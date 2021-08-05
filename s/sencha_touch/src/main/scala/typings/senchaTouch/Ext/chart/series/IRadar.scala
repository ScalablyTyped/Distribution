package typings.senchaTouch.Ext.chart.series

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRadar
  extends StObject
     with IPolar {
  
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
    * @param x Object
    * @param y Object
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
    */
  @JSName("getItemForPoint")
  var getItemForPoint_IRadar: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], js.Any]] = js.undefined
}
object IRadar {
  
  inline def apply(): IRadar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadar]
  }
  
  extension [Self <: IRadar](x: Self) {
    
    inline def setGetItemForPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction2(value))
    
    inline def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
  }
}
