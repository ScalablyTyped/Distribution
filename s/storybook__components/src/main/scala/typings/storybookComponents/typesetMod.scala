package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesetMod {
  
  @JSImport("@storybook/components/dist/blocks/Typeset", "Typeset")
  @js.native
  val Typeset: FunctionComponent[TypesetProps] = js.native
  
  trait TypesetProps extends StObject {
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSizes: js.Array[String]
    
    var fontWeight: js.UndefOr[Double] = js.undefined
    
    var sampleText: js.UndefOr[String] = js.undefined
  }
  object TypesetProps {
    
    inline def apply(fontSizes: js.Array[String]): TypesetProps = {
      val __obj = js.Dynamic.literal(fontSizes = fontSizes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypesetProps]
    }
    
    extension [Self <: TypesetProps](x: Self) {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSizes(value: js.Array[String]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesVarargs(value: String*): Self = StObject.set(x, "fontSizes", js.Array(value :_*))
      
      inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSampleText(value: String): Self = StObject.set(x, "sampleText", value.asInstanceOf[js.Any])
      
      inline def setSampleTextUndefined: Self = StObject.set(x, "sampleText", js.undefined)
    }
  }
}
