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

