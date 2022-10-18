package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreBase[POSSIBLE_RESOURCES /* <: ResourceConstant */, UNLIMITED_STORE /* <: Boolean */] extends StObject {
  
  /**
    * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: UNLIMITED_STORE extends true ? null : R extends undefined ? screeps.ResourceConstant extends POSSIBLE_RESOURCES ? number : null : R extends POSSIBLE_RESOURCES ? number : null */ js.Any = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: UNLIMITED_STORE extends true ? null : R extends undefined ? screeps.ResourceConstant extends POSSIBLE_RESOURCES ? number : null : R extends POSSIBLE_RESOURCES ? number : null */ js.Any = js.native
  
  /**
    * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
    * @param resource The type of the resource.
    * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends POSSIBLE_RESOURCES ? number : null : R extends POSSIBLE_RESOURCES ? number : null */ js.Any = js.native
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends POSSIBLE_RESOURCES ? number : null : R extends POSSIBLE_RESOURCES ? number : null */ js.Any = js.native
  
  /**
    * Returns the capacity used by the specified resource, or total used capacity for general purpose stores if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
    */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends POSSIBLE_RESOURCES ? number : null : R extends POSSIBLE_RESOURCES ? number : null */ js.Any = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends POSSIBLE_RESOURCES ? number : null : R extends POSSIBLE_RESOURCES ? number : null */ js.Any = js.native
}
