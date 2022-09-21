package typings.stencilCore.stencilPublicCompilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevServer
  extends StObject
     with BuildEmitEvents {
  
  var address: String = js.native
  
  var basePath: String = js.native
  
  var browserUrl: String = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
  
  var root: String = js.native
}
