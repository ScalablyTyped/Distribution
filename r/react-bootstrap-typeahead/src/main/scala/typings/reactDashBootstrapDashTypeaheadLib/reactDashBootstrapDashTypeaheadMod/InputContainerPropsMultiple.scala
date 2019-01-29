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

