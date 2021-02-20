package typings.screeps

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Container for custom navigation cost data.
  */
@js.native
trait CostMatrix
  extends /**
  * Creates a new CostMatrix containing 0's for all positions.
  */
Instantiable0[CostMatrix] {
  
  /**
    * Static method which deserializes a new CostMatrix using the return value of serialize.
    * @param val Whatever serialize returned
    */
  def deserialize(`val`: js.Array[Double]): CostMatrix = js.native
  
  /**
    * Get the cost of a position in this CostMatrix.
    * @param x X position in the room.
    * @param y Y position in the room.
    */
  def get(x: Double, y: Double): Double = js.native
  
  /**
    * Returns a compact representation of this CostMatrix which can be stored via JSON.stringify.
    */
  def serialize(): js.Array[Double] = js.native
  
  /**
    * Set the cost of a position in this CostMatrix.
    * @param x X position in the room.
    * @param y Y position in the room.
    * @param cost Cost of this position. Must be a whole number. A cost of 0 will use the terrain cost for that tile. A cost greater than or equal to 255 will be treated as unwalkable.
    */
  def set(x: Double, y: Double, cost: Double): js.UndefOr[scala.Nothing] = js.native
}
