package typings.senchaTouch.Ext.chart.series.sprite

import typings.senchaTouch.Ext.chart.IMarkers
import typings.senchaTouch.Ext.draw.sprite.IPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.senchaTouch.Ext.IClass because Already inherited
- typings.senchaTouch.Ext.IBase because Already inherited
- typings.senchaTouch.Ext.chart.IMarkerHolder because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, destroy, extend, getInitialConfig, inheritableStatics, initConfig, mixins, platformConfig, self, singleton, statics, uses. Inlined bindMarker */ @js.native
trait IPie3DPart extends IPath {
  
  /** [Config Option] (Object) */
  var baseColor: js.UndefOr[js.Any] = js.native
  
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
  var distortion: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var endAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var endRho: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var margin: js.UndefOr[Double] = js.native
  
  /** [Config Option] (String) */
  var part: js.UndefOr[String] = js.native
  
  /** [Config Option] (Number) */
  var startAngle: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var startRho: js.UndefOr[Double] = js.native
  
  /** [Config Option] (Number) */
  var thickness: js.UndefOr[Double] = js.native
  
  /** [Method] Update the path
    * @param path Object
    */
  @JSName("updatePath")
  var updatePath_IPie3DPart: js.UndefOr[js.Function1[/* path */ js.UndefOr[js.Any], Unit]] = js.native
}
object IPie3DPart {
  
  @scala.inline
  def apply(): IPie3DPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPie3DPart]
  }
  
  @scala.inline
  implicit class IPie3DPartOps[Self <: IPie3DPart] (val x: Self) extends AnyVal {
    
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
    def setBaseColor(value: js.Any): Self = this.set("baseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseColor: Self = this.set("baseColor", js.undefined)
    
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
    def setDistortion(value: Double): Self = this.set("distortion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistortion: Self = this.set("distortion", js.undefined)
    
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndAngle: Self = this.set("endAngle", js.undefined)
    
    @scala.inline
    def setEndRho(value: Double): Self = this.set("endRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndRho: Self = this.set("endRho", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = this.set("part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePart: Self = this.set("part", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAngle: Self = this.set("startAngle", js.undefined)
    
    @scala.inline
    def setStartRho(value: Double): Self = this.set("startRho", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRho: Self = this.set("startRho", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setUpdatePath(value: /* path */ js.UndefOr[js.Any] => Unit): Self = this.set("updatePath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUpdatePath: Self = this.set("updatePath", js.undefined)
  }
}
