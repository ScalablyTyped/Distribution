package typings.reactNativeDraggableFlatlist

import typings.react.mod.ForwardedRef
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.ScrollViewProps
import typings.reactNativeDraggableFlatlist.anon.AnimationConfig
import typings.reactNativeDraggableFlatlist.anon.FnCall
import typings.reactNativeDraggableFlatlist.anon.FnCallPropsRef
import typings.reactNativeDraggableFlatlist.anon.IsActive
import typings.reactNativeDraggableFlatlist.anon.PartialReadonlyautoscroll
import typings.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.OpacityProps
import typings.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.ScaleProps
import typings.reactNativeDraggableFlatlist.libComponentsCellDecoratorsMod.ShadowProps
import typings.reactNativeDraggableFlatlist.libHooksUseOnCellActiveAnimationMod.Params
import typings.reactNativeDraggableFlatlist.libTypesMod.DraggableFlatListProps
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
import typings.reactNativeGestureHandler.libTypescriptComponentsGestureComponentsMod.FlatList
import typings.std.Omit
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-draggable-flatlist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    props: AnimationConfig[T] & (Omit[
      FlatListProps[T], 
      onDragEnd | keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | outerScrollOffset | containerStyle | onDragBegin | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | onAnimValInit
    ]) & PartialReadonlyautoscroll
  ): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  
  inline def NestableDraggableFlatList[T](
    props: AnimationConfig[T] & (Omit[
      FlatListProps[T], 
      onDragEnd | keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | outerScrollOffset | containerStyle | onDragBegin | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | onAnimValInit
    ]) & PartialReadonlyautoscroll
  ): ReturnType[FnCallPropsRef] = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatList")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCallPropsRef]]
  
  inline def NestableDraggableFlatListInner[T](props: DraggableFlatListProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatListInner")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def NestableDraggableFlatListInner[T](props: DraggableFlatListProps[T], ref: ForwardedRef[FlatList[T]]): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatListInner")(props.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  inline def NestableScrollContainer(props: ScrollViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def OpacityDecorator(param0: OpacityProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("OpacityDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScaleDecorator(param0: ScaleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ShadowDecorator(param0: ShadowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShadowDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useOnCellActiveAnimation(): IsActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[IsActive]
  inline def useOnCellActiveAnimation(param0: Params): IsActive = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(param0.asInstanceOf[js.Any]).asInstanceOf[IsActive]
}
