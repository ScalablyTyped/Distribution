package typings.reactDashSelect

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInnerPropsSelectProps extends js.Object {
  var children: ReactNode
  var innerProps: Anon_ClassNameEvent
  var selectProps: js.Any
}

object Anon_ChildrenInnerPropsSelectProps {
  @scala.inline
  def apply(innerProps: Anon_ClassNameEvent, selectProps: js.Any, children: ReactNode = null): Anon_ChildrenInnerPropsSelectProps = {
    val __obj = js.Dynamic.literal(innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChildrenInnerPropsSelectProps]
  }
}

