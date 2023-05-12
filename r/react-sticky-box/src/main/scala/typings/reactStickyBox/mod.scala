package typings.reactStickyBox

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sticky-box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StickyBoxCompProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useStickyBox(): Dispatch[SetStateAction[HTMLElement | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStickyBox")().asInstanceOf[Dispatch[SetStateAction[HTMLElement | Null]]]
  inline def useStickyBox(param0: StickyBoxConfig): Dispatch[SetStateAction[HTMLElement | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStickyBox")(param0.asInstanceOf[js.Any]).asInstanceOf[Dispatch[SetStateAction[HTMLElement | Null]]]
  
  /* Inlined react-sticky-box.react-sticky-box.StickyBoxConfig & std.Pick<react.react.ComponentProps<'div'>, 'children' | 'className' | 'style'> */
  trait StickyBoxCompProps extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Any] = js.undefined
    
    var className: js.UndefOr[Any] = js.undefined
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[Any] = js.undefined
  }
  object StickyBoxCompProps {
    
    inline def apply(): StickyBoxCompProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyBoxCompProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StickyBoxCompProps] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait StickyBoxConfig extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
  }
  object StickyBoxConfig {
    
    inline def apply(): StickyBoxConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyBoxConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StickyBoxConfig] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    }
  }
  
  type UseStickyBoxOptions = StickyBoxConfig
}
