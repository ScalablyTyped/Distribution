package typings
package reactDashAutocompleteLib.reactDashAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autocomplete
  extends reactLib.reactMod.Component[
      reactDashAutocompleteLib.reactDashAutocompleteMod.AutocompleteNs.Props, 
      reactDashAutocompleteLib.reactDashAutocompleteMod.AutocompleteNs.State, 
      js.Any
    ] {
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
  var focus: js.Function0[scala.Unit] | (js.Function1[/* options */ stdLib.FocusOptions, scala.Unit]) = js.native
  @JSName("select")
  var select_Original: js.Function0[scala.Unit] = js.native
  @JSName("setCustomValidity")
  var setCustomValidity_Original: js.Function1[/* error */ java.lang.String, scala.Unit] = js.native
  var setSelectionRange: (js.Function2[/* start */ scala.Double, /* end */ scala.Double, scala.Unit]) | (js.Function3[
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    reactDashAutocompleteLib.reactDashAutocompleteLibStrings.forward, 
    scala.Unit
  ]) | (js.Function3[
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    reactDashAutocompleteLib.reactDashAutocompleteLibStrings.backward, 
    scala.Unit
  ]) | (js.Function3[
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    reactDashAutocompleteLib.reactDashAutocompleteLibStrings.none, 
    scala.Unit
  ]) = js.native
  /**
    * Autocomplete exposes a subset of `HTMLInputElement` properties to the parent component.
    * They can be accessed through Autocomplete's `ref` prop.
    */
  def blur(): scala.Unit = js.native
  def checkValidity(): scala.Boolean = js.native
  def click(): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
}

