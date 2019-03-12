package typings
package rivetsLib.rivetsMod.RivetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View extends js.Object {
  def bind(): scala.Unit
  def build(): scala.Unit
  def unbind(): scala.Unit
}

object View {
  @scala.inline
  def apply(bind: () => scala.Unit, build: () => scala.Unit, unbind: () => scala.Unit): View = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction0(bind), build = js.Any.fromFunction0(build), unbind = js.Any.fromFunction0(unbind))
  
    __obj.asInstanceOf[View]
  }
}

