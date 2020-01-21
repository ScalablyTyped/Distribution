package typings.storybookReactNative

import typings.storybookReactNative.absolutePositionedKeyboardAwareViewMod.PreviewDimens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDimens extends js.Object {
  def onLayout(dimens: PreviewDimens): Unit
}

object AnonDimens {
  @scala.inline
  def apply(onLayout: PreviewDimens => Unit): AnonDimens = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout))
  
    __obj.asInstanceOf[AnonDimens]
  }
}

