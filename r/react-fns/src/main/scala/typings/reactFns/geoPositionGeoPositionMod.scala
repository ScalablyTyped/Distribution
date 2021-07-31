package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.anon.IsLoading
import typings.reactFns.anon.Latitude
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoPositionGeoPositionMod {
  
  @JSImport("react-fns/dist/GeoPosition/GeoPosition", "GeoPosition")
  @js.native
  class GeoPosition protected ()
    extends Component[SharedRenderProps[GeoPositionProps], GeoPositionProps, js.Any] {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MGeoPosition(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MGeoPosition(): Unit = js.native
    
    var geoId: js.Any = js.native
    
    def requestGeo(): Unit = js.native
    
    @JSName("state")
    var state_GeoPosition: IsLoading = js.native
  }
  
  trait GeoPositionProps extends StObject {
    
    var coords: js.UndefOr[Latitude] = js.undefined
    
    var error: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionError */ js.Any
      ] = js.undefined
    
    var isLoading: Boolean
  }
  object GeoPositionProps {
    
    @scala.inline
    def apply(isLoading: Boolean): GeoPositionProps = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoPositionProps]
    }
    
    @scala.inline
    implicit class GeoPositionPropsMutableBuilder[Self <: GeoPositionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoords(value: Latitude): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setError(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionError */ js.Any
      ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
}
