package typings.reactNativeChartsWrapper.mod

import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNativeChartsWrapper.anon.Action
import typings.reactNativeChartsWrapper.anon.FnCall
import typings.reactNativeChartsWrapper.anon.Y
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChartChangeEvent = NativeSyntheticEvent[Action]

type ChartSelectEvent = NativeSyntheticEvent[Y | Null]

type Color = ReturnType[FnCall]

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.largeValue
  - typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.percent
  - typings.reactNativeChartsWrapper.reactNativeChartsWrapperStrings.date
  - java.lang.String
  - js.Array[java.lang.String]
*/
type ValueFormatter = _ValueFormatter | js.Array[String] | String
