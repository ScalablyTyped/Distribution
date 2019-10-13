package typings.atStorybookReactDashNative

import typings.atStorybookReactDashNative.distPreviewComponentsOnDeviceUIAbsoluteDashPositionedDashKeyboardDashAwareDashViewMod.PreviewDimens
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dimens extends js.Object {
  def onLayout(dimens: PreviewDimens): Unit
}

object Anon_Dimens {
  @scala.inline
  def apply(onLayout: PreviewDimens => Unit): Anon_Dimens = {
    val __obj = js.Dynamic.literal(onLayout = js.Any.fromFunction1(onLayout))
  
    __obj.asInstanceOf[Anon_Dimens]
  }
}

