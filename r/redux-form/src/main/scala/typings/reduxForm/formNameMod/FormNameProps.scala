package typings.reduxForm.formNameMod

import typings.react.mod.ReactNode
import typings.reduxForm.anon.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormNameProps extends js.Object {
  def children(props: Form): ReactNode
}

object FormNameProps {
  @scala.inline
  def apply(children: Form => ReactNode): FormNameProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[FormNameProps]
  }
}

