package typings.reactMdForm.formMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormMessageWithCounterProps
  extends FormMessageProps
     with FormMessageCounterProps

object FormMessageWithCounterProps {
  @scala.inline
  def apply(id: String, length: Double, maxLength: Double): FormMessageWithCounterProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormMessageWithCounterProps]
  }
}

