package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BoxProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
       * Whether the Box is enabled.
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether there is extra space between the children in the Box.
       */
  var padded: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the Box arranges its children vertically or horizontally.
       */
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether the Box and its children can be seen.
       */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

