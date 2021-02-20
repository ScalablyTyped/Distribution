package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesetMod {
  
  @JSImport("@storybook/components/dist/blocks/Typeset", "Typeset")
  @js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
  
  @js.native
  trait TypesetProps extends StObject {
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var fontSizes: js.Array[String] = js.native
    
    var fontWeight: js.UndefOr[Double] = js.native
    
    var sampleText: js.UndefOr[String] = js.native
  }
  object TypesetProps {
    
    @scala.inline
    def apply(fontSizes: js.Array[String]): TypesetProps = {
      val __obj = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypesetProps]
    }
    
    @scala.inline
    implicit class TypesetPropsMutableBuilder[Self <: TypesetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSizes(value: js.Array[String]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizesVarargs(value: String*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      @scala.inline
      def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setSampleText(value: String): Self = StObject.set(x, "sampleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleTextUndefined: Self = StObject.set(x, "sampleText", js.undefined)
    }
  }
}
