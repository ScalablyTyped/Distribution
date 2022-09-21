package typings.screepsArena.gamePrototypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("game/prototypes", "StructureWall")
@js.native
open class StructureWallCls ()
  extends StObject
     with Structure[STRUCTURE_WALL] {
  def this(id: Id[typings.screepsArena.gamePrototypesMod.StructureWall]) = this()
  
  /**
    * X position in the room. Can be undefined if `.exists` is false
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * Y position in the room. Can be undefined if `.exists` is false
    */
  /* CompleteClass */
  var y: Double = js.native
}
