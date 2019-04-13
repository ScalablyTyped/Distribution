package typings
package restangularLib.restangularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T]
  extends angularLib.angularMod.IPromise[T] {
  @JSName("$object")
  var $object: T = js.native
  def call(methodName: java.lang.String): IPromise[T] = js.native
  def call(methodName: java.lang.String, params: js.Any): IPromise[T] = js.native
  def get(fieldName: java.lang.String): IPromise[T] = js.native
}

