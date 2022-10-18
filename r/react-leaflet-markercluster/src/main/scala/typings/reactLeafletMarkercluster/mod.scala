package typings.reactLeafletMarkercluster

import org.scalablytyped.runtime.Shortcut
import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leaflet.mod.Point_
import typings.leaflet.mod.PolylineOptions
import typings.leafletMarkercluster.leafletMod.MarkerCluster
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-leaflet-markercluster", JSImport.Default)
  @js.native
  val default: ComponentType[MarkerClusterGroupProps] = js.native
  
  trait MarkerClusterGroupProps extends StObject {
    
    /**
      * animate
      *
      * Smoothly split / merge cluster children when zooming and spiderfying.
      * If L.DomUtil.TRANSITION is false, this option has no effect (no animation is possible).
      */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * animateAddingMarkers
      *
      * If set to true (and animate option is also true) then adding individual markers
      * to the MarkerClusterGroup after it has been added to the map will add the marker
      * and animate it into the cluster.
      * Defaults to false as this gives better performance when bulk adding markers.
      * addLayers does not support this, only addLayer with individual Markers.
      */
    var animateAddingMarkers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * chunkDelay
      *
      * Time delay (in ms) between consecutive periods of processing for addLayers.
      * Default to 50ms.
      */
    var chunkDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * chunkInterval
      *
      * Time interval (in ms) during which addLayers works before pausing
      * to let the rest of the page process.
      * In particular, this prevents the page from freezing while adding a lot of markers.
      * Defaults to 200ms.
      */
    var chunkInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * chunkProgress
      *
      * Callback function that is called at the end of each chunkInterval.
      * Typically used to implement a progress indicator.
      * Defaults to null.
      */
    var chunkProgress: js.UndefOr[
        (js.Function3[/* processed */ Double, /* total */ Double, /* elapsed */ Double, Unit]) | Null
      ] = js.undefined
    
    /**
      * chunkedLoading
      *
      * Boolean to split the addLayers processing in to small intervals
      * so that the page does not freeze.
      */
    var chunkedLoading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * clusterPane
      *
      * Map pane where the cluster icons will be added.
      * Defaults to L.Marker's default (currently 'markerPane').
      */
    var clusterPane: js.UndefOr[String] = js.undefined
    
    /**
      * disableClusteringAtZoom
      *
      * If set, at this zoom level and below, markers will not be clustered.
      * This defaults to disabled.
      *
      * Note: you may be interested in disabling spiderfyOnMaxZoom option when using
      * disableClusteringAtZoom.
      */
    var disableClusteringAtZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * iconCreateFunction
      *
      * Function used to create the cluster icon.
      */
    var iconCreateFunction: js.UndefOr[js.Function1[/* cluster */ MarkerCluster, Icon_[IconOptions] | DivIcon_]] = js.undefined
    
    /**
      * maxClusterRadius
      *
      * The maximum radius that a cluster will cover from the central marker (in pixels).
      * Default 80.
      * Decreasing will make more, smaller clusters.
      * You can also use a function that accepts the current map zoom
      * and returns the maximum cluster radius in pixels.
      */
    var maxClusterRadius: js.UndefOr[Double | (js.Function1[/* zoom */ Double, Double])] = js.undefined
    
    /**
      * polygonOptions
      *
      * Options to pass when creating the L.Polygon(points, options) to show the bounds of a cluster.
      * Defaults to empty, which lets Leaflet use the default Path options.
      */
    var polygonOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /**
      * removeOutsideVisibleBounds
      *
      * Clusters and markers too far from the viewport are removed from the map for performance.
      */
    var removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * showCoverageOnHover
      *
      * When you mouse over a cluster it shows the bounds of its markers.
      */
    var showCoverageOnHover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * singleMarkerMode
      *
      * If set to true, overrides the icon for all added markers to make them appear as a 1 size cluster.
      * Note: the markers are not replaced by cluster objects, only their icon is replaced.
      * Hence they still react to normal events, and option disableClusteringAtZoom does not restore
      * their previous icon (see #391).
      */
    var singleMarkerMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * spiderLegPolylineOptions
      *
      * Allows you to specify PolylineOptions to style spider legs.
      * By default, they are { weight: 1.5, color: '#222', opacity: 0.5 }.
      */
    var spiderLegPolylineOptions: js.UndefOr[PolylineOptions] = js.undefined
    
    /**
      * spiderfyDistanceMultiplier
      *
      * Increase from 1 to increase the distance away from the center
      * that spiderfied markers are placed.
      * Use if you are using big marker icons (Default: 1).
      */
    var spiderfyDistanceMultiplier: js.UndefOr[Double] = js.undefined
    
    /**
      * spiderfyOnMaxZoom
      *
      * When you click a cluster at the bottom zoom level we spiderfy it so you can see all of its
      * markers.
      *
      * Note: the spiderfy occurs at the current zoom level if all items within the cluster are
      * still clustered at the maximum zoom level or at zoom specified by disableClusteringAtZoom
      * option.
      */
    var spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * spiderfyShapePositions
      *
      * Function used to override spiderfy default shape positions.
      */
    var spiderfyShapePositions: js.UndefOr[js.Function2[/* count */ Double, /* centerPt */ Point_, js.Array[Point_]]] = js.undefined
    
    /**
      * zoomToBoundsOnClick
      *
      * When you click a cluster we zoom to its bounds.
      */
    var zoomToBoundsOnClick: js.UndefOr[Boolean] = js.undefined
  }
  object MarkerClusterGroupProps {
    
    inline def apply(): MarkerClusterGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerClusterGroupProps]
    }
    
    extension [Self <: MarkerClusterGroupProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateAddingMarkers(value: Boolean): Self = StObject.set(x, "animateAddingMarkers", value.asInstanceOf[js.Any])
      
      inline def setAnimateAddingMarkersUndefined: Self = StObject.set(x, "animateAddingMarkers", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setChunkDelay(value: Double): Self = StObject.set(x, "chunkDelay", value.asInstanceOf[js.Any])
      
      inline def setChunkDelayUndefined: Self = StObject.set(x, "chunkDelay", js.undefined)
      
      inline def setChunkInterval(value: Double): Self = StObject.set(x, "chunkInterval", value.asInstanceOf[js.Any])
      
      inline def setChunkIntervalUndefined: Self = StObject.set(x, "chunkInterval", js.undefined)
      
      inline def setChunkProgress(value: (/* processed */ Double, /* total */ Double, /* elapsed */ Double) => Unit): Self = StObject.set(x, "chunkProgress", js.Any.fromFunction3(value))
      
      inline def setChunkProgressNull: Self = StObject.set(x, "chunkProgress", null)
      
      inline def setChunkProgressUndefined: Self = StObject.set(x, "chunkProgress", js.undefined)
      
      inline def setChunkedLoading(value: Boolean): Self = StObject.set(x, "chunkedLoading", value.asInstanceOf[js.Any])
      
      inline def setChunkedLoadingUndefined: Self = StObject.set(x, "chunkedLoading", js.undefined)
      
      inline def setClusterPane(value: String): Self = StObject.set(x, "clusterPane", value.asInstanceOf[js.Any])
      
      inline def setClusterPaneUndefined: Self = StObject.set(x, "clusterPane", js.undefined)
      
      inline def setDisableClusteringAtZoom(value: Double): Self = StObject.set(x, "disableClusteringAtZoom", value.asInstanceOf[js.Any])
      
      inline def setDisableClusteringAtZoomUndefined: Self = StObject.set(x, "disableClusteringAtZoom", js.undefined)
      
      inline def setIconCreateFunction(value: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_): Self = StObject.set(x, "iconCreateFunction", js.Any.fromFunction1(value))
      
      inline def setIconCreateFunctionUndefined: Self = StObject.set(x, "iconCreateFunction", js.undefined)
      
      inline def setMaxClusterRadius(value: Double | (js.Function1[/* zoom */ Double, Double])): Self = StObject.set(x, "maxClusterRadius", value.asInstanceOf[js.Any])
      
      inline def setMaxClusterRadiusFunction1(value: /* zoom */ Double => Double): Self = StObject.set(x, "maxClusterRadius", js.Any.fromFunction1(value))
      
      inline def setMaxClusterRadiusUndefined: Self = StObject.set(x, "maxClusterRadius", js.undefined)
      
      inline def setPolygonOptions(value: PolylineOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
      
      inline def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
      
      inline def setRemoveOutsideVisibleBounds(value: Boolean): Self = StObject.set(x, "removeOutsideVisibleBounds", value.asInstanceOf[js.Any])
      
      inline def setRemoveOutsideVisibleBoundsUndefined: Self = StObject.set(x, "removeOutsideVisibleBounds", js.undefined)
      
      inline def setShowCoverageOnHover(value: Boolean): Self = StObject.set(x, "showCoverageOnHover", value.asInstanceOf[js.Any])
      
      inline def setShowCoverageOnHoverUndefined: Self = StObject.set(x, "showCoverageOnHover", js.undefined)
      
      inline def setSingleMarkerMode(value: Boolean): Self = StObject.set(x, "singleMarkerMode", value.asInstanceOf[js.Any])
      
      inline def setSingleMarkerModeUndefined: Self = StObject.set(x, "singleMarkerMode", js.undefined)
      
      inline def setSpiderLegPolylineOptions(value: PolylineOptions): Self = StObject.set(x, "spiderLegPolylineOptions", value.asInstanceOf[js.Any])
      
      inline def setSpiderLegPolylineOptionsUndefined: Self = StObject.set(x, "spiderLegPolylineOptions", js.undefined)
      
      inline def setSpiderfyDistanceMultiplier(value: Double): Self = StObject.set(x, "spiderfyDistanceMultiplier", value.asInstanceOf[js.Any])
      
      inline def setSpiderfyDistanceMultiplierUndefined: Self = StObject.set(x, "spiderfyDistanceMultiplier", js.undefined)
      
      inline def setSpiderfyOnMaxZoom(value: Boolean): Self = StObject.set(x, "spiderfyOnMaxZoom", value.asInstanceOf[js.Any])
      
      inline def setSpiderfyOnMaxZoomUndefined: Self = StObject.set(x, "spiderfyOnMaxZoom", js.undefined)
      
      inline def setSpiderfyShapePositions(value: (/* count */ Double, /* centerPt */ Point_) => js.Array[Point_]): Self = StObject.set(x, "spiderfyShapePositions", js.Any.fromFunction2(value))
      
      inline def setSpiderfyShapePositionsUndefined: Self = StObject.set(x, "spiderfyShapePositions", js.undefined)
      
      inline def setZoomToBoundsOnClick(value: Boolean): Self = StObject.set(x, "zoomToBoundsOnClick", value.asInstanceOf[js.Any])
      
      inline def setZoomToBoundsOnClickUndefined: Self = StObject.set(x, "zoomToBoundsOnClick", js.undefined)
    }
  }
  
  type _To = ComponentType[MarkerClusterGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentType[MarkerClusterGroupProps] = default
}
