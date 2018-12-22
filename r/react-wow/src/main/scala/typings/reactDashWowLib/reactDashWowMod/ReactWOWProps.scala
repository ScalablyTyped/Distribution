package typings
package reactDashWowLib.reactDashWowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ReactWOWProps extends js.Object {
  /**
       * Animation css class.
       * @default animated
       */
  var animateClass: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Animation name.
       * @see https://daneden.github.io/animate.css/
       */
  var animation: /* LimitUnionLength: was union type with length 76 */java.lang.String
  /**
       * The callback is fired every time an animation is stoped.
       */
  var callback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
       * Content you want to apply the animation to.
       */
  var children: reactLib.reactMod.Global.JSXNs.Element
  /**
       * Animation delay.
       */
  var delay: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Disable the animation.
       * @default false
       */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Animation duration.
       */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Animation iteration count.
       */
  var iteration: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Distance to the element when triggering the animation.
       * @default 0
       */
  var offset: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  /**
       * If your components inside a overflow container, set this to true.
       * @default false
       */
  var overflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Listen and react to resize event.
       * @default true
       */
  var resize: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Listen and react to scroll event.
       * @default true
       */
  var scroll: js.UndefOr[scala.Boolean] = js.undefined
}

