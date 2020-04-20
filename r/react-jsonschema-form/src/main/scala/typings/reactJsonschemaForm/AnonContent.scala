package typings.reactJsonschemaForm

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: ReactElement
  var disabled: Boolean
  var name: String
  var readonly: Boolean
}

object AnonContent {
  @scala.inline
  def apply(content: ReactElement, disabled: Boolean, name: String, readonly: Boolean): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

