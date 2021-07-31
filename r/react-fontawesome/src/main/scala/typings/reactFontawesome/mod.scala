package typings.reactFontawesome

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-fontawesome", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[FontAwesomeProps, js.Object, js.Any]
  
  type FontAwesome = Component[FontAwesomeProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFontawesome.reactFontawesomeStrings.horizontal
    - typings.reactFontawesome.reactFontawesomeStrings.vertical
  */
  trait FontAwesomeFlip extends StObject
  object FontAwesomeFlip {
    
    @scala.inline
    def horizontal: typings.reactFontawesome.reactFontawesomeStrings.horizontal = "horizontal".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.horizontal]
    
    @scala.inline
    def vertical: typings.reactFontawesome.reactFontawesomeStrings.vertical = "vertical".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.vertical]
  }
  
  trait FontAwesomeProps
    extends StObject
       with Intermediate {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[Boolean] = js.undefined
    
    var cssModule: js.UndefOr[js.Any] = js.undefined
    
    var fixedWidth: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[FontAwesomeFlip] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    @JSName("name")
    var name_FontAwesomeProps: String
    
    var pulse: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    @JSName("size")
    var size_FontAwesomeProps: js.UndefOr[FontAwesomeSize] = js.undefined
    
    var spin: js.UndefOr[Boolean] = js.undefined
    
    var stack: js.UndefOr[FontAwesomeStack] = js.undefined
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object FontAwesomeProps {
    
    @scala.inline
    def apply(name: String): FontAwesomeProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontAwesomeProps]
    }
    
    @scala.inline
    implicit class FontAwesomePropsMutableBuilder[Self <: FontAwesomeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setCssModule(value: js.Any): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      @scala.inline
      def setFlip(value: FontAwesomeFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulse(value: Boolean): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSize(value: FontAwesomeSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      @scala.inline
      def setStack(value: FontAwesomeStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFontawesome.reactFontawesomeStrings.lg
    - typings.reactFontawesome.reactFontawesomeStrings.`2x`
    - typings.reactFontawesome.reactFontawesomeStrings.`3x`
    - typings.reactFontawesome.reactFontawesomeStrings.`4x`
    - typings.reactFontawesome.reactFontawesomeStrings.`5x`
  */
  trait FontAwesomeSize extends StObject
  object FontAwesomeSize {
    
    @scala.inline
    def `2x`: typings.reactFontawesome.reactFontawesomeStrings.`2x` = "2x".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.`2x`]
    
    @scala.inline
    def `3x`: typings.reactFontawesome.reactFontawesomeStrings.`3x` = "3x".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.`3x`]
    
    @scala.inline
    def `4x`: typings.reactFontawesome.reactFontawesomeStrings.`4x` = "4x".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.`4x`]
    
    @scala.inline
    def `5x`: typings.reactFontawesome.reactFontawesomeStrings.`5x` = "5x".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.`5x`]
    
    @scala.inline
    def lg: typings.reactFontawesome.reactFontawesomeStrings.lg = "lg".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.lg]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFontawesome.reactFontawesomeStrings.`1x`
    - typings.reactFontawesome.reactFontawesomeStrings.`2x`
  */
  trait FontAwesomeStack extends StObject
  object FontAwesomeStack {
    
    @scala.inline
    def `1x`: typings.reactFontawesome.reactFontawesomeStrings.`1x` = "1x".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.`1x`]
    
    @scala.inline
    def `2x`: typings.reactFontawesome.reactFontawesomeStrings.`2x` = "2x".asInstanceOf[typings.reactFontawesome.reactFontawesomeStrings.`2x`]
  }
  
  trait Intermediate
    extends StObject
       with AllHTMLAttributes[HTMLElement] {
    
    @JSName("size")
    var size_Intermediate: js.UndefOr[js.Any] = js.undefined
  }
  object Intermediate {
    
    @scala.inline
    def apply(): Intermediate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Intermediate]
    }
    
    @scala.inline
    implicit class IntermediateMutableBuilder[Self <: Intermediate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
