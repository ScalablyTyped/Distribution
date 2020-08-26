package typings.reactAlert.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertProviderProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * The style of the alert container
    *
    * Default z-index value: 100
    */
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Custom context to separate alerts.
    */
  var context: js.UndefOr[Context[js.UndefOr[AlertManager]]] = js.native
  /**
    * The margin of each alert
    *
    * Default value: '10px'
    */
  var offset: js.UndefOr[String] = js.native
  /**
    * The position of the alerts in the page
    *
    * Default value: 'top center'
    */
  var position: js.UndefOr[AlertPosition] = js.native
  /**
    * The alert component for each message
    */
  var template: ComponentType[AlertComponentPropsWithStyle] = js.native
  /**
    * Timeout to alert remove itself, if  set to 0 it never removes itself
    *
    * Default value: 0
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * The transition animation
    *
    * Default value: 'fade'
    */
  var transition: js.UndefOr[AlertTransition] = js.native
  /**
    * The default alert type used when calling this.props.alert.show
    *
    * Default value: 'info'
    */
  var `type`: js.UndefOr[AlertType] = js.native
}

object AlertProviderProps {
  @scala.inline
  def apply(template: ComponentType[AlertComponentPropsWithStyle]): AlertProviderProps = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProviderProps]
  }
  @scala.inline
  implicit class AlertProviderPropsOps[Self <: AlertProviderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTemplate(value: ComponentType[AlertComponentPropsWithStyle]): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setContext(value: Context[js.UndefOr[AlertManager]]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: AlertPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTransition(value: AlertTransition): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setType(value: AlertType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

