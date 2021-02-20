package typings.rcloader

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rcloader", JSImport.Namespace)
  @js.native
  class ^ protected () extends RcLoader {
    def this(configfilename: String, options: String) = this()
    def this(configfilename: String, options: Options) = this()
  }
  
  @js.native
  trait Options
    extends /* property */ StringDictionary[js.Any] {
    
    var lookup: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLookup(value: Boolean): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    }
  }
  
  @js.native
  trait RcLoader extends StObject {
    
    def `for`(path: String): Unit = js.native
    def `for`(path: String, callback: js.Function2[/* error */ js.Any, /* fileOpts */ js.Any, Unit]): Unit = js.native
  }
}
