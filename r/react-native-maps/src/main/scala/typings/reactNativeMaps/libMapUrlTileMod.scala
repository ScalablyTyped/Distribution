package typings.reactNativeMaps

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.libDecorateMapComponentMod.MapManagerCommand
import typings.reactNativeMaps.libDecorateMapComponentMod.NativeComponent
import typings.reactNativeMaps.libDecorateMapComponentMod.UIManagerCommand
import typings.reactNativeMaps.libSharedTypesMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapUrlTileMod {
  
  /* was `typeof MapUrlTile` */
  @JSImport("react-native-maps/lib/MapUrlTile", JSImport.Default)
  @js.native
  open class default () extends MapUrlTile
  
  @JSImport("react-native-maps/lib/MapUrlTile", "MapUrlTile")
  @js.native
  open class MapUrlTile protected ()
    extends Component[MapUrlTileProps, js.Object, Any] {
    def this(props: MapUrlTileProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapUrlTileProps, context: Any) = this()
    
    @JSName("context")
    var context_MapUrlTile: ContextType[Context[Provider]] = js.native
    
    def getMapManagerCommand(name: String): MapManagerCommand = js.native
    
    def getNativeComponent(): NativeComponent[NativeProps] = js.native
    
    def getUIManagerCommand(name: String): UIManagerCommand = js.native
  }
  
  trait MapUrlTileProps
    extends StObject
       with ViewProps {
    
    /**
      * Doubles tile size from 256 to 512 utilising higher zoom levels
      * i.e loading 4 higher zoom level tiles and combining them for one high-resolution tile.
      * iOS does this automatically, even if it is not desirable always.
      * NB! using this makes text labels smaller than in the original map style.
      *
      * @platform iOS: Not supported
      * @platform Android: Supported
      */
    var doubleTileSize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow tiles using the TMS coordinate system (origin bottom left) to be used,
      * and displayed at their correct coordinates.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var flipY: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum native zoom level for this tile overlay i.e. the highest zoom level that the tile server provides.
      * Tiles are auto-scaled for higher zoom levels.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var maximumNativeZ: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum zoom level for this tile overlay.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var maximumZ: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum zoom level for this tile overlay.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var minimumZ: js.UndefOr[Double] = js.undefined
    
    /**
      * In offline-mode tiles are not fetched from the tile servers, rather only tiles stored in the cache directory are used.
      * Furthermore automated tile scaling is activated: if tile at a desired zoom level is not found from the cache directory,
      * then lower zoom level tile is used (up to 4 levels lower) and scaled.
      *
      * @default false
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var offlineMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Map layer opacity. Value between 0 - 1, with 0 meaning fully transparent.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * Corresponds to MKTileOverlay canReplaceMapContent i.e. if true then underlying iOS basemap is not shown.
      *
      * @default false
      * @platform iOS: Apple Maps only
      * @platform Android: Not supported
      */
    var shouldReplaceMapContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines maximum age in seconds for a cached tile before it's refreshed.
      *
      * NB! Refresh logic is "serve-stale-while-refresh"
      * i.e. to ensure map availability a stale (over max age) tile is served
      * while a tile refresh process is started in the background.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var tileCacheMaxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable caching of tiles in the specified directory.
      * Directory can be specified either as a normal path or in URL format (`file://`).
      *
      * Tiles are stored in tileCachePath directory as `/{z}/{x}/{y}` i.e. in sub-directories 2-levels deep,
      * filename is tile y-coordinate without any filetype-extension.
      *
      * NB! All cache management needs to be implemented by client e.g. deleting tiles to manage use of storage space etc.
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var tileCachePath: js.UndefOr[String] = js.undefined
    
    /**
      * Tile size, default size is 256 (for tiles of 256 _ 256 pixels).
      * High-res (aka 'retina') tiles are 512 (tiles of 512 _ 512 pixels)
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var tileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The url template of the map tileserver.
      * (URLTile) The patterns {x} {y} {z} will be replaced at runtime.
      * For example, http://c.tile.openstreetmap.org/{z}/{x}/{y}.png.
      *
      * It is also possible to refer to tiles in local filesystem with file:///top-level-directory/sub-directory/{z}/{x}/{y}.png URL-format.
      * (WMSTile) The patterns {minX} {maxX} {minY} {maxY} {width} {height} will be replaced at runtime according to EPSG:900913 specification bounding box.
      * For example, https://demo.geo-solutions.it/geoserver/tiger/wms?service=WMS&version=1.1.0&request=GetMap&layers=tiger:poi&styles=&bbox={minX},{minY},{maxX},{maxY}&width={width}&height={height}&srs=EPSG:900913&format=image/png&transparent=true&format_options=dpi:213.
      *
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var urlTemplate: String
    
    /**
      * The order in which this tile overlay is drawn with respect to other overlays.
      * An overlay with a larger z-index is drawn over overlays with smaller z-indices.
      * The order of overlays with the same z-index is arbitrary.
      *
      * @platform iOS: Google Maps only
      * @platform Android: Supported
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object MapUrlTileProps {
    
    inline def apply(urlTemplate: String): MapUrlTileProps = {
      val __obj = js.Dynamic.literal(urlTemplate = urlTemplate.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapUrlTileProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapUrlTileProps] (val x: Self) extends AnyVal {
      
      inline def setDoubleTileSize(value: Boolean): Self = StObject.set(x, "doubleTileSize", value.asInstanceOf[js.Any])
      
      inline def setDoubleTileSizeUndefined: Self = StObject.set(x, "doubleTileSize", js.undefined)
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      inline def setMaximumNativeZ(value: Double): Self = StObject.set(x, "maximumNativeZ", value.asInstanceOf[js.Any])
      
      inline def setMaximumNativeZUndefined: Self = StObject.set(x, "maximumNativeZ", js.undefined)
      
      inline def setMaximumZ(value: Double): Self = StObject.set(x, "maximumZ", value.asInstanceOf[js.Any])
      
      inline def setMaximumZUndefined: Self = StObject.set(x, "maximumZ", js.undefined)
      
      inline def setMinimumZ(value: Double): Self = StObject.set(x, "minimumZ", value.asInstanceOf[js.Any])
      
      inline def setMinimumZUndefined: Self = StObject.set(x, "minimumZ", js.undefined)
      
      inline def setOfflineMode(value: Boolean): Self = StObject.set(x, "offlineMode", value.asInstanceOf[js.Any])
      
      inline def setOfflineModeUndefined: Self = StObject.set(x, "offlineMode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setShouldReplaceMapContent(value: Boolean): Self = StObject.set(x, "shouldReplaceMapContent", value.asInstanceOf[js.Any])
      
      inline def setShouldReplaceMapContentUndefined: Self = StObject.set(x, "shouldReplaceMapContent", js.undefined)
      
      inline def setTileCacheMaxAge(value: Double): Self = StObject.set(x, "tileCacheMaxAge", value.asInstanceOf[js.Any])
      
      inline def setTileCacheMaxAgeUndefined: Self = StObject.set(x, "tileCacheMaxAge", js.undefined)
      
      inline def setTileCachePath(value: String): Self = StObject.set(x, "tileCachePath", value.asInstanceOf[js.Any])
      
      inline def setTileCachePathUndefined: Self = StObject.set(x, "tileCachePath", js.undefined)
      
      inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setUrlTemplate(value: String): Self = StObject.set(x, "urlTemplate", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type NativeProps = MapUrlTileProps
  
  /* was `typeof MapUrlTile` */
  type _default = MapUrlTile
}
