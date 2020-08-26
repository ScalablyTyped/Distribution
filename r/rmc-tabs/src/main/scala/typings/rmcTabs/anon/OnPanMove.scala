package typings.rmcTabs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnPanMove extends js.Object {
  def onPanEnd(): Unit = js.native
  def onPanMove(
    status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGestureStatus */ js.Any
  ): Unit = js.native
  def onPanStart(
    status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IGestureStatus */ js.Any
  ): Unit = js.native
  def setCurrentOffset(offset: String): String | Double = js.native
  def setCurrentOffset(offset: Double): String | Double = js.native
}

