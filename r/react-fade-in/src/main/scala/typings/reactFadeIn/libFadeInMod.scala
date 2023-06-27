package typings.reactFadeIn

import typings.react.mod.JSXElementConstructor
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFadeInMod {
  
  @JSImport("react-fade-in/lib/FadeIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PropsWithChildren[Props]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props extends StObject {
    
    var childClassName: js.UndefOr[String] = js.undefined
    
    var childTag: js.UndefOr[JSXElementConstructor[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var onComplete: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var transitionDuration: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var wrapperTag: js.UndefOr[JSXElementConstructor[Any]] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildClassName(value: String): Self = StObject.set(x, "childClassName", value.asInstanceOf[js.Any])
      
      inline def setChildClassNameUndefined: Self = StObject.set(x, "childClassName", js.undefined)
      
      inline def setChildTag(value: JSXElementConstructor[Any]): Self = StObject.set(x, "childTag", value.asInstanceOf[js.Any])
      
      inline def setChildTagFunction2(value: (Any, /* deprecatedLegacyContext */ js.UndefOr[Any]) => ReactNode): Self = StObject.set(x, "childTag", js.Any.fromFunction2(value))
      
      inline def setChildTagUndefined: Self = StObject.set(x, "childTag", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setOnComplete(value: () => Any): Self = StObject.set(x, "onComplete", js.Any.fromFunction0(value))
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWrapperTag(value: JSXElementConstructor[Any]): Self = StObject.set(x, "wrapperTag", value.asInstanceOf[js.Any])
      
      inline def setWrapperTagFunction2(value: (Any, /* deprecatedLegacyContext */ js.UndefOr[Any]) => ReactNode): Self = StObject.set(x, "wrapperTag", js.Any.fromFunction2(value))
      
      inline def setWrapperTagUndefined: Self = StObject.set(x, "wrapperTag", js.undefined)
    }
  }
}
