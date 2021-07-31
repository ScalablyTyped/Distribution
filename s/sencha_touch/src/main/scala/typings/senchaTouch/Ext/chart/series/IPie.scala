package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPie
  extends StObject
     with IPolar {
  
  /** [Config Option] (Number) */
  var Allows: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of donut
    * @returns Boolean/Number
    */
  var getDonut: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /** [Method] Returns the pie slice for a given angle
    * @param angle Number The angle to search for the slice
    * @returns Object An object containing the reocord, sprite, scope etc.
    */
  var getItemForAngle: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], js.Any]] = js.undefined
  
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
    * @param x Object
    * @param y Object
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
    */
  @JSName("getItemForPoint")
  var getItemForPoint_IPie: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Method] Returns the value of labelField
    * @returns String
    */
  @JSName("getLabelField")
  var getLabelField_IPie: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of totalAngle
    * @returns Number
    */
  var getTotalAngle: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IPie: js.UndefOr[Array] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("labelField")
  var labelField_IPie: js.UndefOr[String] = js.undefined
  
  /** [Method] Provide legend information to target array
    * @param target Object
    */
  @JSName("provideLegendInfo")
  var provideLegendInfo_IPie: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of donut
    * @param donut Boolean/Number The new value.
    */
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of hidden
    * @param hidden Array The new value.
    */
  @JSName("setHidden")
  var setHidden_IPie: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Array], Unit]] = js.undefined
  
  /** [Method] Sets the value of labelField
    * @param labelField String The new value.
    */
  @JSName("setLabelField")
  var setLabelField_IPie: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of totalAngle
    * @param totalAngle Number The new value.
    */
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Config Option] (Number) */
  var totalAngle: js.UndefOr[Double] = js.undefined
}
object IPie {
  
  @scala.inline
  def apply(): IPie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie]
  }
  
  @scala.inline
  implicit class IPieMutableBuilder[Self <: IPie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllows(value: Double): Self = StObject.set(x, "Allows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsUndefined: Self = StObject.set(x, "Allows", js.undefined)
    
    @scala.inline
    def setDonut(value: js.Any): Self = StObject.set(x, "donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDonutUndefined: Self = StObject.set(x, "donut", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setGetDonut(value: () => js.Any): Self = StObject.set(x, "getDonut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDonutUndefined: Self = StObject.set(x, "getDonut", js.undefined)
    
    @scala.inline
    def setGetItemForAngle(value: /* angle */ js.UndefOr[Double] => js.Any): Self = StObject.set(x, "getItemForAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetItemForAngleUndefined: Self = StObject.set(x, "getItemForAngle", js.undefined)
    
    @scala.inline
    def setGetItemForPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "getItemForPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetItemForPointUndefined: Self = StObject.set(x, "getItemForPoint", js.undefined)
    
    @scala.inline
    def setGetLabelField(value: () => String): Self = StObject.set(x, "getLabelField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabelFieldUndefined: Self = StObject.set(x, "getLabelField", js.undefined)
    
    @scala.inline
    def setGetTotalAngle(value: () => Double): Self = StObject.set(x, "getTotalAngle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTotalAngleUndefined: Self = StObject.set(x, "getTotalAngle", js.undefined)
    
    @scala.inline
    def setHidden(value: Array): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setLabelField(value: String): Self = StObject.set(x, "labelField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFieldUndefined: Self = StObject.set(x, "labelField", js.undefined)
    
    @scala.inline
    def setProvideLegendInfo(value: /* target */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "provideLegendInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProvideLegendInfoUndefined: Self = StObject.set(x, "provideLegendInfo", js.undefined)
    
    @scala.inline
    def setSetDonut(value: /* donut */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDonut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDonutUndefined: Self = StObject.set(x, "setDonut", js.undefined)
    
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[Array] => Unit): Self = StObject.set(x, "setHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHiddenUndefined: Self = StObject.set(x, "setHidden", js.undefined)
    
    @scala.inline
    def setSetLabelField(value: /* labelField */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setLabelField", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLabelFieldUndefined: Self = StObject.set(x, "setLabelField", js.undefined)
    
    @scala.inline
    def setSetTotalAngle(value: /* totalAngle */ js.UndefOr[Double] => Unit): Self = StObject.set(x, "setTotalAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTotalAngleUndefined: Self = StObject.set(x, "setTotalAngle", js.undefined)
    
    @scala.inline
    def setTotalAngle(value: Double): Self = StObject.set(x, "totalAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAngleUndefined: Self = StObject.set(x, "totalAngle", js.undefined)
  }
}
