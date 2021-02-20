package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPie3D extends IPolar {
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of distortion
    * @returns Number
    */
  var getDistortion: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of donut
    * @returns Boolean/Number
    */
  var getDonut: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of field
    * @returns String
    */
  var getField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of region
    * @returns Array
    */
  var getRegion: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of thickness
    * @returns Number
    */
  var getThickness: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Sets the value of distortion
    * @param distortion Number The new value.
    */
  var setDistortion: js.UndefOr[js.Function1[/* distortion */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of donut
    * @param donut Boolean/Number The new value.
    */
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of field
    * @param field String The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of region
    * @param region Array The new value.
    */
  var setRegion: js.UndefOr[js.Function1[/* region */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of thickness
    * @param thickness Number The new value.
    */
  var setThickness: js.UndefOr[js.Function1[/* thickness */ js.UndefOr[Double], Unit]] = js.native
}
object IPie3D {
  
  @scala.inline
  def apply(): IPie3D = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie3D]
  }
  
  @scala.inline
  implicit class IPie3DMutableBuilder[Self <: IPie3D] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDonut(value: js.Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setGetDistortion(value: () => Double): Self = StObject.set(x, "getDistortion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDistortionUndefined: Self = StObject.set(x, "getDistortion", js.undefined)
    
    @scala.inline
    def setGetDonut(value: () => _): Self = StObject.set(x, "getDonut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDonutUndefined: Self = StObject.set(x, "getDonut", js.undefined)
    
    @scala.inline
    def setGetField(value: () => String): Self = StObject.set(x, "getField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
    
    @scala.inline
    def setGetRegion(value: () => Array): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
    
    @scala.inline
    def setGetThickness(value: () => Double): Self = StObject.set(x, "getThickness", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThicknessUndefined: Self = StObject.set(x, "getThickness", js.undefined)
    
    @scala.inline
    def setSetDistortion(value: /* distortion */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setDistortion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDistortionUndefined: Self = StObject.set(x, "setDistortion", js.undefined)
    
    @scala.inline
    def setSetDonut(value: /* donut */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDonut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDonutUndefined: Self = StObject.set(x, "setDonut", js.undefined)
    
    @scala.inline
    def setSetField(value: /* field */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
    
    @scala.inline
    def setSetRegion(value: /* region */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setRegion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetRegionUndefined: Self = StObject.set(x, "setRegion", js.undefined)
    
    @scala.inline
    def setSetThickness(value: /* thickness */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setThickness", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetThicknessUndefined: Self = StObject.set(x, "setThickness", js.undefined)
  }
}
