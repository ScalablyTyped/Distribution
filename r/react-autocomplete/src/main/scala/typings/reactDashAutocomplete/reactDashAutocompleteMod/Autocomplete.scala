package typings.reactDashAutocomplete.reactDashAutocompleteMod

import typings.react.reactMod.Component
import typings.reactDashAutocomplete.Fn_Backward
import typings.reactDashAutocomplete.Fn_Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete
  extends Component[Props, State, js.Any] {
  /**
    * Autocomplete exposes a subset of `HTMLInputElement` properties to the parent component.
    * They can be accessed through Autocomplete's `ref` prop.
    */
  var blur: js.Function0[Unit] = js.native
  var checkValidity: js.Function0[Boolean] = js.native
  var click: js.Function0[Unit] = js.native
  var focus: Fn_Options = js.native
  var select: js.Function0[Unit] = js.native
  var setCustomValidity: js.Function1[/* error */ String, Unit] = js.native
  var setSelectionRange: Fn_Backward = js.native
}

