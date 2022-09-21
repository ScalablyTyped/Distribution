package typings.puppeteer.mod

import typings.puppeteer.anon.IncludeRawScriptCoverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "JSCoverage")
@js.native
open class JSCoverage protected () extends StObject {
  def this(client: CDPSession) = this()
  
  /* private */ var `private`: Any = js.native
  
  def start(): js.Promise[Unit] = js.native
  def start(options: IncludeRawScriptCoverage): js.Promise[Unit] = js.native
  
  def stop(): js.Promise[js.Array[JSCoverageEntry]] = js.native
}
