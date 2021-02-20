package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featuresMod {
  
  @JSImport("rot-js/lib/map/features", "Corridor")
  @js.native
  class Corridor protected () extends Feature {
    def this(startX: Double, startY: Double, endX: Double, endY: Double) = this()
    
    var _endX: Double = js.native
    
    var _endY: Double = js.native
    
    var _endsWithAWall: Boolean = js.native
    
    var _startX: Double = js.native
    
    var _startY: Double = js.native
    
    def createPriorityWalls(priorityWallCallback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
  }
  /* static members */
  object Corridor {
    
    @JSImport("rot-js/lib/map/features", "Corridor.createRandomAt")
    @js.native
    def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: CorridorOptions): Corridor = js.native
  }
  
  @JSImport("rot-js/lib/map/features", "Room")
  @js.native
  class Room protected () extends Feature {
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: js.UndefOr[scala.Nothing], doorY: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double, doorY: Double) = this()
    
    var _doors: StringDictionary[Double] = js.native
    
    var _x1: Double = js.native
    
    var _x2: Double = js.native
    
    var _y1: Double = js.native
    
    var _y2: Double = js.native
    
    def addDoor(x: Double, y: Double): this.type = js.native
    
    def addDoors(isWallCallback: TestPositionCallback): this.type = js.native
    
    def clearDoors(): this.type = js.native
    
    def getBottom(): Double = js.native
    
    def getCenter(): js.Array[Double] = js.native
    
    /**
      * @param {function}
      */
    def getDoors(cb: js.Function2[/* x */ Double, /* y */ Double, Unit]): this.type = js.native
    
    def getLeft(): Double = js.native
    
    def getRight(): Double = js.native
    
    def getTop(): Double = js.native
  }
  /* static members */
  object Room {
    
    /**
      * Room of random size within a given dimensions
      */
    @JSImport("rot-js/lib/map/features", "Room.createRandom")
    @js.native
    def createRandom(availWidth: Double, availHeight: Double, options: RoomOptions): Room = js.native
    
    /**
      * Room of random size, with a given doors and direction
      */
    @JSImport("rot-js/lib/map/features", "Room.createRandomAt")
    @js.native
    def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: RoomOptions): Room = js.native
    
    /**
      * Room of random size, positioned around center coords
      */
    @JSImport("rot-js/lib/map/features", "Room.createRandomCenter")
    @js.native
    def createRandomCenter(cx: Double, cy: Double, options: RoomOptions): Room = js.native
  }
  
  @js.native
  trait CorridorOptions extends StObject {
    
    var corridorLength: js.Tuple2[Double, Double] = js.native
  }
  object CorridorOptions {
    
    @scala.inline
    def apply(corridorLength: js.Tuple2[Double, Double]): CorridorOptions = {
      val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorridorOptions]
    }
    
    @scala.inline
    implicit class CorridorOptionsMutableBuilder[Self <: CorridorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCorridorLength(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "corridorLength", value.asInstanceOf[js.Any])
    }
  }
  
  type DigCallback = js.Function3[/* x */ Double, /* y */ Double, /* value */ Double, Unit]
  
  /**
    * @class Dungeon feature; has own .create() method
    */
  @js.native
  trait Feature extends StObject {
    
    def create(digCallback: DigCallback): Unit = js.native
    
    def debug(): Unit = js.native
    
    def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean = js.native
  }
  object Feature {
    
    @scala.inline
    def apply(
      create: DigCallback => Unit,
      debug: () => Unit,
      isValid: (TestPositionCallback, TestPositionCallback) => Boolean
    ): Feature = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), debug = js.Any.fromFunction0(debug), isValid = js.Any.fromFunction2(isValid))
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit class FeatureMutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: DigCallback => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDebug(value: () => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsValid(value: (TestPositionCallback, TestPositionCallback) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait FeatureConstructor extends StObject {
    
    def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature = js.native
  }
  object FeatureConstructor {
    
    @scala.inline
    def apply(createRandomAt: (Double, Double, Double, Double, FeatureOptions) => Feature): FeatureConstructor = {
      val __obj = js.Dynamic.literal(createRandomAt = js.Any.fromFunction5(createRandomAt))
      __obj.asInstanceOf[FeatureConstructor]
    }
    
    @scala.inline
    implicit class FeatureConstructorMutableBuilder[Self <: FeatureConstructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateRandomAt(value: (Double, Double, Double, Double, FeatureOptions) => Feature): Self = StObject.set(x, "createRandomAt", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait FeatureOptions
    extends RoomOptions
       with CorridorOptions
  object FeatureOptions {
    
    @scala.inline
    def apply(
      corridorLength: js.Tuple2[Double, Double],
      roomHeight: js.Tuple2[Double, Double],
      roomWidth: js.Tuple2[Double, Double]
    ): FeatureOptions = {
      val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureOptions]
    }
  }
  
  @js.native
  trait RoomOptions extends StObject {
    
    var roomHeight: js.Tuple2[Double, Double] = js.native
    
    var roomWidth: js.Tuple2[Double, Double] = js.native
  }
  object RoomOptions {
    
    @scala.inline
    def apply(roomHeight: js.Tuple2[Double, Double], roomWidth: js.Tuple2[Double, Double]): RoomOptions = {
      val __obj = js.Dynamic.literal(roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomOptions]
    }
    
    @scala.inline
    implicit class RoomOptionsMutableBuilder[Self <: RoomOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type TestPositionCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
}
