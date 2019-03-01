package typings
package reactDashAlbusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  def children(wizard: reactDashAlbusLib.reactDashAlbusMod.WizardContext): reactLib.reactMod.ReactNs.ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(
    children: js.Function1[
      reactDashAlbusLib.reactDashAlbusMod.WizardContext, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_Children]
  }
}

