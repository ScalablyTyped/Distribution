package typings.shpjs

import org.scalablytyped.runtime.Shortcut
import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.node.Buffer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("shpjs", JSImport.Namespace)
  @js.native
  val ^ : ShpJS = js.native
  
  trait FeatureCollectionWithFilename
    extends StObject
       with FeatureCollection[Geometry, GeoJsonProperties] {
    
    var fileName: js.UndefOr[String] = js.undefined
  }
  object FeatureCollectionWithFilename {
    
    @scala.inline
    def apply(features: js.Array[Feature[Geometry, GeoJsonProperties]]): FeatureCollectionWithFilename = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[FeatureCollectionWithFilename]
    }
    
    @scala.inline
    implicit class FeatureCollectionWithFilenameMutableBuilder[Self <: FeatureCollectionWithFilename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    }
  }
  
  @js.native
  trait ShpJS extends StObject {
    
    def apply(base: String): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def apply(base: String, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def apply(base: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def apply(base: ShpJSBuffer, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    
    def combine(arr: js.Tuple2[js.Array[Geometry], js.Array[GeoJsonProperties]]): FeatureCollection[Geometry, GeoJsonProperties] = js.native
    
    def getShapeFile(base: String): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def getShapeFile(base: String, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def getShapeFile(base: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def getShapeFile(base: ShpJSBuffer, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    
    def parseDbf(dbf: ShpJSBuffer, cpg: ShpJSBuffer): js.Array[GeoJsonProperties] = js.native
    
    def parseShp(shp: ShpJSBuffer, prj: String): js.Array[Geometry] = js.native
    def parseShp(shp: ShpJSBuffer, prj: Buffer): js.Array[Geometry] = js.native
    
    def parseZip(buffer: ShpJSBuffer): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
    def parseZip(buffer: ShpJSBuffer, whiteList: js.Array[String]): js.Promise[FeatureCollectionWithFilename | js.Array[FeatureCollectionWithFilename]] = js.native
  }
  
  // All toBuffer() compatible buffers.
  type ShpJSBuffer = Buffer | ArrayBuffer | typings.shpjs.anon.Buffer
  
  type _To = ShpJS
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ShpJS = ^
}
