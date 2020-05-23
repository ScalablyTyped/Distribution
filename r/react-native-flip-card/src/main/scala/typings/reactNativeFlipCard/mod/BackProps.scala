package typings.reactNativeFlipCard.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackProps extends js.Object {
  var chilren: js.Array[Element]
  var flipHorizontal: Boolean
  var flipVertical: Boolean
  var perspective: Double
}

object BackProps {
  @scala.inline
  def apply(chilren: js.Array[Element], flipHorizontal: Boolean, flipVertical: Boolean, perspective: Double): BackProps = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackProps]
  }
}

