package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.anon.Pathname
import typings.stencilCore.stencilPublicCompilerMod.CompilerBuildResults
import typings.stencilCore.stencilPublicCompilerMod.CompilerRequestResponse
import typings.stencilCore.stencilPublicCompilerMod.CompilerSystem
import typings.stencilCore.stencilPublicCompilerMod.PrerenderConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevServerContext extends StObject {
  
  var connectorHtml: String = js.native
  
  var dirTemplate: String = js.native
  
  def getBuildResults(): js.Promise[CompilerBuildResults] = js.native
  
  def getCompilerRequest(path: String): js.Promise[CompilerRequestResponse] = js.native
  
  var isServerListening: Boolean = js.native
  
  def logRequest(req: Pathname, status: Double): Unit = js.native
  
  var prerenderConfig: PrerenderConfig = js.native
  
  def serve302(req: Any, res: Any): Unit = js.native
  def serve302(req: Any, res: Any, pathname: String): Unit = js.native
  
  def serve404(req: Any, res: Any, xSource: String): Unit = js.native
  def serve404(req: Any, res: Any, xSource: String, content: String): Unit = js.native
  
  def serve500(req: Any, res: Any, error: Any, xSource: String): Unit = js.native
  
  var sys: CompilerSystem = js.native
}
