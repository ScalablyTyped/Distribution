package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalInnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictPortalInnerProps extends js.Object {
  /** Primary content. */
  var children: reactLib.reactMod.ReactNs.ReactNode
  /** The node where the portal should mount. */
  var mountNode: js.UndefOr[js.Any] = js.undefined
  /**
     * Called when the PortalInner is mounted on the DOM.
     *
     * @param {null}
     * @param {object} data - All props.
     */
  var onMount: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ PortalInnerProps, scala.Unit]] = js.undefined
  /**
     * Called when the PortalInner is unmounted from the DOM.
     *
     * @param {null}
     * @param {object} data - All props.
     */
  var onUnmount: js.UndefOr[js.Function2[/* nothing */ scala.Null, /* data */ PortalInnerProps, scala.Unit]] = js.undefined
}

