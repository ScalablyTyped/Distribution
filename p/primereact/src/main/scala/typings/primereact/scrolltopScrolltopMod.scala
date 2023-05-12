package typings.primereact

import typings.primereact.primereactStrings.auto
import typings.primereact.primereactStrings.parent
import typings.primereact.primereactStrings.smooth
import typings.primereact.primereactStrings.window
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrolltopScrolltopMod {
  
  @JSImport("primereact/scrolltop/scrolltop", "ScrollTop")
  @js.native
  open class ScrollTop protected () extends Component[ScrollTopProps, Any, Any] {
    def this(props: ScrollTopProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollTopProps, context: Any) = this()
    
    /**
      * Used to get container element.
      * @return {HTMLButtonElement} Container element
      */
    def getElement(): HTMLButtonElement = js.native
  }
  
  trait ScrollTopProps extends StObject {
    
    /**
      * Defines the scrolling behavior, "smooth" adds an animation and "auto" scrolls with a jump.
      * @defaultValue smooth
      */
    var behavior: js.UndefOr[auto | smooth] = js.undefined
    
    /**
      * Used to get the child elements of the component.
      * @readonly
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Style class of the component.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the icon or JSX.Element for icon.
      */
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ScrollTopProps> */ Any
      ] = js.undefined
    
    /**
      * 	Callback to invoke when overlay becomes hidden.
      */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback to invoke when overlay panel becomes visible.
      */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Inline style of the component.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Target of the ScrollTop, valid values are "window" and "parent".
      * @defaultValue window
      */
    var target: js.UndefOr[window | parent] = js.undefined
    
    /**
      * Defines the threshold value of the vertical scroll position of the target to toggle the visibility.
      * @defaultValue 400
      */
    var threshold: js.UndefOr[Double] = js.undefined
    
    /**
      * The properties of CSSTransition can be customized, except for "nodeRef" and "in" properties.
      * @type {CSSTransitionProps}
      */
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
  }
  object ScrollTopProps {
    
    inline def apply(): ScrollTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollTopProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollTopProps] (val x: Self) extends AnyVal {
      
      inline def setBehavior(value: auto | smooth): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ScrollTopProps> */ Any
      ): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: window | parent): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
    }
  }
}
