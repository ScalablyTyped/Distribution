package typings.reactNativeMaps

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.anon.Action
import typings.reactNativeMaps.libDecorateMapComponentMod.MapManagerCommand
import typings.reactNativeMaps.libDecorateMapComponentMod.NativeComponent
import typings.reactNativeMaps.libDecorateMapComponentMod.UIManagerCommand
import typings.reactNativeMaps.libSharedTypesMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapCalloutSubviewMod {
  
  /* was `typeof MapCalloutSubview` */
  @JSImport("react-native-maps/lib/MapCalloutSubview", JSImport.Default)
  @js.native
  open class default () extends MapCalloutSubview
  
  @JSImport("react-native-maps/lib/MapCalloutSubview", "MapCalloutSubview")
  @js.native
  open class MapCalloutSubview protected ()
    extends Component[MapCalloutSubviewProps, js.Object, Any] {
    def this(props: MapCalloutSubviewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapCalloutSubviewProps, context: Any) = this()
    
    @JSName("context")
    var context_MapCalloutSubview: ContextType[Context[Provider]] = js.native
    
    def getMapManagerCommand(name: String): MapManagerCommand = js.native
    
    def getNativeComponent(): NativeComponent[NativeProps] = js.native
    
    def getUIManagerCommand(name: String): UIManagerCommand = js.native
  }
  
  type CalloutSubviewPressEvent = NativeSyntheticEvent[Action]
  
  trait MapCalloutSubviewProps
    extends StObject
       with ViewProps {
    
    /**
      * Callback that is called when the user presses on this subview inside callout
      *
      * @platform iOS: Supported
      * @platform Android: Not supported
      */
    var onPress: js.UndefOr[js.Function1[/* event */ CalloutSubviewPressEvent, Unit]] = js.undefined
  }
  object MapCalloutSubviewProps {
    
    inline def apply(): MapCalloutSubviewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapCalloutSubviewProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapCalloutSubviewProps] (val x: Self) extends AnyVal {
      
      inline def setOnPress(value: /* event */ CalloutSubviewPressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    }
  }
  
  type NativeProps = MapCalloutSubviewProps
  
  /* was `typeof MapCalloutSubview` */
  type _default = MapCalloutSubview
}
