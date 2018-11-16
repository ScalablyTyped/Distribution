package typings
package restangularLib.restangularMod.restangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollectionPromise[T]
  extends angularLib.angularMod.angularNs.IPromise[js.Array[js.Array[T]]] {
  @JSName("$object")
  var $object: js.Array[T] = js.native
  def call(methodName: java.lang.String): ICollectionPromise[T] = js.native
  def call(methodName: java.lang.String, params: js.Any): ICollectionPromise[T] = js.native
  def get(fieldName: java.lang.String): ICollectionPromise[T] = js.native
  def push(`object`: js.Any): ICollectionPromise[T] = js.native
}

