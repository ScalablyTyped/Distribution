package typings.reactFocusLock

import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.reactFocusLock.anon.ChildrenChildrenType
import typings.reactFocusLock.reactFocusLockStrings.tail
import typings.std.FocusOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait AutoFocusProps extends StObject {
    
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object AutoFocusProps {
    
    @scala.inline
    def apply(): AutoFocusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocusProps]
    }
    
    @scala.inline
    implicit class AutoFocusPropsMutableBuilder[Self <: AutoFocusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  @js.native
  trait FreeFocusProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
  }
  object FreeFocusProps {
    
    @scala.inline
    def apply(): FreeFocusProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FreeFocusProps]
    }
    
    @scala.inline
    implicit class FreeFocusPropsMutableBuilder[Self <: FreeFocusProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  @js.native
  trait InFocusGuardProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object InFocusGuardProps {
    
    @scala.inline
    def apply(): InFocusGuardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InFocusGuardProps]
    }
    
    @scala.inline
    implicit class InFocusGuardPropsMutableBuilder[Self <: InFocusGuardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  @js.native
  trait ReactFocusLockProps[ChildrenType, LockProps] extends StObject {
    
    /**
      * @deprecated Use persistentFocus=false instead
      * enables(or disables) text selection. This also allows not to have ANY focus.
      */
    var allowTextSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Component to use, defaults to 'div'
      */
    var as: js.UndefOr[String | (ElementType[LockProps with ChildrenChildrenType[ChildrenType]])] = js.native
    
    /**
      * enables or disables autoFocusing feature.
      * If enabled - will move focus inside Lock, selecting the first or autoFocusable element
      * If disable - will blur any focus on Lock activation.
      * @default true
      */
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ChildrenType] = js.native
    
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
    
    var lockProps: js.UndefOr[LockProps] = js.native
    
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
    
    /**
      * Controls focus lock working areas. Lock will silently ignore all the events from `not allowed` areas
      * @param activeElement
      * @returns {Boolean} true if focus lock should handle activeElement, false if not
      */
    var whiteList: js.UndefOr[js.Function1[/* activeElement */ HTMLElement, Boolean]] = js.native
  }
  object ReactFocusLockProps {
    
    @scala.inline
    def apply[ChildrenType, LockProps](): ReactFocusLockProps[ChildrenType, LockProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactFocusLockProps[ChildrenType, LockProps]]
    }
    
    @scala.inline
    implicit class ReactFocusLockPropsMutableBuilder[Self <: ReactFocusLockProps[_, _], ChildrenType, LockProps] (val x: Self with (ReactFocusLockProps[ChildrenType, LockProps])) extends AnyVal {
      
      @scala.inline
      def setAllowTextSelection(value: Boolean): Self = StObject.set(x, "allowTextSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTextSelectionUndefined: Self = StObject.set(x, "allowTextSelection", js.undefined)
      
      @scala.inline
      def setAs(value: String | (ElementType[LockProps with ChildrenChildrenType[ChildrenType]])): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setChildren(value: ChildrenType): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCrossFrame(value: Boolean): Self = StObject.set(x, "crossFrame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossFrameUndefined: Self = StObject.set(x, "crossFrame", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setLockProps(value: LockProps): Self = StObject.set(x, "lockProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockPropsUndefined: Self = StObject.set(x, "lockProps", js.undefined)
      
      @scala.inline
      def setNoFocusGuards(value: Boolean | tail): Self = StObject.set(x, "noFocusGuards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoFocusGuardsUndefined: Self = StObject.set(x, "noFocusGuards", js.undefined)
      
      @scala.inline
      def setOnActivation(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onActivation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
      
      @scala.inline
      def setOnDeactivation(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "onDeactivation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeactivationUndefined: Self = StObject.set(x, "onDeactivation", js.undefined)
      
      @scala.inline
      def setPersistentFocus(value: Boolean): Self = StObject.set(x, "persistentFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentFocusUndefined: Self = StObject.set(x, "persistentFocus", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setReturnFocus(value: Boolean | FocusOptions): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      @scala.inline
      def setShards(value: js.Array[RefObject[_] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      @scala.inline
      def setShardsVarargs(value: (RefObject[js.Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value :_*))
      
      @scala.inline
      def setWhiteList(value: /* activeElement */ HTMLElement => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
    }
  }
}
