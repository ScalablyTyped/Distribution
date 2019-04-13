package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps, keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsMultiple<react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps>> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.BaseTypeaheadInputProps[P]}
- Dropped {[ P in react-bootstrap-typeahead.react-bootstrap-typeahead.HintedInputContextKeys ]: react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadContext<T>>[P]} */ trait TypeaheadMulitInputWithHocProps[T /* <: TypeaheadModel */] extends InputContainerPropsMultiple[T]

object TypeaheadMulitInputWithHocProps {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    inputClassName: java.lang.String,
    labelKey: TypeaheadLabelKey[T],
    onRemove: stdLib.Event => scala.Unit,
    renderToken: (T, TypeaheadMenuProps[T], scala.Double) => reactLib.reactMod.ReactNode,
    role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.Empty,
    selected: js.Array[T]
  ): TypeaheadMulitInputWithHocProps[T] = {
    val __obj = js.Dynamic.literal(inputClassName = inputClassName, labelKey = labelKey.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role, selected = selected)
  
    __obj.asInstanceOf[TypeaheadMulitInputWithHocProps[T]]
  }
}

