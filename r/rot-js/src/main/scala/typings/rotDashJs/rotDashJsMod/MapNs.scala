package typings.rotDashJs.rotDashJsMod

import typings.rotDashJs.rotDashJsMod.Global.Array
import typings.rotDashJs.rotDashJsMod.MapNs.Dungeon
import typings.rotDashJs.rotDashJsMod.MapNs.Feature
import typings.rotDashJs.rotDashJsMod.MapNs.FeatureNs.Corridor
import typings.rotDashJs.rotDashJsMod.MapNs.FeatureNs.Room
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Map")
@js.native
object MapNs extends js.Object {
  @js.native
  class Arena () extends Map
  
  @js.native
  class Cellular () extends Map {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: CellularOptions) = this()
    def connect(callback: DigCallback): Unit = js.native
    def connect(callback: DigCallback, value: Double): Unit = js.native
    def connect(callback: DigCallback, value: Double, connectionCallback: DoorCallback): Unit = js.native
    def randomize(probability: Double): this.type = js.native
    def serviceCallback(callback: DigCallback): Unit = js.native
    def set(x: Double, y: Double, value: js.Any): Unit = js.native
    def setOptions(options: CellularOptions): Unit = js.native
  }
  
  @js.native
  class Digger () extends Dungeon {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: DiggerOptions) = this()
  }
  
  @js.native
  class DividedMaze () extends Map
  
  @js.native
  class Dungeon () extends Map {
    def getCorridors(): Array[Corridor] = js.native
    def getRooms(): Array[Room] = js.native
  }
  
  @js.native
  class EllerMaze () extends Map
  
  @js.native
  class Feature () extends js.Object {
    def create(digCallback: DigCallback): Unit = js.native
    def debug(): Unit = js.native
    def isValid(canBeDugCallback: CanBeDugCallback): Boolean = js.native
  }
  
  @js.native
  class IceyMaze () extends Map {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, regularity: Double) = this()
  }
  
  @js.native
  class Rogue () extends Map {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: RogueOptions) = this()
  }
  
  @js.native
  class Uniform () extends Dungeon {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: UniformOptions) = this()
  }
  
  /* static members */
  @js.native
  object Feature extends js.Object {
    def createRandomAt(x: Double, y: Double, dx: Double, dy: Double): Feature = js.native
    def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature = js.native
  }
  
  @JSName("Feature")
  @js.native
  object FeatureNs extends js.Object {
    @js.native
    class Corridor protected () extends js.Object {
      def this(startX: Double, startY: Double, endX: Double, endY: Double) = this()
      def create(digCallback: DigCallback): Boolean = js.native
      def createPriorityWalls(priorityWallCallback: DoorCallback): Unit = js.native
      def debug(): Unit = js.native
      def isValid(isWallCallback: IsWallCallback, canBeDugCallback: CanBeDugCallback): Boolean = js.native
    }
    
    @js.native
    class Room protected () extends js.Object {
      def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double) = this()
      def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double, doorY: Double) = this()
      def addDoor(x: Double, y: Double): this.type = js.native
      def addDoors(isWallCallback: IsWallCallback): this.type = js.native
      def clearDoors(): this.type = js.native
      def create(digCallback: DigCallback): Unit = js.native
      def debug(): Unit = js.native
      def getBottom(): Double = js.native
      def getCenter(): js.Tuple2[Double, Double] = js.native
      def getDoors(callback: DoorCallback): this.type = js.native
      def getLeft(): Double = js.native
      def getRight(): Double = js.native
      def getTop(): Double = js.native
      def isValid(isWallCallback: IsWallCallback, canBeDugCallback: CanBeDugCallback): Boolean = js.native
    }
    
    /* static members */
    @js.native
    object Corridor extends js.Object {
      def createRandomAt(x: Double, y: Double, dx: Double, dy: Double): Corridor = js.native
      def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: CorridorOptions): Corridor = js.native
    }
    
    /* static members */
    @js.native
    object Room extends js.Object {
      def createRandom(availWidth: Double, availHeight: Double): Room = js.native
      def createRandom(availWidth: Double, availHeight: Double, options: RoomOptions): Room = js.native
      def createRandomAt(x: Double, y: Double, dx: Double, dy: Double): Room = js.native
      def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: RoomOptions): Room = js.native
      def createRandomCenter(cx: Double, cy: Double): Room = js.native
      def createRandomCenter(cx: Double, cy: Double, options: RoomOptions): Room = js.native
    }
    
  }
  
}

