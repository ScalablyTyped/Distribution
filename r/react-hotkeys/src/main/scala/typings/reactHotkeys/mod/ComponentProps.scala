package typings.reactHotkeys.mod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends ComponentPropsBase {
  var ref: js.UndefOr[MutableRefObject[ComponentClass[js.Object, ComponentState]]] = js.undefined
}

object ComponentProps {
  @scala.inline
  def apply(
    onBlur: () => Unit,
    onFocus: () => Unit,
    tabIndex: TabIndex,
    ref: MutableRefObject[ComponentClass[js.Object, ComponentState]] = null
  ): ComponentProps = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

