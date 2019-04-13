package typings
package reactDashAlbusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  def children(wizard: reactDashAlbusLib.reactDashAlbusMod.WizardContext): reactLib.reactMod.ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(children: reactDashAlbusLib.reactDashAlbusMod.WizardContext => reactLib.reactMod.ReactNode): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

