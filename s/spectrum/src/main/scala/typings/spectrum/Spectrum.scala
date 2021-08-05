package typings.spectrum

import typings.tinycolor2.mod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Spectrum {
  
  trait Options extends StObject {
    
    /**
      * Allows the colorpicker to have no color as a value.
      * Will display a button to set selection to 'no color'.
      */
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
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
    var beforeShow: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Sets the text on the cancel button.
      */
    var cancelText: js.UndefOr[String] = js.undefined
    
    /**
      * Called as the original input changes. Only happens when the input is closed or the 'Choose' button is clicked.
      */
    var change: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Sets the text on the choose button.
      */
    var chooseText: js.UndefOr[String] = js.undefined
    
    /**
      * When clicking outside of the colorpicker,
      *  force it to fire a change event rather than having it revert the change.
      */
    var clickoutFiresChange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial color can be set with the color option.
      * if you don't pass in a color, Spectrum will use the value attribute on the input.
      * The input is a string that is parsed using https://github.com/bgrins/TinyColor
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Adds an additional class name to the just the container element.
      */
    var containerClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Automatically disables the colorpicker.
      * Additionally, if the input that you initialize spectrum on is disabled, this will be the default value.
      * Note: you cannot enable spectrum if the input is disabled
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The colorpicker will always show up at full size, and be positioned as an inline-block element.
      */
    var flat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called after the colorpicker is hidden.
      * This happens when clicking outside of the picker while it is open.
      * Note, when any colorpicker on the page is shown it will hide any that are already open.
      * This event is ignored on a flat colorpicker.
      */
    var hide: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Automatically hides the colorpicker after a palette color is selected.
      */
    var hideAfterPaletteSelect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The users selection will be saved in the browser's localStorage object.
      * Any Spectrum with the same string will share the selection.
      */
    var localStorageKey: js.UndefOr[String] = js.undefined
    
    //same as JQuery appendTo : JQuery| any[] | Element| string
    /**
      * Sets the max size for the palette.
      */
    var maxSelectionSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Called as the user moves around within the colorpicker.
      */
    var move: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Sets a palette below the colorpicker to make it convenient for users to choose from
      *  frequently or recently used colors.
      * Default value:  [["#ffffff", "#000000", "#ff0000", "#ff8000", "#ffff00", "#008000", "#0000ff", "#4b0082", "#9400d3"]]
      */
    var palette: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
    
    /**
      * Sets the format that is displayed in the text box.
      * This will also change the format that is displayed in the titles from the palette swatches.
      * Possible values: "hex", "hex3", "hsl", "rgb", "name"
      */
    var preferredFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Adds an additional class name to just the replacer element.
      */
    var replacerClassName: js.UndefOr[String] = js.undefined
    
    /**
      */
    var selectionPalette: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Called after the colorpicker is opened. This is ignored on a flat colorpicker.
      * Note, when any colorpicker on the page is shown it will hide any that are already open.
      */
    var show: js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.undefined
    
    /**
      * Allows alpha transparency selection
      */
    var showAlpha: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Toggles the choose/cancel buttons.
      * If there are no buttons, the behavior will be to fire the `change` event (and update the original input) when the picker is closed.
      */
    var showButtons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows the color that was initially set when opening.
      * This provides an easy way to click back to what was set when opened.
      */
    var showInitial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds an input to allow for free form typing.
      */
    var showInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When the colorpicker is closed, the current color will be added to the palette if it isn't there already.
      */
    var showPalette: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Shows only the colors specified in the palette
      */
    var showPaletteOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Keeps track of what has been selected by the user.
      */
    var showSelectionPalette: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Changes the text on the close-toggle colorpicker button.
      */
    var togglePaletteLessText: js.UndefOr[String] = js.undefined
    
    /**
      * Changes the text on the open-toggle colorpicker button.
      */
    var togglePaletteMoreText: js.UndefOr[String] = js.undefined
    
    /**
      * Shows a button to toggle the colorpicker next to the palette.
      * This way, the user can choose from a limited number of colors in the palette,
      * but still be able to pick a color that's not in the palette.
      */
    var togglePaletteOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setBeforeShow(value: /* color */ Instance => Unit): Self = StObject.set(x, "beforeShow", js.Any.fromFunction1(value))
      
      inline def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
      
      inline def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setChange(value: /* color */ Instance => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setChooseText(value: String): Self = StObject.set(x, "chooseText", value.asInstanceOf[js.Any])
      
      inline def setChooseTextUndefined: Self = StObject.set(x, "chooseText", js.undefined)
      
      inline def setClickoutFiresChange(value: Boolean): Self = StObject.set(x, "clickoutFiresChange", value.asInstanceOf[js.Any])
      
      inline def setClickoutFiresChangeUndefined: Self = StObject.set(x, "clickoutFiresChange", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setHide(value: /* color */ Instance => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction1(value))
      
      inline def setHideAfterPaletteSelect(value: Boolean): Self = StObject.set(x, "hideAfterPaletteSelect", value.asInstanceOf[js.Any])
      
      inline def setHideAfterPaletteSelectUndefined: Self = StObject.set(x, "hideAfterPaletteSelect", js.undefined)
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setLocalStorageKey(value: String): Self = StObject.set(x, "localStorageKey", value.asInstanceOf[js.Any])
      
      inline def setLocalStorageKeyUndefined: Self = StObject.set(x, "localStorageKey", js.undefined)
      
      inline def setMaxSelectionSize(value: Double): Self = StObject.set(x, "maxSelectionSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSelectionSizeUndefined: Self = StObject.set(x, "maxSelectionSize", js.undefined)
      
      inline def setMove(value: /* color */ Instance => Unit): Self = StObject.set(x, "move", js.Any.fromFunction1(value))
      
      inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
      
      inline def setPalette(value: js.Array[js.Array[String]]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPaletteVarargs(value: js.Array[String]*): Self = StObject.set(x, "palette", js.Array(value :_*))
      
      inline def setPreferredFormat(value: String): Self = StObject.set(x, "preferredFormat", value.asInstanceOf[js.Any])
      
      inline def setPreferredFormatUndefined: Self = StObject.set(x, "preferredFormat", js.undefined)
      
      inline def setReplacerClassName(value: String): Self = StObject.set(x, "replacerClassName", value.asInstanceOf[js.Any])
      
      inline def setReplacerClassNameUndefined: Self = StObject.set(x, "replacerClassName", js.undefined)
      
      inline def setSelectionPalette(value: js.Array[String]): Self = StObject.set(x, "selectionPalette", value.asInstanceOf[js.Any])
      
      inline def setSelectionPaletteUndefined: Self = StObject.set(x, "selectionPalette", js.undefined)
      
      inline def setSelectionPaletteVarargs(value: String*): Self = StObject.set(x, "selectionPalette", js.Array(value :_*))
      
      inline def setShow(value: /* color */ Instance => Unit): Self = StObject.set(x, "show", js.Any.fromFunction1(value))
      
      inline def setShowAlpha(value: Boolean): Self = StObject.set(x, "showAlpha", value.asInstanceOf[js.Any])
      
      inline def setShowAlphaUndefined: Self = StObject.set(x, "showAlpha", js.undefined)
      
      inline def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      inline def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      inline def setShowInitial(value: Boolean): Self = StObject.set(x, "showInitial", value.asInstanceOf[js.Any])
      
      inline def setShowInitialUndefined: Self = StObject.set(x, "showInitial", js.undefined)
      
      inline def setShowInput(value: Boolean): Self = StObject.set(x, "showInput", value.asInstanceOf[js.Any])
      
      inline def setShowInputUndefined: Self = StObject.set(x, "showInput", js.undefined)
      
      inline def setShowPalette(value: Boolean): Self = StObject.set(x, "showPalette", value.asInstanceOf[js.Any])
      
      inline def setShowPaletteOnly(value: Boolean): Self = StObject.set(x, "showPaletteOnly", value.asInstanceOf[js.Any])
      
      inline def setShowPaletteOnlyUndefined: Self = StObject.set(x, "showPaletteOnly", js.undefined)
      
      inline def setShowPaletteUndefined: Self = StObject.set(x, "showPalette", js.undefined)
      
      inline def setShowSelectionPalette(value: Boolean): Self = StObject.set(x, "showSelectionPalette", value.asInstanceOf[js.Any])
      
      inline def setShowSelectionPaletteUndefined: Self = StObject.set(x, "showSelectionPalette", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTogglePaletteLessText(value: String): Self = StObject.set(x, "togglePaletteLessText", value.asInstanceOf[js.Any])
      
      inline def setTogglePaletteLessTextUndefined: Self = StObject.set(x, "togglePaletteLessText", js.undefined)
      
      inline def setTogglePaletteMoreText(value: String): Self = StObject.set(x, "togglePaletteMoreText", value.asInstanceOf[js.Any])
      
      inline def setTogglePaletteMoreTextUndefined: Self = StObject.set(x, "togglePaletteMoreText", js.undefined)
      
      inline def setTogglePaletteOnly(value: Boolean): Self = StObject.set(x, "togglePaletteOnly", value.asInstanceOf[js.Any])
      
      inline def setTogglePaletteOnlyUndefined: Self = StObject.set(x, "togglePaletteOnly", js.undefined)
    }
  }
}
