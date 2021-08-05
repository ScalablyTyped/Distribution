package typings.projectOxford.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("project-oxford", "Client")
@js.native
class Client protected () extends StObject {
  def this(apiKey: String) = this()
  
  /* private */ var _key: String = js.native
  
  var face: FaceAPI = js.native
  
  var vision: VisionAPI = js.native
}
