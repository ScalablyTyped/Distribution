package typings
package spectrumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
       * Called at the beginning of a drag event on either hue slider, alpha slider, or main color picker areas.
       */
  @JSName("on")
  def on_dragstartspectrum(
    events: spectrumLib.spectrumLibStrings.dragstartDOTspectrum,
    handler: js.Function2[
      /* eventObject */ jqueryLib.JQueryEventObject, 
      /* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, 
      _
    ]
  ): JQuery = js.native
  /**
       * Called at the end of a drag event on either hue slider, alpha slider, or main color picker areas.
       */
  @JSName("on")
  def on_dragstopspectrum(
    events: spectrumLib.spectrumLibStrings.dragstopDOTspectrum,
    handler: js.Function2[
      /* eventObject */ jqueryLib.JQueryEventObject, 
      /* color */ tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance, 
      _
    ]
  ): JQuery = js.native
   // in most cases this is JQuery except for the get method which returns a tinycolorInstance
  /**
       * Initializes the input element that it is called on
       * as a spectrum colorpicker instance.
       */
  def spectrum(): JQuery = js.native
  /**
       * Calls the method.
       */
  def spectrum(methodName: java.lang.String): js.Any = js.native
   // in most cases this is JQuery except for the get method which returns a tinycolorInstance
  /**
       * Initializes the input element that it is called on
       * as a spectrum colorpicker instance.
       */
  def spectrum(options: spectrumLib.SpectrumNs.Options): JQuery = js.native
  /**
       * Retrieves the container element of the colorpicker,
       * in case you want to manaully position it or do other things.
       */
  @JSName("spectrum")
  def spectrum_container(methodName: spectrumLib.spectrumLibStrings.container): JQuery = js.native
  /**
       * Removes the colorpicker functionality and restores the element to its original state.
       */
  @JSName("spectrum")
  def spectrum_destroy(methodName: spectrumLib.spectrumLibStrings.destroy): JQuery = js.native
  /**
       * Disables selection of the colorpicker component. adds the sp-disabled class onto the replacer element.
       * If it is already disabled, this method does nothing.
       * Additionally, this will remove the disabled property on the original (now hidden).
       */
  @JSName("spectrum")
  def spectrum_disable(methodName: spectrumLib.spectrumLibStrings.disable): JQuery = js.native
  /**
       * Allows selection of the colorpicker component. if it is already enabled, this method does nothing.
       * Additionally, this will cause the original (now hidden) input to be set as disabled.
       */
  @JSName("spectrum")
  def spectrum_enable(methodName: spectrumLib.spectrumLibStrings.enable): JQuery = js.native
  /**
       * Gets the current value from the colorpicker.
       */
  @JSName("spectrum")
  def spectrum_get(methodName: spectrumLib.spectrumLibStrings.get): tinycolor2Lib.tinycolor2Mod.tinycolorNs.Instance = js.native
  /**
       * Hides the colorpicker.
       */
  @JSName("spectrum")
  def spectrum_hide(methodName: spectrumLib.spectrumLibStrings.hide): JQuery = js.native
  /**
       * Retrieves the current value for the option name.
       *
       * @param optionName- the option to retrieve the value for.
       */
  @JSName("spectrum")
  def spectrum_option(methodName: spectrumLib.spectrumLibStrings.option): JQuery = js.native
  /**
       * Retrieves the current value for the option name.
       *
       * @param optionName- the option to retrieve the value for.
       */
  @JSName("spectrum")
  def spectrum_option(methodName: spectrumLib.spectrumLibStrings.option, optionName: java.lang.String): JQuery = js.native
  /**
       * Sets the value of the option name with the value passed in.
       *
       * @param optionName- the option to set.
       * @param newOptionvalue- the new value for the option.
       */
  @JSName("spectrum")
  def spectrum_option(
    methodName: spectrumLib.spectrumLibStrings.option,
    optionName: java.lang.String,
    newOptionValue: js.Any
  ): JQuery = js.native
  /**
       * Resets the positioning of the container element.
       * This could be used if the colorpicker was hidden when initialized,
       * or if the colorpicker is inside of a moving area.
       */
  @JSName("spectrum")
  def spectrum_reflow(methodName: spectrumLib.spectrumLibStrings.reflow): JQuery = js.native
  /**
       * Sets the colorpickers value to update the original input.
       * Note: this will not fire the `change` event, to prevent infinite loops
       *  from calling `set` from within `change`.
       *
       * @param colorString- the new color for the colorpicker.
       */
  @JSName("spectrum")
  def spectrum_set(methodName: spectrumLib.spectrumLibStrings.set): JQuery = js.native
  /**
       * Sets the colorpickers value to update the original input.
       * Note: this will not fire the `change` event, to prevent infinite loops
       *  from calling `set` from within `change`.
       *
       * @param colorString- the new color for the colorpicker.
       */
  @JSName("spectrum")
  def spectrum_set(methodName: spectrumLib.spectrumLibStrings.set, colorString: java.lang.String): JQuery = js.native
  /**
       * Shows the colorpicker.
       */
  @JSName("spectrum")
  def spectrum_show(methodName: spectrumLib.spectrumLibStrings.show): JQuery = js.native
  /**
      * Toggles the colorpicker.
      *
      * Warning: If you are calling toggle from a click handler,
      *   make sure you return false to prevent the colorpicker from immediately hiding after it is toggled.
      */
  @JSName("spectrum")
  def spectrum_toggle(methodName: spectrumLib.spectrumLibStrings.toggle): JQuery = js.native
}

