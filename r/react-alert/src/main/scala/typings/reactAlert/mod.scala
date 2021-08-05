package typings.reactAlert

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.reactAlert.anon.Alert
import typings.reactAlert.reactAlertStrings.`bottom center`
import typings.reactAlert.reactAlertStrings.`bottom left`
import typings.reactAlert.reactAlertStrings.`bottom right`
import typings.reactAlert.reactAlertStrings.`middle left`
import typings.reactAlert.reactAlertStrings.`middle right`
import typings.reactAlert.reactAlertStrings.`top center`
import typings.reactAlert.reactAlertStrings.`top left`
import typings.reactAlert.reactAlertStrings.`top right`
import typings.reactAlert.reactAlertStrings.alert
import typings.reactAlert.reactAlertStrings.error
import typings.reactAlert.reactAlertStrings.fade
import typings.reactAlert.reactAlertStrings.info
import typings.reactAlert.reactAlertStrings.middle
import typings.reactAlert.reactAlertStrings.scale
import typings.reactAlert.reactAlertStrings.success
import typings.std.Exclude
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-alert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-alert", "Provider")
  @js.native
  class Provider protected ()
    extends Component[AlertProviderProps, js.Object, js.Any] {
    def this(props: AlertProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AlertProviderProps, context: js.Any) = this()
  }
  
  @JSImport("react-alert", "positions")
  @js.native
  val positions: Positions_ = js.native
  
  @JSImport("react-alert", "transitions")
  @js.native
  val transitions: Transitions_ = js.native
  
  @JSImport("react-alert", "types")
  @js.native
  val types: Types_ = js.native
  
  inline def useAlert(): AlertManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useAlert")().asInstanceOf[AlertManager]
  inline def useAlert(context: Context[js.UndefOr[AlertManager]]): AlertManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useAlert")(context.asInstanceOf[js.Any]).asInstanceOf[AlertManager]
  
  inline def withAlert[P /* <: Alert */](): js.Function1[
    /* c */ ComponentType[P], 
    ComponentType[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAlert")().asInstanceOf[js.Function1[
    /* c */ ComponentType[P], 
    ComponentType[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ]]
  inline def withAlert[P /* <: Alert */](context: Context[js.UndefOr[AlertManager]]): js.Function1[
    /* c */ ComponentType[P], 
    ComponentType[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withAlert")(context.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* c */ ComponentType[P], 
    ComponentType[Pick[P, Exclude[/* keyof P */ String, alert]]]
  ]]
  
  trait AlertComponentProps extends StObject {
    
    def close(): Unit
    
    var id: String
    
    var message: ReactNode
    
    var options: AlertCustomOptionsWithType
  }
  object AlertComponentProps {
    
    inline def apply(close: () => Unit, id: String, options: AlertCustomOptionsWithType): AlertComponentProps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertComponentProps]
    }
    
    extension [Self <: AlertComponentProps](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptions(value: AlertCustomOptionsWithType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlertComponentPropsWithStyle
    extends StObject
       with AlertComponentProps {
    
    var style: CSSProperties
  }
  object AlertComponentPropsWithStyle {
    
    inline def apply(close: () => Unit, id: String, options: AlertCustomOptionsWithType, style: CSSProperties): AlertComponentPropsWithStyle = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertComponentPropsWithStyle]
    }
    
    extension [Self <: AlertComponentPropsWithStyle](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait AlertCustomOptions extends StObject {
    
    /**
      * Callback that will be executed after this alert is removed
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback that will be executed after this alert open
      */
    var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Custom timeout just for this one alert
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AlertCustomOptions {
    
    inline def apply(): AlertCustomOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCustomOptions]
    }
    
    extension [Self <: AlertCustomOptions](x: Self) {
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait AlertCustomOptionsWithType
    extends StObject
       with AlertCustomOptions {
    
    var `type`: js.UndefOr[AlertType] = js.undefined
  }
  object AlertCustomOptionsWithType {
    
    inline def apply(): AlertCustomOptionsWithType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCustomOptionsWithType]
    }
    
    extension [Self <: AlertCustomOptionsWithType](x: Self) {
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AlertManager extends StObject {
    
    var alerts: js.Array[AlertComponentProps] = js.native
    
    def error(): AlertComponentProps = js.native
    def error(message: Unit, options: AlertCustomOptions): AlertComponentProps = js.native
    def error(message: ReactNode): AlertComponentProps = js.native
    def error(message: ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
    
    def info(): AlertComponentProps = js.native
    def info(message: Unit, options: AlertCustomOptions): AlertComponentProps = js.native
    def info(message: ReactNode): AlertComponentProps = js.native
    def info(message: ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
    
    def remove(alert: AlertComponentProps): Unit = js.native
    
    var root: js.UndefOr[HTMLElement] = js.native
    
    def show(): AlertComponentProps = js.native
    def show(message: Unit, options: AlertCustomOptionsWithType): AlertComponentProps = js.native
    def show(message: ReactNode): AlertComponentProps = js.native
    def show(message: ReactNode, options: AlertCustomOptionsWithType): AlertComponentProps = js.native
    
    def success(): AlertComponentProps = js.native
    def success(message: Unit, options: AlertCustomOptions): AlertComponentProps = js.native
    def success(message: ReactNode): AlertComponentProps = js.native
    def success(message: ReactNode, options: AlertCustomOptions): AlertComponentProps = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAlert.reactAlertStrings.`top left`
    - typings.reactAlert.reactAlertStrings.`top center`
    - typings.reactAlert.reactAlertStrings.`top right`
    - typings.reactAlert.reactAlertStrings.`middle left`
    - typings.reactAlert.reactAlertStrings.middle
    - typings.reactAlert.reactAlertStrings.`middle right`
    - typings.reactAlert.reactAlertStrings.`bottom left`
    - typings.reactAlert.reactAlertStrings.`bottom center`
    - typings.reactAlert.reactAlertStrings.`bottom right`
  */
  trait AlertPosition extends StObject
  object AlertPosition {
    
    inline def `bottom center`: typings.reactAlert.reactAlertStrings.`bottom center` = ("bottom center").asInstanceOf[typings.reactAlert.reactAlertStrings.`bottom center`]
    
    inline def `bottom left`: typings.reactAlert.reactAlertStrings.`bottom left` = ("bottom left").asInstanceOf[typings.reactAlert.reactAlertStrings.`bottom left`]
    
    inline def `bottom right`: typings.reactAlert.reactAlertStrings.`bottom right` = ("bottom right").asInstanceOf[typings.reactAlert.reactAlertStrings.`bottom right`]
    
    inline def middle: typings.reactAlert.reactAlertStrings.middle = "middle".asInstanceOf[typings.reactAlert.reactAlertStrings.middle]
    
    inline def `middle left`: typings.reactAlert.reactAlertStrings.`middle left` = ("middle left").asInstanceOf[typings.reactAlert.reactAlertStrings.`middle left`]
    
    inline def `middle right`: typings.reactAlert.reactAlertStrings.`middle right` = ("middle right").asInstanceOf[typings.reactAlert.reactAlertStrings.`middle right`]
    
    inline def `top center`: typings.reactAlert.reactAlertStrings.`top center` = ("top center").asInstanceOf[typings.reactAlert.reactAlertStrings.`top center`]
    
    inline def `top left`: typings.reactAlert.reactAlertStrings.`top left` = ("top left").asInstanceOf[typings.reactAlert.reactAlertStrings.`top left`]
    
    inline def `top right`: typings.reactAlert.reactAlertStrings.`top right` = ("top right").asInstanceOf[typings.reactAlert.reactAlertStrings.`top right`]
  }
  
  trait AlertProviderProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
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
    
    inline def apply(template: ComponentType[AlertComponentPropsWithStyle]): AlertProviderProps = {
      val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertProviderProps]
    }
    
    extension [Self <: AlertProviderProps](x: Self) {
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setContext(value: Context[js.UndefOr[AlertManager]]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPosition(value: AlertPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTemplate(value: ComponentType[AlertComponentPropsWithStyle]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransition(value: AlertTransition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setType(value: AlertType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAlert.reactAlertStrings.fade
    - typings.reactAlert.reactAlertStrings.scale
  */
  trait AlertTransition extends StObject
  object AlertTransition {
    
    inline def fade: typings.reactAlert.reactAlertStrings.fade = "fade".asInstanceOf[typings.reactAlert.reactAlertStrings.fade]
    
    inline def scale: typings.reactAlert.reactAlertStrings.scale = "scale".asInstanceOf[typings.reactAlert.reactAlertStrings.scale]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAlert.reactAlertStrings.info
    - typings.reactAlert.reactAlertStrings.success
    - typings.reactAlert.reactAlertStrings.error
  */
  trait AlertType extends StObject
  object AlertType {
    
    inline def error: typings.reactAlert.reactAlertStrings.error = "error".asInstanceOf[typings.reactAlert.reactAlertStrings.error]
    
    inline def info: typings.reactAlert.reactAlertStrings.info = "info".asInstanceOf[typings.reactAlert.reactAlertStrings.info]
    
    inline def success: typings.reactAlert.reactAlertStrings.success = "success".asInstanceOf[typings.reactAlert.reactAlertStrings.success]
  }
  
  trait Positions_ extends StObject {
    
    var BOTTOM_CENTER: `bottom center`
    
    var BOTTOM_LEFT: `bottom left`
    
    var BOTTOM_RIGHT: `bottom right`
    
    var MIDDLE: middle
    
    var MIDDLE_LEFT: `middle left`
    
    var MIDDLE_RIGHT: `middle right`
    
    var TOP_CENTER: `top center`
    
    var TOP_LEFT: `top left`
    
    var TOP_RIGHT: `top right`
  }
  object Positions_ {
    
    inline def apply(): Positions_ = {
      val __obj = js.Dynamic.literal(BOTTOM_CENTER = "bottom center", BOTTOM_LEFT = "bottom left", BOTTOM_RIGHT = "bottom right", MIDDLE = "middle", MIDDLE_LEFT = "middle left", MIDDLE_RIGHT = "middle right", TOP_CENTER = "top center", TOP_LEFT = "top left", TOP_RIGHT = "top right")
      __obj.asInstanceOf[Positions_]
    }
    
    extension [Self <: Positions_](x: Self) {
      
      inline def setBOTTOM_CENTER(value: `bottom center`): Self = StObject.set(x, "BOTTOM_CENTER", value.asInstanceOf[js.Any])
      
      inline def setBOTTOM_LEFT(value: `bottom left`): Self = StObject.set(x, "BOTTOM_LEFT", value.asInstanceOf[js.Any])
      
      inline def setBOTTOM_RIGHT(value: `bottom right`): Self = StObject.set(x, "BOTTOM_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setMIDDLE(value: middle): Self = StObject.set(x, "MIDDLE", value.asInstanceOf[js.Any])
      
      inline def setMIDDLE_LEFT(value: `middle left`): Self = StObject.set(x, "MIDDLE_LEFT", value.asInstanceOf[js.Any])
      
      inline def setMIDDLE_RIGHT(value: `middle right`): Self = StObject.set(x, "MIDDLE_RIGHT", value.asInstanceOf[js.Any])
      
      inline def setTOP_CENTER(value: `top center`): Self = StObject.set(x, "TOP_CENTER", value.asInstanceOf[js.Any])
      
      inline def setTOP_LEFT(value: `top left`): Self = StObject.set(x, "TOP_LEFT", value.asInstanceOf[js.Any])
      
      inline def setTOP_RIGHT(value: `top right`): Self = StObject.set(x, "TOP_RIGHT", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transitions_ extends StObject {
    
    var FADE: fade
    
    var SCALE: scale
  }
  object Transitions_ {
    
    inline def apply(): Transitions_ = {
      val __obj = js.Dynamic.literal(FADE = "fade", SCALE = "scale")
      __obj.asInstanceOf[Transitions_]
    }
    
    extension [Self <: Transitions_](x: Self) {
      
      inline def setFADE(value: fade): Self = StObject.set(x, "FADE", value.asInstanceOf[js.Any])
      
      inline def setSCALE(value: scale): Self = StObject.set(x, "SCALE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types_ extends StObject {
    
    var ERROR: error
    
    var INFO: info
    
    var SUCCESS: success
  }
  object Types_ {
    
    inline def apply(): Types_ = {
      val __obj = js.Dynamic.literal(ERROR = "error", INFO = "info", SUCCESS = "success")
      __obj.asInstanceOf[Types_]
    }
    
    extension [Self <: Types_](x: Self) {
      
      inline def setERROR(value: error): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: info): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setSUCCESS(value: success): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
    }
  }
}
