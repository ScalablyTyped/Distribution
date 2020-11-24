package typings.reactVis.mod

import typings.reactVis.anon.X
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.radius
import typings.reactVis.reactVisStrings.radius0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcSeriesProps extends AbstractSeriesProps[ArcSeriesPoint] {
  
  var _angleValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_angle'] */ js.Any
  ] = js.native
  
  var _radiusValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_radius'] */ js.Any
  ] = js.native
  
  var angleBaseValue: js.UndefOr[Double] = js.native
  
  var angleDistance: js.UndefOr[Double] = js.native
  
  var angleDomain: js.UndefOr[js.Array[Double]] = js.native
  
  var angleRange: js.UndefOr[js.Array[Double]] = js.native
  
  var angleType: js.UndefOr[Scale] = js.native
  
  var arcClassName: js.UndefOr[String] = js.native
  
   // default: ''
  var center: js.UndefOr[X] = js.native
  
  var getAngle: js.UndefOr[RVGet[ArcSeriesPoint, angle]] = js.native
  
   // default: {'x':0,'y':0}
  var getAngle0: js.UndefOr[RVGet[ArcSeriesPoint, angle0]] = js.native
  
  var getRadius: js.UndefOr[RVGet[ArcSeriesPoint, radius]] = js.native
  
  var getRadius0: js.UndefOr[RVGet[ArcSeriesPoint, radius0]] = js.native
  
  var radiusBaseValue: js.UndefOr[Double] = js.native
  
  var radiusDistance: js.UndefOr[Double] = js.native
  
  var radiusDomain: js.UndefOr[js.Array[Double]] = js.native
  
  var radiusRange: js.UndefOr[js.Array[Double]] = js.native
  
  var radiusType: js.UndefOr[Scale] = js.native
}
object ArcSeriesProps {
  
  @scala.inline
  def apply(): ArcSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcSeriesProps]
  }
  
  @scala.inline
  implicit class ArcSeriesPropsOps[Self <: ArcSeriesProps] (val x: Self) extends AnyVal {
    
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
    def set_angleValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_angle'] */ js.Any
    ): Self = this.set("_angleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_angleValue: Self = this.set("_angleValue", js.undefined)
    
    @scala.inline
    def set_radiusValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_radius'] */ js.Any
    ): Self = this.set("_radiusValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_radiusValue: Self = this.set("_radiusValue", js.undefined)
    
    @scala.inline
    def setAngleBaseValue(value: Double): Self = this.set("angleBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleBaseValue: Self = this.set("angleBaseValue", js.undefined)
    
    @scala.inline
    def setAngleDistance(value: Double): Self = this.set("angleDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleDistance: Self = this.set("angleDistance", js.undefined)
    
    @scala.inline
    def setAngleDomainVarargs(value: Double*): Self = this.set("angleDomain", js.Array(value :_*))
    
    @scala.inline
    def setAngleDomain(value: js.Array[Double]): Self = this.set("angleDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleDomain: Self = this.set("angleDomain", js.undefined)
    
    @scala.inline
    def setAngleRangeVarargs(value: Double*): Self = this.set("angleRange", js.Array(value :_*))
    
    @scala.inline
    def setAngleRange(value: js.Array[Double]): Self = this.set("angleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleRange: Self = this.set("angleRange", js.undefined)
    
    @scala.inline
    def setAngleType(value: Scale): Self = this.set("angleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleType: Self = this.set("angleType", js.undefined)
    
    @scala.inline
    def setArcClassName(value: String): Self = this.set("arcClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArcClassName: Self = this.set("arcClassName", js.undefined)
    
    @scala.inline
    def setCenter(value: X): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setGetAngle(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAngle: Self = this.set("getAngle", js.undefined)
    
    @scala.inline
    def setGetAngle0(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getAngle0", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetAngle0: Self = this.set("getAngle0", js.undefined)
    
    @scala.inline
    def setGetRadius(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRadius: Self = this.set("getRadius", js.undefined)
    
    @scala.inline
    def setGetRadius0(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = this.set("getRadius0", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetRadius0: Self = this.set("getRadius0", js.undefined)
    
    @scala.inline
    def setRadiusBaseValue(value: Double): Self = this.set("radiusBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusBaseValue: Self = this.set("radiusBaseValue", js.undefined)
    
    @scala.inline
    def setRadiusDistance(value: Double): Self = this.set("radiusDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusDistance: Self = this.set("radiusDistance", js.undefined)
    
    @scala.inline
    def setRadiusDomainVarargs(value: Double*): Self = this.set("radiusDomain", js.Array(value :_*))
    
    @scala.inline
    def setRadiusDomain(value: js.Array[Double]): Self = this.set("radiusDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusDomain: Self = this.set("radiusDomain", js.undefined)
    
    @scala.inline
    def setRadiusRangeVarargs(value: Double*): Self = this.set("radiusRange", js.Array(value :_*))
    
    @scala.inline
    def setRadiusRange(value: js.Array[Double]): Self = this.set("radiusRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusRange: Self = this.set("radiusRange", js.undefined)
    
    @scala.inline
    def setRadiusType(value: Scale): Self = this.set("radiusType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusType: Self = this.set("radiusType", js.undefined)
  }
}
