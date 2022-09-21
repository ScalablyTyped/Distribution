package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.gamePrototypesMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OwnedStructure[T /* <: StructureConstant */]
  extends StObject
     with Structure[T] {
  
  /**
    * Whether this is your own structure. Walls and roads don't have this property as they are considered neutral structures.
    */
  var my: Boolean = js.native
}
object OwnedStructure {
  
  inline def apply: Constructor[OwnedStructure[StructureConstant]] = ^.asInstanceOf[js.Dynamic].selectDynamic("OwnedStructure").asInstanceOf[Constructor[OwnedStructure[StructureConstant]]]
}
