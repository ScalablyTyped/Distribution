package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Map")
@js.native
object MapNs extends js.Object {
  @js.native
  class Arena ()
    extends rotDashJsLib.rotDashJsMod.Map
  
  @js.native
  class Cellular ()
    extends rotDashJsLib.rotDashJsMod.Map {
    def this(width: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double, options: rotDashJsLib.rotDashJsMod.CellularOptions) = this()
    def connect(callback: rotDashJsLib.rotDashJsMod.DigCallback): scala.Unit = js.native
    def connect(callback: rotDashJsLib.rotDashJsMod.DigCallback, value: scala.Double): scala.Unit = js.native
    def connect(
      callback: rotDashJsLib.rotDashJsMod.DigCallback,
      value: scala.Double,
      connectionCallback: rotDashJsLib.rotDashJsMod.DoorCallback
    ): scala.Unit = js.native
    def randomize(probability: scala.Double): this.type = js.native
    def serviceCallback(callback: rotDashJsLib.rotDashJsMod.DigCallback): scala.Unit = js.native
    def set(x: scala.Double, y: scala.Double, value: js.Any): scala.Unit = js.native
    def setOptions(options: rotDashJsLib.rotDashJsMod.CellularOptions): scala.Unit = js.native
  }
  
  @js.native
  class Digger () extends Dungeon {
    def this(width: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double, options: rotDashJsLib.rotDashJsMod.DiggerOptions) = this()
  }
  
  @js.native
  class DividedMaze ()
    extends rotDashJsLib.rotDashJsMod.Map
  
  @js.native
  class Dungeon ()
    extends rotDashJsLib.rotDashJsMod.Map {
    def getCorridors(): rotDashJsLib.rotDashJsMod.Global.Array[rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Corridor] = js.native
    def getRooms(): rotDashJsLib.rotDashJsMod.Global.Array[rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room] = js.native
  }
  
  @js.native
  class EllerMaze ()
    extends rotDashJsLib.rotDashJsMod.Map
  
  @js.native
  class Feature () extends js.Object {
    def create(digCallback: rotDashJsLib.rotDashJsMod.DigCallback): scala.Unit = js.native
    def debug(): scala.Unit = js.native
    def isValid(canBeDugCallback: rotDashJsLib.rotDashJsMod.CanBeDugCallback): scala.Boolean = js.native
  }
  
  @js.native
  class IceyMaze ()
    extends rotDashJsLib.rotDashJsMod.Map {
    def this(width: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double, regularity: scala.Double) = this()
  }
  
  @js.native
  class Rogue ()
    extends rotDashJsLib.rotDashJsMod.Map {
    def this(width: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double, options: rotDashJsLib.rotDashJsMod.RogueOptions) = this()
  }
  
  @js.native
  class Uniform () extends Dungeon {
    def this(width: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double) = this()
    def this(width: scala.Double, height: scala.Double, options: rotDashJsLib.rotDashJsMod.UniformOptions) = this()
  }
  
  /* static members */
  @js.native
  object Feature extends js.Object {
    def createRandomAt(x: scala.Double, y: scala.Double, dx: scala.Double, dy: scala.Double): rotDashJsLib.rotDashJsMod.MapNs.Feature = js.native
    def createRandomAt(
      x: scala.Double,
      y: scala.Double,
      dx: scala.Double,
      dy: scala.Double,
      options: rotDashJsLib.rotDashJsMod.FeatureOptions
    ): rotDashJsLib.rotDashJsMod.MapNs.Feature = js.native
  }
  
  @JSName("Feature")
  @js.native
  object FeatureNs extends js.Object {
    @js.native
    class Corridor protected () extends js.Object {
      def this(startX: scala.Double, startY: scala.Double, endX: scala.Double, endY: scala.Double) = this()
      def create(digCallback: rotDashJsLib.rotDashJsMod.DigCallback): scala.Boolean = js.native
      def createPriorityWalls(priorityWallCallback: rotDashJsLib.rotDashJsMod.DoorCallback): scala.Unit = js.native
      def debug(): scala.Unit = js.native
      def isValid(
        isWallCallback: rotDashJsLib.rotDashJsMod.IsWallCallback,
        canBeDugCallback: rotDashJsLib.rotDashJsMod.CanBeDugCallback
      ): scala.Boolean = js.native
    }
    
    @js.native
    class Room protected () extends js.Object {
      def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double) = this()
      def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, doorX: scala.Double) = this()
      def this(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double, doorX: scala.Double, doorY: scala.Double) = this()
      def addDoor(x: scala.Double, y: scala.Double): this.type = js.native
      def addDoors(isWallCallback: rotDashJsLib.rotDashJsMod.IsWallCallback): this.type = js.native
      def clearDoors(): this.type = js.native
      def create(digCallback: rotDashJsLib.rotDashJsMod.DigCallback): scala.Unit = js.native
      def debug(): scala.Unit = js.native
      def getBottom(): scala.Double = js.native
      def getCenter(): js.Tuple2[scala.Double, scala.Double] = js.native
      def getDoors(callback: rotDashJsLib.rotDashJsMod.DoorCallback): this.type = js.native
      def getLeft(): scala.Double = js.native
      def getRight(): scala.Double = js.native
      def getTop(): scala.Double = js.native
      def isValid(
        isWallCallback: rotDashJsLib.rotDashJsMod.IsWallCallback,
        canBeDugCallback: rotDashJsLib.rotDashJsMod.CanBeDugCallback
      ): scala.Boolean = js.native
    }
    
    /* static members */
    @js.native
    object Corridor extends js.Object {
      def createRandomAt(x: scala.Double, y: scala.Double, dx: scala.Double, dy: scala.Double): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Corridor = js.native
      def createRandomAt(
        x: scala.Double,
        y: scala.Double,
        dx: scala.Double,
        dy: scala.Double,
        options: rotDashJsLib.rotDashJsMod.CorridorOptions
      ): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Corridor = js.native
    }
    
    /* static members */
    @js.native
    object Room extends js.Object {
      def createRandom(availWidth: scala.Double, availHeight: scala.Double): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room = js.native
      def createRandom(
        availWidth: scala.Double,
        availHeight: scala.Double,
        options: rotDashJsLib.rotDashJsMod.RoomOptions
      ): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room = js.native
      def createRandomAt(x: scala.Double, y: scala.Double, dx: scala.Double, dy: scala.Double): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room = js.native
      def createRandomAt(
        x: scala.Double,
        y: scala.Double,
        dx: scala.Double,
        dy: scala.Double,
        options: rotDashJsLib.rotDashJsMod.RoomOptions
      ): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room = js.native
      def createRandomCenter(cx: scala.Double, cy: scala.Double): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room = js.native
      def createRandomCenter(cx: scala.Double, cy: scala.Double, options: rotDashJsLib.rotDashJsMod.RoomOptions): rotDashJsLib.rotDashJsMod.MapNs.FeatureNs.Room = js.native
    }
    
  }
  
}

