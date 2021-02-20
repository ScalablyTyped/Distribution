package typings.screeps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerCreepConstructor extends ConstructorById[PowerCreep] {
  
  /**
    * A static method to create new Power Creep instance in your account. It will be added in an unspawned state,
    * use spawn method to spawn it in the world.
    *
    * You need one free Power Level in your account to perform this action.
    *
    * @param name The name of the power creep.
    * @param className The class of the new power creep, one of the `POWER_CLASS` constants
    */
  def create(name: String, className: PowerClassConstant): OK | ERR_NAME_EXISTS | ERR_NOT_ENOUGH_RESOURCES = js.native
}
