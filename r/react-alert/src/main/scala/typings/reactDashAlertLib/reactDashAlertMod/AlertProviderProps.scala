package typings
package reactDashAlertLib.reactDashAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProviderProps
  extends reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] {
  /**
    * The style of the alert container
    *
    * Default z-index value: 100
    */
  var containerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /**
    * Custom context to separate alerts.
    */
  var context: js.UndefOr[reactLib.reactMod.Context[js.UndefOr[AlertManager]]] = js.undefined
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
    * The alert component for each message
    */
  var template: reactLib.reactMod.ComponentType[AlertComponentPropsWithStyle]
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
}

object AlertProviderProps {
  @scala.inline
  def apply(
    template: reactLib.reactMod.ComponentType[AlertComponentPropsWithStyle],
    HTMLAttributes: reactLib.reactMod.HTMLAttributes[stdLib.HTMLDivElement] = null,
    containerStyle: reactLib.reactMod.CSSProperties = null,
    context: reactLib.reactMod.Context[js.UndefOr[AlertManager]] = null,
    offset: java.lang.String = null,
    position: AlertPosition = null,
    timeout: scala.Int | scala.Double = null,
    transition: AlertTransition = null,
    `type`: AlertType = null
  ): AlertProviderProps = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (context != null) __obj.updateDynamic("context")(context)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AlertProviderProps]
  }
}

