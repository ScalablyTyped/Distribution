package typings.reactNativeSafeArea

import typings.react.mod.ComponentType
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.absolutePosition
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.contentInset
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.margin
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.padding
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.safeAreaInsetsForRootViewDidChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-safe-area", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with SafeArea
  /* static members */
  object default {
    
    @JSImport("react-native-safe-area", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getSafeAreaInsetsForRootView(): js.Promise[EventPayload] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSafeAreaInsetsForRootView")().asInstanceOf[js.Promise[EventPayload]]
    
    inline def removeEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(eventType.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def withSafeArea_absolutePosition[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: absolutePosition,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")(WrappedComponent.asInstanceOf[js.Any], applyTo.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  inline def withSafeArea_contentInset[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: contentInset,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")(WrappedComponent.asInstanceOf[js.Any], applyTo.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  inline def withSafeArea_margin[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: margin,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")(WrappedComponent.asInstanceOf[js.Any], applyTo.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  inline def withSafeArea_padding[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: padding,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("withSafeArea")(WrappedComponent.asInstanceOf[js.Any], applyTo.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  // from `withSafeArea.js`
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.top
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.left
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.right
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom
    - typings.reactNativeSafeArea.reactNativeSafeAreaStrings.all
  */
  trait Direction extends StObject
  object Direction {
    
    inline def all: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.all = "all".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.all]
    
    inline def bottom: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom = "bottom".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom]
    
    inline def bottomAndLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft = "bottomAndLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft]
    
    inline def bottomAndRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight = "bottomAndRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight]
    
    inline def bottomLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft]
    
    inline def bottomRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight = "bottomRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight]
    
    inline def horizontal: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal = "horizontal".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal]
    
    inline def horizontalAndBottom: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom = "horizontalAndBottom".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom]
    
    inline def horizontalAndTop: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop = "horizontalAndTop".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop]
    
    inline def left: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.left = "left".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.left]
    
    inline def right: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.right = "right".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.right]
    
    inline def top: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.top = "top".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.top]
    
    inline def topAndLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft = "topAndLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft]
    
    inline def topAndRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight = "topAndRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight]
    
    inline def topLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft = "topLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft]
    
    inline def topRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight = "topRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight]
    
    inline def vertical: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical = "vertical".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical]
    
    inline def verticalAndLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft = "verticalAndLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft]
    
    inline def verticalAndRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight = "verticalAndRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight]
  }
  
  trait EventPayload extends StObject {
    
    var safeAreaInsets: SafeAreaInsets
  }
  object EventPayload {
    
    inline def apply(safeAreaInsets: SafeAreaInsets): EventPayload = {
      val __obj = js.Dynamic.literal(safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
    
    extension [Self <: EventPayload](x: Self) {
      
      inline def setSafeAreaInsets(value: SafeAreaInsets): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    }
  }
  
  type EventType = safeAreaInsetsForRootViewDidChange
  
  trait SafeArea extends StObject
  
  // from `TypeDefinition.js`
  trait SafeAreaInsets extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object SafeAreaInsets {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): SafeAreaInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeAreaInsets]
    }
    
    extension [Self <: SafeAreaInsets](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
