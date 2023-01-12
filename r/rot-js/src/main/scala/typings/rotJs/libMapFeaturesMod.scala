package typings.rotJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapFeaturesMod {
  
  @JSImport("rot-js/lib/map/features", "Corridor")
  @js.native
  open class Corridor protected ()
    extends StObject
       with Feature {
    def this(startX: Double, startY: Double, endX: Double, endY: Double) = this()
    
    var _endX: Double = js.native
    
    var _endY: Double = js.native
    
    var _endsWithAWall: Boolean = js.native
    
    var _startX: Double = js.native
    
    var _startY: Double = js.native
    
    /* CompleteClass */
    override def create(digCallback: DigCallback): Unit = js.native
    
    def createPriorityWalls(priorityWallCallback: js.Function2[/* x */ Double, /* y */ Double, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def debug(): Unit = js.native
    
    /* CompleteClass */
    override def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean = js.native
  }
  /* static members */
  object Corridor {
    
    @JSImport("rot-js/lib/map/features", "Corridor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: CorridorOptions): Corridor = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandomAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Corridor]
  }
  
  @JSImport("rot-js/lib/map/features", "Room")
  @js.native
  open class Room protected ()
    extends StObject
       with Feature {
    def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Double, doorY: Double) = this()
    def this(x1: Double, y1: Double, x2: Double, y2: Double, doorX: Unit, doorY: Double) = this()
    
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
  object Room {
    
    @JSImport("rot-js/lib/map/features", "Room")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Room of random size within a given dimensions
      */
    inline def createRandom(availWidth: Double, availHeight: Double, options: RoomOptions): Room = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandom")(availWidth.asInstanceOf[js.Any], availHeight.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Room]
    
    /**
      * Room of random size, with a given doors and direction
      */
    inline def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: RoomOptions): Room = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandomAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Room]
    
    /**
      * Room of random size, positioned around center coords
      */
    inline def createRandomCenter(cx: Double, cy: Double, options: RoomOptions): Room = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandomCenter")(cx.asInstanceOf[js.Any], cy.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Room]
  }
  
  trait CorridorOptions extends StObject {
    
    var corridorLength: js.Tuple2[Double, Double]
  }
  object CorridorOptions {
    
    inline def apply(corridorLength: js.Tuple2[Double, Double]): CorridorOptions = {
      val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[CorridorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CorridorOptions] (val x: Self) extends AnyVal {
      
      inline def setCorridorLength(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "corridorLength", value.asInstanceOf[js.Any])
    }
  }
  
  type DigCallback = js.Function3[/* x */ Double, /* y */ Double, /* value */ Double, Unit]
  
  /**
    * @class Dungeon feature; has own .create() method
    */
  trait Feature extends StObject {
    
    def create(digCallback: DigCallback): Unit
    
    def debug(): Unit
    
    def isValid(isWallCallback: TestPositionCallback, canBeDugCallback: TestPositionCallback): Boolean
  }
  object Feature {
    
    inline def apply(
      create: DigCallback => Unit,
      debug: () => Unit,
      isValid: (TestPositionCallback, TestPositionCallback) => Boolean
    ): Feature = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), debug = js.Any.fromFunction0(debug), isValid = js.Any.fromFunction2(isValid))
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: DigCallback => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDebug(value: () => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction0(value))
      
      inline def setIsValid(value: (TestPositionCallback, TestPositionCallback) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
    }
  }
  
  trait FeatureConstructor extends StObject {
    
    def createRandomAt(x: Double, y: Double, dx: Double, dy: Double, options: FeatureOptions): Feature
  }
  object FeatureConstructor {
    
    inline def apply(createRandomAt: (Double, Double, Double, Double, FeatureOptions) => Feature): FeatureConstructor = {
      val __obj = js.Dynamic.literal(createRandomAt = js.Any.fromFunction5(createRandomAt))
      __obj.asInstanceOf[FeatureConstructor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureConstructor] (val x: Self) extends AnyVal {
      
      inline def setCreateRandomAt(value: (Double, Double, Double, Double, FeatureOptions) => Feature): Self = StObject.set(x, "createRandomAt", js.Any.fromFunction5(value))
    }
  }
  
  trait FeatureOptions
    extends StObject
       with RoomOptions
       with CorridorOptions
  object FeatureOptions {
    
    inline def apply(
      corridorLength: js.Tuple2[Double, Double],
      roomHeight: js.Tuple2[Double, Double],
      roomWidth: js.Tuple2[Double, Double]
    ): FeatureOptions = {
      val __obj = js.Dynamic.literal(corridorLength = corridorLength.asInstanceOf[js.Any], roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureOptions]
    }
  }
  
  trait RoomOptions extends StObject {
    
    var roomHeight: js.Tuple2[Double, Double]
    
    var roomWidth: js.Tuple2[Double, Double]
  }
  object RoomOptions {
    
    inline def apply(roomHeight: js.Tuple2[Double, Double], roomWidth: js.Tuple2[Double, Double]): RoomOptions = {
      val __obj = js.Dynamic.literal(roomHeight = roomHeight.asInstanceOf[js.Any], roomWidth = roomWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomOptions] (val x: Self) extends AnyVal {
      
      inline def setRoomHeight(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomHeight", value.asInstanceOf[js.Any])
      
      inline def setRoomWidth(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "roomWidth", value.asInstanceOf[js.Any])
    }
  }
  
  type TestPositionCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
}
