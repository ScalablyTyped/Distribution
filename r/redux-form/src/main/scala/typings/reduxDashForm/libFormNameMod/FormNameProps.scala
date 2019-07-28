package typings.reduxDashForm.libFormNameMod

import typings.react.reactMod.ReactNode
import typings.reduxDashForm.Anon_Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: Anon_Form): ReactNode
}

object FormNameProps {
  @scala.inline
  def apply(children: Anon_Form => ReactNode): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[FormNameProps]
  }
}

