package typings
package reduxDashSagaLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Deferred[R] extends js.Object {
  var promise: stdLib.Promise[R]
  def reject(error: js.Any): scala.Unit
  def resolve(result: R): scala.Unit
}

