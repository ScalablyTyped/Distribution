package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  /**
    * Group can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Whether the Group is enabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether there is a margin inside the group.
    */
  var margined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the group.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the Grid can be seen.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

