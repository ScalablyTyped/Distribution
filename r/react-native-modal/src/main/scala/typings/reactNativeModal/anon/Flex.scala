package typings.reactNativeModal.anon

import typings.reactNativeModal.reactNativeModalStrings.center
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flex extends js.Object {
  var flex: Double
  var justifyContent: center
}

object Flex {
  @scala.inline
  def apply(flex: Double, justifyContent: center): Flex = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], justifyContent = justifyContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
}

