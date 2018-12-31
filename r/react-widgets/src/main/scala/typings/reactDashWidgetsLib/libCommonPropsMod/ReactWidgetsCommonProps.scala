package typings
package reactDashWidgetsLib.libCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactWidgetsCommonProps[C]
  extends reactLib.reactMod.ReactNs.Props[C] {
  /**
    * Disable the widget, if an Array of values is passed in only those values will be disabled.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
  /**
    * Used to label and annotate aria- attributes
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Mark whether the SelectList should render right-to-left. This property can also be
    * implicitly passed to the widget through a childContext prop (isRtl) this allows higher
    * level application components to specify the direction.
    * @default false
    */
  var isRtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Place the widget in a read-only mode, If an Array of values is passed in only those
    * values will be read-only.
    * @default false
    */
  var readOnly: js.UndefOr[scala.Boolean | js.Array[_]] = js.undefined
}

