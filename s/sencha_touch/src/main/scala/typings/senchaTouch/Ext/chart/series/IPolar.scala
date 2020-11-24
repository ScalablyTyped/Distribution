package typings.senchaTouch.Ext.chart.series

import typings.senchaTouch.Ext.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPolar extends ISeries {
  
  /** [Config Option] (Array) */
  var center: js.UndefOr[Array] = js.native
  
  /** [Method] Returns the value of center
    * @returns Array
    */
  var getCenter: js.UndefOr[js.Function0[Array]] = js.native
  
  /** [Method] Returns the value of offsetX
    * @returns Number
    */
  var getOffsetX: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of offsetY
    * @returns Number
    */
  var getOffsetY: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of radius
    * @returns Number
    */
  var getRadius: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of rotation
    * @returns Number
    */
  var getRotation: js.UndefOr[js.Function0[Double]] = js.native
  
  /** [Method] Returns the value of xAxis
    * @returns Object
    */
  var getXAxis: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of xField
    * @returns String
    */
  var getXField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Method] Returns the value of yAxis
    * @returns Object
    */
  var getYAxis: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Method] Returns the value of yField
    * @returns String
    */
  var getYField: js.UndefOr[js.Function0[String]] = js.native
  
  /** [Config Option] (Number) */
  var offsetX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var offsetY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var radius: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var rotation: js.UndefOr[Double] = js.native
  
  /** [Method] Sets the value of center
    * @param center Array The new value.
    */
  var setCenter: js.UndefOr[js.Function1[/* center */ js.UndefOr[Array], Unit]] = js.native
  
  /** [Method] Sets the value of offsetX
    * @param offsetX Number The new value.
    */
  var setOffsetX: js.UndefOr[js.Function1[/* offsetX */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of offsetY
    * @param offsetY Number The new value.
    */
  var setOffsetY: js.UndefOr[js.Function1[/* offsetY */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of radius
    * @param radius Number The new value.
    */
  var setRadius: js.UndefOr[js.Function1[/* radius */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of rotation
    * @param rotation Number The new value.
    */
  var setRotation: js.UndefOr[js.Function1[/* rotation */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Method] Sets the value of xAxis
    * @param xAxis Object The new value.
    */
  var setXAxis: js.UndefOr[js.Function1[/* xAxis */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of xField
    * @param xField String The new value.
    */
  var setXField: js.UndefOr[js.Function1[/* xField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] Sets the value of yAxis
    * @param yAxis Object The new value.
    */
  var setYAxis: js.UndefOr[js.Function1[/* yAxis */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Method] Sets the value of yField
    * @param yField String The new value.
    */
  var setYField: js.UndefOr[js.Function1[/* yField */ js.UndefOr[String], Unit]] = js.native
  
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.native
}
object IPolar {
  
  @scala.inline
  def apply(): IPolar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolar]
  }
  
  @scala.inline
  implicit class IPolarOps[Self <: IPolar] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Array): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setGetCenter(value: () => Array): Self = this.set("getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetCenter: Self = this.set("getCenter", js.undefined)
    
    @scala.inline
    def setGetOffsetX(value: () => Double): Self = this.set("getOffsetX", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetX: Self = this.set("getOffsetX", js.undefined)
    
    @scala.inline
    def setGetOffsetY(value: () => Double): Self = this.set("getOffsetY", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetY: Self = this.set("getOffsetY", js.undefined)
    
    @scala.inline
    def setGetRadius(value: () => Double): Self = this.set("getRadius", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRadius: Self = this.set("getRadius", js.undefined)
    
    @scala.inline
    def setGetRotation(value: () => Double): Self = this.set("getRotation", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetRotation: Self = this.set("getRotation", js.undefined)
    
    @scala.inline
    def setGetXAxis(value: () => _): Self = this.set("getXAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXAxis: Self = this.set("getXAxis", js.undefined)
    
    @scala.inline
    def setGetXField(value: () => String): Self = this.set("getXField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetXField: Self = this.set("getXField", js.undefined)
    
    @scala.inline
    def setGetYAxis(value: () => _): Self = this.set("getYAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetYAxis: Self = this.set("getYAxis", js.undefined)
    
    @scala.inline
    def setGetYField(value: () => String): Self = this.set("getYField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetYField: Self = this.set("getYField", js.undefined)
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setSetCenter(value: /* center */ js.UndefOr[Array] => Unit): Self = this.set("setCenter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetCenter: Self = this.set("setCenter", js.undefined)
    
    @scala.inline
    def setSetOffsetX(value: /* offsetX */ js.UndefOr[Double] => Unit): Self = this.set("setOffsetX", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOffsetX: Self = this.set("setOffsetX", js.undefined)
    
    @scala.inline
    def setSetOffsetY(value: /* offsetY */ js.UndefOr[Double] => Unit): Self = this.set("setOffsetY", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetOffsetY: Self = this.set("setOffsetY", js.undefined)
    
    @scala.inline
    def setSetRadius(value: /* radius */ js.UndefOr[Double] => Unit): Self = this.set("setRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRadius: Self = this.set("setRadius", js.undefined)
    
    @scala.inline
    def setSetRotation(value: /* rotation */ js.UndefOr[Double] => Unit): Self = this.set("setRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetRotation: Self = this.set("setRotation", js.undefined)
    
    @scala.inline
    def setSetXAxis(value: /* xAxis */ js.UndefOr[js.Any] => Unit): Self = this.set("setXAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXAxis: Self = this.set("setXAxis", js.undefined)
    
    @scala.inline
    def setSetXField(value: /* xField */ js.UndefOr[String] => Unit): Self = this.set("setXField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetXField: Self = this.set("setXField", js.undefined)
    
    @scala.inline
    def setSetYAxis(value: /* yAxis */ js.UndefOr[js.Any] => Unit): Self = this.set("setYAxis", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetYAxis: Self = this.set("setYAxis", js.undefined)
    
    @scala.inline
    def setSetYField(value: /* yField */ js.UndefOr[String] => Unit): Self = this.set("setYField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetYField: Self = this.set("setYField", js.undefined)
    
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
}
