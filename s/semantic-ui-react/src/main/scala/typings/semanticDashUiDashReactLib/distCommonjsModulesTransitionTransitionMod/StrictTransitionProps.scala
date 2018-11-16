package typings
package semanticDashUiDashReactLib.distCommonjsModulesTransitionTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StrictTransitionProps extends js.Object {
  /** Named animation event to used. Must be defined in CSS. */
  var animation: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticTRANSITIONS] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Duration of the CSS transition animation in milliseconds. */
  var duration: js.UndefOr[scala.Double | java.lang.String | TransitionPropDuration] = js.undefined
  /** Wait until the first "enter" transition to mount the component (add it to the DOM). */
  var mountOnShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Callback on each transition that changes visibility to shown.
     *
     * @param {null}
     * @param {object} data - All props with status.
     */
  var onComplete: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ TransitionEventData, scala.Unit]
  ] = js.undefined
  /**
     * Callback on each transition that changes visibility to hidden.
     *
     * @param {null}
     * @param {object} data - All props with status.
     */
  var onHide: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ TransitionEventData, scala.Unit]
  ] = js.undefined
  /**
     * Callback on each transition that changes visibility to shown.
     *
     * @param {null}
     * @param {object} data - All props with status.
     */
  var onShow: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ TransitionEventData, scala.Unit]
  ] = js.undefined
  /**
     * Callback on animation start.
     *
     * @param {null}
     * @param {object} data - All props with status.
     */
  var onStart: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ TransitionEventData, scala.Unit]
  ] = js.undefined
  /** React's key of the element. */
  var reactKey: js.UndefOr[java.lang.String] = js.undefined
  /** Run the enter animation when the component mounts, if it is initially shown. */
  var transitionOnMount: js.UndefOr[scala.Boolean] = js.undefined
  /** Unmount the component (remove it from the DOM) when it is not shown. */
  var unmountOnHide: js.UndefOr[scala.Boolean] = js.undefined
  /** Show the component; triggers the enter or exit animation. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

