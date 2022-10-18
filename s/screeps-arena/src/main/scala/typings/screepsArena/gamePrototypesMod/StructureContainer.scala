package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.anon.StoreResourceConstant
import typings.screepsArena.gameConstantsMod._BuildableStructure
import typings.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructureContainer
  extends StObject
     with OwnedStructure[STRUCTURE_CONTAINER]
     with _BuildableStructure {
  
  /**
    * A Store object that contains a cargo of this structure. Spawns can contain only energy.
    */
  var store: StoreResourceConstant = js.native
}
object StructureContainer {
  
  inline def apply: StructureContainerConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureContainer").asInstanceOf[StructureContainerConstructor]
}
