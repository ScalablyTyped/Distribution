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
    
    @scala.inline
    def apply(): InjectedCSSModuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectedCSSModuleProps]
    }
    
    @scala.inline
    implicit class InjectedCSSModulePropsMutableBuilder[Self <: InjectedCSSModuleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: StylesObject): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  type StylesObject = js.Any
  
  trait TypeOptions extends StObject {
    
    var allowMultiple: js.UndefOr[Boolean] = js.undefined
    
    var handleNotFoundStyleName: js.UndefOr[`throw` | log | ignore] = js.undefined
  }
  object TypeOptions {
    
    @scala.inline
    def apply(): TypeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeOptions]
    }
    
    @scala.inline
    implicit class TypeOptionsMutableBuilder[Self <: TypeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultipleUndefined: Self = StObject.set(x, "allowMultiple", js.undefined)
      
      @scala.inline
      def setHandleNotFoundStyleName(value: `throw` | log | ignore): Self = StObject.set(x, "handleNotFoundStyleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleNotFoundStyleNameUndefined: Self = StObject.set(x, "handleNotFoundStyleName", js.undefined)
    }
  }
  
  type _To = CSSModules
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CSSModules = ^
  
  object reactAugmentingMod {
    
    trait HTMLAttributes[T] extends StObject {
      
      var styleName: js.UndefOr[String] = js.undefined
    }
    object HTMLAttributes {
      
      @scala.inline
      def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      @scala.inline
      implicit class HTMLAttributesMutableBuilder[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      }
    }
    
    trait SVGAttributes[T] extends StObject {
      
      var styleName: js.UndefOr[String] = js.undefined
    }
    object SVGAttributes {
      
      @scala.inline
      def apply[T](): SVGAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SVGAttributes[T]]
      }
      
      @scala.inline
      implicit class SVGAttributesMutableBuilder[Self <: SVGAttributes[?], T] (val x: Self & SVGAttributes[T]) extends AnyVal {
        
        @scala.inline
        def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
      }
    }
  }
}
