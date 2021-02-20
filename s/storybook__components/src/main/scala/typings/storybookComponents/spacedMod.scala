package typings.storybookComponents

import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spacedMod {
  
  @JSImport("@storybook/components/dist/spaced/Spaced", "Spaced")
  @js.native
  val Spaced: FunctionComponent[SpacedProps] = js.native
  
  @js.native
  trait ContainerProps extends StObject {
    
    var col: js.UndefOr[Double] = js.native
    
    var outer: js.UndefOr[Double] = js.native
    
    var row: js.UndefOr[Double] = js.native
  }
  object ContainerProps {
    
    @scala.inline
    def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      @scala.inline
      def setOuter(value: Double): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  @js.native
  trait SpacedProps extends StObject {
    
    var col: js.UndefOr[Double] = js.native
    
    var outer: js.UndefOr[Double | Boolean] = js.native
    
    var row: js.UndefOr[Double] = js.native
  }
  object SpacedProps {
    
    @scala.inline
    def apply(): SpacedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpacedProps]
    }
    
    @scala.inline
    implicit class SpacedPropsMutableBuilder[Self <: SpacedProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColUndefined: Self = StObject.set(x, "col", js.undefined)
      
      @scala.inline
      def setOuter(value: Double | Boolean): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOuterUndefined: Self = StObject.set(x, "outer", js.undefined)
      
      @scala.inline
      def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
}
