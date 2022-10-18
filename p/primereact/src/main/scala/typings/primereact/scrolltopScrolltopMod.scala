package typings.primereact

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
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollTopProps, context: Any) = this()
    
    def getElement(): HTMLButtonElement = js.native
  }
  
  trait ScrollTopProps extends StObject {
    
    var behavior: js.UndefOr[ScrollTopScrollBehavior] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<ScrollTopProps> */ Any
      ] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
    
    var target: js.UndefOr[ScrollTopTargetType] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var transitionOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ] = js.undefined
  }
  object ScrollTopProps {
    
    inline def apply(): ScrollTopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollTopProps]
    }
    
    extension [Self <: ScrollTopProps](x: Self) {
      
      inline def setBehavior(value: ScrollTopScrollBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
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
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: ScrollTopTargetType): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTransitionOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
      ): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptionsUndefined: Self = StObject.set(x, "transitionOptions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.auto
    - typings.primereact.primereactStrings.smooth
  */
  trait ScrollTopScrollBehavior extends StObject
  object ScrollTopScrollBehavior {
    
    inline def auto: typings.primereact.primereactStrings.auto = "auto".asInstanceOf[typings.primereact.primereactStrings.auto]
    
    inline def smooth: typings.primereact.primereactStrings.smooth = "smooth".asInstanceOf[typings.primereact.primereactStrings.smooth]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.primereact.primereactStrings.window
    - typings.primereact.primereactStrings.parent
  */
  trait ScrollTopTargetType extends StObject
  object ScrollTopTargetType {
    
    inline def parent: typings.primereact.primereactStrings.parent = "parent".asInstanceOf[typings.primereact.primereactStrings.parent]
    
    inline def window: typings.primereact.primereactStrings.window = "window".asInstanceOf[typings.primereact.primereactStrings.window]
  }
}
