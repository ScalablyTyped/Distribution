package typings.scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EasyScroller extends js.Object {
  def bindEvents(): Unit
  def reflow(): Unit
  def render(): Unit
}

object EasyScroller {
  @scala.inline
  def apply(bindEvents: () => Unit, reflow: () => Unit, render: () => Unit): EasyScroller = {
    val __obj = js.Dynamic.literal(bindEvents = js.Any.fromFunction0(bindEvents), reflow = js.Any.fromFunction0(reflow), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[EasyScroller]
  }
}

