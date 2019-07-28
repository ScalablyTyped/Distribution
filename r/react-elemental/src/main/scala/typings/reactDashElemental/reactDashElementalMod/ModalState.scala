package typings.reactDashElemental.reactDashElementalMod

import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalState extends js.Object {
  val modal: HTMLDivElement
  val windowHeight: Double
  val windowWidth: Double
}

object ModalState {
  @scala.inline
  def apply(modal: HTMLDivElement, windowHeight: Double, windowWidth: Double): ModalState = {
    val __obj = js.Dynamic.literal(modal = modal, windowHeight = windowHeight, windowWidth = windowWidth)
  
    __obj.asInstanceOf[ModalState]
  }
}

