package typings.reactNativeNavigation

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementId extends js.Object {
  var elementId: Validator[String]
  var resizeMode: Requireable[String]
}

object AnonElementId {
  @scala.inline
  def apply(elementId: Validator[String], resizeMode: Requireable[String]): AnonElementId = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonElementId]
  }
}

