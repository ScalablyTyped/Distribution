package typings.reactReduxToastr

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import typings.reactReduxToastr.anon.CancelText
import typings.reactReduxToastr.anon.Id
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux-toastr", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReduxToastrProps, js.Object, js.Any]
  
  @JSImport("react-redux-toastr", "actions")
  @js.native
  val actions: ToastrActionCreators = js.native
  
  @JSImport("react-redux-toastr", "reducer")
  @js.native
  val reducer: Reducer[ToastrState, AnyAction] = js.native
  
  @JSImport("react-redux-toastr", "toastr")
  @js.native
  val toastr: ToastrEmitter = js.native
  
  trait AddToastPayload extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[BasicToastrOptions | LightToastrOptions] = js.undefined
    
    var position: js.UndefOr[positionType] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: toastType
  }
  object AddToastPayload {
    
    inline def apply(`type`: toastType): AddToastPayload = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToastPayload]
    }
    
    extension [Self <: AddToastPayload](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: toastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait BasicToastrOptions extends StObject {
    
    var attention: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[(Component[js.Object, js.Object, js.Any]) | Element] = js.undefined
    
    var getState: js.UndefOr[js.Function1[/* state */ ToastrState, ToastrState]] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onToastrClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progressBar: js.UndefOr[Boolean] = js.undefined
    
    var removeOnHover: js.UndefOr[Boolean] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
    
    var transitionIn: js.UndefOr[transitionInType] = js.undefined
    
    var transitionOut: js.UndefOr[transitionOutType] = js.undefined
  }
  object BasicToastrOptions {
    
    inline def apply(): BasicToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicToastrOptions]
    }
    
    extension [Self <: BasicToastrOptions](x: Self) {
      
      inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
      
      inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: (Component[js.Object, js.Object, js.Any]) | Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setGetState(value: /* state */ ToastrState => ToastrState): Self = StObject.set(x, "getState", js.Any.fromFunction1(value))
      
      inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnCloseButtonClick(value: () => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction0(value))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHideComplete(value: () => Unit): Self = StObject.set(x, "onHideComplete", js.Any.fromFunction0(value))
      
      inline def setOnHideCompleteUndefined: Self = StObject.set(x, "onHideComplete", js.undefined)
      
      inline def setOnShowComplete(value: () => Unit): Self = StObject.set(x, "onShowComplete", js.Any.fromFunction0(value))
      
      inline def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
      
      inline def setOnToastrClick(value: () => Unit): Self = StObject.set(x, "onToastrClick", js.Any.fromFunction0(value))
      
      inline def setOnToastrClickUndefined: Self = StObject.set(x, "onToastrClick", js.undefined)
      
      inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setRemoveOnHover(value: Boolean): Self = StObject.set(x, "removeOnHover", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnHoverUndefined: Self = StObject.set(x, "removeOnHover", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      inline def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      inline def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  trait ConfirmToastrCustomOptions extends StObject {
    
    var component: Element
  }
  object ConfirmToastrCustomOptions {
    
    inline def apply(component: Element): ConfirmToastrCustomOptions = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmToastrCustomOptions]
    }
    
    extension [Self <: ConfirmToastrCustomOptions](x: Self) {
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfirmToastrOptions extends StObject {
    
    var disableCancel: js.UndefOr[Boolean] = js.undefined
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object ConfirmToastrOptions {
    
    inline def apply(): ConfirmToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmToastrOptions]
    }
    
    extension [Self <: ConfirmToastrOptions](x: Self) {
      
      inline def setDisableCancel(value: Boolean): Self = StObject.set(x, "disableCancel", value.asInstanceOf[js.Any])
      
      inline def setDisableCancelUndefined: Self = StObject.set(x, "disableCancel", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
      
      inline def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  trait LightToastrOptions extends StObject {
    
    var attention: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[Element] = js.undefined
    
    var icon: js.UndefOr[iconType | Element] = js.undefined
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progressBar: js.UndefOr[Boolean] = js.undefined
    
    var removeOnHover: js.UndefOr[Boolean] = js.undefined
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[iconType] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
    
    var transitionIn: js.UndefOr[transitionInType] = js.undefined
    
    var transitionOut: js.UndefOr[transitionOutType] = js.undefined
  }
  object LightToastrOptions {
    
    inline def apply(): LightToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightToastrOptions]
    }
    
    extension [Self <: LightToastrOptions](x: Self) {
      
      inline def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
      
      inline def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setIcon(value: iconType | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnCloseButtonClick(value: () => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction0(value))
      
      inline def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      inline def setOnHideComplete(value: () => Unit): Self = StObject.set(x, "onHideComplete", js.Any.fromFunction0(value))
      
      inline def setOnHideCompleteUndefined: Self = StObject.set(x, "onHideComplete", js.undefined)
      
      inline def setOnShowComplete(value: () => Unit): Self = StObject.set(x, "onShowComplete", js.Any.fromFunction0(value))
      
      inline def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
      
      inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setRemoveOnHover(value: Boolean): Self = StObject.set(x, "removeOnHover", value.asInstanceOf[js.Any])
      
      inline def setRemoveOnHoverUndefined: Self = StObject.set(x, "removeOnHover", js.undefined)
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStatus(value: iconType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      inline def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      inline def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  type ReduxToastr = Component[ReduxToastrProps, js.Object, js.Any]
  
  trait ReduxToastrProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var closeOnToastrClick: js.UndefOr[Boolean] = js.undefined
    
    var confirmOptions: js.UndefOr[CancelText] = js.undefined
    
    var newestOnTop: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[js.Any] = js.undefined
    
    // This is currently not used, waiting for response from the package author to remove
    var position: js.UndefOr[positionType] = js.undefined
    
    var preventDuplicates: js.UndefOr[Boolean] = js.undefined
    
    var progressBar: js.UndefOr[Boolean] = js.undefined
    
    var timeOut: js.UndefOr[Double] = js.undefined
    
    var toastr: js.UndefOr[ToastrState] = js.undefined
    
    var transitionIn: js.UndefOr[transitionInType] = js.undefined
    
    var transitionOut: js.UndefOr[transitionOutType] = js.undefined
  }
  object ReduxToastrProps {
    
    inline def apply(): ReduxToastrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxToastrProps]
    }
    
    extension [Self <: ReduxToastrProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCloseOnToastrClick(value: Boolean): Self = StObject.set(x, "closeOnToastrClick", value.asInstanceOf[js.Any])
      
      inline def setCloseOnToastrClickUndefined: Self = StObject.set(x, "closeOnToastrClick", js.undefined)
      
      inline def setConfirmOptions(value: CancelText): Self = StObject.set(x, "confirmOptions", value.asInstanceOf[js.Any])
      
      inline def setConfirmOptionsUndefined: Self = StObject.set(x, "confirmOptions", js.undefined)
      
      inline def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
      
      inline def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
      
      inline def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setPreventDuplicates(value: Boolean): Self = StObject.set(x, "preventDuplicates", value.asInstanceOf[js.Any])
      
      inline def setPreventDuplicatesUndefined: Self = StObject.set(x, "preventDuplicates", js.undefined)
      
      inline def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      inline def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      inline def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      inline def setToastr(value: ToastrState): Self = StObject.set(x, "toastr", value.asInstanceOf[js.Any])
      
      inline def setToastrUndefined: Self = StObject.set(x, "toastr", js.undefined)
      
      inline def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      inline def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      inline def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      inline def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  @js.native
  trait ToastrActionCreators extends StObject {
    
    def add(toastr: AddToastPayload): Action[js.Any] = js.native
    
    def clean(): Action[js.Any] = js.native
    
    def hideConfirm(): Action[js.Any] = js.native
    
    def remove(id: String): Action[js.Any] = js.native
    
    def removeByType(`type`: toastType): Action[js.Any] = js.native
    
    def showConfirm(confirm: ConfirmToastrCustomOptions): Action[js.Any] = js.native
    def showConfirm(confirm: ConfirmToastrOptions): Action[js.Any] = js.native
  }
  
  @js.native
  trait ToastrEmitter extends StObject {
    
    def clean(): Unit = js.native
    
    def confirm(message: String, options: ConfirmToastrOptions): Unit = js.native
    
    def error(title: String, message: String): Unit = js.native
    def error(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def info(title: String, message: String): Unit = js.native
    def info(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def light(title: String, message: String): Unit = js.native
    def light(title: String, message: String, options: LightToastrOptions): Unit = js.native
    
    def message(title: String, message: String): Unit = js.native
    def message(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def removeByType(`type`: String): Unit = js.native
    
    def success(title: String, message: String): Unit = js.native
    def success(title: String, message: String, options: BasicToastrOptions): Unit = js.native
    
    def warning(title: String, message: String): Unit = js.native
    def warning(title: String, message: String, options: BasicToastrOptions): Unit = js.native
  }
  
  trait ToastrState extends StObject {
    
    var confirm: js.UndefOr[Id] = js.undefined
    
    var toastrs: js.Array[Toastr_]
  }
  object ToastrState {
    
    inline def apply(toastrs: js.Array[Toastr_]): ToastrState = {
      val __obj = js.Dynamic.literal(toastrs = toastrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastrState]
    }
    
    extension [Self <: ToastrState](x: Self) {
      
      inline def setConfirm(value: Id): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setToastrs(value: js.Array[Toastr_]): Self = StObject.set(x, "toastrs", value.asInstanceOf[js.Any])
      
      inline def setToastrsVarargs(value: Toastr_ *): Self = StObject.set(x, "toastrs", js.Array(value :_*))
    }
  }
  
  trait Toastr_ extends StObject {
    
    var id: String
    
    var message: js.UndefOr[String] = js.undefined
    
    var options: BasicToastrOptions | LightToastrOptions
    
    var position: positionType
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: toastType
  }
  object Toastr_ {
    
    inline def apply(
      id: String,
      options: BasicToastrOptions | LightToastrOptions,
      position: positionType,
      `type`: toastType
    ): Toastr_ = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toastr_]
    }
    
    extension [Self <: Toastr_](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: toastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.success
    - typings.reactReduxToastr.reactReduxToastrStrings.info
    - typings.reactReduxToastr.reactReduxToastrStrings.warning
    - typings.reactReduxToastr.reactReduxToastrStrings.error
  */
  trait iconType extends StObject
  object iconType {
    
    inline def error: typings.reactReduxToastr.reactReduxToastrStrings.error = "error".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.error]
    
    inline def info: typings.reactReduxToastr.reactReduxToastrStrings.info = "info".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.info]
    
    inline def success: typings.reactReduxToastr.reactReduxToastrStrings.success = "success".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.success]
    
    inline def warning: typings.reactReduxToastr.reactReduxToastrStrings.warning = "warning".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.`top-left`
    - typings.reactReduxToastr.reactReduxToastrStrings.`top-center`
    - typings.reactReduxToastr.reactReduxToastrStrings.`top-right`
    - typings.reactReduxToastr.reactReduxToastrStrings.`bottom-left`
    - typings.reactReduxToastr.reactReduxToastrStrings.`bottom-center`
    - typings.reactReduxToastr.reactReduxToastrStrings.`bottom-right`
  */
  trait positionType extends StObject
  object positionType {
    
    inline def `bottom-center`: typings.reactReduxToastr.reactReduxToastrStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`bottom-center`]
    
    inline def `bottom-left`: typings.reactReduxToastr.reactReduxToastrStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`bottom-left`]
    
    inline def `bottom-right`: typings.reactReduxToastr.reactReduxToastrStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`bottom-right`]
    
    inline def `top-center`: typings.reactReduxToastr.reactReduxToastrStrings.`top-center` = "top-center".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`top-center`]
    
    inline def `top-left`: typings.reactReduxToastr.reactReduxToastrStrings.`top-left` = "top-left".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`top-left`]
    
    inline def `top-right`: typings.reactReduxToastr.reactReduxToastrStrings.`top-right` = "top-right".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`top-right`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.success
    - typings.reactReduxToastr.reactReduxToastrStrings.info
    - typings.reactReduxToastr.reactReduxToastrStrings.warning
    - typings.reactReduxToastr.reactReduxToastrStrings.light
    - typings.reactReduxToastr.reactReduxToastrStrings.error
    - typings.reactReduxToastr.reactReduxToastrStrings.confirm
    - typings.reactReduxToastr.reactReduxToastrStrings.message
  */
  trait toastType extends StObject
  object toastType {
    
    inline def confirm: typings.reactReduxToastr.reactReduxToastrStrings.confirm = "confirm".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.confirm]
    
    inline def error: typings.reactReduxToastr.reactReduxToastrStrings.error = "error".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.error]
    
    inline def info: typings.reactReduxToastr.reactReduxToastrStrings.info = "info".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.info]
    
    inline def light: typings.reactReduxToastr.reactReduxToastrStrings.light = "light".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.light]
    
    inline def message: typings.reactReduxToastr.reactReduxToastrStrings.message = "message".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.message]
    
    inline def success: typings.reactReduxToastr.reactReduxToastrStrings.success = "success".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.success]
    
    inline def warning: typings.reactReduxToastr.reactReduxToastrStrings.warning = "warning".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceIn
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceInDown
    - typings.reactReduxToastr.reactReduxToastrStrings.fadeIn
  */
  trait transitionInType extends StObject
  object transitionInType {
    
    inline def bounceIn: typings.reactReduxToastr.reactReduxToastrStrings.bounceIn = "bounceIn".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceIn]
    
    inline def bounceInDown: typings.reactReduxToastr.reactReduxToastrStrings.bounceInDown = "bounceInDown".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceInDown]
    
    inline def fadeIn: typings.reactReduxToastr.reactReduxToastrStrings.fadeIn = "fadeIn".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.fadeIn]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceOut
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceOutUp
    - typings.reactReduxToastr.reactReduxToastrStrings.fadeOut
  */
  trait transitionOutType extends StObject
  object transitionOutType {
    
    inline def bounceOut: typings.reactReduxToastr.reactReduxToastrStrings.bounceOut = "bounceOut".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceOut]
    
    inline def bounceOutUp: typings.reactReduxToastr.reactReduxToastrStrings.bounceOutUp = "bounceOutUp".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceOutUp]
    
    inline def fadeOut: typings.reactReduxToastr.reactReduxToastrStrings.fadeOut = "fadeOut".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.fadeOut]
  }
}
