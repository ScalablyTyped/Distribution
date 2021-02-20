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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait AddToastPayload extends StObject {
    
    var id: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var options: js.UndefOr[BasicToastrOptions | LightToastrOptions] = js.native
    
    var position: js.UndefOr[positionType] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: toastType = js.native
  }
  object AddToastPayload {
    
    @scala.inline
    def apply(`type`: toastType): AddToastPayload = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddToastPayload]
    }
    
    @scala.inline
    implicit class AddToastPayloadMutableBuilder[Self <: AddToastPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: toastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BasicToastrOptions extends StObject {
    
    var attention: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[(Component[js.Object, js.Object, _]) | Element] = js.native
    
    var getState: js.UndefOr[js.Function1[/* state */ ToastrState, ToastrState]] = js.native
    
    var icon: js.UndefOr[Element] = js.native
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onToastrClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var progressBar: js.UndefOr[Boolean] = js.native
    
    var removeOnHover: js.UndefOr[Boolean] = js.native
    
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    var timeOut: js.UndefOr[Double] = js.native
    
    var transitionIn: js.UndefOr[transitionInType] = js.native
    
    var transitionOut: js.UndefOr[transitionOutType] = js.native
  }
  object BasicToastrOptions {
    
    @scala.inline
    def apply(): BasicToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicToastrOptions]
    }
    
    @scala.inline
    implicit class BasicToastrOptionsMutableBuilder[Self <: BasicToastrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: (Component[js.Object, js.Object, _]) | Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setGetState(value: /* state */ ToastrState => ToastrState): Self = StObject.set(x, "getState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      @scala.inline
      def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnCloseButtonClick(value: () => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      @scala.inline
      def setOnHideComplete(value: () => Unit): Self = StObject.set(x, "onHideComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideCompleteUndefined: Self = StObject.set(x, "onHideComplete", js.undefined)
      
      @scala.inline
      def setOnShowComplete(value: () => Unit): Self = StObject.set(x, "onShowComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
      
      @scala.inline
      def setOnToastrClick(value: () => Unit): Self = StObject.set(x, "onToastrClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnToastrClickUndefined: Self = StObject.set(x, "onToastrClick", js.undefined)
      
      @scala.inline
      def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      @scala.inline
      def setRemoveOnHover(value: Boolean): Self = StObject.set(x, "removeOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnHoverUndefined: Self = StObject.set(x, "removeOnHover", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      @scala.inline
      def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      @scala.inline
      def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  @js.native
  trait ConfirmToastrCustomOptions extends StObject {
    
    var component: Element = js.native
  }
  object ConfirmToastrCustomOptions {
    
    @scala.inline
    def apply(component: Element): ConfirmToastrCustomOptions = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfirmToastrCustomOptions]
    }
    
    @scala.inline
    implicit class ConfirmToastrCustomOptionsMutableBuilder[Self <: ConfirmToastrCustomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConfirmToastrOptions extends StObject {
    
    var disableCancel: js.UndefOr[Boolean] = js.native
    
    var onCancel: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onOk: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ConfirmToastrOptions {
    
    @scala.inline
    def apply(): ConfirmToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfirmToastrOptions]
    }
    
    @scala.inline
    implicit class ConfirmToastrOptionsMutableBuilder[Self <: ConfirmToastrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableCancel(value: Boolean): Self = StObject.set(x, "disableCancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCancelUndefined: Self = StObject.set(x, "disableCancel", js.undefined)
      
      @scala.inline
      def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnOk(value: () => Unit): Self = StObject.set(x, "onOk", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOkUndefined: Self = StObject.set(x, "onOk", js.undefined)
    }
  }
  
  @js.native
  trait LightToastrOptions extends StObject {
    
    var attention: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var component: js.UndefOr[Element] = js.native
    
    var icon: js.UndefOr[iconType | Element] = js.native
    
    var onCloseButtonClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onHideComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onShowComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    var progressBar: js.UndefOr[Boolean] = js.native
    
    var removeOnHover: js.UndefOr[Boolean] = js.native
    
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    var status: js.UndefOr[iconType] = js.native
    
    var timeOut: js.UndefOr[Double] = js.native
    
    var transitionIn: js.UndefOr[transitionInType] = js.native
    
    var transitionOut: js.UndefOr[transitionOutType] = js.native
  }
  object LightToastrOptions {
    
    @scala.inline
    def apply(): LightToastrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightToastrOptions]
    }
    
    @scala.inline
    implicit class LightToastrOptionsMutableBuilder[Self <: LightToastrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttention(value: Boolean): Self = StObject.set(x, "attention", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttentionUndefined: Self = StObject.set(x, "attention", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponent(value: Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setIcon(value: iconType | Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setOnCloseButtonClick(value: () => Unit): Self = StObject.set(x, "onCloseButtonClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseButtonClickUndefined: Self = StObject.set(x, "onCloseButtonClick", js.undefined)
      
      @scala.inline
      def setOnHideComplete(value: () => Unit): Self = StObject.set(x, "onHideComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideCompleteUndefined: Self = StObject.set(x, "onHideComplete", js.undefined)
      
      @scala.inline
      def setOnShowComplete(value: () => Unit): Self = StObject.set(x, "onShowComplete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowCompleteUndefined: Self = StObject.set(x, "onShowComplete", js.undefined)
      
      @scala.inline
      def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      @scala.inline
      def setRemoveOnHover(value: Boolean): Self = StObject.set(x, "removeOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOnHoverUndefined: Self = StObject.set(x, "removeOnHover", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setStatus(value: iconType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      @scala.inline
      def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      @scala.inline
      def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  type ReduxToastr = Component[ReduxToastrProps, js.Object, js.Any]
  
  @js.native
  trait ReduxToastrProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var closeOnToastrClick: js.UndefOr[Boolean] = js.native
    
    var confirmOptions: js.UndefOr[CancelText] = js.native
    
    var newestOnTop: js.UndefOr[Boolean] = js.native
    
    var options: js.UndefOr[js.Any] = js.native
    
    // This is currently not used, waiting for response from the package author to remove
    var position: js.UndefOr[positionType] = js.native
    
    var preventDuplicates: js.UndefOr[Boolean] = js.native
    
    var progressBar: js.UndefOr[Boolean] = js.native
    
    var timeOut: js.UndefOr[Double] = js.native
    
    var toastr: js.UndefOr[ToastrState] = js.native
    
    var transitionIn: js.UndefOr[transitionInType] = js.native
    
    var transitionOut: js.UndefOr[transitionOutType] = js.native
  }
  object ReduxToastrProps {
    
    @scala.inline
    def apply(): ReduxToastrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxToastrProps]
    }
    
    @scala.inline
    implicit class ReduxToastrPropsMutableBuilder[Self <: ReduxToastrProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseOnToastrClick(value: Boolean): Self = StObject.set(x, "closeOnToastrClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnToastrClickUndefined: Self = StObject.set(x, "closeOnToastrClick", js.undefined)
      
      @scala.inline
      def setConfirmOptions(value: CancelText): Self = StObject.set(x, "confirmOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmOptionsUndefined: Self = StObject.set(x, "confirmOptions", js.undefined)
      
      @scala.inline
      def setNewestOnTop(value: Boolean): Self = StObject.set(x, "newestOnTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewestOnTopUndefined: Self = StObject.set(x, "newestOnTop", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setPreventDuplicates(value: Boolean): Self = StObject.set(x, "preventDuplicates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDuplicatesUndefined: Self = StObject.set(x, "preventDuplicates", js.undefined)
      
      @scala.inline
      def setProgressBar(value: Boolean): Self = StObject.set(x, "progressBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
      
      @scala.inline
      def setTimeOut(value: Double): Self = StObject.set(x, "timeOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOutUndefined: Self = StObject.set(x, "timeOut", js.undefined)
      
      @scala.inline
      def setToastr(value: ToastrState): Self = StObject.set(x, "toastr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastrUndefined: Self = StObject.set(x, "toastr", js.undefined)
      
      @scala.inline
      def setTransitionIn(value: transitionInType): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionInUndefined: Self = StObject.set(x, "transitionIn", js.undefined)
      
      @scala.inline
      def setTransitionOut(value: transitionOutType): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionOutUndefined: Self = StObject.set(x, "transitionOut", js.undefined)
    }
  }
  
  @js.native
  trait ToastrActionCreators extends StObject {
    
    def add(toastr: AddToastPayload): Action[_] = js.native
    
    def clean(): Action[_] = js.native
    
    def hideConfirm(): Action[_] = js.native
    
    def remove(id: String): Action[_] = js.native
    
    def removeByType(`type`: toastType): Action[_] = js.native
    
    def showConfirm(confirm: ConfirmToastrCustomOptions): Action[_] = js.native
    def showConfirm(confirm: ConfirmToastrOptions): Action[_] = js.native
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
  
  @js.native
  trait ToastrState extends StObject {
    
    var confirm: js.UndefOr[Id] = js.native
    
    var toastrs: js.Array[Toastr_] = js.native
  }
  object ToastrState {
    
    @scala.inline
    def apply(toastrs: js.Array[Toastr_]): ToastrState = {
      val __obj = js.Dynamic.literal(toastrs = toastrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToastrState]
    }
    
    @scala.inline
    implicit class ToastrStateMutableBuilder[Self <: ToastrState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfirm(value: Id): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      @scala.inline
      def setToastrs(value: js.Array[Toastr_]): Self = StObject.set(x, "toastrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToastrsVarargs(value: Toastr_ *): Self = StObject.set(x, "toastrs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Toastr_ extends StObject {
    
    var id: String = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var options: BasicToastrOptions | LightToastrOptions = js.native
    
    var position: positionType = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: toastType = js.native
  }
  object Toastr_ {
    
    @scala.inline
    def apply(
      id: String,
      options: BasicToastrOptions | LightToastrOptions,
      position: positionType,
      `type`: toastType
    ): Toastr_ = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Toastr_]
    }
    
    @scala.inline
    implicit class Toastr_MutableBuilder[Self <: Toastr_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOptions(value: BasicToastrOptions | LightToastrOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: positionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: toastType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def error: typings.reactReduxToastr.reactReduxToastrStrings.error = "error".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.error]
    
    @scala.inline
    def info: typings.reactReduxToastr.reactReduxToastrStrings.info = "info".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.info]
    
    @scala.inline
    def success: typings.reactReduxToastr.reactReduxToastrStrings.success = "success".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.success]
    
    @scala.inline
    def warning: typings.reactReduxToastr.reactReduxToastrStrings.warning = "warning".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.warning]
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
    
    @scala.inline
    def `bottom-center`: typings.reactReduxToastr.reactReduxToastrStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-left`: typings.reactReduxToastr.reactReduxToastrStrings.`bottom-left` = "bottom-left".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`bottom-left`]
    
    @scala.inline
    def `bottom-right`: typings.reactReduxToastr.reactReduxToastrStrings.`bottom-right` = "bottom-right".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`bottom-right`]
    
    @scala.inline
    def `top-center`: typings.reactReduxToastr.reactReduxToastrStrings.`top-center` = "top-center".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`top-center`]
    
    @scala.inline
    def `top-left`: typings.reactReduxToastr.reactReduxToastrStrings.`top-left` = "top-left".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`top-left`]
    
    @scala.inline
    def `top-right`: typings.reactReduxToastr.reactReduxToastrStrings.`top-right` = "top-right".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.`top-right`]
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
    
    @scala.inline
    def confirm: typings.reactReduxToastr.reactReduxToastrStrings.confirm = "confirm".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.confirm]
    
    @scala.inline
    def error: typings.reactReduxToastr.reactReduxToastrStrings.error = "error".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.error]
    
    @scala.inline
    def info: typings.reactReduxToastr.reactReduxToastrStrings.info = "info".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.info]
    
    @scala.inline
    def light: typings.reactReduxToastr.reactReduxToastrStrings.light = "light".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.light]
    
    @scala.inline
    def message: typings.reactReduxToastr.reactReduxToastrStrings.message = "message".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.message]
    
    @scala.inline
    def success: typings.reactReduxToastr.reactReduxToastrStrings.success = "success".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.success]
    
    @scala.inline
    def warning: typings.reactReduxToastr.reactReduxToastrStrings.warning = "warning".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.warning]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceIn
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceInDown
    - typings.reactReduxToastr.reactReduxToastrStrings.fadeIn
  */
  trait transitionInType extends StObject
  object transitionInType {
    
    @scala.inline
    def bounceIn: typings.reactReduxToastr.reactReduxToastrStrings.bounceIn = "bounceIn".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceIn]
    
    @scala.inline
    def bounceInDown: typings.reactReduxToastr.reactReduxToastrStrings.bounceInDown = "bounceInDown".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceInDown]
    
    @scala.inline
    def fadeIn: typings.reactReduxToastr.reactReduxToastrStrings.fadeIn = "fadeIn".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.fadeIn]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceOut
    - typings.reactReduxToastr.reactReduxToastrStrings.bounceOutUp
    - typings.reactReduxToastr.reactReduxToastrStrings.fadeOut
  */
  trait transitionOutType extends StObject
  object transitionOutType {
    
    @scala.inline
    def bounceOut: typings.reactReduxToastr.reactReduxToastrStrings.bounceOut = "bounceOut".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceOut]
    
    @scala.inline
    def bounceOutUp: typings.reactReduxToastr.reactReduxToastrStrings.bounceOutUp = "bounceOutUp".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.bounceOutUp]
    
    @scala.inline
    def fadeOut: typings.reactReduxToastr.reactReduxToastrStrings.fadeOut = "fadeOut".asInstanceOf[typings.reactReduxToastr.reactReduxToastrStrings.fadeOut]
  }
}
