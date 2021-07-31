package typings.reactToastify

import typings.react.mod.global.JSX.Element
import typings.reactToastify.constantMod.DEFAULT
import typings.reactToastify.cssTransitionMod.CSSTransitionProps
import typings.reactToastify.reactToastifyBooleans.`false`
import typings.reactToastify.reactToastifyBooleans.`true`
import typings.reactToastify.typesMod.Id
import typings.reactToastify.typesMod.ToastPosition
import typings.reactToastify.typesMod.ToastTransitionProps
import typings.reactToastify.typesMod.TypeOptions
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
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
    @scala.inline
    def BOTTOM_CENTER_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.BOTTOM_LEFT")
    @js.native
    def BOTTOM_LEFT: ToastPosition = js.native
    @scala.inline
    def BOTTOM_LEFT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.BOTTOM_RIGHT")
    @js.native
    def BOTTOM_RIGHT: ToastPosition = js.native
    @scala.inline
    def BOTTOM_RIGHT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.TOP_CENTER")
    @js.native
    def TOP_CENTER: ToastPosition = js.native
    @scala.inline
    def TOP_CENTER_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_CENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.TOP_LEFT")
    @js.native
    def TOP_LEFT: ToastPosition = js.native
    @scala.inline
    def TOP_LEFT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "POSITION.TOP_RIGHT")
    @js.native
    def TOP_RIGHT: ToastPosition = js.native
    @scala.inline
    def TOP_RIGHT_=(x: ToastPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP_RIGHT")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined {[ key in react-toastify.react-toastify/dist/utils/constant.KeyOfType ]: react-toastify.react-toastify/dist/types.TypeOptions} */
  object TYPE {
    
    @JSImport("react-toastify/dist/utils", "TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify/dist/utils", "TYPE.DARK")
    @js.native
    def DARK: TypeOptions = js.native
    @scala.inline
    def DARK_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DARK")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.DEFAULT")
    @js.native
    def DEFAULT: TypeOptions = js.native
    @scala.inline
    def DEFAULT_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.ERROR")
    @js.native
    def ERROR: TypeOptions = js.native
    @scala.inline
    def ERROR_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.INFO")
    @js.native
    def INFO: TypeOptions = js.native
    @scala.inline
    def INFO_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.SUCCESS")
    @js.native
    def SUCCESS: TypeOptions = js.native
    @scala.inline
    def SUCCESS_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify/dist/utils", "TYPE.WARNING")
    @js.native
    def WARNING: TypeOptions = js.native
    @scala.inline
    def WARNING_=(x: TypeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def canBeRendered[T](content: T): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canBeRendered")(content.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("react-toastify/dist/utils", "canUseDom")
  @js.native
  val canUseDom: Boolean = js.native
  
  @scala.inline
  def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collapseToast")(node.asInstanceOf[js.Any], done.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("cssTransition")(hasEnterExitDurationAppendPositionCollapseCollapseDuration.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ]]
  
  @scala.inline
  def getAutoCloseDelay(): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")().asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay(toastAutoClose: Double): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay(toastAutoClose: Double, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay(toastAutoClose: Unit, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: Double, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: Unit, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: `false`): js.UndefOr[Double | `false`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: Double): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  @scala.inline
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: `false`): js.UndefOr[Double | `false`] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAutoCloseDelay")(toastAutoClose.asInstanceOf[js.Any], containerAutoClose.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | `false`]]
  
  @scala.inline
  def hasToastId(): js.UndefOr[String | Double | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasToastId")().asInstanceOf[js.UndefOr[String | Double | `true`]]
  @scala.inline
  def hasToastId(toastId: Id): js.UndefOr[String | Double | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasToastId")(toastId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double | `true`]]
  
  @scala.inline
  def isBool(v: js.Any): /* is std.Boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBool")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Boolean */ Boolean]
  
  @scala.inline
  def isFn(v: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFn")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  @scala.inline
  def isNum(v: js.Any): /* is std.Number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNum")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Number */ Boolean]
  
  @scala.inline
  def isStr(v: js.Any): /* is std.String */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStr")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.String */ Boolean]
  
  @scala.inline
  def objectValues[T](obj: Record[String, T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("objectValues")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def parseClassName(v: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassName")(v.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
