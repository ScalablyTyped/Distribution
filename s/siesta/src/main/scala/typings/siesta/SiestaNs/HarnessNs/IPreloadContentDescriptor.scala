package typings.siesta.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPreloadContentDescriptor extends js.Object {
  var content: String
  var `type`: String
}

object IPreloadContentDescriptor {
  @scala.inline
  def apply(content: String, `type`: String): IPreloadContentDescriptor = {
    val __obj = js.Dynamic.literal(content = content)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPreloadContentDescriptor]
  }
}

