package typings.restangular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollectionPromise[T]
  extends typings.angular.mod.IPromise[js.Array[T]] {
  @JSName("$object")
  var $object: js.Array[T] = js.native
  def call(methodName: String): ICollectionPromise[T] = js.native
  def call(methodName: String, params: js.Any): ICollectionPromise[T] = js.native
  def get(fieldName: String): ICollectionPromise[T] = js.native
  def push(`object`: js.Any): ICollectionPromise[T] = js.native
}

