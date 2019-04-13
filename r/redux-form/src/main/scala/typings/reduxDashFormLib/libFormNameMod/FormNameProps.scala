package typings
package reduxDashFormLib.libFormNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: reduxDashFormLib.Anon_Form): reactLib.reactMod.ReactNode
}

object FormNameProps {
  @scala.inline
  def apply(children: reduxDashFormLib.Anon_Form => reactLib.reactMod.ReactNode): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[FormNameProps]
  }
}

