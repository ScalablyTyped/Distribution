package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.anon.IsLoading
import typings.reactFns.anon.Latitude
import typings.reactFns.distTypesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distGeoPositionGeoPositionMod {
  
  @JSImport("react-fns/dist/GeoPosition/GeoPosition", "GeoPosition")
  @js.native
  open class GeoPosition protected () extends Component[SharedRenderProps[GeoPositionProps], GeoPositionProps, Any] {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MGeoPosition(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGeoPosition(): Unit = js.native
    
    var geoId: Any = js.native
    
    def requestGeo(): Unit = js.native
    
    @JSName("state")
    var state_GeoPosition: IsLoading = js.native
  }
  
  trait GeoPositionProps extends StObject {
    
    var coords: js.UndefOr[Latitude] = js.undefined
    
    var error: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionError */ Any
      ] = js.undefined
    
    var isLoading: Boolean
  }
  object GeoPositionProps {
    
    inline def apply(isLoading: Boolean): GeoPositionProps = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoPositionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GeoPositionProps] (val x: Self) extends AnyVal {
      
      inline def setCoords(value: Latitude): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setError(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionError */ Any
      ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
}
