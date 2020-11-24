package typings.projectOxford.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("project-oxford", "Client")
@js.native
class Client protected () extends js.Object {
  def this(apiKey: String) = this()
  
  var _key: String = js.native
  
  var face: FaceAPI = js.native
  
  var vision: VisionAPI = js.native
}
