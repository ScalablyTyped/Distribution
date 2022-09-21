package typings.reactStickyBox

import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sticky-box", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sticky-box", JSImport.Default)
  @js.native
  val default: FunctionComponent[StickyBoxCompProps] = js.native
  
  inline def useStickyBox[T](): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStickyBox")().asInstanceOf[RefCallback[T]]
  inline def useStickyBox[T](options: UseStickyBoxOptions): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useStickyBox")(options.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  
  trait StickyBoxCompProps
    extends StObject
       with UseStickyBoxOptions {
    
    var children: ReactNode
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object StickyBoxCompProps {
    
    inline def apply(): StickyBoxCompProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StickyBoxCompProps]
    }
    
    extension [Self <: StickyBoxCompProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait UseStickyBoxOptions extends StObject {
    
    var bottom: js.UndefOr[Boolean] = js.undefined
    
    var offsetBottom: js.UndefOr[Double] = js.undefined
    
    var offsetTop: js.UndefOr[Double] = js.undefined
  }
  object UseStickyBoxOptions {
    
    inline def apply(): UseStickyBoxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseStickyBoxOptions]
    }
    
    extension [Self <: UseStickyBoxOptions](x: Self) {
      
      inline def setBottom(value: Boolean): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
    }
  }
}
