package typings.reactNativeMaps

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.reactNative.mod.ViewProps
import typings.reactNativeMaps.libDecorateMapComponentMod.MapManagerCommand
import typings.reactNativeMaps.libDecorateMapComponentMod.NativeComponent
import typings.reactNativeMaps.libDecorateMapComponentMod.UIManagerCommand
import typings.reactNativeMaps.libSharedTypesMod.CalloutPressEvent
import typings.reactNativeMaps.libSharedTypesMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapCalloutMod {
  
  /* was `typeof MapCallout` */
  @JSImport("react-native-maps/lib/MapCallout", JSImport.Default)
  @js.native
  open class default () extends MapCallout
  
  @JSImport("react-native-maps/lib/MapCallout", "MapCallout")
  @js.native
  open class MapCallout protected ()
    extends Component[MapCalloutProps, js.Object, Any] {
    def this(props: MapCalloutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MapCalloutProps, context: Any) = this()
    
    @JSName("context")
    var context_MapCallout: ContextType[Context[Provider]] = js.native
    
    def getMapManagerCommand(name: String): MapManagerCommand = js.native
    
    def getNativeComponent(): NativeComponent[NativeProps] = js.native
    
    def getUIManagerCommand(name: String): UIManagerCommand = js.native
  }
  
  trait MapCalloutProps
    extends StObject
       with ViewProps {
    
    /**
      * If `true`, clicks on transparent areas in callout will be passed to map.
      *
      * @default false
      * @platform iOS: Supported
      * @platform Android: Not supported
      */
    var alphaHitTest: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that is called when the user presses on the callout
      *
      * @platform iOS: Apple Maps only
      * @platform Android: Supported
      */
    var onPress: js.UndefOr[js.Function1[/* event */ CalloutPressEvent, Unit]] = js.undefined
    
    /**
      * If `false`, a default "tooltip" bubble window will be drawn around this callouts children.
      * If `true`, the child views can fully customize their appearance, including any "bubble" like styles.
      *
      * @default false
      * @platform iOS: Supported
      * @platform Android: Supported
      */
    var tooltip: js.UndefOr[Boolean] = js.undefined
  }
  object MapCalloutProps {
    
    inline def apply(): MapCalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapCalloutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapCalloutProps] (val x: Self) extends AnyVal {
      
      inline def setAlphaHitTest(value: Boolean): Self = StObject.set(x, "alphaHitTest", value.asInstanceOf[js.Any])
      
      inline def setAlphaHitTestUndefined: Self = StObject.set(x, "alphaHitTest", js.undefined)
      
      inline def setOnPress(value: /* event */ CalloutPressEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type NativeProps = MapCalloutProps
  
  /* was `typeof MapCallout` */
  type _default = MapCallout
}
