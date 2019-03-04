package typings
package reduxDashFormLib.libFormNameMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: reduxDashFormLib.Anon_Form): reactLib.reactMod.ReactNs.ReactNode
}

object FormNameProps {
  @scala.inline
  def apply(children: js.Function1[reduxDashFormLib.Anon_Form, reactLib.reactMod.ReactNs.ReactNode]): FormNameProps = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[FormNameProps]
  }
}

