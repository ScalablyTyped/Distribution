package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPie extends IPolar {
  
  /** [Config Option] (Number) */
  var Allows: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Boolean/Number) */
  var donut: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var field: js.UndefOr[String] = js.native
  
  /** [Method] Returns the value of donut
    * @returns Boolean/Number
    */
  var getDonut: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the pie slice for a given angle
    * @param angle Number The angle to search for the slice
    * @returns Object An object containing the reocord, sprite, scope etc.
    */
  var getItemForAngle: js.UndefOr[js.Function1[/* angle */ js.UndefOr[Double], _]] = js.native
  
  /** [Method] For a given x y point relative to the main region find a corresponding item from this series if any
    * @param x Object
    * @param y Object
    * @returns Object An object describing the item, or null if there is no matching item. The exact contents of this object will vary by series type, but should always contain at least the following:
    */
  @JSName("getItemForPoint")
  var getItemForPoint_IPie: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the value of labelField
    * @returns String
    */
  @JSName("getLabelField")
  var getLabelField_IPie: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of totalAngle
    * @returns Number
    */
  var getTotalAngle: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Config Option] (Array) */
  @JSName("hidden")
  var hidden_IPie: js.UndefOr[Array] = js.native
  
  /** [Config Option] (String) */
  @JSName("labelField")
  var labelField_IPie: js.UndefOr[String] = js.native
  
  /** [Method] Provide legend information to target array
    * @param target Object
    */
  @JSName("provideLegendInfo")
  var provideLegendInfo_IPie: js.UndefOr[js.Function1[/* target */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of donut
    * @param donut Boolean/Number The new value.
    */
  var setDonut: js.UndefOr[js.Function1[/* donut */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of hidden
    * @param hidden Array The new value.
    */
  @JSName("setHidden")
  var setHidden_IPie: js.UndefOr[js.Function1[/* hidden */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of labelField
    * @param labelField String The new value.
    */
  @JSName("setLabelField")
  var setLabelField_IPie: js.UndefOr[js.Function1[/* labelField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of totalAngle
    * @param totalAngle Number The new value.
    */
  var setTotalAngle: js.UndefOr[js.Function1[/* totalAngle */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var totalAngle: js.UndefOr[Double] = js.native
}
object IPie {
  
  @scala.inline
  def apply(): IPie = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie]
  }
  
  @scala.inline
  implicit class IPieOps[Self <: IPie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllows(value: Double): Self = this.set("Allows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllows: Self = this.set("Allows", js.undefined)
    
    @scala.inline
    def setDonut(value: js.Any): Self = this.set("donut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDonut: Self = this.set("donut", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setGetDonut(value: () => _): Self = this.set("getDonut", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetDonut: Self = this.set("getDonut", js.undefined)
    
    @scala.inline
    def setGetItemForAngle(value: /* angle */ js.UndefOr[Double] => _): Self = this.set("getItemForAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetItemForAngle: Self = this.set("getItemForAngle", js.undefined)
    
    @scala.inline
    def setGetItemForPoint(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any]) => _): Self = this.set("getItemForPoint", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetItemForPoint: Self = this.set("getItemForPoint", js.undefined)
    
    @scala.inline
    def setGetLabelField(value: () => String): Self = this.set("getLabelField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetLabelField: Self = this.set("getLabelField", js.undefined)
    
    @scala.inline
    def setGetTotalAngle(value: () => Double): Self = this.set("getTotalAngle", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetTotalAngle: Self = this.set("getTotalAngle", js.undefined)
    
    @scala.inline
    def setHidden(value: Array): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setLabelField(value: String): Self = this.set("labelField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelField: Self = this.set("labelField", js.undefined)
    
    @scala.inline
    def setProvideLegendInfo(value: /* target */ js.UndefOr[js.Any] => Unit): Self = this.set("provideLegendInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProvideLegendInfo: Self = this.set("provideLegendInfo", js.undefined)
    
    @scala.inline
    def setSetDonut(value: /* donut */ js.UndefOr[js.Any] => Unit): Self = this.set("setDonut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetDonut: Self = this.set("setDonut", js.undefined)
    
    @scala.inline
    def setSetHidden(value: /* hidden */ js.UndefOr[Array] => Unit): Self = this.set("setHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetHidden: Self = this.set("setHidden", js.undefined)
    
    @scala.inline
    def setSetLabelField(value: /* labelField */ js.UndefOr[String] => Unit): Self = this.set("setLabelField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetLabelField: Self = this.set("setLabelField", js.undefined)
    
    @scala.inline
    def setSetTotalAngle(value: /* totalAngle */ js.UndefOr[Double] => Unit): Self = this.set("setTotalAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetTotalAngle: Self = this.set("setTotalAngle", js.undefined)
    
    @scala.inline
    def setTotalAngle(value: Double): Self = this.set("totalAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalAngle: Self = this.set("totalAngle", js.undefined)
  }
}
