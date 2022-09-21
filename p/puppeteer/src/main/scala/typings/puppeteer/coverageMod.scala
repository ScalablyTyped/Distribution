package typings.puppeteer

import typings.devtoolsProtocol.mod.Protocol.Profiler.ScriptCoverage
import typings.puppeteer.anon.End
import typings.puppeteer.anon.IncludeRawScriptCoverage
import typings.puppeteer.anon.ResetOnNavigation
import typings.puppeteer.commonConnectionMod.CDPSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coverageMod {
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/Coverage", "CSSCoverage")
  @js.native
  open class CSSCoverage protected () extends StObject {
    def this(client: CDPSession) = this()
    
    /* private */ var `private`: Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    def start(options: ResetOnNavigation): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[js.Array[CoverageEntry]] = js.native
  }
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/Coverage", "Coverage")
  @js.native
  open class Coverage protected () extends StObject {
    def this(client: CDPSession) = this()
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @param options - Set of configurable options for coverage, defaults to
      * `resetOnNavigation : true`
      * @returns Promise that resolves when coverage is started.
      */
    def startCSSCoverage(): js.Promise[Unit] = js.native
    def startCSSCoverage(options: CSSCoverageOptions): js.Promise[Unit] = js.native
    
    /**
      * @param options - Set of configurable options for coverage defaults to
      * `resetOnNavigation : true, reportAnonymousScripts : false`
      * @returns Promise that resolves when coverage is started.
      *
      * @remarks
      * Anonymous scripts are ones that don't have an associated url. These are
      * scripts that are dynamically created on the page using `eval` or
      * `new Function`. If `reportAnonymousScripts` is set to `true`, anonymous
      * scripts URL will start with `debugger://VM` (unless a magic //# sourceURL
      * comment is present, in which case that will the be URL).
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
    def stopJSCoverage(): js.Promise[js.Array[JSCoverageEntry]] = js.native
  }
  
  @JSImport("puppeteer/lib/cjs/puppeteer/common/Coverage", "JSCoverage")
  @js.native
  open class JSCoverage protected () extends StObject {
    def this(client: CDPSession) = this()
    
    /* private */ var `private`: Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    def start(options: IncludeRawScriptCoverage): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[js.Array[JSCoverageEntry]] = js.native
  }
  
  trait CSSCoverageOptions extends StObject {
    
    /**
      * Whether to reset coverage on every navigation.
      */
    var resetOnNavigation: js.UndefOr[Boolean] = js.undefined
  }
  object CSSCoverageOptions {
    
    inline def apply(): CSSCoverageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSCoverageOptions]
    }
    
    extension [Self <: CSSCoverageOptions](x: Self) {
      
      inline def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
      
      inline def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
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
    
    inline def apply(ranges: js.Array[End], text: String, url: String): CoverageEntry = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoverageEntry]
    }
    
    extension [Self <: CoverageEntry](x: Self) {
      
      inline def setRanges(value: js.Array[End]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setRangesVarargs(value: End*): Self = StObject.set(x, "ranges", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSCoverageEntry
    extends StObject
       with CoverageEntry {
    
    /**
      * Raw V8 script coverage entry.
      */
    var rawScriptCoverage: js.UndefOr[ScriptCoverage] = js.undefined
  }
  object JSCoverageEntry {
    
    inline def apply(ranges: js.Array[End], text: String, url: String): JSCoverageEntry = {
      val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSCoverageEntry]
    }
    
    extension [Self <: JSCoverageEntry](x: Self) {
      
      inline def setRawScriptCoverage(value: ScriptCoverage): Self = StObject.set(x, "rawScriptCoverage", value.asInstanceOf[js.Any])
      
      inline def setRawScriptCoverageUndefined: Self = StObject.set(x, "rawScriptCoverage", js.undefined)
    }
  }
  
  trait JSCoverageOptions extends StObject {
    
    /**
      * Whether the result includes raw V8 script coverage entries.
      */
    var includeRawScriptCoverage: js.UndefOr[Boolean] = js.undefined
    
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
    
    inline def apply(): JSCoverageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSCoverageOptions]
    }
    
    extension [Self <: JSCoverageOptions](x: Self) {
      
      inline def setIncludeRawScriptCoverage(value: Boolean): Self = StObject.set(x, "includeRawScriptCoverage", value.asInstanceOf[js.Any])
      
      inline def setIncludeRawScriptCoverageUndefined: Self = StObject.set(x, "includeRawScriptCoverage", js.undefined)
      
      inline def setReportAnonymousScripts(value: Boolean): Self = StObject.set(x, "reportAnonymousScripts", value.asInstanceOf[js.Any])
      
      inline def setReportAnonymousScriptsUndefined: Self = StObject.set(x, "reportAnonymousScripts", js.undefined)
      
      inline def setResetOnNavigation(value: Boolean): Self = StObject.set(x, "resetOnNavigation", value.asInstanceOf[js.Any])
      
      inline def setResetOnNavigationUndefined: Self = StObject.set(x, "resetOnNavigation", js.undefined)
    }
  }
}
