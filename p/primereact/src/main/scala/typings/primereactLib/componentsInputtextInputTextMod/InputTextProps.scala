package typings
package primereactLib.componentsInputtextInputTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTextProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLInputElement]
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var keyfilter: js.UndefOr[js.Any] = js.undefined
  @JSName("onInput")
  var onInput_InputTextProps: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.FormEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.undefined
  @JSName("onKeyPress")
  var onKeyPress_InputTextProps: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.undefined
  var tooltip: js.UndefOr[js.Any] = js.undefined
  var tooltipOptions: js.UndefOr[primereactLib.componentsTooltipTooltipOptionsMod.TooltipOptions] = js.undefined
  var validateOnly: js.UndefOr[scala.Boolean] = js.undefined
}

