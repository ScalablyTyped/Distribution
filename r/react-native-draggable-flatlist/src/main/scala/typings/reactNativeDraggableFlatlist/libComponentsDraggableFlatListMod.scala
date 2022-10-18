package typings.reactNativeDraggableFlatlist

import typings.reactNative.mod.FlatListProps
import typings.reactNativeDraggableFlatlist.anon.AnimationConfig
import typings.reactNativeDraggableFlatlist.anon.FnCall
import typings.reactNativeDraggableFlatlist.anon.PartialReadonlyautoscroll
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.activationDistance
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.animationConfig
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.autoscrollSpeed
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.autoscrollThreshold
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.containerStyle
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.data
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.debug
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.dragHitSlop
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.dragItemOverflow
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.keyExtractor
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onAnimValInit
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onDragBegin
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onDragEnd
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onPlaceholderIndexChange
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onRelease
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onScrollOffsetChange
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.outerScrollOffset
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.renderItem
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.renderPlaceholder
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.scrollEnabled
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.simultaneousHandlers
import typings.std.Omit
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDraggableFlatListMod {
  
  @JSImport("react-native-draggable-flatlist/lib/components/DraggableFlatList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    props: AnimationConfig[T] & (Omit[
      FlatListProps[T], 
      onDragEnd | keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | outerScrollOffset | containerStyle | onDragBegin | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | onAnimValInit
    ]) & PartialReadonlyautoscroll
  ): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
}
