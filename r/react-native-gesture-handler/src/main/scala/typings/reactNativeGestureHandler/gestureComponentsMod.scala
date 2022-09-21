package typings.reactNativeGestureHandler

import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ForwardedRef
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.RefreshControlProps
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.SwitchProps
import typings.reactNative.mod.TextInputProps
import typings.reactNativeGestureHandler.anon.DrawerLayoutAndroidPropsc
import typings.reactNativeGestureHandler.anon.ScrollViewPropschildrenRe
import typings.reactNativeGestureHandler.nativeViewGestureHandlerMod.NativeViewGestureHandlerProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gestureComponentsMod {
  
  @js.native
  trait DrawerLayoutAndroid
    extends typings.reactNative.mod.DrawerLayoutAndroid
       with ForwardRefExoticComponent[DrawerLayoutAndroidPropsc]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "DrawerLayoutAndroid")
  @js.native
  val DrawerLayoutAndroid: ForwardRefExoticComponent[DrawerLayoutAndroidPropsc] = js.native
  
  @js.native
  trait FlatList[ItemT]
    extends typings.reactNative.mod.FlatList[ItemT] {
    
    def apply[ItemT](
      props: PropsWithChildren[
          FlatListProps[ItemT] & RefAttributes[FlatList[ItemT]] & NativeViewGestureHandlerProps_
        ],
      ref: ForwardedRef[FlatList[ItemT]]
    ): ReactElement | Null = js.native
  }
  object FlatList {
    
    @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "FlatList")
    @js.native
    def apply[ItemT](
      props: PropsWithChildren[
          FlatListProps[ItemT] & RefAttributes[FlatList[ItemT]] & NativeViewGestureHandlerProps_
        ],
      ref: ForwardedRef[FlatList[ItemT]]
    ): ReactElement | Null = js.native
  }
  
  @js.native
  trait RefreshControl
    extends typings.reactNative.mod.RefreshControl
       with ForwardRefExoticComponent[
          RefreshControlProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
        ]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "RefreshControl")
  @js.native
  val RefreshControl: ForwardRefExoticComponent[
    RefreshControlProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
  
  @js.native
  trait ScrollView
    extends typings.reactNative.mod.ScrollView
       with ForwardRefExoticComponent[ScrollViewPropschildrenRe]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "ScrollView")
  @js.native
  val ScrollView: ForwardRefExoticComponent[
    ScrollViewProps & NativeViewGestureHandlerProps_ & RefAttributes[typings.reactNative.mod.ScrollView]
  ] = js.native
  
  @js.native
  trait Switch
    extends typings.reactNative.mod.Switch
       with ForwardRefExoticComponent[SwitchProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]] = js.native
  
  @js.native
  trait TextInput
    extends typings.reactNative.mod.TextInput
       with ForwardRefExoticComponent[
          TextInputProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
        ]
  @JSImport("react-native-gesture-handler/lib/typescript/components/GestureComponents", "TextInput")
  @js.native
  val TextInput: ForwardRefExoticComponent[
    TextInputProps & NativeViewGestureHandlerProps_ & RefAttributes[ComponentType[Any]]
  ] = js.native
}
