package typings.reactNativeReanimated.libTypesMod

import typings.react.mod.ComponentType
import typings.reactNativeReanimated.libTypesCreateAnimatedComponentMod.AnimatedComponentProps
import typings.reactNativeReanimated.libTypesCreateAnimatedComponentMod.InitialComponentProps
import typings.reactNativeReanimated.libTypesCreateAnimatedComponentMod.Options
import typings.reactNativeReanimated.libTypesReanimated2ComponentFlatListMod.ReanimatedFlatListFC
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object default {
  
  @JSImport("react-native-reanimated/lib/types", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-reanimated/lib/types", "default.FlatList")
  @js.native
  val FlatList: ReanimatedFlatListFC[Any] = js.native
  
  @JSImport("react-native-reanimated/lib/types", "default.Image")
  @js.native
  val Image: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  @JSImport("react-native-reanimated/lib/types", "default.ScrollView")
  @js.native
  val ScrollView: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  @JSImport("react-native-reanimated/lib/types", "default.Text")
  @js.native
  val Text: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  @JSImport("react-native-reanimated/lib/types", "default.View")
  @js.native
  val View: ComponentType[AnimatedComponentProps[InitialComponentProps]] = js.native
  
  inline def addWhitelistedNativeProps(props: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedNativeProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addWhitelistedUIProps(props: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedUIProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createAnimatedComponent(Component: ComponentType[InitialComponentProps]): ComponentType[AnimatedComponentProps[InitialComponentProps]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[AnimatedComponentProps[InitialComponentProps]]]
  inline def createAnimatedComponent(Component: ComponentType[InitialComponentProps], options: Options[InitialComponentProps]): ComponentType[AnimatedComponentProps[InitialComponentProps]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAnimatedComponent")(Component.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[AnimatedComponentProps[InitialComponentProps]]]
}
