package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Animated {
  type AnimatedComponent[T /* <: typings.react.mod.ComponentType[_] */] = typings.react.mod.FC[
    typings.reactNative.mod.Animated.ComponentProps[T] | typings.reactNative.mod.Animated.AnimatedProps[typings.react.mod.ComponentPropsWithRef[T]]
  ]
  type AnimatedProps[T] = typings.reactNative.reactNativeStrings.AnimatedProps with org.scalablytyped.runtime.TopLevel[T] with (js.Object | typings.reactNative.anon.`2`)
  type AnimatedValue = typings.reactNative.mod.Animated.Value
  type AnimatedValueXY = typings.reactNative.mod.Animated.ValueXY
  type ComponentProps[T] = js.Any
  type EndCallback = js.Function1[/* result */ typings.reactNative.mod.Animated.EndResult, scala.Unit]
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typings.reactNative.mod.Animated.AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ typings.reactNative.anon.Value, scala.Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ typings.reactNative.anon.X, scala.Unit]
}
