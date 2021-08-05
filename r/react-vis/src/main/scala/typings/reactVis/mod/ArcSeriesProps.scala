package typings.reactVis.mod

import typings.reactVis.anon.X
import typings.reactVis.reactVisStrings.angle
import typings.reactVis.reactVisStrings.angle0
import typings.reactVis.reactVisStrings.radius
import typings.reactVis.reactVisStrings.radius0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcSeriesProps
  extends StObject
     with AbstractSeriesProps[ArcSeriesPoint] {
  
  var _angleValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_angle'] */ js.Any
  ] = js.undefined
  
  var _radiusValue: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_radius'] */ js.Any
  ] = js.undefined
  
  var angleBaseValue: js.UndefOr[Double] = js.undefined
  
  var angleDistance: js.UndefOr[Double] = js.undefined
  
  var angleDomain: js.UndefOr[js.Array[Double]] = js.undefined
  
  var angleRange: js.UndefOr[js.Array[Double]] = js.undefined
  
  var angleType: js.UndefOr[Scale] = js.undefined
  
  var arcClassName: js.UndefOr[String] = js.undefined
  
  // default: ''
  var center: js.UndefOr[X] = js.undefined
  
  var getAngle: js.UndefOr[RVGet[ArcSeriesPoint, angle]] = js.undefined
  
  // default: {'x':0,'y':0}
  var getAngle0: js.UndefOr[RVGet[ArcSeriesPoint, angle0]] = js.undefined
  
  var getRadius: js.UndefOr[RVGet[ArcSeriesPoint, radius]] = js.undefined
  
  var getRadius0: js.UndefOr[RVGet[ArcSeriesPoint, radius0]] = js.undefined
  
  var radiusBaseValue: js.UndefOr[Double] = js.undefined
  
  var radiusDistance: js.UndefOr[Double] = js.undefined
  
  var radiusDomain: js.UndefOr[js.Array[Double]] = js.undefined
  
  var radiusRange: js.UndefOr[js.Array[Double]] = js.undefined
  
  var radiusType: js.UndefOr[Scale] = js.undefined
}
object ArcSeriesProps {
  
  inline def apply(): ArcSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcSeriesProps]
  }
  
  extension [Self <: ArcSeriesProps](x: Self) {
    
    inline def setAngleBaseValue(value: Double): Self = StObject.set(x, "angleBaseValue", value.asInstanceOf[js.Any])
    
    inline def setAngleBaseValueUndefined: Self = StObject.set(x, "angleBaseValue", js.undefined)
    
    inline def setAngleDistance(value: Double): Self = StObject.set(x, "angleDistance", value.asInstanceOf[js.Any])
    
    inline def setAngleDistanceUndefined: Self = StObject.set(x, "angleDistance", js.undefined)
    
    inline def setAngleDomain(value: js.Array[Double]): Self = StObject.set(x, "angleDomain", value.asInstanceOf[js.Any])
    
    inline def setAngleDomainUndefined: Self = StObject.set(x, "angleDomain", js.undefined)
    
    inline def setAngleDomainVarargs(value: Double*): Self = StObject.set(x, "angleDomain", js.Array(value :_*))
    
    inline def setAngleRange(value: js.Array[Double]): Self = StObject.set(x, "angleRange", value.asInstanceOf[js.Any])
    
    inline def setAngleRangeUndefined: Self = StObject.set(x, "angleRange", js.undefined)
    
    inline def setAngleRangeVarargs(value: Double*): Self = StObject.set(x, "angleRange", js.Array(value :_*))
    
    inline def setAngleType(value: Scale): Self = StObject.set(x, "angleType", value.asInstanceOf[js.Any])
    
    inline def setAngleTypeUndefined: Self = StObject.set(x, "angleType", js.undefined)
    
    inline def setArcClassName(value: String): Self = StObject.set(x, "arcClassName", value.asInstanceOf[js.Any])
    
    inline def setArcClassNameUndefined: Self = StObject.set(x, "arcClassName", js.undefined)
    
    inline def setCenter(value: X): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setGetAngle(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle", js.Any.fromFunction1(value))
    
    inline def setGetAngle0(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getAngle0", js.Any.fromFunction1(value))
    
    inline def setGetAngle0Undefined: Self = StObject.set(x, "getAngle0", js.undefined)
    
    inline def setGetAngleUndefined: Self = StObject.set(x, "getAngle", js.undefined)
    
    inline def setGetRadius(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius", js.Any.fromFunction1(value))
    
    inline def setGetRadius0(
      value: ArcSeriesPoint => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self = StObject.set(x, "getRadius0", js.Any.fromFunction1(value))
    
    inline def setGetRadius0Undefined: Self = StObject.set(x, "getRadius0", js.undefined)
    
    inline def setGetRadiusUndefined: Self = StObject.set(x, "getRadius", js.undefined)
    
    inline def setRadiusBaseValue(value: Double): Self = StObject.set(x, "radiusBaseValue", value.asInstanceOf[js.Any])
    
    inline def setRadiusBaseValueUndefined: Self = StObject.set(x, "radiusBaseValue", js.undefined)
    
    inline def setRadiusDistance(value: Double): Self = StObject.set(x, "radiusDistance", value.asInstanceOf[js.Any])
    
    inline def setRadiusDistanceUndefined: Self = StObject.set(x, "radiusDistance", js.undefined)
    
    inline def setRadiusDomain(value: js.Array[Double]): Self = StObject.set(x, "radiusDomain", value.asInstanceOf[js.Any])
    
    inline def setRadiusDomainUndefined: Self = StObject.set(x, "radiusDomain", js.undefined)
    
    inline def setRadiusDomainVarargs(value: Double*): Self = StObject.set(x, "radiusDomain", js.Array(value :_*))
    
    inline def setRadiusRange(value: js.Array[Double]): Self = StObject.set(x, "radiusRange", value.asInstanceOf[js.Any])
    
    inline def setRadiusRangeUndefined: Self = StObject.set(x, "radiusRange", js.undefined)
    
    inline def setRadiusRangeVarargs(value: Double*): Self = StObject.set(x, "radiusRange", js.Array(value :_*))
    
    inline def setRadiusType(value: Scale): Self = StObject.set(x, "radiusType", value.asInstanceOf[js.Any])
    
    inline def setRadiusTypeUndefined: Self = StObject.set(x, "radiusType", js.undefined)
    
    inline def set_angleValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_angle'] */ js.Any
    ): Self = StObject.set(x, "_angleValue", value.asInstanceOf[js.Any])
    
    inline def set_angleValueUndefined: Self = StObject.set(x, "_angleValue", js.undefined)
    
    inline def set_radiusValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react-vis.react-vis.ArcSeriesPoint['_radius'] */ js.Any
    ): Self = StObject.set(x, "_radiusValue", value.asInstanceOf[js.Any])
    
    inline def set_radiusValueUndefined: Self = StObject.set(x, "_radiusValue", js.undefined)
  }
}
