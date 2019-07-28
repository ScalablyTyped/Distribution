package typings.simplebar.simplebarMod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplebar", JSImport.Namespace)
@js.native
class ^ protected () extends SimpleBar {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: Options) = this()
  /* CompleteClass */
  override def getContentElement(): Element = js.native
  /* CompleteClass */
  override def getScrollElement(): Element = js.native
  /* CompleteClass */
  override def recalculate(): Unit = js.native
}

@JSImport("simplebar", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def removeObserver(): Unit = js.native
}

