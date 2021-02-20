package typings.reactVis.mod

import typings.reactVis.anon.X
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.radius
import typings.reactVis.reactVisStrings.radius0
import org.scalablytyped.runtime.StObject
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
  implicit class ArcSeriesPropsMutableBuilder[Self <: ArcSeriesProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngleBaseValue(value: Double): Self = StObject.set(x, "angleBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleBaseValueUndefined: Self = StObject.set(x, "angleBaseValue", js.undefined)
    
    @scala.inline
    def setAngleDistance(value: Double): Self = StObject.set(x, "angleDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleDistanceUndefined: Self = StObject.set(x, "angleDistance", js.undefined)
    
    @scala.inline
    def setAngleDomain(value: js.Array[Double]): Self = StObject.set(x, "angleDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleDomainUndefined: Self = StObject.set(x, "angleDomain", js.undefined)
    
    @scala.inline
    def setAngleDomainVarargs(value: Double*): Self = StObject.set(x, "angleDomain", js.Array(value :_*))
    
    @scala.inline
    def setAngleRange(value: js.Array[Double]): Self = StObject.set(x, "angleRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleRangeUndefined: Self = StObject.set(x, "angleRange", js.undefined)
    
    @scala.inline
    def setAngleRangeVarargs(value: Double*): Self = StObject.set(x, "angleRange", js.Array(value :_*))
    
    @scala.inline
    def setAngleType(value: Scale): Self = StObject.set(x, "angleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleTypeUndefined: Self = StObject.set(x, "angleType", js.undefined)
    
    @scala.inline
    def setArcClassName(value: String): Self = StObject.set(x, "arcClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcClassNameUndefined: Self = StObject.set(x, "arcClassName", js.undefined)
    
    @scala.inline
    def setCenter(value: X): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    @scala.inline
    def setGetAngle(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAngle0(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAngle0Undefined: Self = StObject.set(x, "getAngle0", js.undefined)
    
    @scala.inline
    def setGetAngleUndefined: Self = StObject.set(x, "getAngle", js.undefined)
    
    @scala.inline
    def setGetRadius(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRadius0(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius0", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRadius0Undefined: Self = StObject.set(x, "getRadius0", js.undefined)
    
    @scala.inline
    def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    @scala.inline
    def setRadiusBaseValue(value: Double): Self = StObject.set(x, "radiusBaseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusBaseValueUndefined: Self = StObject.set(x, "radiusBaseValue", js.undefined)
    
    @scala.inline
    def setRadiusDistance(value: Double): Self = StObject.set(x, "radiusDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusDistanceUndefined: Self = StObject.set(x, "radiusDistance", js.undefined)
    
    @scala.inline
    def setRadiusDomain(value: js.Array[Double]): Self = StObject.set(x, "radiusDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusDomainUndefined: Self = StObject.set(x, "radiusDomain", js.undefined)
    
    @scala.inline
    def setRadiusDomainVarargs(value: Double*): Self = StObject.set(x, "radiusDomain", js.Array(value :_*))
    
    @scala.inline
    def setRadiusRange(value: js.Array[Double]): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusRangeUndefined: Self = StObject.set(x, "radiusRange", js.undefined)
    
    @scala.inline
    def setRadiusRangeVarargs(value: Double*): Self = StObject.set(x, "radiusRange", js.Array(value :_*))
    
    @scala.inline
    def setRadiusType(value: Scale): Self = StObject.set(x, "radiusType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusTypeUndefined: Self = StObject.set(x, "radiusType", js.undefined)
    
    @scala.inline
    def set_angleValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_angle'] */ js.Any
    ): Self = StObject.set(x, "_angleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_angleValueUndefined: Self = StObject.set(x, "_angleValue", js.undefined)
    
    @scala.inline
    def set_radiusValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_radius'] */ js.Any
    ): Self = StObject.set(x, "_radiusValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_radiusValueUndefined: Self = StObject.set(x, "_radiusValue", js.undefined)
  }
}
