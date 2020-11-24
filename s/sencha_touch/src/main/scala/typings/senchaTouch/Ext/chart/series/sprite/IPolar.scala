package typings.senchaTouch.Ext.chart.series.sprite

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.sprite.ISprite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IPolar extends ISprite {
  
  /** [Config Option] (Array) */
  var Data: js.UndefOr[Array] = js.native
  
  /** [Config Option] (Number) */
  var baseRotation: js.UndefOr[Double] = js.native
  
  /** [Method]
    * @param name String
    * @param marker Ext.chart.Markers
    */
  var bindMarker: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[IMarkers], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var centerX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var centerY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMaxX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMaxY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMinX: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var dataMinY: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var dataX: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Object) */
  var dataY: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.native
  
  /** [Method] Returns the value of field
    * @returns Object
    */
  var getField: js.UndefOr[js.Function0[_]] = js.native
  
  /** [Config Option] (Number) */
  var labelOverflowPadding: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Object) */
  var labels: js.UndefOr[js.Any] = js.native
  
  /** [Method] Sets the value of field
    * @param field Object The new value.
    */
  var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.native
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
    def setData(value: Array): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setBaseRotation(value: Double): Self = this.set("baseRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseRotation: Self = this.set("baseRotation", js.undefined)
    
    @scala.inline
    def setBindMarker(value: (js.UndefOr[String], js.UndefOr[IMarkers]) => Unit): Self = this.set("bindMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBindMarker: Self = this.set("bindMarker", js.undefined)
    
    @scala.inline
    def setCenterX(value: Double): Self = this.set("centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterX: Self = this.set("centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: Double): Self = this.set("centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterY: Self = this.set("centerY", js.undefined)
    
    @scala.inline
    def setDataMaxX(value: Double): Self = this.set("dataMaxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMaxX: Self = this.set("dataMaxX", js.undefined)
    
    @scala.inline
    def setDataMaxY(value: Double): Self = this.set("dataMaxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMaxY: Self = this.set("dataMaxY", js.undefined)
    
    @scala.inline
    def setDataMinX(value: Double): Self = this.set("dataMinX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMinX: Self = this.set("dataMinX", js.undefined)
    
    @scala.inline
    def setDataMinY(value: Double): Self = this.set("dataMinY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMinY: Self = this.set("dataMinY", js.undefined)
    
    @scala.inline
    def setDataX(value: js.Any): Self = this.set("dataX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataX: Self = this.set("dataX", js.undefined)
    
    @scala.inline
    def setDataY(value: js.Any): Self = this.set("dataY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataY: Self = this.set("dataY", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setEndRho(value: Double): Self = this.set("endRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndRho: Self = this.set("endRho", js.undefined)
    
    @scala.inline
    def setGetField(value: () => _): Self = this.set("getField", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetField: Self = this.set("getField", js.undefined)
    
    @scala.inline
    def setLabelOverflowPadding(value: Double): Self = this.set("labelOverflowPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelOverflowPadding: Self = this.set("labelOverflowPadding", js.undefined)
    
    @scala.inline
    def setLabels(value: js.Any): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setSetField(value: /* field */ js.UndefOr[js.Any] => Unit): Self = this.set("setField", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSetField: Self = this.set("setField", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setStartRho(value: Double): Self = this.set("startRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRho: Self = this.set("startRho", js.undefined)
  }
}
