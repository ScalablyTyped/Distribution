package typings.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsVisible extends js.Object {
  var isVisible: Boolean
  var showContent: Boolean
}

object AnonIsVisible {
  @scala.inline
  def apply(isVisible: Boolean, showContent: Boolean): AnonIsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], showContent = showContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIsVisible]
  }
}

