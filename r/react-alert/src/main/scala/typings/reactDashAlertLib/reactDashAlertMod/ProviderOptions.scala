package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderOptions extends js.Object {
  /**
    * The margin of each alert
    *
    * Default value: '10px'
    */
  var offset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The position of the alerts in the page
    *
    * Default value: 'top center'
    */
  var position: js.UndefOr[AlertPosition] = js.undefined
  /**
    * Timeout to alert remove itself, if  set to 0 it never removes itself
    *
    * Default value: 0
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * The transition animation
    *
    * Default value: 'fade'
    */
  var transition: js.UndefOr[AlertTransition] = js.undefined
  /**
    * The default alert type used when calling this.props.alert.show
    *
    * Default value: 'info'
    */
  var `type`: js.UndefOr[AlertType] = js.undefined
  /**
    * The z-index of alerts
    *
    * Default value: 100
    */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

