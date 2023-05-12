package typings.reactLeaflet

import typings.leaflet.mod.Control_.Layers
import typings.leaflet.mod.Control_.LayersOptions
import typings.leaflet.mod.Layer
import typings.react.mod.FunctionComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.reactLeaflet.anon.PartialLayersControlProps
import typings.reactLeaflet.anon.ReadonlyinstanceLayerscon
import typings.reactLeaflet.anon.ReadonlyversionnumbermapM
import typings.reactLeaflet.anon.WeakValidationMapLayersCo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayersControlMod {
  
  @JSImport("react-leaflet/lib/LayersControl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined react.react.ForwardRefExoticComponent<react-leaflet.react-leaflet/lib/LayersControl.LayersControlProps & react.react.RefAttributes<leaflet.leaflet.Control.Layers>> & {  BaseLayer :react.react.FunctionComponent<react-leaflet.react-leaflet/lib/LayersControl.ControlledLayerProps>,   Overlay :react.react.FunctionComponent<react-leaflet.react-leaflet/lib/LayersControl.ControlledLayerProps>} */
  object LayersControl {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: LayersControlProps & RefAttributes[Layers]): ReactElement | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl.BaseLayer")
    @js.native
    def BaseLayer: FunctionComponent[ControlledLayerProps] = js.native
    inline def BaseLayer_=(x: FunctionComponent[ControlledLayerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseLayer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl.Overlay")
    @js.native
    def Overlay: FunctionComponent[ControlledLayerProps] = js.native
    inline def Overlay_=(x: FunctionComponent[ControlledLayerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialLayersControlProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialLayersControlProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapLayersCo] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapLayersCo]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-leaflet/lib/LayersControl", "LayersControl.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  inline def createControlledLayer(addLayerToControl: AddLayerFunc): js.Function1[/* props */ ControlledLayerProps, Element | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createControlledLayer")(addLayerToControl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* props */ ControlledLayerProps, Element | Null]]
  
  inline def useLayersControl(props: LayersControlProps): MutableRefObject[ReadonlyinstanceLayerscon] = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayersControl")(props.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[ReadonlyinstanceLayerscon]]
  
  inline def useLayersControlElement(props: LayersControlProps, context: ReadonlyversionnumbermapM): MutableRefObject[ReadonlyinstanceLayerscon] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayersControlElement")(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[ReadonlyinstanceLayerscon]]
  
  type AddLayerFunc = js.Function3[/* layersControl */ Layers, /* layer */ Layer, /* name */ String, Unit]
  
  trait ControlledLayerProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var children: ReactNode
    
    var name: String
  }
  object ControlledLayerProps {
    
    inline def apply(name: String): ControlledLayerProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledLayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlledLayerProps] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayersControlProps
    extends StObject
       with LayersOptions {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object LayersControlProps {
    
    inline def apply(): LayersControlProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayersControlProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LayersControlProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
