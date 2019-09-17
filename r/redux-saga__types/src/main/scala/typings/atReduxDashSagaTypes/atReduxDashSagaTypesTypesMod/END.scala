package typings.atReduxDashSagaTypes.atReduxDashSagaTypesTypesMod

import typings.atReduxDashSagaTypes.atReduxDashSagaTypesStrings.`@@redux-saga/CHANNEL_END`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait END extends js.Object {
  var `type`: `@@redux-saga/CHANNEL_END`
}

object END {
  @scala.inline
  def apply(`type`: `@@redux-saga/CHANNEL_END`): END = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[END]
  }
}

