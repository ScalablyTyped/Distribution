package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalState extends js.Object {
  val modal: stdLib.HTMLDivElement
  val windowHeight: scala.Double
  val windowWidth: scala.Double
}

object ModalState {
  @scala.inline
  def apply(modal: stdLib.HTMLDivElement, windowHeight: scala.Double, windowWidth: scala.Double): ModalState = {
    val __obj = js.Dynamic.literal(modal = modal, windowHeight = windowHeight, windowWidth = windowWidth)
  
    __obj.asInstanceOf[ModalState]
  }
}

