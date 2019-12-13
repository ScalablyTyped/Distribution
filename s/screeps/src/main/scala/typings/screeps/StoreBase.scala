package typings.screeps

import typings.screeps.screepsNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreBase[POSSIBLE_RESOURCES /* <: ResourceConstant */, UNLIMITED_STORE /* <: Boolean */] extends js.Object {
  /** Returns capacity of this store for the specified resource, or total capacity if resource is undefined. */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): Null | Double = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): Null | Double = js.native
  /** A shorthand for getCapacity(resource) - getUsedCapacity(resource). */
  def getFreeCapacity(): Double = js.native
  def getFreeCapacity(resource: ResourceConstant): Double = js.native
  /** Returns the capacity used by the specified resource, or total used capacity for general purpose stores if resource is undefined. */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): `0` | Double | Null = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): `0` | Double | Null = js.native
}

