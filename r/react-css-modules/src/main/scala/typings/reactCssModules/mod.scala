package typings.reactCssModules

import org.scalablytyped.runtime.Shortcut
import typings.reactCssModules.reactCssModulesStrings.`throw`
import typings.reactCssModules.reactCssModulesStrings.ignore
import typings.reactCssModules.reactCssModulesStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-css-modules", JSImport.Namespace)
  @js.native
  val ^ : CSSModules = js.native
  
  @js.native
  trait CSSModules extends StObject {
    
    def apply(defaultStyles: StylesObject): js.Function1[/* Component */ js.Function, js.Function] = js.native
    def apply(defaultStyles: StylesObject, options: TypeOptions): js.Function1[/* Component */ js.Function, js.Function] = js.native
    def apply[C /* <: js.Function */](Component: C, defaultStyles: StylesObject): C = js.native
    def apply[C /* <: js.Function */](Component: C, defaultStyles: StylesObject, options: TypeOptions): C = js.native
  }
  
  // Extend your component's Prop interface with this one to get access to `this.props.styles`
  //
  // interface MyComponentProps extends CSSModules.InjectedCSSModuleProps {}
  trait InjectedCSSModuleProps extends StObject {
    
    var styles: js.UndefOr[StylesObject] = js.undefined
  }
  object InjectedCSSModuleProps {
    
    inline def apply(): InjectedCSSModuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedCSSModuleProps]
    }
    
    extension [Self <: InjectedCSSModuleProps](x: Self) {
      
      inline def setStyles(value: StylesObject): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type StylesObject = Any
  
  trait TypeOptions extends StObject {
    
    var allowMultiple: js.UndefOr[Boolean] = js.undefined
    
    var handleNotFoundStyleName: js.UndefOr[`throw` | log | ignore] = js.undefined
  }
  object TypeOptions {
    
    inline def apply(): TypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeOptions]
    }
    
    extension [Self <: TypeOptions](x: Self) {
      
      inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      inline def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      inline def setHandleNotFoundStyleName(value: `throw` | log | ignore): Self = StObject.set(x, "handleNotFoundStyleName", value.asInstanceOf[js.Any])
      
      inline def setHandleNotFoundStyleNameUndefined: Self = StObject.set(x, "handleNotFoundStyleName", js.undefined)
    }
  }
  
  type _To = CSSModules
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CSSModules = ^
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait Attributes extends StObject {
      
      var styleName: js.UndefOr[String] = js.undefined
    }
    object Attributes {
      
      inline def apply(): Attributes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Attributes]
      }
      
      extension [Self <: Attributes](x: Self) {
        
        inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
        
        inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      }
    }
    
    trait HTMLAttributes[T] extends StObject {
      
      var styleName: js.UndefOr[String] = js.undefined
    }
    object HTMLAttributes {
      
      inline def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      extension [Self <: HTMLAttributes[?], T](x: Self & HTMLAttributes[T]) {
        
        inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
        
        inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      }
    }
    
    trait SVGAttributes[T] extends StObject {
      
      var styleName: js.UndefOr[String] = js.undefined
    }
    object SVGAttributes {
      
      inline def apply[T](): SVGAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SVGAttributes[T]]
      }
      
      extension [Self <: SVGAttributes[?], T](x: Self & SVGAttributes[T]) {
        
        inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
        
        inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      }
    }
  }
}
