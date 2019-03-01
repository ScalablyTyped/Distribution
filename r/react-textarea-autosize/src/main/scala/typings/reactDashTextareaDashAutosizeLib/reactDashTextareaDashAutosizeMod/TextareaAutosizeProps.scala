package typings
package reactDashTextareaDashAutosizeLib.reactDashTextareaDashAutosizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextareaAutosizeProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLTextAreaElement] {
  /**
    * Allows an owner to retrieve the DOM node.
    */
  var inputRef: js.UndefOr[js.Function1[/* node */ reactLib.HTMLTextAreaElement, scala.Unit]] = js.undefined
  /**
    * Maximum number of rows to show.
    */
  var maxRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Alias for `rows`.
    */
  var minRows: js.UndefOr[scala.Double] = js.undefined
  /**
    * Callback on value change
    * @param event
    */
  @JSName("onChange")
  var onChange_TextareaAutosizeProps: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLTextAreaElement], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback on height change
    * @param height
    */
  var onHeightChange: js.UndefOr[js.Function1[/* height */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Try to cache DOM measurements performed by component so that we don't
    * touch DOM when it's not needed.
    *
    * This optimization doesn't work if we dynamically style <textarea />
    * component.
    * @default false
    */
  var useCacheForDOMMeasurements: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Current textarea value
    */
  @JSName("value")
  var value_TextareaAutosizeProps: js.UndefOr[java.lang.String] = js.undefined
}

object TextareaAutosizeProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactLib.HTMLTextAreaElement] = null,
    inputRef: js.Function1[/* node */ reactLib.HTMLTextAreaElement, scala.Unit] = null,
    maxRows: scala.Int | scala.Double = null,
    minRows: scala.Int | scala.Double = null,
    onChange: js.Function1[
      /* event */ reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLTextAreaElement], 
      scala.Unit
    ] = null,
    onHeightChange: js.Function1[/* height */ scala.Double, scala.Unit] = null,
    rows: scala.Int | scala.Double = null,
    useCacheForDOMMeasurements: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): TextareaAutosizeProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef)
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (minRows != null) __obj.updateDynamic("minRows")(minRows.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onHeightChange != null) __obj.updateDynamic("onHeightChange")(onHeightChange)
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (!js.isUndefined(useCacheForDOMMeasurements)) __obj.updateDynamic("useCacheForDOMMeasurements")(useCacheForDOMMeasurements)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TextareaAutosizeProps]
  }
}

