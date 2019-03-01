package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick ]: react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>>[P]} */ trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends MenuProps

object TypeaheadMenuProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    id: java.lang.String,
    className: java.lang.String = null,
    emptyLabel: java.lang.String = null,
    innerRef: reactLib.reactMod.ReactNs.LegacyRef[reactLib.HTMLUListElement] = null,
    maxHeight: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    text: java.lang.String = null
  ): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (className != null) __obj.updateDynamic("className")(className)
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
}

