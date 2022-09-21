package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompilerWatcher
  extends StObject
     with BuildOnEvents {
  
  def close(): js.Promise[WatcherCloseResults] = js.native
  
  def request(data: CompilerRequest): js.Promise[CompilerRequestResponse] = js.native
  
  def start(): js.Promise[WatcherCloseResults] = js.native
}
