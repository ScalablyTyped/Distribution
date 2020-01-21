package typings.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcAsyncMod {
  type AsyncComponentProps[T /* <: typings.react.mod.ComponentType[_] */] = typings.reactSelect.srcAsyncMod.SelectComponentProps[T] with typings.reactSelect.srcAsyncMod.AsyncProps[_]
  type ClassProps[T] = js.Any
  type FunctionProps[T] = js.Any
  type Props[OptionType /* <: typings.reactSelect.typesMod.OptionTypeBase */] = typings.reactSelect.selectMod.Props[OptionType] with typings.reactSelect.srcAsyncMod.AsyncProps[OptionType]
  type SelectComponentProps[T] = typings.reactSelect.srcAsyncMod.ClassProps[T] | typings.reactSelect.srcAsyncMod.FunctionProps[T]
}
