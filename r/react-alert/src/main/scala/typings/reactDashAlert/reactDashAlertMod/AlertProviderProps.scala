package typings.reactDashAlert.reactDashAlertMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProviderProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The style of the alert container
    *
    * Default z-index value: 100
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Custom context to separate alerts.
    */
  var context: js.UndefOr[Context[js.UndefOr[AlertManager]]] = js.undefined
  /**
    * The margin of each alert
    *
    * Default value: '10px'
    */
  var offset: js.UndefOr[String] = js.undefined
  /**
    * The position of the alerts in the page
    *
    * Default value: 'top center'
    */
  var position: js.UndefOr[AlertPosition] = js.undefined
  /**
    * The alert component for each message
    */
  var template: ComponentType[AlertComponentPropsWithStyle]
  /**
    * Timeout to alert remove itself, if  set to 0 it never removes itself
    *
    * Default value: 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
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
    template: ComponentType[AlertComponentPropsWithStyle],
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    containerStyle: CSSProperties = null,
    context: Context[js.UndefOr[AlertManager]] = null,
    offset: String = null,
    position: AlertPosition = null,
    timeout: Int | Double = null,
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

