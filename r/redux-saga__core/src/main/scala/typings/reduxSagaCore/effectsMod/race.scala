package typings.reduxSagaCore.effectsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@redux-saga/core/types/effects", "race")
@js.native
object race extends js.Object {
  
  def apply[T](effects: js.Array[T]): RaceEffect[T] = js.native
  def apply[T](effects: StringDictionary[T]): RaceEffect[T] = js.native
}
