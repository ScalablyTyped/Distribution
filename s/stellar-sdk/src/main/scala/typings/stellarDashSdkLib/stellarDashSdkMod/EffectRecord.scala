package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EffectRecord extends Record {
  var account: java.lang.String
  var amount: js.UndefOr[js.Any] = js.undefined
  var operation: js.UndefOr[CallFunction[OperationRecord]] = js.undefined
  var paging_token: java.lang.String
  var precedes: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
  var starting_balance: java.lang.String
  var succeeds: js.UndefOr[CallFunction[EffectRecord]] = js.undefined
  var `type`: java.lang.String
  var type_i: java.lang.String
}

