package typings.rivets.rivetsMod.Rivets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  def bind(): Unit
  def build(): Unit
  def unbind(): Unit
}

object View {
  @scala.inline
  def apply(bind: () => Unit, build: () => Unit, unbind: () => Unit): View = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), build = js.Any.fromFunction0(build), unbind = js.Any.fromFunction0(unbind))
  
    __obj.asInstanceOf[View]
  }
}

