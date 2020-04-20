package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object componentsMod {
  type DeepNonNullable[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? std.NonNullable<T[P]>}
    */ typings.reactSelect.reactSelectStrings.DeepNonNullable with org.scalablytyped.runtime.TopLevel[T]
  type IndicatorComponentType[OptionType /* <: typings.reactSelect.typesMod.OptionTypeBase */] = typings.react.mod.ComponentType[typings.reactSelect.indicatorsMod.IndicatorProps[OptionType]]
  type PlaceholderOrValue[OptionType /* <: typings.reactSelect.typesMod.OptionTypeBase */] = typings.react.mod.ReactElement | js.Array[typings.react.mod.ReactElement]
}
