package typings.reactNativeReanimated

import typings.react.mod.MutableRefObject
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedStyle
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.StyleProps
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor
import typings.reactNativeReanimated.libTypesReanimated2ViewDescriptorsSetMod.ViewRefSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2UpdatePropsMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/UpdateProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(viewDescriptor: SharedValue[js.Array[Descriptor]], updates: AnimatedStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    viewDescriptor: SharedValue[js.Array[Descriptor]],
    updates: AnimatedStyle,
    maybeViewRef: ViewRefSet[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], maybeViewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(viewDescriptor: SharedValue[js.Array[Descriptor]], updates: StyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(
    viewDescriptor: SharedValue[js.Array[Descriptor]],
    updates: StyleProps,
    maybeViewRef: ViewRefSet[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], maybeViewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/UpdateProps", "ColorProperties")
  @js.native
  val ColorProperties: js.Array[String] = js.native
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/UpdateProps", "colorProps")
  @js.native
  val colorProps: js.Array[String] = js.native
  
  inline def updateProps(viewDescriptor: SharedValue[js.Array[Descriptor]], updates: AnimatedStyle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProps")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateProps(
    viewDescriptor: SharedValue[js.Array[Descriptor]],
    updates: AnimatedStyle,
    maybeViewRef: ViewRefSet[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProps")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], maybeViewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateProps(viewDescriptor: SharedValue[js.Array[Descriptor]], updates: StyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProps")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateProps(
    viewDescriptor: SharedValue[js.Array[Descriptor]],
    updates: StyleProps,
    maybeViewRef: ViewRefSet[Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateProps")(viewDescriptor.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], maybeViewRef.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updatePropsJestWrapper(
    viewDescriptors: SharedValue[js.Array[Descriptor]],
    updates: AnimatedStyle,
    maybeViewRef: Unit,
    animatedStyle: MutableRefObject[AnimatedStyle],
    adapters: js.Array[js.Function1[/* updates */ AnimatedStyle, Unit]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePropsJestWrapper")(viewDescriptors.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], maybeViewRef.asInstanceOf[js.Any], animatedStyle.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updatePropsJestWrapper(
    viewDescriptors: SharedValue[js.Array[Descriptor]],
    updates: AnimatedStyle,
    maybeViewRef: ViewRefSet[Any],
    animatedStyle: MutableRefObject[AnimatedStyle],
    adapters: js.Array[js.Function1[/* updates */ AnimatedStyle, Unit]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePropsJestWrapper")(viewDescriptors.asInstanceOf[js.Any], updates.asInstanceOf[js.Any], maybeViewRef.asInstanceOf[js.Any], animatedStyle.asInstanceOf[js.Any], adapters.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
