package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacedMod {
  
  @JSImport("@storybook/components/dist/spaced/Spaced", "Spaced")
  @js.native
  val Spaced: FunctionComponent[SpacedProps] = js.native
  
  trait ContainerProps extends StObject {
    
    var col: js.UndefOr[Double] = js.undefined
    
    var outer: js.UndefOr[Double] = js.undefined
    
    var row: js.UndefOr[Double] = js.undefined
  }
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    extension [Self <: ContainerProps](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      inline def setOuter(value: Double): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      inline def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait SpacedProps extends StObject {
    
    var col: js.UndefOr[Double] = js.undefined
    
    var outer: js.UndefOr[Double | Boolean] = js.undefined
    
    var row: js.UndefOr[Double] = js.undefined
  }
  object SpacedProps {
    
    inline def apply(): SpacedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpacedProps]
    }
    
    extension [Self <: SpacedProps](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      inline def setOuter(value: Double | Boolean): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      inline def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
