package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "Coverage")
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
    * `resetOnNavigation : true, reportAnonymousScripts : false,`
    * `includeRawScriptCoverage : false, useBlockCoverage : true`
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
