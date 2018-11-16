package typings
package rxjsLib.internalOperatorsGroupByMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RefCountSubscription extends js.Object {
  var attemptedToUnsubscribe: scala.Boolean
  var closed: scala.Boolean
  var count: scala.Double
  def unsubscribe(): scala.Unit
}

