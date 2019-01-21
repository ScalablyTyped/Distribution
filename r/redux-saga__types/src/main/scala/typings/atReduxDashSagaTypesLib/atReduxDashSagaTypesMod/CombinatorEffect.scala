package typings
package atReduxDashSagaTypesLib.atReduxDashSagaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CombinatorEffect[T, E] extends js.Object {
  var `@@redux-saga/IO`: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`true`
  var combinator: atReduxDashSagaTypesLib.atReduxDashSagaTypesLibNumbers.`true`
  var payload: CombinatorEffectDescriptor[E]
  var `type`: T
}

