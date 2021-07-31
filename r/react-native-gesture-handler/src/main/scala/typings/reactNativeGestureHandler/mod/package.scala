package typings.reactNativeGestureHandler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def GestureHandlerRootView: typings.react.mod.ComponentType[typings.reactNative.mod.ViewProps] = typings.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].selectDynamic("GestureHandlerRootView").asInstanceOf[typings.react.mod.ComponentType[typings.reactNative.mod.ViewProps]]

@scala.inline
def createNativeWrapper[P](
  Component: typings.react.mod.ComponentType[P],
  config: typings.reactNativeGestureHandler.mod.NativeViewGestureHandlerProperties
): typings.react.mod.ComponentType[P] = (typings.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createNativeWrapper")(Component.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ComponentType[P]]

@scala.inline
def gestureHandlerRootHOC[P](Component: typings.react.mod.ComponentType[P]): typings.react.mod.ComponentType[P] = typings.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gestureHandlerRootHOC")(Component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentType[P]]
@scala.inline
def gestureHandlerRootHOC[P](
  Component: typings.react.mod.ComponentType[P],
  containerStyles: typings.reactNative.mod.StyleProp[typings.reactNative.mod.ViewStyle]
): typings.react.mod.ComponentType[P] = (typings.reactNativeGestureHandler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("gestureHandlerRootHOC")(Component.asInstanceOf[js.Any], containerStyles.asInstanceOf[js.Any])).asInstanceOf[typings.react.mod.ComponentType[P]]
