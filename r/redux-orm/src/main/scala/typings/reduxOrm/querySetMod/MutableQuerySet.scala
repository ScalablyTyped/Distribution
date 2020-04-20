package typings.reduxOrm.querySetMod

import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.modelMod.IdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutableQuerySet[M /* <: AnyModel */, InstanceProps /* <: js.Object */] extends QuerySet[M, InstanceProps] {
  def add(entitiesToAdd: (IdType[M] | M)*): Unit = js.native
  def clear(): Unit = js.native
  def remove(entitiesToRemove: (IdType[M] | M)*): Unit = js.native
}

