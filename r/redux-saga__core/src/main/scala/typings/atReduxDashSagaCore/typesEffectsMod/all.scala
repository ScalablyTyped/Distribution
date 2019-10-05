package typings.atReduxDashSagaCore.typesEffectsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@redux-saga/core/types/effects", "all")
@js.native
object all extends js.Object {
  def apply[T](effects: js.Array[T]): AllEffect[T] = js.native
  def apply[T](effects: StringDictionary[T]): AllEffect[T] = js.native
}

