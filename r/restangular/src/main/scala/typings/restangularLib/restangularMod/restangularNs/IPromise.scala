package typings
package restangularLib.restangularMod.restangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T]
  extends angularLib.angularMod.angularNs.IPromise[T] {
  @JSName("$object")
  var $object: T = js.native
  def call(methodName: java.lang.String): IPromise[T] = js.native
  def call(methodName: java.lang.String, params: js.Any): IPromise[T] = js.native
  def get(fieldName: java.lang.String): IPromise[T] = js.native
}

