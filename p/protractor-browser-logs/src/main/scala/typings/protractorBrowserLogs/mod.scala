package typings.protractorBrowserLogs

import typings.protractor.mod.ProtractorBrowser
import typings.seleniumWebdriver.mod.logging.Entry
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protractor-browser-logs", JSImport.Namespace)
  @js.native
  def apply(browser: ProtractorBrowser): BrowserLogs = js.native
  @JSImport("protractor-browser-logs", JSImport.Namespace)
  @js.native
  def apply(browser: ProtractorBrowser, options: BrowserLogOptions): BrowserLogs = js.native
  
  @js.native
  trait BrowserLogOptions extends StObject {
    
    var reporters: js.UndefOr[js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]] = js.native
  }
  object BrowserLogOptions {
    
    @scala.inline
    def apply(): BrowserLogOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserLogOptions]
    }
    
    @scala.inline
    implicit class BrowserLogOptionsMutableBuilder[Self <: BrowserLogOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReporters(value: js.Array[js.Function1[/* entries */ js.Array[Entry], Unit]]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      @scala.inline
      def setReportersVarargs(value: (js.Function1[/* entries */ js.Array[Entry], Unit])*): Self = StObject.set(x, "reporters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BrowserLogs extends StObject {
    
    def DEBUG(entry: Entry): Boolean = js.native
    @JSName("DEBUG")
    var DEBUG_Original: matchPredicateFunction = js.native
    
    def ERROR(entry: Entry): Boolean = js.native
    @JSName("ERROR")
    var ERROR_Original: matchPredicateFunction = js.native
    
    def INFO(entry: Entry): Boolean = js.native
    @JSName("INFO")
    var INFO_Original: matchPredicateFunction = js.native
    
    def LOG(entry: Entry): Boolean = js.native
    @JSName("LOG")
    var LOG_Original: matchPredicateFunction = js.native
    
    def WARNING(entry: Entry): Boolean = js.native
    @JSName("WARNING")
    var WARNING_Original: matchPredicateFunction = js.native
    
    def and(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction = js.native
    
    def expect(matches: matchPredicate*): js.Array[matchPredicateFunction] = js.native
    
    def ignore(matches: matchPredicate*): js.Array[matchPredicateFunction] = js.native
    
    def logs(): js.Array[Entry] = js.native
    
    def or(a: matchPredicateFunction, b: matchPredicateFunction): matchPredicateFunction = js.native
    
    def reset(): Unit = js.native
    
    def verify(): Unit = js.native
  }
  
  type matchPredicate = String | RegExp | matchPredicateFunction
  
  type matchPredicateFunction = js.Function1[/* entry */ Entry, Boolean]
}
