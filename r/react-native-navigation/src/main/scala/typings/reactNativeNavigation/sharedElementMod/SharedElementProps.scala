package typings.reactNativeNavigation.sharedElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedElementProps extends js.Object {
  var elementId: String
  var resizeMode: String
}

object SharedElementProps {
  @scala.inline
  def apply(elementId: String, resizeMode: String): SharedElementProps = {
    val __obj = js.Dynamic.literal(elementId = elementId.asInstanceOf[js.Any], resizeMode = resizeMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharedElementProps]
  }
}

