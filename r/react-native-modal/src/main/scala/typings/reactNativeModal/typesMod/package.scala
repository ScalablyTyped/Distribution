package typings.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type AnimationEvent = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type OnOrientationChange = js.Function1[/* orientation */ typings.reactNative.mod.NativeSyntheticEvent[js.Any], scala.Unit]
  
  type OrNull[T] = scala.Null | T
  
  type SupportedAnimation = typings.reactNativeAnimatable.mod.Animation | (typings.reactNativeAnimatable.mod.CustomAnimation[
    typings.reactNative.mod.TextStyle with typings.reactNative.mod.ViewStyle with typings.reactNative.mod.ImageStyle
  ])
}
