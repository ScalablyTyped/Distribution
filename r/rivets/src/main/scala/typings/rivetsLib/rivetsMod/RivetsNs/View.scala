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
  def apply(bind: js.Function0[scala.Unit], build: js.Function0[scala.Unit], unbind: js.Function0[scala.Unit]): View = {
    val __obj = js.Dynamic.literal(bind = bind, build = build, unbind = unbind)
  
    __obj.asInstanceOf[View]
  }
}

