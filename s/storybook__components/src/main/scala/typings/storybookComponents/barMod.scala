package typings.storybookComponents

import typings.emotionStyledBase.mod.StyledComponent
import typings.react.mod.FunctionComponent
import typings.std.Pick
import typings.storybookTheming.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barMod {
  
  @JSImport("@storybook/components/dist/bar/bar", "Bar")
  @js.native
  val Bar: StyledComponent[js.Any, Pick[js.Any, String | Double | js.Symbol], Theme] = js.native
  
  @JSImport("@storybook/components/dist/bar/bar", "FlexBar")
  @js.native
  val FlexBar: FunctionComponent[FlexBarProps] = js.native
  
  trait FlexBarProps extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[js.Any] = js.undefined
  }
  object FlexBarProps {
    
    inline def apply(): FlexBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexBarProps]
    }
    
    extension [Self <: FlexBarProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait SideProps extends StObject {
    
    var left: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
  }
  object SideProps {
    
    inline def apply(): SideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideProps]
    }
    
    extension [Self <: SideProps](x: Self) {
      
      inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
}
