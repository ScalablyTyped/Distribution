package typings.spectrum

import typings.jquery.JQuery.ChangeEvent
import typings.jquery.JQuery.CoordinatesPartial
import typings.jquery.JQuery.Selector
import typings.jquery.JQuery.TypeOrArray
import typings.jquery.JQuery.htmlString
import typings.spectrum.Spectrum.BeforeShowEvent
import typings.spectrum.Spectrum.ColorFormatName
import typings.spectrum.Spectrum.DragstartEvent
import typings.spectrum.Spectrum.DragstopEvent
import typings.spectrum.Spectrum.HideEvent
import typings.spectrum.Spectrum.MoveEvent
import typings.spectrum.Spectrum.Options
import typings.spectrum.Spectrum.ShowEvent
import typings.spectrum.spectrumBooleans.`false`
import typings.spectrum.spectrumStrings.allowEmpty
import typings.spectrum.spectrumStrings.appendTo
import typings.spectrum.spectrumStrings.beforeShow
import typings.spectrum.spectrumStrings.cancelText
import typings.spectrum.spectrumStrings.change
import typings.spectrum.spectrumStrings.chooseText
import typings.spectrum.spectrumStrings.clearText
import typings.spectrum.spectrumStrings.clickoutFiresChange
import typings.spectrum.spectrumStrings.color
import typings.spectrum.spectrumStrings.container
import typings.spectrum.spectrumStrings.containerClassName
import typings.spectrum.spectrumStrings.destroy
import typings.spectrum.spectrumStrings.disable
import typings.spectrum.spectrumStrings.disabled
import typings.spectrum.spectrumStrings.enable
import typings.spectrum.spectrumStrings.flat
import typings.spectrum.spectrumStrings.get
import typings.spectrum.spectrumStrings.hide
import typings.spectrum.spectrumStrings.hideAfterPaletteSelect
import typings.spectrum.spectrumStrings.localStorageKey
import typings.spectrum.spectrumStrings.maxSelectionSize
import typings.spectrum.spectrumStrings.move
import typings.spectrum.spectrumStrings.noColorSelectedText
import typings.spectrum.spectrumStrings.offset
import typings.spectrum.spectrumStrings.option
import typings.spectrum.spectrumStrings.palette
import typings.spectrum.spectrumStrings.preferredFormat
import typings.spectrum.spectrumStrings.reflow
import typings.spectrum.spectrumStrings.replacerClassName
import typings.spectrum.spectrumStrings.selectionPalette
import typings.spectrum.spectrumStrings.set
import typings.spectrum.spectrumStrings.show
import typings.spectrum.spectrumStrings.showAlpha
import typings.spectrum.spectrumStrings.showButtons
import typings.spectrum.spectrumStrings.showInitial
import typings.spectrum.spectrumStrings.showInput
import typings.spectrum.spectrumStrings.showPalette
import typings.spectrum.spectrumStrings.showPaletteOnly
import typings.spectrum.spectrumStrings.showSelectionPalette
import typings.spectrum.spectrumStrings.toggle
import typings.spectrum.spectrumStrings.togglePaletteLessText
import typings.spectrum.spectrumStrings.togglePaletteMoreText
import typings.spectrum.spectrumStrings.togglePaletteOnly
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.NonNullable
import typings.tinycolor2.mod.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable:unified-signatures self-documenting code and JSDoc require non-unified signatures
@js.native
trait JQuery extends StObject {
  
  /**
    * Initializes the input element that it is called on as a spectrum color
    * picker instance.
    *
    * Just create a normal input and initialize it as a normal jQuery plugin.
    * You can set a lot of options when initializing the color picker.
    *
    * ```html
    * <input type='text' id="custom" />
    *
    * <script>
    * $("#custom").spectrum({
    *   color: "#f00"
    * });
    * </script>
    * ```
    */
  def spectrum(): JQuery = js.native
  def spectrum(methodName: option, optionName: allowEmpty): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: allowEmpty, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: appendTo): js.UndefOr[Selector | htmlString | (TypeOrArray[Element | DocumentFragment]) | JQuery] = js.native
  def spectrum(
    methodName: option,
    optionName: appendTo,
    newOptionValue: NonNullable[
      js.UndefOr[Selector | htmlString | (TypeOrArray[Element | DocumentFragment]) | JQuery]
    ]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: beforeShow): js.UndefOr[js.Function1[/* color */ Instance, Boolean | Unit]] = js.native
  def spectrum(
    methodName: option,
    optionName: beforeShow,
    newOptionValue: NonNullable[js.UndefOr[js.Function1[/* color */ Instance, Boolean | Unit]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: cancelText): js.UndefOr[String] = js.native
  def spectrum(methodName: option, optionName: cancelText, newOptionValue: NonNullable[js.UndefOr[String]]): JQuery = js.native
  def spectrum(methodName: option, optionName: change): js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  def spectrum(
    methodName: option,
    optionName: change,
    newOptionValue: NonNullable[js.UndefOr[js.Function1[/* color */ Instance, Unit]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: chooseText): js.UndefOr[String] = js.native
  def spectrum(methodName: option, optionName: chooseText, newOptionValue: NonNullable[js.UndefOr[String]]): JQuery = js.native
  def spectrum(methodName: option, optionName: clearText): js.UndefOr[String] = js.native
  def spectrum(methodName: option, optionName: clearText, newOptionValue: NonNullable[js.UndefOr[String]]): JQuery = js.native
  def spectrum(methodName: option, optionName: clickoutFiresChange): js.UndefOr[Boolean] = js.native
  def spectrum(
    methodName: option,
    optionName: clickoutFiresChange,
    newOptionValue: NonNullable[js.UndefOr[Boolean]]
  ): JQuery = js.native
  /**
    * Retrieves the current value for the option with the given name.
    *
    * ```javascript
    * $("input").spectrum({
    *   showInput: true
    * });
    * $("input").spectrum("option", "showInput"); // true
    * ```
    *
    * @param methodName Name of the method to call, i.e. `option`.
    * @param optionName Name of the option for which to retrieve the value.
    * @return The current value for the given option.
    */
  def spectrum(methodName: option, optionName: color): js.UndefOr[String | `false`] = js.native
  /**
    * Sets the value of the option with the given name to the given value.
    *
    * ```javascript
    * $("input").spectrum({
    *   showInput: true
    * });
    * $("input").spectrum("option", "showInput", false);
    * $("input").spectrum("option", "showInput"); // false
    * ```
    *
    * @param optionName Name of the option to set.
    * @param newOptionValue the new value for the option. This must not be
    * `undefined`, or the current value of the option will be returned.
    * @return This JQuery instance for chaining method calls.
    */
  def spectrum(methodName: option, optionName: color, newOptionValue: NonNullable[js.UndefOr[String | `false`]]): JQuery = js.native
  def spectrum(methodName: option, optionName: containerClassName): js.UndefOr[String] = js.native
  def spectrum(
    methodName: option,
    optionName: containerClassName,
    newOptionValue: NonNullable[js.UndefOr[String]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: disabled): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: disabled, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: flat): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: flat, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: hide): js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  def spectrum(methodName: option, optionName: hideAfterPaletteSelect): js.UndefOr[Boolean] = js.native
  def spectrum(
    methodName: option,
    optionName: hideAfterPaletteSelect,
    newOptionValue: NonNullable[js.UndefOr[Boolean]]
  ): JQuery = js.native
  def spectrum(
    methodName: option,
    optionName: hide,
    newOptionValue: NonNullable[js.UndefOr[js.Function1[/* color */ Instance, Unit]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: localStorageKey): js.UndefOr[String | `false`] = js.native
  def spectrum(
    methodName: option,
    optionName: localStorageKey,
    newOptionValue: NonNullable[js.UndefOr[String | `false`]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: maxSelectionSize): js.UndefOr[Double] = js.native
  def spectrum(methodName: option, optionName: maxSelectionSize, newOptionValue: NonNullable[js.UndefOr[Double]]): JQuery = js.native
  def spectrum(methodName: option, optionName: move): js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  def spectrum(
    methodName: option,
    optionName: move,
    newOptionValue: NonNullable[js.UndefOr[js.Function1[/* color */ Instance, Unit]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: noColorSelectedText): js.UndefOr[String] = js.native
  def spectrum(
    methodName: option,
    optionName: noColorSelectedText,
    newOptionValue: NonNullable[js.UndefOr[String]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: offset): js.UndefOr[CoordinatesPartial | Null] = js.native
  def spectrum(
    methodName: option,
    optionName: offset,
    newOptionValue: NonNullable[js.UndefOr[CoordinatesPartial | Null]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: palette): js.UndefOr[js.Array[js.Array[String]]] = js.native
  def spectrum(
    methodName: option,
    optionName: palette,
    newOptionValue: NonNullable[js.UndefOr[js.Array[js.Array[String]]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: preferredFormat): js.UndefOr[ColorFormatName | `false`] = js.native
  def spectrum(
    methodName: option,
    optionName: preferredFormat,
    newOptionValue: NonNullable[js.UndefOr[ColorFormatName | `false`]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: replacerClassName): js.UndefOr[String] = js.native
  def spectrum(methodName: option, optionName: replacerClassName, newOptionValue: NonNullable[js.UndefOr[String]]): JQuery = js.native
  def spectrum(methodName: option, optionName: selectionPalette): js.UndefOr[js.Array[String]] = js.native
  def spectrum(
    methodName: option,
    optionName: selectionPalette,
    newOptionValue: NonNullable[js.UndefOr[js.Array[String]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: show): js.UndefOr[js.Function1[/* color */ Instance, Unit]] = js.native
  def spectrum(methodName: option, optionName: showAlpha): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: showAlpha, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: showButtons): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: showButtons, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: showInitial): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: showInitial, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: showInput): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: showInput, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: showPalette): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: showPaletteOnly): js.UndefOr[Boolean] = js.native
  def spectrum(methodName: option, optionName: showPaletteOnly, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: showPalette, newOptionValue: NonNullable[js.UndefOr[Boolean]]): JQuery = js.native
  def spectrum(methodName: option, optionName: showSelectionPalette): js.UndefOr[Boolean] = js.native
  def spectrum(
    methodName: option,
    optionName: showSelectionPalette,
    newOptionValue: NonNullable[js.UndefOr[Boolean]]
  ): JQuery = js.native
  def spectrum(
    methodName: option,
    optionName: show,
    newOptionValue: NonNullable[js.UndefOr[js.Function1[/* color */ Instance, Unit]]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: togglePaletteLessText): js.UndefOr[String] = js.native
  def spectrum(
    methodName: option,
    optionName: togglePaletteLessText,
    newOptionValue: NonNullable[js.UndefOr[String]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: togglePaletteMoreText): js.UndefOr[String] = js.native
  def spectrum(
    methodName: option,
    optionName: togglePaletteMoreText,
    newOptionValue: NonNullable[js.UndefOr[String]]
  ): JQuery = js.native
  def spectrum(methodName: option, optionName: togglePaletteOnly): js.UndefOr[Boolean] = js.native
  def spectrum(
    methodName: option,
    optionName: togglePaletteOnly,
    newOptionValue: NonNullable[js.UndefOr[Boolean]]
  ): JQuery = js.native
  def spectrum(options: Options): JQuery = js.native
  /**
    * Retrieves the container element of the color picker, in case you want to
    * manually position it or do other things.
    *
    * @param methodName Name of the method to call, i.e. `container`.
    * @return The JQuery element representing the container DOM element of the
    * color picker.
    */
  @JSName("spectrum")
  def spectrum_container(methodName: container): JQuery = js.native
  /**
    * Removes the color picker functionality and restores the element to its
    * original state.
    *
    * @param methodName Name of the method to call, i.e. `destroy`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_destroy(methodName: destroy): JQuery = js.native
  /**
    * Disables selection of the color picker component. Adds the `sp-disabled`
    * class to the replacer element. If it is already disabled, this method
    * does nothing.
    *
    * Additionally, this will remove the `disabled` property on the original
    * now hidden).
    *
    * @param methodName Name of the method to call, i.e. `disable`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_disable(methodName: disable): JQuery = js.native
  /**
    * Allows selection of the color picker component. if it is already enabled,
    * this method does nothing.
    *
    * Additionally, this will cause the original (now hidden) input to be set
    * as disabled.
    *
    * @param methodName Name of the method to call, i.e. `enable`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_enable(methodName: enable): JQuery = js.native
  /**
    * Gets the current value from the color picker.
    *
    * @param methodName Name of the method to call, i.e. `get`.
    * @return The currently selected color.
    */
  @JSName("spectrum")
  def spectrum_get(methodName: get): Instance = js.native
  /**
    * Hides the color picker.
    *
    * @param methodName Name of the method to call, i.e. `hide`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_hide(methodName: hide): JQuery = js.native
  /**
    * Retrieves the set of options currently set on the color picker.
    *
    * @param methodName Name of the method to call, i.e. `option`.
    * @return An object with all options currently set on the color picker.
    */
  @JSName("spectrum")
  def spectrum_option(methodName: option): Options = js.native
  /**
    * Resets the positioning of the container element.
    *
    * This could be used if the color picker was hidden when initialized, or if
    * the color picker is inside of a moving area.
    *
    * @param methodName Name of the method to call, i.e. `reflow`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_reflow(methodName: reflow): JQuery = js.native
  /**
    * Sets the color picker's value to update the original input.
    *
    * Note: This will not fire the `change` event, to prevent infinite loops
    * from calling `set` from within `change`.
    *
    * ```html
    * <input type='text' value='blanchedalmond' name='triggerSet' id='triggerSet' />
    * <input type='text' placeholder='Enter A Color' id='enterAColor' />
    * <button id='btnEnterAColor'>Trigger Set</button>
    * <script>
    *   $("#triggerSet").spectrum();
    *
    * // Show the original input to demonstrate the
    *   // value changing when calling `set`
    *   $("#triggerSet").show();
    *
    *   $("#btnEnterAColor").click(function() {
    *     $("#triggerSet").spectrum("set", $("#enterAColor").val());
    *   });
    * </script>
    * ```
    *
    * @param methodName Name of the method to call, i.e. `set`.
    * @param colorString The new color for the color picker. When not given,
    * resets the color to the default color.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_set(methodName: set): JQuery = js.native
  @JSName("spectrum")
  def spectrum_set(methodName: set, colorString: String): JQuery = js.native
  /**
    * Shows the color picker.
    *
    * @param methodName Name of the method to call, i.e. `show`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_show(methodName: show): JQuery = js.native
  /**
    * Toggles the color picker.
    *
    * Warning: If you are calling toggle from a click handler, make sure you
    * return `false` to prevent the color picker from immediately hiding after
    * it is toggled.
    *
    * ```javascript
    * $("#btn-toggle").click(function() {
    *   $("#toggle").spectrum("toggle");
    *   return false;
    * });
    * ```
    *
    * @param methodName Name of the method to call, i.e. `toggle`.
    * @return This JQuery instance for chaining method calls.
    */
  @JSName("spectrum")
  def spectrum_toggle(methodName: toggle): JQuery = js.native
}
object JQuery {
  
  trait TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] extends StObject {
    
    /**
      * You can prevent the color picker from showing up if you return
      * `false` in the `beforeShow` event.
      *
      * This event is ignored on a flat color picker.
      *
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   beforeShow: function(color) {
      *     color.toHexString(); // #ff0000
      *     return false; // Will never show up
      *   }
      * }
      * ```
      */
    @JSName("beforeShow.spectrum")
    var beforeShowDotspectrum: BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    
    /**
      * Called as the original input changes. Only happens when the input is
      * closed or the 'Choose' button is clicked.
      *
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   change: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      */
    @JSName("change.spectrum")
    var changeDotspectrum: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    
    /**
      * Called at the beginning of a drag event on either hue slider, alpha
      * slider, or main color picker areas.
      *
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $(element).on("dragstart.spectrum", function(e, color) {
      *  color.toHexString(); // #ff0000
      * });
      * ```
      */
    @JSName("dragstart.spectrum")
    var dragstartDotspectrum: DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    
    /**
      * Called at the end of a drag event on either hue slider, alpha slider, or
      * main color picker areas.
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $(element).on("dragstop.spectrum", function(e, color) {
      *  color.toHexString(); // #ff0000
      * });
      * ```
      */
    @JSName("dragstop.spectrum")
    var dragstopDotspectrum: DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    
    /**
      * Called after the color picker is hidden.
      *
      * This happens when clicking outside of the picker while it is open.
      *
      * Note: When any color picker on the page is shown, it will hide all
      * other color picker that are already open.
      *
      * This event is ignored on a flat color picker, i.e. when `flat` is
      * set to `true`.
      *
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   hide: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      */
    @JSName("hide.spectrum")
    var hideDotspectrum: HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    
    /**
      * Called as the user moves around within the color picker.
      *
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   move: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      */
    @JSName("move.spectrum")
    var moveDotspectrum: MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    
    /**
      * Called after the color picker is opened. This is ignored on a flat
      * color picker.
      *
      * Note: When any color picker on the page is shown, it will hide all
      * other color pickers that are already open.
      *
      * The callback will receive an additional argument of type
      * `tinycolor.Instance` with the currently selected color.
      *
      * ```javascript
      * $("#picker").spectrum({
      *   show: function(color) {
      *     color.toHexString(); // #ff0000
      *   }
      * }
      * ```
      */
    @JSName("show.spectrum")
    var showDotspectrum: ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
  }
  object TypeToTriggeredEventMap {
    
    inline def apply[TDelegateTarget, TData, TCurrentTarget, TTarget](
      beforeShowDotspectrum: BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
      changeDotspectrum: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
      dragstartDotspectrum: DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
      dragstopDotspectrum: DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
      hideDotspectrum: HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
      moveDotspectrum: MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget],
      showDotspectrum: ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]
    ): TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("beforeShow.spectrum")(beforeShowDotspectrum.asInstanceOf[js.Any])
      __obj.updateDynamic("change.spectrum")(changeDotspectrum.asInstanceOf[js.Any])
      __obj.updateDynamic("dragstart.spectrum")(dragstartDotspectrum.asInstanceOf[js.Any])
      __obj.updateDynamic("dragstop.spectrum")(dragstopDotspectrum.asInstanceOf[js.Any])
      __obj.updateDynamic("hide.spectrum")(hideDotspectrum.asInstanceOf[js.Any])
      __obj.updateDynamic("move.spectrum")(moveDotspectrum.asInstanceOf[js.Any])
      __obj.updateDynamic("show.spectrum")(showDotspectrum.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget]]
    }
    
    extension [Self <: TypeToTriggeredEventMap[?, ?, ?, ?], TDelegateTarget, TData, TCurrentTarget, TTarget](x: Self & (TypeToTriggeredEventMap[TDelegateTarget, TData, TCurrentTarget, TTarget])) {
      
      inline def setBeforeShowDotspectrum(value: BeforeShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "beforeShow.spectrum", value.asInstanceOf[js.Any])
      
      inline def setChangeDotspectrum(value: ChangeEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "change.spectrum", value.asInstanceOf[js.Any])
      
      inline def setDragstartDotspectrum(value: DragstartEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "dragstart.spectrum", value.asInstanceOf[js.Any])
      
      inline def setDragstopDotspectrum(value: DragstopEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "dragstop.spectrum", value.asInstanceOf[js.Any])
      
      inline def setHideDotspectrum(value: HideEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "hide.spectrum", value.asInstanceOf[js.Any])
      
      inline def setMoveDotspectrum(value: MoveEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "move.spectrum", value.asInstanceOf[js.Any])
      
      inline def setShowDotspectrum(value: ShowEvent[TDelegateTarget, TData, TCurrentTarget, TTarget]): Self = StObject.set(x, "show.spectrum", value.asInstanceOf[js.Any])
    }
  }
}
