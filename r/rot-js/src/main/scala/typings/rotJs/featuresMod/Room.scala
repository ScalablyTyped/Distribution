package typings.rotJs.featuresMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map/features", "Room")
@js.native
class Room protected () extends Feature {
  def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double) = this()
  def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double, doorY: Double) = this()
  var _doors: StringDictionary[Double] = js.native
  var _x1: Double = js.native
  var _x2: Double = js.native
  var _y1: Double = js.native
  var _y2: Double = js.native
  def addDoor(x: Double, y: Double): this.type = js.native
  def addDoors(isWallCallback: TestPositionCallback): this.type = js.native
  def clearDoors(): this.type = js.native
  /* CompleteClass */
  override def create(digCallback: DigCallback): Unit = js.native
  /* CompleteClass */
  override def debug(): Unit = js.native
  def getBottom(): Double = js.native
  def getCenter(): js.Array[Double] = js.native
  /**
    * @param {function}
    */
  def getDoors(cb: js.Function2[/* x */ Double, /* y */ Double, Unit]): this.type = js.native
  def getLeft(): Double = js.native
  def getRight(): Double = js.native
  def getTop(): Double = js.native
  /* CompleteClass */
  override def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean = js.native
}

/* static members */
@JSImport("rot-js/lib/map/features", "Room")
@js.native
object Room extends js.Object {
  /**
    * Room of random size within a given dimensions
    */
  def createRandom(availWidth: Double, availHeight: Double, options: RoomOptions): Room = js.native
  /**
    * Room of random size, with a given doors and direction
    */
  def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: RoomOptions): Room = js.native
  /**
    * Room of random size, positioned around center coords
    */
  def createRandomCenter(cx: Double, cy: Double, options: RoomOptions): Room = js.native
}

