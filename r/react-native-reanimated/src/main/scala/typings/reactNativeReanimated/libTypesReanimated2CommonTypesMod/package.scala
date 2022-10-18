package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import typings.reactNative.mod.MatrixTransform
import typings.reactNative.mod.PerpectiveTransform
import typings.reactNative.mod.RotateTransform
import typings.reactNative.mod.RotateXTransform
import typings.reactNative.mod.RotateYTransform
import typings.reactNative.mod.RotateZTransform
import typings.reactNative.mod.ScaleTransform
import typings.reactNative.mod.ScaleXTransform
import typings.reactNative.mod.ScaleYTransform
import typings.reactNative.mod.SkewXTransform
import typings.reactNative.mod.SkewYTransform
import typings.reactNative.mod.TranslateXTransform
import typings.reactNative.mod.TranslateYTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimatableValue = Double | String | js.Array[Double]

type AnimationCallback = js.Function2[/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue], Unit]

type NestedObjectValues[T] = T | js.Array[Any] | NestedObject[T]

type SensorValue3D = SharedValue[Value3D]

type SensorValueRotation = SharedValue[ValueRotation]

type ShadowNodeWrapper = js.Object

type Timestamp = Double

type TransformProperty = PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
