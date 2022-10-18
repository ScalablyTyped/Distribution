package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.anon.StoreResourceConstant
import typings.screepsArena.gameConstantsMod._BuildableStructure
import typings.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructureExtension
  extends StObject
     with OwnedStructure[STRUCTURE_EXTENSION]
     with _BuildableStructure {
  
  /**
    * A Store object that contains a cargo of this structure. Spawns can contain only energy.
    */
  var store: StoreResourceConstant = js.native
}
object StructureExtension {
  
  inline def apply: StructureExtensionConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("StructureExtension").asInstanceOf[StructureExtensionConstructor]
}
