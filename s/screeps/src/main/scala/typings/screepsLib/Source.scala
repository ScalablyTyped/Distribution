package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An energy source object. Can be harvested by creeps with a WORK body part.
  */
trait Source extends RoomObject {
  /**
    * The remaining amount of energy.
    */
  var energy: scala.Double
  /**
    * The total amount of energy in the source. Equals to 3000 in most cases.
    */
  var energyCapacity: scala.Double
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  var id: java.lang.String
  /**
    * If you can get an instance of Source, you can see it.
    * If you can see a Source, you can see the room it's in.
    */
  @JSName("room")
  var room_Source: Room
  /**
    * The remaining time after which the source will be refilled.
    */
  var ticksToRegeneration: scala.Double
}

