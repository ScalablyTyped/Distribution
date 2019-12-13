package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericStoreBase extends js.Object {
  /** Returns capacity of this store for the specified resource, or total capacity if resource is undefined. */
  def getCapacity(): Double | Null = js.native
  def getCapacity(resource: ResourceConstant): Double | Null = js.native
  /** A shorthand for getCapacity(resource) - getUsedCapacity(resource). */
  def getFreeCapacity(): Double = js.native
  def getFreeCapacity(resource: ResourceConstant): Double = js.native
  /** Returns the capacity used by the specified resource, or total used capacity for general purpose stores if resource is undefined. */
  def getUsedCapacity(): Double | Null = js.native
  def getUsedCapacity(resource: ResourceConstant): Double | Null = js.native
}

