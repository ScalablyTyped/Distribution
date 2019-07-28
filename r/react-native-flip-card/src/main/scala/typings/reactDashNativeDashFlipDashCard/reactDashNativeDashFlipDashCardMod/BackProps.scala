package typings.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod

import typings.react.reactMod.Global.JSXNs.Element
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
    val __obj = js.Dynamic.literal(chilren = chilren, flipHorizontal = flipHorizontal, flipVertical = flipVertical, perspective = perspective)
  
    __obj.asInstanceOf[BackProps]
  }
}

