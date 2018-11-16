package typings
package semanticDashUiDashReactLib.distCommonjsAddonsResponsiveResponsiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictResponsiveProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
     * otherwise, assumes a width of 0.
     */
  var getWidth: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** The maximum width at which content will be displayed. */
  var maxWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The minimum width at which content will be displayed. */
  var minWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
     * Called on update.
     *
     * @param {SyntheticEvent} event - The React SyntheticEvent object
     * @param {object} data - All props and the event value.
     */
  var onUpdate: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement], 
      /* data */ ResponsiveOnUpdateData, 
      scala.Unit
    ]
  ] = js.undefined
}

