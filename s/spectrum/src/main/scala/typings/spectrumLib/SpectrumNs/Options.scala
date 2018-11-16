package typings
package spectrumLib.SpectrumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * Allows the colorpicker to have no color as a value.
           * Will display a button to set selection to 'no color'.
           */
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Sets which element the colorpicker container is appended to (default is "body").
           * This can be any valid object taken into the jQuery appendTo function.
           * Changing this can help resolve issues with opening the colorpicker in a modal dialog
           * or fixed position container, for instance.
           */
  var appendTo: js.UndefOr[js.Any] = js.undefined
  /**
           * You can prevent the colorpicker from showing up if you return false in the beforeShow event.
           * This event is ignored on a flat colorpicker.
           */
  var beforeShow: js.UndefOr[
    js.Function1[/* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, scala.Unit]
  ] = js.undefined
  /**
           * Sets the text on the cancel button.
           */
  var cancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Called as the original input changes. Only happens when the input is closed or the 'Choose' button is clicked.
           */
  var change: js.UndefOr[
    js.Function1[/* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, scala.Unit]
  ] = js.undefined
  /**
           * Sets the text on the choose button.
           */
  var chooseText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When clicking outside of the colorpicker,
           *  force it to fire a change event rather than having it revert the change.
           */
  var clickoutFiresChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The initial color can be set with the color option.
           * if you don't pass in a color, Spectrum will use the value attribute on the input.
           * The input is a string that is parsed using https://github.com/bgrins/TinyColor
           */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Adds an additional class name to the just the container element.
           */
  var containerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Automatically disables the colorpicker.
           * Additionally, if the input that you initialize spectrum on is disabled, this will be the default value.
           * Note: you cannot enable spectrum if the input is disabled
           */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The colorpicker will always show up at full size, and be positioned as an inline-block element.
           */
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Called after the colorpicker is hidden.
           * This happens when clicking outside of the picker while it is open.
           * Note, when any colorpicker on the page is shown it will hide any that are already open.
           * This event is ignored on a flat colorpicker.
           */
  var hide: js.UndefOr[
    js.Function1[/* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, scala.Unit]
  ] = js.undefined
  /**
           * Automatically hides the colorpicker after a palette color is selected.
           */
  var hideAfterPaletteSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The users selection will be saved in the browser's localStorage object.
           * Any Spectrum with the same string will share the selection.
           */
  var localStorageKey: js.UndefOr[java.lang.String] = js.undefined
  //same as JQuery appendTo : JQuery| any[] | Element| string
  /**
           * Sets the max size for the palette.
           */
  var maxSelectionSize: js.UndefOr[scala.Double] = js.undefined
  /**
           * Called as the user moves around within the colorpicker.
           */
  var move: js.UndefOr[
    js.Function1[/* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, scala.Unit]
  ] = js.undefined
  /**
           * Sets a palette below the colorpicker to make it convenient for users to choose from
           *  frequently or recently used colors.
           * Default value:  [["#ffffff", "#000000", "#ff0000", "#ff8000", "#ffff00", "#008000", "#0000ff", "#4b0082", "#9400d3"]]
           */
  var palette: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
           * Sets the format that is displayed in the text box.
           * This will also change the format that is displayed in the titles from the palette swatches.
           * Possible values: "hex", "hex3", "hsl", "rgb", "name"
           */
  var preferredFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Adds an additional class name to just the replacer element.
           */
  var replacerClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
           */
  var selectionPalette: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Called after the colorpicker is opened. This is ignored on a flat colorpicker.
           * Note, when any colorpicker on the page is shown it will hide any that are already open.
           */
  var show: js.UndefOr[
    js.Function1[/* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, scala.Unit]
  ] = js.undefined
  /**
           * Allows alpha transparency selection
           */
  var showAlpha: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Toggles the choose/cancel buttons.
           * If there are no buttons, the behavior will be to fire the `change` event (and update the original input) when the picker is closed.
           */
  var showButtons: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows the color that was initially set when opening.
           * This provides an easy way to click back to what was set when opened.
           */
  var showInitial: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Adds an input to allow for free form typing.
           */
  var showInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When the colorpicker is closed, the current color will be added to the palette if it isn't there already.
           */
  var showPalette: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Shows only the colors specified in the palette
           */
  var showPaletteOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Keeps track of what has been selected by the user.
           */
  var showSelectionPalette: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Changes the text on the close-toggle colorpicker button.
           */
  var togglePaletteLessText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Changes the text on the open-toggle colorpicker button.
           */
  var togglePaletteMoreText: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Shows a button to toggle the colorpicker next to the palette.
           * This way, the user can choose from a limited number of colors in the palette,
           * but still be able to pick a color that's not in the palette.
           */
  var togglePaletteOnly: js.UndefOr[scala.Boolean] = js.undefined
}

