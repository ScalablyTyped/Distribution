package typings.reactToastify

import typings.react.mod.JSX.Element
import typings.reactToastify.distTypesMod.Toast
import typings.reactToastify.distTypesMod.ToastItem
import typings.reactToastify.distTypesMod.ToastItemStatus
import typings.reactToastify.distTypesMod.ToastPosition
import typings.reactToastify.distTypesMod.ToastTransitionProps
import typings.reactToastify.distTypesMod.TypeOptions
import typings.reactToastify.distUtilsConstantMod.Default
import typings.reactToastify.distUtilsCssTransitionMod.CSSTransitionProps
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("react-toastify/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {[ key in react-toastify.react-toastify/dist/utils/constant.KeyOfPosition ]: react-toastify.react-toastify/dist/types.ToastPosition} */
  object POSITION {
    
    @JSImport("react-toastify/dist/utils", "POSITION")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify/dist/utils", "POSITION.BOTTOM_CENTER")
    @js.native
    def BOTTOM_CENTER: ToastPosition = js.native
    inline def BOTTOM_CENTER_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.BOTTOM_LEFT")
    @js.native
    def BOTTOM_LEFT: ToastPosition = js.native
    inline def BOTTOM_LEFT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.BOTTOM_RIGHT")
    @js.native
    def BOTTOM_RIGHT: ToastPosition = js.native
    inline def BOTTOM_RIGHT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.TOP_CENTER")
    @js.native
    def TOP_CENTER: ToastPosition = js.native
    inline def TOP_CENTER_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.TOP_LEFT")
    @js.native
    def TOP_LEFT: ToastPosition = js.native
    inline def TOP_LEFT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.TOP_RIGHT")
    @js.native
    def TOP_RIGHT: ToastPosition = js.native
    inline def TOP_RIGHT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {[ key in react-toastify.react-toastify/dist/utils/constant.KeyOfType ]: react-toastify.react-toastify/dist/types.TypeOptions} */
  object TYPE_ {
    
    @JSImport("react-toastify/dist/utils", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify/dist/utils", "TYPE.DEFAULT")
    @js.native
    def DEFAULT: TypeOptions = js.native
    inline def DEFAULT_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.ERROR")
    @js.native
    def ERROR: TypeOptions = js.native
    inline def ERROR_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.INFO")
    @js.native
    def INFO: TypeOptions = js.native
    inline def INFO_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.SUCCESS")
    @js.native
    def SUCCESS: TypeOptions = js.native
    inline def SUCCESS_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.WARNING")
    @js.native
    def WARNING: TypeOptions = js.native
    inline def WARNING_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  inline def canBeRendered[T](content: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canBeRendered")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: Default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def cssTransition(param0: CSSTransitionProps): js.Function1[/* param0 */ ToastTransitionProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param0 */ ToastTransitionProps, Element]]
  
  inline def getAutoCloseDelay(): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")().asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay(toastAutoClose: Double): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay(toastAutoClose: Double, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay(toastAutoClose: Unit, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  inline def getAutoCloseDelay_false(toastAutoClose: Double, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: Unit, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: `false`): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  inline def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  inline def isFn(v: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFn")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isNum(v: Any): /* is std.Number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Number */ Boolean]
  
  inline def isStr(v: Any): /* is std.String */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStr")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.String */ Boolean]
  
  inline def parseClassName(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassName")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def toToastItem(toast: Toast, status: ToastItemStatus): ToastItem[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toToastItem")(toast.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[ToastItem[js.Object]]
}
