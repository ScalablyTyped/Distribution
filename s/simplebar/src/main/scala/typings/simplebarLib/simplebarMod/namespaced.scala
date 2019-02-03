package typings
package simplebarLib.simplebarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simplebar", JSImport.Namespace)
@js.native
class namespaced protected () extends SimpleBar {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: simplebarLib.simplebarMod.SimpleBarNs.Options) = this()
  /* CompleteClass */
  override def getContentElement(): stdLib.Element = js.native
  /* CompleteClass */
  override def getScrollElement(): stdLib.Element = js.native
  /* CompleteClass */
  override def recalculate(): scala.Unit = js.native
}

/* static members */
@JSImport("simplebar", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def removeObserver(): scala.Unit = js.native
}

