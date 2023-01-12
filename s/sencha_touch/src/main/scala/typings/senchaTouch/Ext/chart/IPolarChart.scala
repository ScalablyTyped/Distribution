package typings.senchaTouch.Ext.chart

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolarChart
  extends StObject
     with IAbstractChart {
  
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.undefined
  
  /** [Method] Returns the value of center
    * @returns Array
    */
  var getCenter: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of radius
    * @returns Number
    */
  var getRadius: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.undefined
  
  /** [Method] Sets the value of center
    * @param center Array The new value.
    */
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of radius
    * @param radius Number The new value.
    */
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.undefined
}
object IPolarChart {
  
  inline def apply(): IPolarChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolarChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPolarChart] (val x: Self) extends AnyVal {
    
    inline def setCenter(value: Array): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setGetCenter(value: () => Array): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    inline def setGetCenterUndefined: Self = StObject.set(x, "getCenter", js.undefined)
    
    inline def setGetRadius(value: () => Double): Self = StObject.set(x, "getRadius", js.Any.fromFunction0(value))
    
    inline def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSetCenter(value: /* center */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setCenter", js.Any.fromFunction1(value))
    
    inline def setSetCenterUndefined: Self = StObject.set(x, "setCenter", js.undefined)
    
    inline def setSetRadius(value: /* radius */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setRadius", js.Any.fromFunction1(value))
    
    inline def setSetRadiusUndefined: Self = StObject.set(x, "setRadius", js.undefined)
  }
}
