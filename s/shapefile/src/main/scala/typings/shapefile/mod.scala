package typings.shapefile

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryObject
import typings.node.streamMod.Readable
import typings.shapefile.anon.Done
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shapefile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def open(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  inline def open(shp: Openable, dbf: Unit, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  inline def open(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  inline def open(shp: Openable, dbf: Openable, options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[Feature[Geometry, GeoJsonProperties]]]]
  
  inline def openDbf(source: Openable): js.Promise[Source[GeoJsonProperties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDbf")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Source[GeoJsonProperties]]]
  inline def openDbf(source: Openable, options: Options): js.Promise[Source[GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDbf")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[GeoJsonProperties]]]
  
  inline def openShp(source: Openable): js.Promise[Source[GeometryObject]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openShp")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Source[GeometryObject]]]
  inline def openShp(source: Openable, options: Options): js.Promise[Source[GeometryObject]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openShp")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Source[GeometryObject]]]
  
  inline def read(shp: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any]).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  inline def read(shp: Openable, dbf: Unit, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  inline def read(shp: Openable, dbf: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  inline def read(shp: Openable, dbf: Openable, options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(shp.asInstanceOf[js.Any], dbf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FeatureCollection[Geometry, GeoJsonProperties]]]
  
  type Openable = String | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | Readable | ReadableStream[Any]
  
  trait Options extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  trait Source[RecordType] extends StObject {
    
    var bbox: js.Array[Double]
    
    def cancel(): js.Promise[Unit]
    
    def read(): js.Promise[Done[RecordType]]
  }
  object Source {
    
    inline def apply[RecordType](bbox: js.Array[Double], cancel: () => js.Promise[Unit], read: () => js.Promise[Done[RecordType]]): Source[RecordType] = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[Source[RecordType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Source[?], RecordType] (val x: Self & Source[RecordType]) extends AnyVal {
      
      inline def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value*))
      
      inline def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setRead(value: () => js.Promise[Done[RecordType]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}
