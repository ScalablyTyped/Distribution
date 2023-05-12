package typings.reactLeaflet

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Layer
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.SVGOverlay_
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactLeafletCore.libContextMod.ControlledLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-leaflet.react-leaflet/lib/LayersControl.LayersControlProps & react.react.RefAttributes<leaflet.leaflet.Control.Layers>> */
  trait PartialLayersControlProps extends StObject {
    
    var autoZIndex: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var collapsed: js.UndefOr[Boolean] = js.undefined
    
    var hideSingleBase: js.UndefOr[Boolean] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    var position: js.UndefOr[ControlPosition] = js.undefined
    
    var ref: js.UndefOr[Ref[Layers]] = js.undefined
    
    var sortFunction: js.UndefOr[
        js.Function4[/* layerA */ Layer, /* layerB */ Layer, /* nameA */ String, /* nameB */ String, Double]
      ] = js.undefined
    
    var sortLayers: js.UndefOr[Boolean] = js.undefined
  }
  object PartialLayersControlProps {
    
    inline def apply(): PartialLayersControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLayersControlProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLayersControlProps] (val x: Self) extends AnyVal {
      
      inline def setAutoZIndex(value: Boolean): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setHideSingleBase(value: Boolean): Self = StObject.set(x, "hideSingleBase", value.asInstanceOf[js.Any])
      
      inline def setHideSingleBaseUndefined: Self = StObject.set(x, "hideSingleBase", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRef(value: Ref[Layers]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Layers | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSortFunction(value: (/* layerA */ Layer, /* layerB */ Layer, /* nameA */ String, /* nameB */ String) => Double): Self = StObject.set(x, "sortFunction", js.Any.fromFunction4(value))
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      inline def setSortLayers(value: Boolean): Self = StObject.set(x, "sortLayers", value.asInstanceOf[js.Any])
      
      inline def setSortLayersUndefined: Self = StObject.set(x, "sortLayers", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<{  instance :leaflet.leaflet.Control.Layers,   context :std.Readonly<{  __version :number,   map :leaflet.leaflet.Map,   layerContainer :leaflet.leaflet.LayerGroup<any> | @react-leaflet/core.@react-leaflet/core/lib/context.ControlledLayer | undefined,   layersControl :leaflet.leaflet.Control.Layers | undefined,   overlayContainer :leaflet.leaflet.Layer | undefined,   pane :string | undefined}>,   container :any | undefined}> */
  trait ReadonlyinstanceLayerscon extends StObject {
    
    val container: js.UndefOr[Any] = js.undefined
    
    val context: ReadonlyversionnumbermapM
    
    val instance: Layers
  }
  object ReadonlyinstanceLayerscon {
    
    inline def apply(context: ReadonlyversionnumbermapM, instance: Layers): ReadonlyinstanceLayerscon = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyinstanceLayerscon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyinstanceLayerscon] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContext(value: ReadonlyversionnumbermapM): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Layers): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  instance :leaflet.leaflet.SVGOverlay,   context :std.Readonly<{  __version :number,   map :leaflet.leaflet.Map,   layerContainer :leaflet.leaflet.LayerGroup<any> | @react-leaflet/core.@react-leaflet/core/lib/context.ControlledLayer | undefined,   layersControl :leaflet.leaflet.Control.Layers | undefined,   overlayContainer :leaflet.leaflet.Layer | undefined,   pane :string | undefined}>,   container :any | undefined}> */
  trait ReadonlyinstanceSVGOverla extends StObject {
    
    val container: js.UndefOr[Any] = js.undefined
    
    val context: ReadonlyversionnumbermapM
    
    val instance: SVGOverlay_
  }
  object ReadonlyinstanceSVGOverla {
    
    inline def apply(context: ReadonlyversionnumbermapM, instance: SVGOverlay_): ReadonlyinstanceSVGOverla = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyinstanceSVGOverla]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyinstanceSVGOverla] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContext(value: ReadonlyversionnumbermapM): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: SVGOverlay_): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  __version :number,   map :leaflet.leaflet.Map,   layerContainer :leaflet.leaflet.LayerGroup<any> | @react-leaflet/core.@react-leaflet/core/lib/context.ControlledLayer | undefined,   layersControl :leaflet.leaflet.Control.Layers | undefined,   overlayContainer :leaflet.leaflet.Layer | undefined,   pane :string | undefined}> */
  trait ReadonlyversionnumbermapM extends StObject {
    
    val __version: Double
    
    val layerContainer: js.UndefOr[LayerGroup_[Any] | ControlledLayer] = js.undefined
    
    val layersControl: js.UndefOr[Layers] = js.undefined
    
    val map: Map_
    
    val overlayContainer: js.UndefOr[Layer] = js.undefined
    
    val pane: js.UndefOr[String] = js.undefined
  }
  object ReadonlyversionnumbermapM {
    
    inline def apply(__version: Double, map: Map_): ReadonlyversionnumbermapM = {
      val __obj = js.Dynamic.literal(__version = __version.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyversionnumbermapM]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadonlyversionnumbermapM] (val x: Self) extends AnyVal {
      
      inline def setLayerContainer(value: LayerGroup_[Any] | ControlledLayer): Self = StObject.set(x, "layerContainer", value.asInstanceOf[js.Any])
      
      inline def setLayerContainerUndefined: Self = StObject.set(x, "layerContainer", js.undefined)
      
      inline def setLayersControl(value: Layers): Self = StObject.set(x, "layersControl", value.asInstanceOf[js.Any])
      
      inline def setLayersControlUndefined: Self = StObject.set(x, "layersControl", js.undefined)
      
      inline def setMap(value: Map_): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainer(value: Layer): Self = StObject.set(x, "overlayContainer", value.asInstanceOf[js.Any])
      
      inline def setOverlayContainerUndefined: Self = StObject.set(x, "overlayContainer", js.undefined)
      
      inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def set__version(value: Double): Self = StObject.set(x, "__version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.WeakValidationMap<react-leaflet.react-leaflet/lib/LayersControl.LayersControlProps & react.react.RefAttributes<leaflet.leaflet.Control.Layers>> */
  trait WeakValidationMapLayersCo extends StObject {
    
    var autoZIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var children: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ] = js.undefined
    
    var collapsed: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var hideSingleBase: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
    
    var key: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ] = js.undefined
    
    var position: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends leaflet.leaflet.ControlPosition | undefined ? react.react.Validator<leaflet.leaflet.ControlPosition | undefined | null | undefined> : undefined extends leaflet.leaflet.ControlPosition | undefined ? react.react.Validator<leaflet.leaflet.ControlPosition | undefined | null | undefined> : react.react.Validator<leaflet.leaflet.ControlPosition | undefined> */ js.Any
      ] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<leaflet.leaflet.Control.Layers> | undefined ? react.react.Validator<react.react.Ref<leaflet.leaflet.Control.Layers> | undefined | null | undefined> : undefined extends react.react.Ref<leaflet.leaflet.Control.Layers> | undefined ? react.react.Validator<react.react.Ref<leaflet.leaflet.Control.Layers> | undefined | null | undefined> : react.react.Validator<react.react.Ref<leaflet.leaflet.Control.Layers> | undefined> */ js.Any
      ] = js.undefined
    
    var sortFunction: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends (layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined ? react.react.Validator<(layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined | null | undefined> : undefined extends (layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined ? react.react.Validator<(layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined | null | undefined> : react.react.Validator<(layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined> */ js.Any
      ] = js.undefined
    
    var sortLayers: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ] = js.undefined
  }
  object WeakValidationMapLayersCo {
    
    inline def apply(): WeakValidationMapLayersCo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WeakValidationMapLayersCo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WeakValidationMapLayersCo] (val x: Self) extends AnyVal {
      
      inline def setAutoZIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "autoZIndex", value.asInstanceOf[js.Any])
      
      inline def setAutoZIndexUndefined: Self = StObject.set(x, "autoZIndex", js.undefined)
      
      inline def setChildren(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : undefined extends react.react.ReactNode | undefined ? react.react.Validator<react.react.ReactNode | undefined | null | undefined> : react.react.Validator<react.react.ReactNode | undefined> */ js.Any
      ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsed(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      inline def setHideSingleBase(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "hideSingleBase", value.asInstanceOf[js.Any])
      
      inline def setHideSingleBaseUndefined: Self = StObject.set(x, "hideSingleBase", js.undefined)
      
      inline def setKey(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : undefined extends react.react.Key | null | undefined ? react.react.Validator<react.react.Key | null | undefined | null | undefined> : react.react.Validator<react.react.Key | null | undefined> */ js.Any
      ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPosition(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends leaflet.leaflet.ControlPosition | undefined ? react.react.Validator<leaflet.leaflet.ControlPosition | undefined | null | undefined> : undefined extends leaflet.leaflet.ControlPosition | undefined ? react.react.Validator<leaflet.leaflet.ControlPosition | undefined | null | undefined> : react.react.Validator<leaflet.leaflet.ControlPosition | undefined> */ js.Any
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends react.react.Ref<leaflet.leaflet.Control.Layers> | undefined ? react.react.Validator<react.react.Ref<leaflet.leaflet.Control.Layers> | undefined | null | undefined> : undefined extends react.react.Ref<leaflet.leaflet.Control.Layers> | undefined ? react.react.Validator<react.react.Ref<leaflet.leaflet.Control.Layers> | undefined | null | undefined> : react.react.Validator<react.react.Ref<leaflet.leaflet.Control.Layers> | undefined> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setSortFunction(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends (layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined ? react.react.Validator<(layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined | null | undefined> : undefined extends (layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined ? react.react.Validator<(layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined | null | undefined> : react.react.Validator<(layerA : leaflet.leaflet.Layer, layerB : leaflet.leaflet.Layer, nameA : string, nameB : string): number | undefined> */ js.Any
      ): Self = StObject.set(x, "sortFunction", value.asInstanceOf[js.Any])
      
      inline def setSortFunctionUndefined: Self = StObject.set(x, "sortFunction", js.undefined)
      
      inline def setSortLayers(
        value: /* import warning: importer.ImportType#apply Failed type conversion: null extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : undefined extends boolean | undefined ? react.react.Validator<boolean | undefined | null | undefined> : react.react.Validator<boolean | undefined> */ js.Any
      ): Self = StObject.set(x, "sortLayers", value.asInstanceOf[js.Any])
      
      inline def setSortLayersUndefined: Self = StObject.set(x, "sortLayers", js.undefined)
    }
  }
}
