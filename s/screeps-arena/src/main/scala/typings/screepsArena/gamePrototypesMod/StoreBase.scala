package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.constantsMod.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreBase[POSSIBLE_RESOURCES /* <: ResourceConstant */] extends StObject {
  
  /**
    * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getCapacity(): Double | Null = js.native
  def getCapacity(resource: ResourceConstant): Double | Null = js.native
  
  /**
    * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
    * @param resource The type of the resource.
    * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getFreeCapacity(): Double | Null = js.native
  def getFreeCapacity(resource: ResourceConstant): Double | Null = js.native
  
  /**
    * Returns the capacity used by the specified resource. For a general purpose store, it returns total used capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
    */
  def getUsedCapacity(): Double | Null = js.native
  def getUsedCapacity(resource: ResourceConstant): Double | Null = js.native
}
