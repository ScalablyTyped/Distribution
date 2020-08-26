package typings.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ChartChangeEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNativeChartsWrapper.anon.Action]
  type ChartSelectEvent = typings.reactNative.mod.NativeSyntheticEvent[typings.reactNativeChartsWrapper.anon.Y | scala.Null]
  type Color = typings.std.ReturnType[typings.reactNativeChartsWrapper.anon.FnCall]
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.largeValue
    - typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.percent
    - typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.date
    - java.lang.String
    - js.Array[java.lang.String]
  */
  type ValueFormatter = typings.reactNativeChartsWrapper.mod._ValueFormatter | js.Array[java.lang.String] | java.lang.String
}
