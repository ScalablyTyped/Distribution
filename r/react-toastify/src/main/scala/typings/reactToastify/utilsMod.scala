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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
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
  
  @JSImport("react-toastify/dist/utils", "canBeRendered")
  @js.native
  def canBeRendered[T](content: T): Boolean = js.native
  
  @JSImport("react-toastify/dist/utils", "canUseDom")
  @js.native
  val canUseDom: Boolean = js.native
  
  @JSImport("react-toastify/dist/utils", "collapseToast")
  @js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = js.native
  @JSImport("react-toastify/dist/utils", "collapseToast")
  @js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = js.native
  
  @JSImport("react-toastify/dist/utils", "cssTransition")
  @js.native
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    Element
  ] = js.native
  
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay(): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay(toastAutoClose: js.UndefOr[scala.Nothing], containerAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay(toastAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay(toastAutoClose: Double, containerAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay_false(toastAutoClose: js.UndefOr[scala.Nothing], containerAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay_false(toastAutoClose: Double, containerAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay_false(toastAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: Double): js.UndefOr[Double | `false`] = js.native
  @JSImport("react-toastify/dist/utils", "getAutoCloseDelay")
  @js.native
  def getAutoCloseDelay_false(toastAutoClose: `false`, containerAutoClose: `false`): js.UndefOr[Double | `false`] = js.native
  
  @JSImport("react-toastify/dist/utils", "hasToastId")
  @js.native
  def hasToastId(): js.UndefOr[String | Double | `true`] = js.native
  @JSImport("react-toastify/dist/utils", "hasToastId")
  @js.native
  def hasToastId(toastId: Id): js.UndefOr[String | Double | `true`] = js.native
  
  @JSImport("react-toastify/dist/utils", "isBool")
  @js.native
  def isBool(v: js.Any): /* is std.Boolean */ Boolean = js.native
  
  @JSImport("react-toastify/dist/utils", "isFn")
  @js.native
  def isFn(v: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("react-toastify/dist/utils", "isNum")
  @js.native
  def isNum(v: js.Any): /* is std.Number */ Boolean = js.native
  
  @JSImport("react-toastify/dist/utils", "isStr")
  @js.native
  def isStr(v: js.Any): /* is std.String */ Boolean = js.native
  
  @JSImport("react-toastify/dist/utils", "objectValues")
  @js.native
  def objectValues[T](obj: Record[String, T]): js.Array[T] = js.native
  
  @JSImport("react-toastify/dist/utils", "parseClassName")
  @js.native
  def parseClassName(v: js.Any): js.Any = js.native
}
