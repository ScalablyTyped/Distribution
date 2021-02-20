package typings.reactNativeSafeArea

import typings.react.mod.ComponentType
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.absolutePosition
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.contentInset
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.margin
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.padding
import typings.reactNativeSafeArea.reactNativeSafeAreaStrings.safeAreaInsetsForRootViewDidChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-safe-area", JSImport.Default)
  @js.native
  class default () extends SafeArea
  /* static members */
  object default {
    
    @JSImport("react-native-safe-area", "default.addEventListener")
    @js.native
    def addEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = js.native
    
    @JSImport("react-native-safe-area", "default.getSafeAreaInsetsForRootView")
    @js.native
    def getSafeAreaInsetsForRootView(): js.Promise[EventPayload] = js.native
    
    @JSImport("react-native-safe-area", "default.removeEventListener")
    @js.native
    def removeEventListener(eventType: EventType, listener: js.Function1[/* payload */ EventPayload, Unit]): Unit = js.native
  }
  
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_absolutePosition[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: absolutePosition,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_contentInset[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: contentInset,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_margin[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: margin,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
  @JSImport("react-native-safe-area", "withSafeArea")
  @js.native
  def withSafeArea_padding[P](
    WrappedComponent: ComponentType[P],
    /**
    * @default 'margin'
    */
  applyTo: padding,
    /**
    * @default 'all'
    */
  direction: Direction
  ): ComponentType[P] = js.native
  
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
    
    @scala.inline
    def all: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.all = "all".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.all]
    
    @scala.inline
    def bottom: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom = "bottom".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottom]
    
    @scala.inline
    def bottomAndLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft = "bottomAndLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndLeft]
    
    @scala.inline
    def bottomAndRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight = "bottomAndRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomAndRight]
    
    @scala.inline
    def bottomLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight = "bottomRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.bottomRight]
    
    @scala.inline
    def horizontal: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal = "horizontal".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontal]
    
    @scala.inline
    def horizontalAndBottom: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom = "horizontalAndBottom".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndBottom]
    
    @scala.inline
    def horizontalAndTop: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop = "horizontalAndTop".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.horizontalAndTop]
    
    @scala.inline
    def left: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.left = "left".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.left]
    
    @scala.inline
    def right: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.right = "right".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.right]
    
    @scala.inline
    def top: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.top = "top".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.top]
    
    @scala.inline
    def topAndLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft = "topAndLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndLeft]
    
    @scala.inline
    def topAndRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight = "topAndRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topAndRight]
    
    @scala.inline
    def topLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft = "topLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topLeft]
    
    @scala.inline
    def topRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight = "topRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.topRight]
    
    @scala.inline
    def vertical: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical = "vertical".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.vertical]
    
    @scala.inline
    def verticalAndLeft: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft = "verticalAndLeft".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndLeft]
    
    @scala.inline
    def verticalAndRight: typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight = "verticalAndRight".asInstanceOf[typings.reactNativeSafeArea.reactNativeSafeAreaStrings.verticalAndRight]
  }
  
  @js.native
  trait EventPayload extends StObject {
    
    var safeAreaInsets: SafeAreaInsets = js.native
  }
  object EventPayload {
    
    @scala.inline
    def apply(safeAreaInsets: SafeAreaInsets): EventPayload = {
      val __obj = js.Dynamic.literal(safeAreaInsets = safeAreaInsets.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventPayload]
    }
    
    @scala.inline
    implicit class EventPayloadMutableBuilder[Self <: EventPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSafeAreaInsets(value: SafeAreaInsets): Self = StObject.set(x, "safeAreaInsets", value.asInstanceOf[js.Any])
    }
  }
  
  type EventType = safeAreaInsetsForRootViewDidChange
  
  @js.native
  trait SafeArea extends StObject
  
  // from `TypeDefinition.js`
  @js.native
  trait SafeAreaInsets extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object SafeAreaInsets {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): SafeAreaInsets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[SafeAreaInsets]
    }
    
    @scala.inline
    implicit class SafeAreaInsetsMutableBuilder[Self <: SafeAreaInsets] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
