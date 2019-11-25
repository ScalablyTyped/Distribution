package typings.siesta.Siesta.Harness

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
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPreloadContentDescriptor]
  }
}

