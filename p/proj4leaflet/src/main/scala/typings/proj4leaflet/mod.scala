package typings.proj4leaflet

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.Bounds_
import typings.leaflet.mod.GeoJSONOptions
import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.Projection
import typings.leaflet.mod.Transformation
import typings.proj4.mod.InterfaceProjection
import typings.proj4leaflet.anon.Properties
import typings.proj4leaflet.proj4leafletStrings.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object leafletAugmentingMod {
    
    object Proj {
      
      @JSImport("leaflet", "Proj.CRS")
      @js.native
      class CRS protected ()
        extends typings.leaflet.mod.CRS {
        def this(projection: InterfaceProjection) = this()
        def this(code: String, proj4def: String) = this()
        def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
        def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
        
        var projection: Projection = js.native
        
        var transformation: Transformation = js.native
      }
      
      @JSImport("leaflet", "Proj.GeoJSON")
      @js.native
      class GeoJSON_ ()
        extends typings.leaflet.mod.GeoJSON_[js.Any] {
        def this(geojson: GeoJsonObject) = this()
        def this(geojson: js.UndefOr[scala.Nothing], options: GeoJSONOptions[_]) = this()
        def this(geojson: GeoJsonObject, options: GeoJSONOptions[_]) = this()
      }
      
      @JSImport("leaflet", "Proj.ImageOverlay")
      @js.native
      class ImageOverlay_ protected ()
        extends typings.leaflet.mod.ImageOverlay_ {
        def this(imageUrl: String, bounds: LatLngBoundsExpression) = this()
        def this(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
      }
      
      @JSImport("leaflet", "Proj.geoJson")
      @js.native
      def geoJson(): GeoJSON_ = js.native
      @JSImport("leaflet", "Proj.geoJson")
      @js.native
      def geoJson(geojson: js.UndefOr[scala.Nothing], options: GeoJSONOptions[_]): GeoJSON_ = js.native
      @JSImport("leaflet", "Proj.geoJson")
      @js.native
      def geoJson(geojson: Proj4GeoJSONFeature): GeoJSON_ = js.native
      @JSImport("leaflet", "Proj.geoJson")
      @js.native
      def geoJson(geojson: Proj4GeoJSONFeature, options: GeoJSONOptions[_]): GeoJSON_ = js.native
      
      @JSImport("leaflet", "Proj.imageOverlay")
      @js.native
      def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay_ = js.native
      @JSImport("leaflet", "Proj.imageOverlay")
      @js.native
      def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay_ = js.native
      
      @js.native
      trait ProjCRSOptions extends StObject {
        
        var bounds: js.UndefOr[Bounds_] = js.native
        
        var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.native
        
        var resolutions: js.UndefOr[js.Array[Double]] = js.native
        
        var scales: js.UndefOr[js.Array[Double]] = js.native
        
        var transformation: js.UndefOr[Transformation] = js.native
      }
      object ProjCRSOptions {
        
        @scala.inline
        def apply(): ProjCRSOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ProjCRSOptions]
        }
        
        @scala.inline
        implicit class ProjCRSOptionsMutableBuilder[Self <: ProjCRSOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBounds(value: Bounds_): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
          
          @scala.inline
          def setOrigin(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
          
          @scala.inline
          def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
          
          @scala.inline
          def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
          
          @scala.inline
          def setScales(value: js.Array[Double]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScalesUndefined: Self = StObject.set(x, "scales", js.undefined)
          
          @scala.inline
          def setScalesVarargs(value: Double*): Self = StObject.set(x, "scales", js.Array(value :_*))
          
          @scala.inline
          def setTransformation(value: Transformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
        }
      }
    }
  }
  
  /* Inlined geojson.geojson.Feature<geojson.geojson.GeometryObject, geojson.geojson.GeoJsonProperties> & {  crs :{  type :string,   properties :{  name :string}} | undefined} */
  @js.native
  trait Proj4GeoJSONFeature extends StObject {
    
    /**
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * The value of the bbox member is an array of length 2*n where n is the number of dimensions
      * represented in the contained geometries, with all axes of the most southwesterly point
      * followed by all axes of the more northeasterly point.
      * The axes order of a bbox follows the axes order of geometries.
      * https://tools.ietf.org/html/rfc7946#section-5
      */
    var bbox: js.UndefOr[BBox] = js.native
    
    var crs: js.UndefOr[Properties] = js.native
    
    /**
      * The feature's geometry
      */
    var geometry: GeometryObject = js.native
    
    /**
      * A value that uniquely identifies this feature in a
      * https://tools.ietf.org/html/rfc7946#section-3.2.
      */
    var id: js.UndefOr[String | Double] = js.native
    
    /**
      * Properties associated with this feature.
      */
    var properties: GeoJsonProperties = js.native
    
    var `type`: Feature = js.native
  }
  object Proj4GeoJSONFeature {
    
    @scala.inline
    def apply(geometry: GeometryObject, `type`: Feature): Proj4GeoJSONFeature = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Proj4GeoJSONFeature]
    }
    
    @scala.inline
    implicit class Proj4GeoJSONFeatureMutableBuilder[Self <: Proj4GeoJSONFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setCrs(value: Properties): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
      
      @scala.inline
      def setGeometry(value: GeometryObject): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: GeoJsonProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesNull: Self = StObject.set(x, "properties", null)
      
      @scala.inline
      def setType(value: Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
