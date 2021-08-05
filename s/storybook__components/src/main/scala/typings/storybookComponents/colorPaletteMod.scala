package typings.storybookComponents

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPaletteMod {
  
  @JSImport("@storybook/components/dist/blocks/ColorPalette", "ColorItem")
  @js.native
  val ColorItem: FunctionComponent[ColorProps] = js.native
  
  @JSImport("@storybook/components/dist/blocks/ColorPalette", "ColorPalette")
  @js.native
  val ColorPalette: FunctionComponent[js.Object] = js.native
  
  trait ColorProps extends StObject {
    
    var colors: Colors
    
    var subtitle: String
    
    var title: String
  }
  object ColorProps {
    
    inline def apply(colors: Colors, subtitle: String, title: String): ColorProps = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorProps]
    }
    
    extension [Self <: ColorProps](x: Self) {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value :_*))
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Colors = js.Array[String] | StringDictionary[String]
}
