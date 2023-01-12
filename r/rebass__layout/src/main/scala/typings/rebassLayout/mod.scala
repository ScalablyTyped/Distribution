package typings.rebassLayout

import typings.react.mod.FunctionComponent
import typings.rebass.mod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rebass/layout", "Tiles")
  @js.native
  val Tiles: FunctionComponent[TilesProps] = js.native
  
  trait TilesProps
    extends StObject
       with BoxProps {
    
    var columns: js.UndefOr[js.Array[Double | Null]] = js.undefined
    
    var gap: js.UndefOr[Double] = js.undefined
    
    @JSName("width")
    var width_TilesProps: js.UndefOr[js.Array[Double | String | Null]] = js.undefined
  }
  object TilesProps {
    
    inline def apply(): TilesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TilesProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TilesProps] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: js.Array[Double | Null]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (Double | Null)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setWidth(value: js.Array[Double | String | Null]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(value: (Double | String | Null)*): Self = StObject.set(x, "width", js.Array(value*))
    }
  }
}
