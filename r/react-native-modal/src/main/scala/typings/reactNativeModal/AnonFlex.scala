package typings.reactNativeModal

import typings.reactNativeModal.reactNativeModalStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlex extends js.Object {
  var flex: Double
  var justifyContent: center
}

object AnonFlex {
  @scala.inline
  def apply(flex: Double, justifyContent: center): AnonFlex = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFlex]
  }
}

