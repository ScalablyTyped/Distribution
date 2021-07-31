package typings.proj4leaflet

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonObject
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.GeometryObject
import typings.leaflet.mod.Bounds_
import typings.leaflet.mod.GeoJSONOptions
import typings.leaflet.mod.ImageOverlayOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.LatLngLiteral
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.PointExpression
import typings.leaflet.mod.Point_
import typings.leaflet.mod.Projection
import typings.leaflet.mod.Transformation
import typings.proj4.mod.InterfaceProjection
import typings.proj4leaflet.anon.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* augmented module */
  object leafletAugmentingMod {
    
    object Proj {
      
      @JSImport("leaflet", "Proj")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("leaflet", "Proj.CRS")
      @js.native
      class CRS protected () extends StObject {
        def this(projection: InterfaceProjection) = this()
        def this(code: String, proj4def: String) = this()
        def this(projection: InterfaceProjection, options: ProjCRSOptions) = this()
        def this(code: String, proj4def: String, options: ProjCRSOptions) = this()
        
        var code: js.UndefOr[String] = js.native
        
        def distance(latlng1: LatLngExpression, latlng2: LatLngExpression): Double = js.native
        
        def getProjectedBounds(zoom: Double): Bounds_ = js.native
        
        var infinite: Boolean = js.native
        
        def latLngToPoint(latlng: LatLngExpression, zoom: Double): Point_ = js.native
        
        def pointToLatLng(point: PointExpression, zoom: Double): LatLng_ = js.native
        
        def project(latlng: LatLngLiteral): Point_ = js.native
        def project(latlng: LatLng_): Point_ = js.native
        
        var projection: Projection = js.native
        
        def scale(zoom: Double): Double = js.native
        
        var transformation: Transformation = js.native
        
        def unproject(point: PointExpression): LatLng_ = js.native
        
        var wrapLat: js.UndefOr[js.Tuple2[Double, Double]] = js.native
        
        def wrapLatLng(latlng: LatLngLiteral): LatLng_ = js.native
        def wrapLatLng(latlng: LatLng_): LatLng_ = js.native
        
        var wrapLng: js.UndefOr[js.Tuple2[Double, Double]] = js.native
        
        def zoom(scale: Double): Double = js.native
      }
      
      @JSImport("leaflet", "Proj.GeoJSON")
      @js.native
      class GeoJSON_ ()
        extends typings.leaflet.mod.GeoJSON_[js.Any] {
        def this(geojson: GeoJsonObject) = this()
        def this(geojson: Unit, options: GeoJSONOptions[js.Any]) = this()
        def this(geojson: GeoJsonObject, options: GeoJSONOptions[js.Any]) = this()
      }
      
      @JSImport("leaflet", "Proj.ImageOverlay")
      @js.native
      class ImageOverlay_ protected ()
        extends typings.leaflet.mod.ImageOverlay_ {
        def this(imageUrl: String, bounds: LatLngBoundsExpression) = this()
        def this(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions) = this()
      }
      
      @scala.inline
      def geoJson(): GeoJSON_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")().asInstanceOf[GeoJSON_]
      @scala.inline
      def geoJson(geojson: Unit, options: GeoJSONOptions[js.Any]): GeoJSON_ = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON_]
      @scala.inline
      def geoJson(geojson: Proj4GeoJSONFeature): GeoJSON_ = ^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any]).asInstanceOf[GeoJSON_]
      @scala.inline
      def geoJson(geojson: Proj4GeoJSONFeature, options: GeoJSONOptions[js.Any]): GeoJSON_ = (^.asInstanceOf[js.Dynamic].applyDynamic("geoJson")(geojson.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSON_]
      
      @scala.inline
      def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression): ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[ImageOverlay_]
      @scala.inline
      def imageOverlay(imageUrl: String, bounds: LatLngBoundsExpression, options: ImageOverlayOptions): ImageOverlay_ = (^.asInstanceOf[js.Dynamic].applyDynamic("imageOverlay")(imageUrl.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ImageOverlay_]
      
      trait ProjCRSOptions extends StObject {
        
        var bounds: js.UndefOr[Bounds_] = js.undefined
        
        var origin: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
        
        var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
        
        var scales: js.UndefOr[js.Array[Double]] = js.undefined
        
        var transformation: js.UndefOr[Transformation] = js.undefined
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
  
  trait Proj4GeoJSONFeature
    extends StObject
       with Feature[GeometryObject, GeoJsonProperties] {
    
    var crs: js.UndefOr[Properties] = js.undefined
  }
  object Proj4GeoJSONFeature {
    
    @scala.inline
    def apply(geometry: GeometryObject): Proj4GeoJSONFeature = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = null)
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[Proj4GeoJSONFeature]
    }
    
    @scala.inline
    implicit class Proj4GeoJSONFeatureMutableBuilder[Self <: Proj4GeoJSONFeature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrs(value: Properties): Self = StObject.set(x, "crs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrsUndefined: Self = StObject.set(x, "crs", js.undefined)
    }
  }
}
