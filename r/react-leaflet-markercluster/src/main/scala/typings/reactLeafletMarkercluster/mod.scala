package typings.reactLeafletMarkercluster

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.Layer
import typings.leaflet.mod.PolylineOptions
import typings.leafletMarkercluster.mod.MarkerCluster
import typings.reactLeaflet.mod.MapLayer
import typings.reactLeaflet.mod.MapLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-markercluster", JSImport.Default)
  @js.native
  class default[P /* <: MarkerClusterGroupProps */] () extends MapLayer[P, Layer]
  
  type MarkerClusterGroup[P /* <: MarkerClusterGroupProps */] = MapLayer[P, Layer]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because var conflicts: attribution, pane. Inlined 
  - typings.leafletMarkercluster.mod.MarkerClusterGroupOptions because var conflicts: attribution, pane. Inlined disableClusteringAtZoom, singleMarkerMode, zoomToBoundsOnClick, animate, maxClusterRadius, chunkInterval, showCoverageOnHover, spiderLegPolylineOptions, animateAddingMarkers, spiderfyDistanceMultiplier, chunkedLoading, polygonOptions, iconCreateFunction, chunkDelay, chunkProgress, removeOutsideVisibleBounds, spiderfyOnMaxZoom */ trait MarkerClusterGroupProps
    extends StObject
       with MapLayerProps {
    
    /*
      * Smoothly split / merge cluster children when zooming and spiderfying.
      * If L.DomUtil.TRANSITION is false, this option has no effect (no animation is possible).
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /*
      * If set to true (and animate option is also true) then adding individual markers to the
      * MarkerClusterGroup after it has been added to the map will add the marker and animate it
      * into the cluster. Defaults to false as this gives better performance when bulk adding markers.
      * addLayers does not support this, only addLayer with individual Markers.
      */
    var animateAddingMarkers: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Time delay (in ms) between consecutive periods of processing for addLayers. Default to 50ms.
      */
    var chunkDelay: js.UndefOr[Double] = js.undefined
    
    /*
      * Time interval (in ms) during which addLayers works before pausing to let the rest of the page process.
      * In particular, this prevents the page from freezing while adding a lot of markers. Defaults to 200ms.
      */
    var chunkInterval: js.UndefOr[Double] = js.undefined
    
    /*
      * Callback function that is called at the end of each chunkInterval.
      * Typically used to implement a progress indicator. Defaults to null.
      */
    var chunkProgress: js.UndefOr[
        js.Function3[
          /* processedMarkers */ Double, 
          /* totalMarkers */ Double, 
          /* elapsedTime */ Double, 
          Unit
        ]
      ] = js.undefined
    
    /*
      * Boolean to split the addLayers processing in to small intervals so that the page does not freeze.
      */
    var chunkedLoading: js.UndefOr[Boolean] = js.undefined
    
    /*
      * If set, at this zoom level and below markers will not be clustered. This defaults to disabled.
      */
    var disableClusteringAtZoom: js.UndefOr[Double] = js.undefined
    
    /*
      * Function used to create the cluster icon
      */
    var iconCreateFunction: js.UndefOr[js.Function1[/* cluster */ MarkerCluster, Icon_[IconOptions] | DivIcon_]] = js.undefined
    
    /*
      * The maximum radius that a cluster will cover from the central marker (in pixels). Default 80.
      * Decreasing will make more, smaller clusters. You can also use a function that accepts
      * the current map zoom and returns the maximum cluster radius in pixels
      */
    var maxClusterRadius: js.UndefOr[Double | (js.Function1[/* zoom */ Double, Double])] = js.undefined
    
    /*
      * Options to pass when creating the L.Polygon(points, options) to show the bounds of a cluster.
      * Defaults to empty
      */
    var polygonOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /*
      * Clusters and markers too far from the viewport are removed from the map
      * for performance.
      */
    var removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.undefined
    
    /*
      * When you mouse over a cluster it shows the bounds of its markers.
      */
    var showCoverageOnHover: js.UndefOr[Boolean] = js.undefined
    
    /*
      * If set to true, overrides the icon for all added markers to make them appear as a 1 size cluster.
      */
    var singleMarkerMode: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Allows you to specify PolylineOptions to style spider legs.
      * By default, they are { weight: 1.5, color: '#222', opacity: 0.5 }.
      */
    var spiderLegPolylineOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /*
      * Increase from 1 to increase the distance away from the center that spiderfied markers are placed.
      * Use if you are using big marker icons (Default: 1).
      */
    var spiderfyDistanceMultiplier: js.UndefOr[Double] = js.undefined
    
    /*
      * When you click a cluster at the bottom zoom level we spiderfy it
      * so you can see all of its markers.
      */
    var spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.undefined
    
    /*
      * When you click a cluster we zoom to its bounds.
      */
    var zoomToBoundsOnClick: js.UndefOr[Boolean] = js.undefined
  }
  object MarkerClusterGroupProps {
    
    @scala.inline
    def apply(): MarkerClusterGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerClusterGroupProps]
    }
    
    @scala.inline
    implicit class MarkerClusterGroupPropsMutableBuilder[Self <: MarkerClusterGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateAddingMarkers(value: Boolean): Self = StObject.set(x, "animateAddingMarkers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateAddingMarkersUndefined: Self = StObject.set(x, "animateAddingMarkers", js.undefined)
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setChunkDelay(value: Double): Self = StObject.set(x, "chunkDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkDelayUndefined: Self = StObject.set(x, "chunkDelay", js.undefined)
      
      @scala.inline
      def setChunkInterval(value: Double): Self = StObject.set(x, "chunkInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkIntervalUndefined: Self = StObject.set(x, "chunkInterval", js.undefined)
      
      @scala.inline
      def setChunkProgress(
        value: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit
      ): Self = StObject.set(x, "chunkProgress", js.Any.fromFunction3(value))
      
      @scala.inline
      def setChunkProgressUndefined: Self = StObject.set(x, "chunkProgress", js.undefined)
      
      @scala.inline
      def setChunkedLoading(value: Boolean): Self = StObject.set(x, "chunkedLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChunkedLoadingUndefined: Self = StObject.set(x, "chunkedLoading", js.undefined)
      
      @scala.inline
      def setDisableClusteringAtZoom(value: Double): Self = StObject.set(x, "disableClusteringAtZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableClusteringAtZoomUndefined: Self = StObject.set(x, "disableClusteringAtZoom", js.undefined)
      
      @scala.inline
      def setIconCreateFunction(value: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "iconCreateFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIconCreateFunctionUndefined: Self = StObject.set(x, "iconCreateFunction", js.undefined)
      
      @scala.inline
      def setMaxClusterRadius(value: Double | (js.Function1[/* zoom */ Double, Double])): Self = StObject.set(x, "maxClusterRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxClusterRadiusFunction1(value: /* zoom */ Double => Double): Self = StObject.set(x, "maxClusterRadius", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxClusterRadiusUndefined: Self = StObject.set(x, "maxClusterRadius", js.undefined)
      
      @scala.inline
      def setPolygonOptions(value: PolylineOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      @scala.inline
      def setRemoveOutsideVisibleBounds(value: Boolean): Self = StObject.set(x, "removeOutsideVisibleBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveOutsideVisibleBoundsUndefined: Self = StObject.set(x, "removeOutsideVisibleBounds", js.undefined)
      
      @scala.inline
      def setShowCoverageOnHover(value: Boolean): Self = StObject.set(x, "showCoverageOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCoverageOnHoverUndefined: Self = StObject.set(x, "showCoverageOnHover", js.undefined)
      
      @scala.inline
      def setSingleMarkerMode(value: Boolean): Self = StObject.set(x, "singleMarkerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSingleMarkerModeUndefined: Self = StObject.set(x, "singleMarkerMode", js.undefined)
      
      @scala.inline
      def setSpiderLegPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "spiderLegPolylineOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpiderLegPolylineOptionsUndefined: Self = StObject.set(x, "spiderLegPolylineOptions", js.undefined)
      
      @scala.inline
      def setSpiderfyDistanceMultiplier(value: Double): Self = StObject.set(x, "spiderfyDistanceMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpiderfyDistanceMultiplierUndefined: Self = StObject.set(x, "spiderfyDistanceMultiplier", js.undefined)
      
      @scala.inline
      def setSpiderfyOnMaxZoom(value: Boolean): Self = StObject.set(x, "spiderfyOnMaxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpiderfyOnMaxZoomUndefined: Self = StObject.set(x, "spiderfyOnMaxZoom", js.undefined)
      
      @scala.inline
      def setZoomToBoundsOnClick(value: Boolean): Self = StObject.set(x, "zoomToBoundsOnClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomToBoundsOnClickUndefined: Self = StObject.set(x, "zoomToBoundsOnClick", js.undefined)
    }
  }
}
