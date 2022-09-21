package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Structure[T /* <: StructureConstant */]
  extends StObject
     with GameObject {
  
  /**
    * The current amount of hit points of the structure.
    */
  var hits: Double = js.native
  
  /**
    * The total amount of hit points of the structure.
    */
  var hitsMax: Double = js.native
  
  // /**
  //  * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
  //  */
  // id: Id<this>;
  /**
    * One of the STRUCTURE_* constants.
    */
  var structureType: T = js.native
}
object Structure {
  
  inline def apply: Constructor[Structure[StructureConstant]] = ^.asInstanceOf[js.Dynamic].selectDynamic("Structure").asInstanceOf[Constructor[Structure[StructureConstant]]]
}
