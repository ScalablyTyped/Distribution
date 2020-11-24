package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Animated {
  
  type AnimatedComponent[T /* <: typings.react.mod.ComponentType[_] */] = typings.react.mod.FC[
    typings.reactNative.mod.Animated.AnimatedProps[typings.react.mod.ComponentPropsWithRef[T]]
  ]
  
  type AnimatedProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: key extends react-native.react-native.Animated.NonAnimatedProps? key extends 'ref'? react-native.react-native.Animated.TAugmentRef<T[key]> : T[key] : react-native.react-native.Animated.WithAnimatedValue<T[key]>}
    */ typings.reactNative.reactNativeStrings.AnimatedProps with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type AnimatedValue = typings.reactNative.mod.Animated.Value
  
  type AnimatedValueXY = typings.reactNative.mod.Animated.ValueXY
  
  type Builtin = js.Function | typings.std.Date | typings.std.Error | typings.std.RegExp
  
  type ComponentProps[T] = js.Any
  
  type EndCallback = js.Function1[/* result */ typings.reactNative.mod.Animated.EndResult, scala.Unit]
  
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typings.reactNative.mod.Animated.AnimatedValue
  
  type Nullable = js.UndefOr[scala.Null]
  
  type Primitive = java.lang.String | scala.Double | scala.Boolean | js.Symbol
  
  type TAugmentRef[T] = typings.react.mod.Ref[js.Any | typings.reactNative.mod.Animated.LegacyRef[js.Any]]
  
  type ValueListenerCallback = js.Function1[/* state */ typings.reactNative.anon.Value, scala.Unit]
  
  type ValueXYListenerCallback = js.Function1[/* value */ typings.reactNative.anon.X, scala.Unit]
  
  type WithAnimatedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: react-native.react-native.Animated.WithAnimatedValue<T[K]>}
    */ typings.reactNative.reactNativeStrings.WithAnimatedObject with org.scalablytyped.runtime.TopLevel[T]
  
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.reactNative.mod.Animated.WithAnimatedObject[T]
    - typings.reactNative.mod.Animated.WithAnimatedArray[js.Any]
    - typings.reactNative.mod.Animated.Value
    - typings.reactNative.mod.Animated.AnimatedInterpolation
  */
  type WithAnimatedValue[T] = typings.reactNative.mod.Animated._WithAnimatedValue[T] | typings.reactNative.mod.Animated.WithAnimatedArray[js.Any] | T | typings.reactNative.mod.Animated.WithAnimatedObject[T]
}
