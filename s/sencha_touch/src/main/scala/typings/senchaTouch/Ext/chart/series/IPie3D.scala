package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPie3D
  extends StObject
     with IPolar {
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of distortion
    * @returns Number
    */
  var getDistortion: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of donut
    * @returns Boolean/Number
    */
  var getDonut: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of region
    * @returns Array
    */
  var getRegion: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the value of thickness
    * @returns Number
    */
  var getThickness: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Sets the value of distortion
    * @param distortion Number The new value.
    */
  var setDistortion: js.UndefOr[js.Function1[/* distortion */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of donut
    * @param donut Boolean/Number The new value.
    */
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of region
    * @param region Array The new value.
    */
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of thickness
    * @param thickness Number The new value.
    */
  var setThickness: js.UndefOr[js.Function1[/* thickness */ js.UndefOr[Double], Unit]] = js.undefined
}
object IPie3D {
  
  inline def apply(): IPie3D = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie3D]
  }
  
  extension [Self <: IPie3D](x: Self) {
    
    inline def setDonut(value: js.Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    inline def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setGetDistortion(value: () => Double): Self = StObject.set(x, "getDistortion", js.Any.fromFunction0(value))
    
    inline def setGetDistortionUndefined: Self = StObject.set(x, "getDistortion", js.undefined)
    
    inline def setGetDonut(value: () => js.Any): Self = StObject.set(x, "getDonut", js.Any.fromFunction0(value))
    
    inline def setGetDonutUndefined: Self = StObject.set(x, "getDonut", js.undefined)
    
    inline def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
    
    inline def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
    
    inline def setGetRegion(value: () => Array): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
    
    inline def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
    
    inline def setGetThickness(value: () => Double): Self = StObject.set(x, "getThickness", js.Any.fromFunction0(value))
    
    inline def setGetThicknessUndefined: Self = StObject.set(x, "getThickness", js.undefined)
    
    inline def setSetDistortion(value: /* distortion */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDistortion", js.Any.fromFunction1(value))
    
    inline def setSetDistortionUndefined: Self = StObject.set(x, "setDistortion", js.undefined)
    
    inline def setSetDonut(value: /* donut */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDonut", js.Any.fromFunction1(value))
    
    inline def setSetDonutUndefined: Self = StObject.set(x, "setDonut", js.undefined)
    
    inline def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
    
    inline def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
    
    inline def setSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRegion", js.Any.fromFunction1(value))
    
    inline def setSetRegionUndefined: Self = StObject.set(x, "setRegion", js.undefined)
    
    inline def setSetThickness(value: /* thickness */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setThickness", js.Any.fromFunction1(value))
    
    inline def setSetThicknessUndefined: Self = StObject.set(x, "setThickness", js.undefined)
  }
}
