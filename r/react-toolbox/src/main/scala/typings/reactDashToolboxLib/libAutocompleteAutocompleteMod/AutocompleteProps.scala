package typings
package reactDashToolboxLib.libAutocompleteAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutocompleteProps
  extends reactDashToolboxLib.libInputInputMod.InputProps
     with /**
   * Additional properties passed to inner Input component.
   */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
     * Determines if user can create a new option with the current typed value.
     * @default false
     */
  var allowCreate: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Determines the opening direction. It can be auto, up or down.
     * @default auto
     */
  var direction: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.auto | reactDashToolboxLib.reactDashToolboxLibStrings.up | reactDashToolboxLib.reactDashToolboxLibStrings.down
  ] = js.undefined
  /**
     * Whether component should keep focus after value change.
     * @default false
     */
  var keepFocusOnChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, component can hold multiple values.
     * @default true
     */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Callback function that is fired when the components's query value changes.
     */
  var onQueryChange: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
     * Determines if the selected list is shown above or below input. It can be above or below.
     * @default above
     */
  var selectedPosition: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.above | reactDashToolboxLib.reactDashToolboxLibStrings.below | reactDashToolboxLib.reactDashToolboxLibStrings.none
  ] = js.undefined
  /**
     * Determines if the selected list is shown if the `value` keys don't exist in the source. Only works if passing the `value` prop as an Object.
     * @default false
     */
  var showSelectedWhenNotInSource: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * If true, the list of suggestions will not be filtered when a value is selected.
     * @default false
     */
  var showSuggestionsWhenValueIsSet: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Object of key/values or array representing all items suggested.
     */
  var source: js.UndefOr[js.Any] = js.undefined
  /**
     * Determines how suggestions are supplied.
     * @default start
     */
  var suggestionMatch: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.disabled | reactDashToolboxLib.reactDashToolboxLibStrings.start | reactDashToolboxLib.reactDashToolboxLibStrings.anywhere | reactDashToolboxLib.reactDashToolboxLibStrings.word
  ] = js.undefined
  /**
     * Classnames object defining the component style.
     */
  @JSName("theme")
  var theme_AutocompleteProps: js.UndefOr[AutocompleteTheme with reactDashToolboxLib.libInputInputMod.InputTheme] = js.undefined
}

