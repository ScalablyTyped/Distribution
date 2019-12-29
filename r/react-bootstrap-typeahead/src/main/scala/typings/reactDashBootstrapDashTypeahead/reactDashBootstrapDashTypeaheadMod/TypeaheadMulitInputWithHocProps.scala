package typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import typings.react.reactMod.ReactNode
import typings.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings._empty
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsMultiple<T>> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps[P]}
- Dropped {[ P in react-bootstrap-typeahead.react-bootstrap-typeahead.HintedInputContextKeys ]: react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>[P]} */ trait TypeaheadMulitInputWithHocProps[T /* <: TypeaheadModel */] extends InputContainerPropsMultiple[T]

object TypeaheadMulitInputWithHocProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    inputClassName: String,
    labelKey: TypeaheadLabelKey[T],
    onRemove: Event => Unit,
    renderToken: (T, TypeaheadMenuProps[T], Double) => ReactNode,
    role: _empty,
    selected: js.Array[T]
  ): TypeaheadMulitInputWithHocProps[T] = {
    val __obj = js.Dynamic.literal(inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeaheadMulitInputWithHocProps[T]]
  }
}

