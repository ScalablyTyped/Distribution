package typings.reactColor

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactColor.anon.PartialClassesGithubPicke
import typings.reactColor.mod.ColorPickerProps
import typings.reactColor.mod.ColorResult
import typings.reactColor.reactColorStrings.`top-left`
import typings.reactColor.reactColorStrings.`top-right`
import typings.reactColor.reactColorStrings.hide
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object githubMod {
  
  @JSImport("react-color/lib/components/github/Github", JSImport.Default)
  @js.native
  class default ()
    extends Component[GithubPickerProps, js.Object, js.Any]
  
  @js.native
  trait GithubPicker
    extends Component[GithubPickerProps, js.Object, js.Any]
  
  @js.native
  trait GithubPickerProps extends ColorPickerProps[GithubPicker] {
    
    var colors: js.UndefOr[js.Array[String]] = js.native
    
    var onSwatchHover: js.UndefOr[js.Function2[/* color */ ColorResult, /* event */ MouseEvent, Unit]] = js.native
    
    @JSName("styles")
    var styles_GithubPickerProps: js.UndefOr[PartialClassesGithubPicke] = js.native
    
    var triangle: js.UndefOr[hide | `top-left` | `top-right`] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object GithubPickerProps {
    
    @scala.inline
    def apply(): GithubPickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GithubPickerProps]
    }
    
    @scala.inline
    implicit class GithubPickerPropsMutableBuilder[Self <: GithubPickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      @scala.inline
      def setOnSwatchHover(value: (/* color */ ColorResult, /* event */ MouseEvent) => Unit): Self = StObject.set(x, "onSwatchHover", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSwatchHoverUndefined: Self = StObject.set(x, "onSwatchHover", js.undefined)
      
      @scala.inline
      def setStyles(value: PartialClassesGithubPicke): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTriangle(value: hide | `top-left` | `top-right`): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleUndefined: Self = StObject.set(x, "triangle", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait GithubPickerStylesProps extends StObject {
    
    var card: CSSProperties = js.native
    
    var triangle: CSSProperties = js.native
    
    var triangleShadow: CSSProperties = js.native
  }
  object GithubPickerStylesProps {
    
    @scala.inline
    def apply(card: CSSProperties, triangle: CSSProperties, triangleShadow: CSSProperties): GithubPickerStylesProps = {
      val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], triangle = triangle.asInstanceOf[js.Any], triangleShadow = triangleShadow.asInstanceOf[js.Any])
      __obj.asInstanceOf[GithubPickerStylesProps]
    }
    
    @scala.inline
    implicit class GithubPickerStylesPropsMutableBuilder[Self <: GithubPickerStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCard(value: CSSProperties): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangle(value: CSSProperties): Self = StObject.set(x, "triangle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangleShadow(value: CSSProperties): Self = StObject.set(x, "triangleShadow", value.asInstanceOf[js.Any])
    }
  }
}
