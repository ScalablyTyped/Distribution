package typings.proj4

import typings.proj4.proj4Booleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fromProjection: String): Converter = ^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any]).asInstanceOf[Converter]
  inline def apply(fromProjection: String, toProjection: String): Converter = (^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any], toProjection.asInstanceOf[js.Any])).asInstanceOf[Converter]
  inline def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any], toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any], toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
  inline def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].apply(toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
  
  @JSImport("proj4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Point(coordinates: String): InterfaceCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("Point")(coordinates.asInstanceOf[js.Any]).asInstanceOf[InterfaceCoordinates]
  inline def Point(coordinates: TemplateCoordinates): InterfaceCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("Point")(coordinates.asInstanceOf[js.Any]).asInstanceOf[InterfaceCoordinates]
  /**
    * @deprecated v3
    */
  inline def Point(x: Double, y: Double): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("Point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
  inline def Point(x: Double, y: Double, z: Double): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("Point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
  
  inline def Proj(srsCode: Any): InterfaceProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("Proj")(srsCode.asInstanceOf[js.Any]).asInstanceOf[InterfaceProjection]
  inline def Proj(srsCode: Any, callback: Any): InterfaceProjection = (^.asInstanceOf[js.Dynamic].applyDynamic("Proj")(srsCode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[InterfaceProjection]
  
  @JSImport("proj4", "WGS84")
  @js.native
  val WGS84: Any = js.native
  
  @JSImport("proj4", "defaultDatum")
  @js.native
  val defaultDatum: String = js.native
  
  inline def defs(name: String): ProjectionDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any]).asInstanceOf[ProjectionDefinition]
  inline def defs(name: String, projection: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defs(name: String, projection: ProjectionDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def defs(name: js.Array[js.Array[String]]): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Unit]]
  
  inline def mgrs(coordinates: js.Array[Double], accuracy: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mgrs")(coordinates.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def nadgrid(key: String, grid: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nadgrid")(key.asInstanceOf[js.Any], grid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toPoint(array: js.Array[Double]): InterfaceCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("toPoint")(array.asInstanceOf[js.Any]).asInstanceOf[InterfaceCoordinates]
  
  inline def transform(source: InterfaceProjection, dest: InterfaceProjection, point: TemplateCoordinates): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("proj4", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait Converter extends StObject {
    
    def forward(coordinates: js.Array[Double]): js.Array[Double] = js.native
    def forward(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
    
    def inverse(coordinates: js.Array[Double]): js.Array[Double] = js.native
    def inverse(coordinates: InterfaceCoordinates): InterfaceCoordinates = js.native
  }
  
  trait InterfaceCoordinates extends StObject {
    
    var m: js.UndefOr[Double] = js.undefined
    
    var x: Double
    
    var y: Double
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object InterfaceCoordinates {
    
    inline def apply(x: Double, y: Double): InterfaceCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterfaceCoordinates] (val x: Self) extends AnyVal {
      
      inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
  
  trait InterfaceDatum extends StObject {
    
    var a: Double
    
    var b: Double
    
    var datum_type: Double
    
    var ep2: Double
    
    var es: Double
  }
  object InterfaceDatum {
    
    inline def apply(a: Double, b: Double, datum_type: Double, ep2: Double, es: Double): InterfaceDatum = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], datum_type = datum_type.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceDatum]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterfaceDatum] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setDatum_type(value: Double): Self = StObject.set(x, "datum_type", value.asInstanceOf[js.Any])
      
      inline def setEp2(value: Double): Self = StObject.set(x, "ep2", value.asInstanceOf[js.Any])
      
      inline def setEs(value: Double): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    }
  }
  
  trait InterfaceProjection extends StObject {
    
    var b: Double
    
    var datum: String
    
    var e: Double
    
    var ep2: Double
    
    var es: Double
    
    def forward(coordinates: TemplateCoordinates): js.Array[Double]
    
    def inverse(coordinates: TemplateCoordinates): js.Array[Double]
    
    var rf: Double
    
    var sphere: Double
  }
  object InterfaceProjection {
    
    inline def apply(
      b: Double,
      datum: String,
      e: Double,
      ep2: Double,
      es: Double,
      forward: TemplateCoordinates => js.Array[Double],
      inverse: TemplateCoordinates => js.Array[Double],
      rf: Double,
      sphere: Double
    ): InterfaceProjection = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], datum = datum.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], ep2 = ep2.asInstanceOf[js.Any], es = es.asInstanceOf[js.Any], forward = js.Any.fromFunction1(forward), inverse = js.Any.fromFunction1(inverse), rf = rf.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterfaceProjection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterfaceProjection] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setDatum(value: String): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEp2(value: Double): Self = StObject.set(x, "ep2", value.asInstanceOf[js.Any])
      
      inline def setEs(value: Double): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
      
      inline def setForward(value: TemplateCoordinates => js.Array[Double]): Self = StObject.set(x, "forward", js.Any.fromFunction1(value))
      
      inline def setInverse(value: TemplateCoordinates => js.Array[Double]): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
      
      inline def setRf(value: Double): Self = StObject.set(x, "rf", value.asInstanceOf[js.Any])
      
      inline def setSphere(value: Double): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProjectionDefinition extends StObject {
    
    var R_A: js.UndefOr[`true`] = js.undefined
    
    var a: js.UndefOr[Double] = js.undefined
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var axis: js.UndefOr[String] = js.undefined
    
    var b: js.UndefOr[Double] = js.undefined
    
    var datum: js.UndefOr[String] = js.undefined
    
    var datumCode: js.UndefOr[String] = js.undefined
    
    var datumName: js.UndefOr[String] = js.undefined
    
    var datum_params: js.UndefOr[String | js.Array[Double]] = js.undefined
    
    var ellps: js.UndefOr[String] = js.undefined
    
    var from_greenwich: js.UndefOr[Double] = js.undefined
    
    var k0: js.UndefOr[Double] = js.undefined
    
    var lat0: js.UndefOr[Double] = js.undefined
    
    var lat1: js.UndefOr[Double] = js.undefined
    
    var lat2: js.UndefOr[Double] = js.undefined
    
    var lat_ts: js.UndefOr[Double] = js.undefined
    
    var long0: js.UndefOr[Double] = js.undefined
    
    var long1: js.UndefOr[Double] = js.undefined
    
    var long2: js.UndefOr[Double] = js.undefined
    
    var longc: js.UndefOr[Double] = js.undefined
    
    var nadgrids: js.UndefOr[String] = js.undefined
    
    var projName: js.UndefOr[String] = js.undefined
    
    var rf: js.UndefOr[Double] = js.undefined
    
    var title: String
    
    var to_meter: js.UndefOr[Double] = js.undefined
    
    var units: js.UndefOr[String] = js.undefined
    
    var utmSouth: js.UndefOr[`true`] = js.undefined
    
    var x0: js.UndefOr[Double] = js.undefined
    
    var y0: js.UndefOr[Double] = js.undefined
    
    var zone: js.UndefOr[Double] = js.undefined
  }
  object ProjectionDefinition {
    
    inline def apply(title: String): ProjectionDefinition = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProjectionDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProjectionDefinition] (val x: Self) extends AnyVal {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
      
      inline def setDatum(value: String): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumCode(value: String): Self = StObject.set(x, "datumCode", value.asInstanceOf[js.Any])
      
      inline def setDatumCodeUndefined: Self = StObject.set(x, "datumCode", js.undefined)
      
      inline def setDatumName(value: String): Self = StObject.set(x, "datumName", value.asInstanceOf[js.Any])
      
      inline def setDatumNameUndefined: Self = StObject.set(x, "datumName", js.undefined)
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setDatum_params(value: String | js.Array[Double]): Self = StObject.set(x, "datum_params", value.asInstanceOf[js.Any])
      
      inline def setDatum_paramsUndefined: Self = StObject.set(x, "datum_params", js.undefined)
      
      inline def setDatum_paramsVarargs(value: Double*): Self = StObject.set(x, "datum_params", js.Array(value*))
      
      inline def setEllps(value: String): Self = StObject.set(x, "ellps", value.asInstanceOf[js.Any])
      
      inline def setEllpsUndefined: Self = StObject.set(x, "ellps", js.undefined)
      
      inline def setFrom_greenwich(value: Double): Self = StObject.set(x, "from_greenwich", value.asInstanceOf[js.Any])
      
      inline def setFrom_greenwichUndefined: Self = StObject.set(x, "from_greenwich", js.undefined)
      
      inline def setK0(value: Double): Self = StObject.set(x, "k0", value.asInstanceOf[js.Any])
      
      inline def setK0Undefined: Self = StObject.set(x, "k0", js.undefined)
      
      inline def setLat0(value: Double): Self = StObject.set(x, "lat0", value.asInstanceOf[js.Any])
      
      inline def setLat0Undefined: Self = StObject.set(x, "lat0", js.undefined)
      
      inline def setLat1(value: Double): Self = StObject.set(x, "lat1", value.asInstanceOf[js.Any])
      
      inline def setLat1Undefined: Self = StObject.set(x, "lat1", js.undefined)
      
      inline def setLat2(value: Double): Self = StObject.set(x, "lat2", value.asInstanceOf[js.Any])
      
      inline def setLat2Undefined: Self = StObject.set(x, "lat2", js.undefined)
      
      inline def setLat_ts(value: Double): Self = StObject.set(x, "lat_ts", value.asInstanceOf[js.Any])
      
      inline def setLat_tsUndefined: Self = StObject.set(x, "lat_ts", js.undefined)
      
      inline def setLong0(value: Double): Self = StObject.set(x, "long0", value.asInstanceOf[js.Any])
      
      inline def setLong0Undefined: Self = StObject.set(x, "long0", js.undefined)
      
      inline def setLong1(value: Double): Self = StObject.set(x, "long1", value.asInstanceOf[js.Any])
      
      inline def setLong1Undefined: Self = StObject.set(x, "long1", js.undefined)
      
      inline def setLong2(value: Double): Self = StObject.set(x, "long2", value.asInstanceOf[js.Any])
      
      inline def setLong2Undefined: Self = StObject.set(x, "long2", js.undefined)
      
      inline def setLongc(value: Double): Self = StObject.set(x, "longc", value.asInstanceOf[js.Any])
      
      inline def setLongcUndefined: Self = StObject.set(x, "longc", js.undefined)
      
      inline def setNadgrids(value: String): Self = StObject.set(x, "nadgrids", value.asInstanceOf[js.Any])
      
      inline def setNadgridsUndefined: Self = StObject.set(x, "nadgrids", js.undefined)
      
      inline def setProjName(value: String): Self = StObject.set(x, "projName", value.asInstanceOf[js.Any])
      
      inline def setProjNameUndefined: Self = StObject.set(x, "projName", js.undefined)
      
      inline def setR_A(value: `true`): Self = StObject.set(x, "R_A", value.asInstanceOf[js.Any])
      
      inline def setR_AUndefined: Self = StObject.set(x, "R_A", js.undefined)
      
      inline def setRf(value: Double): Self = StObject.set(x, "rf", value.asInstanceOf[js.Any])
      
      inline def setRfUndefined: Self = StObject.set(x, "rf", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTo_meter(value: Double): Self = StObject.set(x, "to_meter", value.asInstanceOf[js.Any])
      
      inline def setTo_meterUndefined: Self = StObject.set(x, "to_meter", js.undefined)
      
      inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setUtmSouth(value: `true`): Self = StObject.set(x, "utmSouth", value.asInstanceOf[js.Any])
      
      inline def setUtmSouthUndefined: Self = StObject.set(x, "utmSouth", js.undefined)
      
      inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
      
      inline def setX0Undefined: Self = StObject.set(x, "x0", js.undefined)
      
      inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
      
      inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
      
      inline def setZone(value: Double): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  type TemplateCoordinates = js.Array[Double] | InterfaceCoordinates
}
