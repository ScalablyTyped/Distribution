package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.LegacyRef
import typings.std.HTMLUListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick ]: react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>>[P]} */ trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends MenuProps

object TypeaheadMenuProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    id: String,
    className: String = null,
    emptyLabel: String = null,
    innerRef: LegacyRef[HTMLUListElement] = null,
    maxHeight: String = null,
    style: CSSProperties = null,
    text: String = null
  ): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id)
    if (className != null) __obj.updateDynamic("className")(className)
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel)
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight)
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
}

