package typings
package reactDashAutocompleteLib.reactDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete
  extends reactLib.reactMod.Component[Props, State, js.Any] {
  /**
    * Autocomplete exposes a subset of `HTMLInputElement` properties to the parent component.
    * They can be accessed through Autocomplete's `ref` prop.
    */
  var blur: js.Function0[scala.Unit] = js.native
  var checkValidity: js.Function0[scala.Boolean] = js.native
  var click: js.Function0[scala.Unit] = js.native
  var focus: reactDashAutocompleteLib.Fn_Options = js.native
  var select: js.Function0[scala.Unit] = js.native
  var setCustomValidity: js.Function1[/* error */ java.lang.String, scala.Unit] = js.native
  var setSelectionRange: reactDashAutocompleteLib.Fn_Backward = js.native
}

