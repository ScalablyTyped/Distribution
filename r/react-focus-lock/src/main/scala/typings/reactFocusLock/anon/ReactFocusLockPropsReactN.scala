package typings.reactFocusLock.anon

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.SFC
import typings.reactFocusLock.reactFocusLockStrings.tail
import typings.std.FocusOptions
import typings.std.HTMLElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-focus-lock.react-focus-lock/interfaces.ReactFocusLockProps<react.react.ReactNode, std.Record<string, any>> & {  sideCar :react.react.SFC<any>} */
@js.native
trait ReactFocusLockPropsReactN extends js.Object {
  
  /**
    * @deprecated Use persistentFocus=false instead
    * enables(or disables) text selection. This also allows not to have ANY focus.
    */
  var allowTextSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Component to use, defaults to 'div'
    */
  var as: js.UndefOr[String | (ElementType[(Record[String, _]) with Children])] = js.native
  
  /**
    * enables or disables autoFocusing feature.
    * If enabled - will move focus inside Lock, selecting the first or autoFocusable element
    * If disable - will blur any focus on Lock activation.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * enables aggressive focus capturing within iframes
    * - once disabled allows focus to move outside of iframe, if enabled inside iframe
    * - once enabled keep focus in the lock, no matter where lock is active (default)
    * @default true
    */
  var crossFrame: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * named focus group for focus scattering aka combined lock targets
    */
  var group: js.UndefOr[String] = js.native
  
  var lockProps: js.UndefOr[Record[String, _]] = js.native
  
  /**
    * disables hidden inputs before and after the lock.
    */
  var noFocusGuards: js.UndefOr[Boolean | tail] = js.native
  
  /**
    * life-cycle hook, called on lock activation
    * @param node the observed node
    */
  var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  /**
    * life-cycle hook, called on deactivation
    * @param node the observed node
    */
  var onDeactivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
  
  /**
    * enables of disables "sticky" behavior, when any focusable element shall be focused.
    * This disallow any text selection on the page.
    * @default false
    */
  var persistentFocus: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[Ref[HTMLElement]] = js.native
  
  /**
    * if true, will return focus to the previous position on trap disable.
    * Optionally, can pass focus options instead of `true` to control the focus
    * more precisely (ie. `{ preventScroll: true }`)
    */
  var returnFocus: js.UndefOr[Boolean | FocusOptions] = js.native
  
  /**
    * Shards forms a scattered lock, same as `group` does, but in more "low" and controlled way
    */
  var shards: js.UndefOr[js.Array[RefObject[_] | HTMLElement]] = js.native
  
  var sideCar: SFC[_] = js.native
  
  /**
    * Controls focus lock working areas. Lock will silently ignore all the events from `not allowed` areas
    * @param activeElement
    * @returns {Boolean} true if focus lock should handle activeElement, false if not
    */
  var whiteList: js.UndefOr[js.Function1[/* activeElement */ HTMLElement, Boolean]] = js.native
}
object ReactFocusLockPropsReactN {
  
  @scala.inline
  def apply(sideCar: SFC[_]): ReactFocusLockPropsReactN = {
    val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactFocusLockPropsReactN]
  }
  
  @scala.inline
  implicit class ReactFocusLockPropsReactNOps[Self <: ReactFocusLockPropsReactN] (val x: Self) extends AnyVal {
    
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
    def setSideCar(value: SFC[_]): Self = this.set("sideCar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTextSelection(value: Boolean): Self = this.set("allowTextSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTextSelection: Self = this.set("allowTextSelection", js.undefined)
    
    @scala.inline
    def setAs(value: String | (ElementType[(Record[String, _]) with Children])): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFocus: Self = this.set("autoFocus", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCrossFrame(value: Boolean): Self = this.set("crossFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossFrame: Self = this.set("crossFrame", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setLockProps(value: Record[String, _]): Self = this.set("lockProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockProps: Self = this.set("lockProps", js.undefined)
    
    @scala.inline
    def setNoFocusGuards(value: Boolean | tail): Self = this.set("noFocusGuards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoFocusGuards: Self = this.set("noFocusGuards", js.undefined)
    
    @scala.inline
    def setOnActivation(value: /* node */ HTMLElement => Unit): Self = this.set("onActivation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActivation: Self = this.set("onActivation", js.undefined)
    
    @scala.inline
    def setOnDeactivation(value: /* node */ HTMLElement => Unit): Self = this.set("onDeactivation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDeactivation: Self = this.set("onDeactivation", js.undefined)
    
    @scala.inline
    def setPersistentFocus(value: Boolean): Self = this.set("persistentFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePersistentFocus: Self = this.set("persistentFocus", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLElement]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setReturnFocus(value: Boolean | FocusOptions): Self = this.set("returnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFocus: Self = this.set("returnFocus", js.undefined)
    
    @scala.inline
    def setShardsVarargs(value: (RefObject[js.Any] | HTMLElement)*): Self = this.set("shards", js.Array(value :_*))
    
    @scala.inline
    def setShards(value: js.Array[RefObject[_] | HTMLElement]): Self = this.set("shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShards: Self = this.set("shards", js.undefined)
    
    @scala.inline
    def setWhiteList(value: /* activeElement */ HTMLElement => Boolean): Self = this.set("whiteList", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWhiteList: Self = this.set("whiteList", js.undefined)
  }
}
