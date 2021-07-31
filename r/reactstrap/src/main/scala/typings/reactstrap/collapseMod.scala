package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.anon.Hide
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collapseMod {
  
  @JSImport("reactstrap/lib/Collapse", JSImport.Default)
  @js.native
  class default ()
    extends Component[CollapseProps, js.Object, js.Any]
  
  type Collapse = Component[CollapseProps, js.Object, js.Any]
  
  trait CollapseProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var delay: js.UndefOr[Hide] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var navbar: js.UndefOr[Boolean] = js.undefined
    
    var onClosed: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntered: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onEntering: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExited: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExiting: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
  }
  object CollapseProps {
    
    @scala.inline
    def apply(): CollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseProps]
    }
    
    @scala.inline
    implicit class CollapsePropsMutableBuilder[Self <: CollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setDelay(value: Hide): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      @scala.inline
      def setNavbar(value: Boolean): Self = StObject.set(x, "navbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavbarUndefined: Self = StObject.set(x, "navbar", js.undefined)
      
      @scala.inline
      def setOnClosed(value: () => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
      
      @scala.inline
      def setOnEntered(value: () => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: () => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: () => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: () => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setOnOpened(value: () => Unit): Self = StObject.set(x, "onOpened", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOpenedUndefined: Self = StObject.set(x, "onOpened", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  trait UncontrolledCollapseProps
    extends StObject
       with CollapseProps {
    
    var defaultOpen: js.UndefOr[Boolean] = js.undefined
    
    var toggleEvents: js.UndefOr[js.Array[String]] = js.undefined
    
    var toggler: String
  }
  object UncontrolledCollapseProps {
    
    @scala.inline
    def apply(toggler: String): UncontrolledCollapseProps = {
      val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
      __obj.asInstanceOf[UncontrolledCollapseProps]
    }
    
    @scala.inline
    implicit class UncontrolledCollapsePropsMutableBuilder[Self <: UncontrolledCollapseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOpen(value: Boolean): Self = StObject.set(x, "defaultOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultOpenUndefined: Self = StObject.set(x, "defaultOpen", js.undefined)
      
      @scala.inline
      def setToggleEvents(value: js.Array[String]): Self = StObject.set(x, "toggleEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleEventsUndefined: Self = StObject.set(x, "toggleEvents", js.undefined)
      
      @scala.inline
      def setToggleEventsVarargs(value: String*): Self = StObject.set(x, "toggleEvents", js.Array(value :_*))
      
      @scala.inline
      def setToggler(value: String): Self = StObject.set(x, "toggler", value.asInstanceOf[js.Any])
    }
  }
}
