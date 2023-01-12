package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.typesLibUtilsMod.CSSModule
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibFadeMod {
  
  @JSImport("reactstrap/types/lib/Fade", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FadeProps, js.Object, Any]
  
  type Fade = Component[FadeProps, js.Object, Any]
  
  trait FadeProps
    extends StObject
       with HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[Any] {
    
    var baseClass: js.UndefOr[String] = js.undefined
    
    var baseClassIn: js.UndefOr[String] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var in: js.UndefOr[Boolean] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLElement]] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var transitionAppear: js.UndefOr[Boolean] = js.undefined
    
    var transitionAppearTimeout: js.UndefOr[Double] = js.undefined
    
    var transitionEnter: js.UndefOr[Boolean] = js.undefined
    
    var transitionEnterTimeout: js.UndefOr[Double] = js.undefined
    
    var transitionLeave: js.UndefOr[Boolean] = js.undefined
    
    var transitionLeaveTimeout: js.UndefOr[Double] = js.undefined
  }
  object FadeProps {
    
    inline def apply(): FadeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FadeProps] (val x: Self) extends AnyVal {
      
      inline def setBaseClass(value: String): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
      
      inline def setBaseClassIn(value: String): Self = StObject.set(x, "baseClassIn", value.asInstanceOf[js.Any])
      
      inline def setBaseClassInUndefined: Self = StObject.set(x, "baseClassIn", js.undefined)
      
      inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnLeave(value: () => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction0(value))
      
      inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setTransitionAppear(value: Boolean): Self = StObject.set(x, "transitionAppear", value.asInstanceOf[js.Any])
      
      inline def setTransitionAppearTimeout(value: Double): Self = StObject.set(x, "transitionAppearTimeout", value.asInstanceOf[js.Any])
      
      inline def setTransitionAppearTimeoutUndefined: Self = StObject.set(x, "transitionAppearTimeout", js.undefined)
      
      inline def setTransitionAppearUndefined: Self = StObject.set(x, "transitionAppear", js.undefined)
      
      inline def setTransitionEnter(value: Boolean): Self = StObject.set(x, "transitionEnter", value.asInstanceOf[js.Any])
      
      inline def setTransitionEnterTimeout(value: Double): Self = StObject.set(x, "transitionEnterTimeout", value.asInstanceOf[js.Any])
      
      inline def setTransitionEnterTimeoutUndefined: Self = StObject.set(x, "transitionEnterTimeout", js.undefined)
      
      inline def setTransitionEnterUndefined: Self = StObject.set(x, "transitionEnter", js.undefined)
      
      inline def setTransitionLeave(value: Boolean): Self = StObject.set(x, "transitionLeave", value.asInstanceOf[js.Any])
      
      inline def setTransitionLeaveTimeout(value: Double): Self = StObject.set(x, "transitionLeaveTimeout", value.asInstanceOf[js.Any])
      
      inline def setTransitionLeaveTimeoutUndefined: Self = StObject.set(x, "transitionLeaveTimeout", js.undefined)
      
      inline def setTransitionLeaveUndefined: Self = StObject.set(x, "transitionLeave", js.undefined)
    }
  }
}
