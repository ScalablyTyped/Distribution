package typings.shapefile

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryObject
import typings.node.streamMod.Readable
import typings.shapefile.anon.Done
import typings.std.ArrayBuffer
import typings.std.ReadableStream
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shapefile", "open")
  @js.native
  def open(shp: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  @JSImport("shapefile", "open")
  @js.native
  def open(shp: Openable, dbf: js.UndefOr[Openable], options: Options): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  @JSImport("shapefile", "open")
  @js.native
  def open(shp: Openable, dbf: Openable): js.Promise[Source[Feature[Geometry, GeoJsonProperties]]] = js.native
  
  @JSImport("shapefile", "openDbf")
  @js.native
  def openDbf(source: Openable): js.Promise[Source[GeoJsonProperties]] = js.native
  @JSImport("shapefile", "openDbf")
  @js.native
  def openDbf(source: Openable, options: Options): js.Promise[Source[GeoJsonProperties]] = js.native
  
  @JSImport("shapefile", "openShp")
  @js.native
  def openShp(source: Openable): js.Promise[Source[GeometryObject]] = js.native
  @JSImport("shapefile", "openShp")
  @js.native
  def openShp(source: Openable, options: Options): js.Promise[Source[GeometryObject]] = js.native
  
  @JSImport("shapefile", "read")
  @js.native
  def read(shp: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  @JSImport("shapefile", "read")
  @js.native
  def read(shp: Openable, dbf: js.UndefOr[Openable], options: Options): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  @JSImport("shapefile", "read")
  @js.native
  def read(shp: Openable, dbf: Openable): js.Promise[FeatureCollection[Geometry, GeoJsonProperties]] = js.native
  
  type Openable = String | ArrayBuffer | Uint8Array | Readable | ReadableStream[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var encoding: js.UndefOr[String] = js.native
    
    var highWaterMark: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  @js.native
  trait Source[RecordType] extends StObject {
    
    var bbox: js.Array[Double] = js.native
    
    def cancel(): js.Promise[Unit] = js.native
    
    def read(): js.Promise[Done[RecordType]] = js.native
  }
  object Source {
    
    @scala.inline
    def apply[RecordType](bbox: js.Array[Double], cancel: () => js.Promise[Unit], read: () => js.Promise[Done[RecordType]]): Source[RecordType] = {
      val __obj = js.Dynamic.literal(bbox = bbox.asInstanceOf[js.Any], cancel = js.Any.fromFunction0(cancel), read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[Source[RecordType]]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source[_], RecordType] (val x: Self with Source[RecordType]) extends AnyVal {
      
      @scala.inline
      def setBbox(value: js.Array[Double]): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxVarargs(value: Double*): Self = StObject.set(x, "bbox", js.Array(value :_*))
      
      @scala.inline
      def setCancel(value: () => js.Promise[Unit]): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRead(value: () => js.Promise[Done[RecordType]]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    }
  }
}
