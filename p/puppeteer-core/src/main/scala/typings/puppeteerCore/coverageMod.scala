package typings.puppeteerCore

import typings.devtoolsProtocol.mod.Protocol.CSS.StyleSheetAddedEvent
import typings.devtoolsProtocol.mod.Protocol.Debugger.ScriptParsedEvent
import typings.puppeteerCore.anon.End
import typings.puppeteerCore.anon.ReportAnonymousScripts
import typings.puppeteerCore.anon.ResetOnNavigation
import typings.puppeteerCore.connectionMod.CDPSession
import typings.puppeteerCore.helperMod.PuppeteerEventListener
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coverageMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/Coverage", "Coverage")
  @js.native
  class Coverage protected () extends StObject {
    def this(client: CDPSession) = this()
    
    /**
      * @internal
      */
    var _cssCoverage: CSSCoverage = js.native
    
    /**
      * @internal
      */
    var _jsCoverage: JSCoverage = js.native
    
    /**
      * @param options - defaults to `{ resetOnNavigation : true }`
      * @returns Promise that resolves when coverage is started.
      */
    def startCSSCoverage(): js.Promise[Unit] = js.native
    def startCSSCoverage(options: CSSCoverageOptions): js.Promise[Unit] = js.native
    
    /**
      * @param options - defaults to
      * `{ resetOnNavigation : true, reportAnonymousScripts : false }`
      * @returns Promise that resolves when coverage is started.
      *
      * @remarks
      * Anonymous scripts are ones that don't have an associated url. These are
      * scripts that are dynamically created on the page using `eval` or
      * `new Function`. If `reportAnonymousScripts` is set to `true`, anonymous
      * scripts will have `__puppeteer_evaluation_script__` as their URL.
      */
    def startJSCoverage(): js.Promise[Unit] = js.native
    def startJSCoverage(options: JSCoverageOptions): js.Promise[Unit] = js.native
    
    /**
      * @returns Promise that resolves to the array of coverage reports
      * for all stylesheets.
      * @remarks
      * CSS Coverage doesn't include dynamically injected style tags
      * without sourceURLs.
      */
    def stopCSSCoverage(): js.Promise[js.Array[CoverageEntry]] = js.native
    
    /**
      * @returns Promise that resolves to the array of coverage reports for
      * all scripts.
      *
      * @remarks
      * JavaScript Coverage doesn't include anonymous scripts by default.
      * However, scripts with sourceURLs are reported.
      */
    def stopJSCoverage(): js.Promise[js.Array[CoverageEntry]] = js.native
  }
  
  @js.native
  trait CSSCoverage extends StObject {
    
    var _client: CDPSession = js.native
    
    var _enabled: Boolean = js.native
    
    var _eventListeners: js.Array[PuppeteerEventListener] = js.native
    
    def _onExecutionContextsCleared(): Unit = js.native
    
    def _onStyleSheet(event: StyleSheetAddedEvent): js.Promise[Unit] = js.native
    
    var _reportAnonymousScripts: Boolean = js.native
    
    var _resetOnNavigation: Boolean = js.native
    
    var _stylesheetSources: Map[String, String] = js.native
    
    var _stylesheetURLs: Map[String, String] = js.native
    
    def start(): js.Promise[Unit] = js.native
    def start(options: ResetOnNavigation): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[js.Array[CoverageEntry]] = js.native
  }
  
  trait CSSCoverageOptions extends StObject {
    
    /**
      * Whether to reset coverage on every navigation.
      */
    var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
  }
  object CSSCoverageOptions {
    
    @scala.inline
    def apply(): CSSCoverageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSCoverageOptions]
    }
    
    @scala.inline
    implicit class CSSCoverageOptionsMutableBuilder[Self <: CSSCoverageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
    }
  }
  
  trait CoverageEntry extends StObject {
    
    /**
      * The covered range as start and end positions.
      */
    var ranges: js.Array[End]
    
    /**
      * The content of the style sheet or script.
      */
    var text: String
    
    /**
      * The URL of the style sheet or script.
      */
    var url: String
  }
  object CoverageEntry {
    
    @scala.inline
    def apply(ranges: js.Array[End], text: String, url: String): CoverageEntry = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageEntry]
    }
    
    @scala.inline
    implicit class CoverageEntryMutableBuilder[Self <: CoverageEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSCoverage extends StObject {
    
    var _client: CDPSession = js.native
    
    var _enabled: Boolean = js.native
    
    var _eventListeners: js.Array[PuppeteerEventListener] = js.native
    
    def _onExecutionContextsCleared(): Unit = js.native
    
    def _onScriptParsed(event: ScriptParsedEvent): js.Promise[Unit] = js.native
    
    var _reportAnonymousScripts: Boolean = js.native
    
    var _resetOnNavigation: Boolean = js.native
    
    var _scriptSources: Map[String, String] = js.native
    
    var _scriptURLs: Map[String, String] = js.native
    
    def start(): js.Promise[Unit] = js.native
    def start(options: ReportAnonymousScripts): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[js.Array[CoverageEntry]] = js.native
  }
  
  trait JSCoverageOptions extends StObject {
    
    /**
      * Whether anonymous scripts generated by the page should be reported.
      */
    var reportAnonymousScripts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to reset coverage on every navigation.
      */
    var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
  }
  object JSCoverageOptions {
    
    @scala.inline
    def apply(): JSCoverageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSCoverageOptions]
    }
    
    @scala.inline
    implicit class JSCoverageOptionsMutableBuilder[Self <: JSCoverageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReportAnonymousScripts(value: Boolean): Self = StObject.set(x, "reportAnonymousScripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportAnonymousScriptsUndefined: Self = StObject.set(x, "reportAnonymousScripts", js.undefined)
      
      @scala.inline
      def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
    }
  }
}
