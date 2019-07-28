package typings.siesta.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @mixin
  */
@js.native
trait ITextSelection extends js.Object {
  def getSelectedText(el: js.Any): String = js.native
  def selectText(el: js.Any): Unit = js.native
  def selectText(el: js.Any, start: Double): Unit = js.native
  def selectText(el: js.Any, start: Double, end: Double): Unit = js.native
}

