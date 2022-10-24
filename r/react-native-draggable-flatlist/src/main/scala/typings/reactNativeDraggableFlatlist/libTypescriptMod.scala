package typings.reactNativeDraggableFlatlist

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.ScrollViewProps
import typings.reactNativeDraggableFlatlist.anon.AutoscrollSpeed
import typings.reactNativeDraggableFlatlist.anon.Fn0
import typings.reactNativeDraggableFlatlist.anon.OnActiveAnim
import typings.reactNativeDraggableFlatlist.anon.PartialReadonlyautoscrollActivationDistance
import typings.reactNativeDraggableFlatlist.libTypescriptComponentsCellDecoratorsMod.OpacityProps
import typings.reactNativeDraggableFlatlist.libTypescriptComponentsCellDecoratorsMod.ScaleProps
import typings.reactNativeDraggableFlatlist.libTypescriptComponentsCellDecoratorsMod.ShadowProps
import typings.reactNativeDraggableFlatlist.libTypescriptHooksUseOnCellActiveAnimationMod.Params
import typings.reactNativeDraggableFlatlist.libTypescriptTypesMod.DraggableFlatListProps
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
import typings.reactNativeDraggableFlatlist.reactNativeDraggableFlatlistStrings.onContainerLayout
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

object libTypescriptMod {
  
  @JSImport("react-native-draggable-flatlist/lib/typescript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](
    props: AutoscrollSpeed[T] & (Omit[
      FlatListProps[T], 
      keyExtractor | data | renderItem | debug | scrollEnabled | autoscrollThreshold | autoscrollSpeed | animationConfig | dragHitSlop | activationDistance | dragItemOverflow | containerStyle | onDragBegin | onDragEnd | onPlaceholderIndexChange | onRelease | onScrollOffsetChange | renderPlaceholder | simultaneousHandlers | outerScrollOffset | onAnimValInit | onContainerLayout
    ]) & PartialReadonlyautoscrollActivationDistance
  ): ReturnType[Fn0] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReturnType[Fn0]]
  
  inline def NestableDraggableFlatList[T](props: DraggableFlatListProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableDraggableFlatList")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def NestableScrollContainer(props: ScrollViewProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestableScrollContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def OpacityDecorator(param0: OpacityProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("OpacityDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ScaleDecorator(param0: ScaleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ScaleDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ShadowDecorator(param0: ShadowProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ShadowDecorator")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useOnCellActiveAnimation(): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")().asInstanceOf[OnActiveAnim]
  inline def useOnCellActiveAnimation(param0: Params): OnActiveAnim = ^.asInstanceOf[js.Dynamic].applyDynamic("useOnCellActiveAnimation")(param0.asInstanceOf[js.Any]).asInstanceOf[OnActiveAnim]
}
