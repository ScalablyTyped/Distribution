package typings
package reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>>>>, 'role'> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>>>>[P]} */ trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var inputClassName: java.lang.String
  var labelKey: TypeaheadLabelKey[T]
  var role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.Empty
  var selected: js.Array[T]
  def onRemove(e: reactLib.Event): scala.Unit
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: scala.Double): reactLib.reactMod.ReactNs.ReactNode
}

object InputContainerPropsMultiple {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    inputClassName: java.lang.String,
    labelKey: TypeaheadLabelKey[T],
    onRemove: js.Function1[reactLib.Event, scala.Unit],
    renderToken: js.Function3[T, TypeaheadMenuProps[T], scala.Double, reactLib.reactMod.ReactNs.ReactNode],
    role: reactDashBootstrapDashTypeaheadLib.reactDashBootstrapDashTypeaheadLibStrings.Empty,
    selected: js.Array[T]
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputClassName")(inputClassName)
    __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    __obj.updateDynamic("onRemove")(onRemove)
    __obj.updateDynamic("renderToken")(renderToken)
    __obj.updateDynamic("role")(role)
    __obj.updateDynamic("selected")(selected)
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
}

