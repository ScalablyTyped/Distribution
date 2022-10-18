package typings.screepsArena.gamePrototypesMod

import typings.screepsArena.gamePathFinderMod.FindPathOpts
import typings.screepsArena.gamePathFinderMod.PathStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameObject
  extends StObject
     with RoomPosition {
  
  // constructor(id: any);
  /**
    * Returns true if this object is live in the game at the moment. Check this property to verify cached or newly created object instances.
    */
  var exists: Boolean = js.native
  
  /**
    * Find a position with the shortest path from the given position, or null otherwise.
    * @param opts object containing additional options:
    * ignore: array (objects which should be treated as obstacles during the search)
    * Any options supported by searchPath method
    */
  def findClosestByPath[T /* <: RoomPosition */](positions: js.Array[T]): T = js.native
  def findClosestByPath[T /* <: RoomPosition */](positions: js.Array[T], opts: FindPathOpts): T = js.native
  
  /**
    * Find a position with the shortest linear distance from the given position, or null otherwise.
    */
  def findClosestByRange[T /* <: RoomPosition */](positions: js.Array[T]): T = js.native
  
  /**
    * Find all positions from the given positions array within the specified linear range.
    */
  def findInRange[T /* <: RoomPosition */](positions: js.Array[T], range: Double): js.Array[T] = js.native
  
  /**
    * Returns the path from this object to another position. pos can be any object containing x and y properties. See /game/utils::findPath for details.
    */
  def findPathTo(pos: RoomPosition): js.Array[PathStep] = js.native
  def findPathTo(pos: RoomPosition, opts: FindPathOpts): js.Array[PathStep] = js.native
  
  /**
    * Get linear range to another position. pos may be any object containing x and y properties.
    */
  def getRangeTo(pos: RoomPosition): Double = js.native
  
  /**
    * A unique object identificator.
    * You can use {@link getObjectById} method to retrieve an object instance by its id.
    */
  var id: Id[this.type] = js.native
  
  def toJSON(): RoomObjectJSON = js.native
}
