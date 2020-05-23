package typings.reactHammerjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hammerjs.CssProps
import typings.hammerjs.HammerInput
import typings.hammerjs.HammerManager
import typings.hammerjs.RecognizerOptions
import typings.hammerjs.RecognizerTuple
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<hammerjs.HammerOptions, 'recognizers'> & {  recognizers ? :{[gesture: string] : hammerjs.RecognizerOptions}} */
trait HammerOptionsWithRecognizers extends js.Object {
  var cssProps: js.UndefOr[CssProps] = js.undefined
  var domEvents: js.UndefOr[Boolean] = js.undefined
  var enable: js.UndefOr[Boolean | (js.Function1[/* manager */ HammerManager, Boolean])] = js.undefined
  var inputClass: js.UndefOr[HammerInput] = js.undefined
  var inputTarget: js.UndefOr[EventTarget] = js.undefined
  var preset: js.UndefOr[js.Array[RecognizerTuple]] = js.undefined
  var recognizers: js.UndefOr[StringDictionary[RecognizerOptions]] = js.undefined
  var touchAction: js.UndefOr[String] = js.undefined
}

object HammerOptionsWithRecognizers {
  @scala.inline
  def apply(
    cssProps: CssProps = null,
    domEvents: js.UndefOr[Boolean] = js.undefined,
    enable: Boolean | (js.Function1[/* manager */ HammerManager, Boolean]) = null,
    inputClass: HammerInput = null,
    inputTarget: EventTarget = null,
    preset: js.Array[RecognizerTuple] = null,
    recognizers: StringDictionary[RecognizerOptions] = null,
    touchAction: String = null
  ): HammerOptionsWithRecognizers = {
    val __obj = js.Dynamic.literal()
    if (cssProps != null) __obj.updateDynamic("cssProps")(cssProps.asInstanceOf[js.Any])
    if (!js.isUndefined(domEvents)) __obj.updateDynamic("domEvents")(domEvents.get.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (inputClass != null) __obj.updateDynamic("inputClass")(inputClass.asInstanceOf[js.Any])
    if (inputTarget != null) __obj.updateDynamic("inputTarget")(inputTarget.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (recognizers != null) __obj.updateDynamic("recognizers")(recognizers.asInstanceOf[js.Any])
    if (touchAction != null) __obj.updateDynamic("touchAction")(touchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerOptionsWithRecognizers]
  }
}

