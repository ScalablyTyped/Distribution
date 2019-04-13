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
  @JSName("blur")
  var blur_Original: js.Function0[scala.Unit] = js.native
  @JSName("checkValidity")
  var checkValidity_Original: js.Function0[scala.Boolean] = js.native
  @JSName("click")
  var click_Original: js.Function0[scala.Unit] = js.native
  @JSName("focus")
  var focus_Original: reactDashAutocompleteLib.Anon_Options = js.native
  @JSName("select")
  var select_Original: js.Function0[scala.Unit] = js.native
  @JSName("setCustomValidity")
  var setCustomValidity_Original: js.Function1[/* error */ java.lang.String, scala.Unit] = js.native
  @JSName("setSelectionRange")
  var setSelectionRange_Original: reactDashAutocompleteLib.Anon_Backward = js.native
  /**
    * Autocomplete exposes a subset of `HTMLInputElement` properties to the parent component.
    * They can be accessed through Autocomplete's `ref` prop.
    */
  def blur(): scala.Unit = js.native
  def checkValidity(): scala.Boolean = js.native
  def click(): scala.Unit = js.native
  def focus(): scala.Unit = js.native
  def focus(options: stdLib.FocusOptions): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
  def setSelectionRange(start: scala.Double, end: scala.Double): scala.Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_backward(
    start: scala.Double,
    end: scala.Double,
    direction: reactDashAutocompleteLib.reactDashAutocompleteLibStrings.backward
  ): scala.Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_forward(
    start: scala.Double,
    end: scala.Double,
    direction: reactDashAutocompleteLib.reactDashAutocompleteLibStrings.forward
  ): scala.Unit = js.native
  @JSName("setSelectionRange")
  def setSelectionRange_none(
    start: scala.Double,
    end: scala.Double,
    direction: reactDashAutocompleteLib.reactDashAutocompleteLibStrings.none
  ): scala.Unit = js.native
}

