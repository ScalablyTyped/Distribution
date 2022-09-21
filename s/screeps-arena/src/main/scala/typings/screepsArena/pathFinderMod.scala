package typings.screepsArena

import typings.screepsArena.anon.Pos
import typings.screepsArena.gamePrototypesMod.Constructor
import typings.screepsArena.gamePrototypesMod.RoomPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathFinderMod {
  
  @JSImport("game/path-finder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CostMatrix extends StObject {
    
    // /**
    //  * Creates a new CostMatrix containing 0's for all positions.
    //  */
    // new (): CostMatrix;
    var _bits: js.typedarray.Uint8Array
    
    /**
      * Static method which deserializes a new CostMatrix using the return value of serialize.
      * @param val Whatever serialize returned
      */
    def deserialize(`val`: js.Array[Double]): CostMatrix
    
    /**
      * Get the cost of a position in this CostMatrix.
      * @param x X position in the room.
      * @param y Y position in the room.
      */
    def get(x: Double, y: Double): Double
    
    /**
      * Returns a compact representation of this CostMatrix which can be stored via JSON.stringify.
      */
    def serialize(): js.Array[Double]
    
    /**
      * Set the cost of a position in this CostMatrix.
      * @param x X position in the room.
      * @param y Y position in the room.
      * @param cost Cost of this position. Must be a whole number. A cost of 0 will use the terrain cost for that tile. A cost greater than or equal to 255 will be treated as unwalkable.
      */
    def set(x: Double, y: Double, cost: Double): Unit
  }
  object CostMatrix {
    
    @JSImport("game/path-finder", "CostMatrix")
    @js.native
    val ^ : CostMatrixConstructor = js.native
    
    extension [Self <: CostMatrix](x: Self) {
      
      inline def setDeserialize(value: js.Array[Double] => CostMatrix): Self = StObject.set(x, "deserialize", js.Any.fromFunction1(value))
      
      inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSerialize(value: () => js.Array[Double]): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
      
      inline def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
      
      inline def set_bits(value: js.typedarray.Uint8Array): Self = StObject.set(x, "_bits", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("game/path-finder", "CostMatrix")
  @js.native
  open class CostMatrixCls ()
    extends StObject
       with CostMatrix {
    
    // /**
    //  * Creates a new CostMatrix containing 0's for all positions.
    //  */
    // new (): CostMatrix;
    /* CompleteClass */
    var _bits: js.typedarray.Uint8Array = js.native
    
    /**
      * Static method which deserializes a new CostMatrix using the return value of serialize.
      * @param val Whatever serialize returned
      */
    /* CompleteClass */
    override def deserialize(`val`: js.Array[Double]): CostMatrix = js.native
    
    /**
      * Get the cost of a position in this CostMatrix.
      * @param x X position in the room.
      * @param y Y position in the room.
      */
    /* CompleteClass */
    override def get(x: Double, y: Double): Double = js.native
    
    /**
      * Returns a compact representation of this CostMatrix which can be stored via JSON.stringify.
      */
    /* CompleteClass */
    override def serialize(): js.Array[Double] = js.native
    
    /**
      * Set the cost of a position in this CostMatrix.
      * @param x X position in the room.
      * @param y Y position in the room.
      * @param cost Cost of this position. Must be a whole number. A cost of 0 will use the terrain cost for that tile. A cost greater than or equal to 255 will be treated as unwalkable.
      */
    /* CompleteClass */
    override def set(x: Double, y: Double, cost: Double): Unit = js.native
  }
  
  inline def searchPath(origin: RoomPosition, goal: js.Array[RoomPosition | Pos]): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  inline def searchPath(origin: RoomPosition, goal: js.Array[RoomPosition | Pos], opts: FindPathOpts): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  inline def searchPath(origin: RoomPosition, goal: Pos): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  inline def searchPath(origin: RoomPosition, goal: Pos, opts: FindPathOpts): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  inline def searchPath(origin: RoomPosition, goal: RoomPosition): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  inline def searchPath(origin: RoomPosition, goal: RoomPosition, opts: FindPathOpts): FindPathResult = (^.asInstanceOf[js.Dynamic].applyDynamic("searchPath")(origin.asInstanceOf[js.Any], goal.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FindPathResult]
  
  @js.native
  trait CostMatrixConstructor
    extends StObject
       with Constructor[CostMatrix]
       with CostMatrix
  
  trait FindPathOpts extends StObject {
    
    /**
      * CostMatrix (Container for custom navigation cost data)
      */
    var costMatrix: js.UndefOr[CostMatrix] = js.undefined
    
    // // /**
    // //  * Treat squares with creeps as walkable. Can be useful with too many moving creeps around or in some other cases. The default
    // //  * value is false.
    // //  */
    // // ignoreCreeps?: boolean;
    // // /**
    // //  * Treat squares with destructible structures (constructed walls, ramparts, spawns, extensions) as walkable. Use this flag when
    // //  * you need to move through a territory blocked by hostile structures. If a creep with an ATTACK body part steps on such a square,
    // //  * it automatically attacks the structure. The default value is false.
    // //  */
    // // ignoreDestructibleStructures?: boolean;
    // // /**
    // //  * Ignore road structures. Enabling this option can speed up the search. The default value is false. This is only used when the
    // //  * new PathFinder is enabled.
    // //  */
    // // ignoreRoads?: boolean;
    // // /**
    // //  * You can use this callback to modify a CostMatrix for any room during the search. The callback accepts two arguments, roomName
    // //  * and costMatrix. Use the costMatrix instance to make changes to the positions costs. If you return a new matrix from this callback,
    // //  * it will be used instead of the built-in cached one. This option is only used when the new PathFinder is enabled.
    // //  *
    // //  * @param roomName The name of the room.
    // //  * @param costMatrix The current CostMatrix
    // //  * @returns The new CostMatrix to use
    // //  */
    // // costCallback?(roomName: string, costMatrix: CostMatrix): void | CostMatrix;
    // // /**
    // //  * An array of the room's objects or RoomPosition objects which should be treated as walkable tiles during the search. This option
    // //  * cannot be used when the new PathFinder is enabled (use costCallback option instead).
    // //  */
    // // ignore?: any[] | RoomPosition[];
    /**
      * (Instead of searching for a path to the goals this will search for a path away from the goals.
      * The cheapest path that is out of range of every goal will be returned.
      * The default is false)
      */
    var flee: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Weight to apply to the heuristic in the A* formula F = G + weight * H. Use this option only if you understand the underlying
      * A* algorithm mechanics! The default value is 1.2.
      */
    var heuristicWeight: js.UndefOr[Double] = js.undefined
    
    /**
      * (The maximum allowed cost of the path returned. The default is Infinity.)
      */
    var maxCost: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum limit of possible pathfinding operations. You can limit CPU time used for the search based on ratio 1 op ~ 0.001 CPU.
      * The default value is 2000.
      */
    var maxOps: js.UndefOr[Double] = js.undefined
    
    /**
      * Cost for walking on plain positions. The default is 1.
      */
    var plainCost: js.UndefOr[Double] = js.undefined
    
    // // /**
    // //  * If true, the result path will be serialized using Room.serializePath. The default is false.
    // //  */
    // // serialize?: boolean;
    /**
      * Path to within (range) tiles of target tile. The default is to path to the tile that the target is on (0).
      */
    var range: js.UndefOr[Double] = js.undefined
    
    /**
      * Cost for walking on swamp positions. The default is 5.
      */
    var swampCost: js.UndefOr[Double] = js.undefined
  }
  object FindPathOpts {
    
    inline def apply(): FindPathOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindPathOpts]
    }
    
    extension [Self <: FindPathOpts](x: Self) {
      
      inline def setCostMatrix(value: CostMatrix): Self = StObject.set(x, "costMatrix", value.asInstanceOf[js.Any])
      
      inline def setCostMatrixUndefined: Self = StObject.set(x, "costMatrix", js.undefined)
      
      inline def setFlee(value: Boolean): Self = StObject.set(x, "flee", value.asInstanceOf[js.Any])
      
      inline def setFleeUndefined: Self = StObject.set(x, "flee", js.undefined)
      
      inline def setHeuristicWeight(value: Double): Self = StObject.set(x, "heuristicWeight", value.asInstanceOf[js.Any])
      
      inline def setHeuristicWeightUndefined: Self = StObject.set(x, "heuristicWeight", js.undefined)
      
      inline def setMaxCost(value: Double): Self = StObject.set(x, "maxCost", value.asInstanceOf[js.Any])
      
      inline def setMaxCostUndefined: Self = StObject.set(x, "maxCost", js.undefined)
      
      inline def setMaxOps(value: Double): Self = StObject.set(x, "maxOps", value.asInstanceOf[js.Any])
      
      inline def setMaxOpsUndefined: Self = StObject.set(x, "maxOps", js.undefined)
      
      inline def setPlainCost(value: Double): Self = StObject.set(x, "plainCost", value.asInstanceOf[js.Any])
      
      inline def setPlainCostUndefined: Self = StObject.set(x, "plainCost", js.undefined)
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSwampCost(value: Double): Self = StObject.set(x, "swampCost", value.asInstanceOf[js.Any])
      
      inline def setSwampCostUndefined: Self = StObject.set(x, "swampCost", js.undefined)
    }
  }
  
  trait FindPathResult extends StObject {
    
    /**
      * The total cost of the path as derived from `plainCost`, `swampCost`, and given `CostMatrix` instance
      */
    var cost: Double
    
    /**
      * If the pathfinder fails to find a complete path, this will be true
      */
    var incomplete: Boolean
    
    /**
      * Total number of operations performed before this path was calculated
      */
    var ops: Double
    
    /**
      * The path found as an array of objects containing x and y properties
      */
    var path: js.Array[PathStep]
  }
  object FindPathResult {
    
    inline def apply(cost: Double, incomplete: Boolean, ops: Double, path: js.Array[PathStep]): FindPathResult = {
      val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindPathResult]
    }
    
    extension [Self <: FindPathResult](x: Self) {
      
      inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
      
      inline def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      inline def setOps(value: Double): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[PathStep]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: PathStep*): Self = StObject.set(x, "path", js.Array(value*))
    }
  }
  
  trait MoveToOpts
    extends StObject
       with FindPathOpts {
    
    // // /**
    // //  * This option enables reusing the path found along multiple game ticks. It allows to save CPU time, but can result in a slightly
    // //  * slower creep reaction behavior. The path is stored into the creep's memory to the `_move` property. The `reusePath` value defines
    // //  * the amount of ticks which the path should be reused for. The default value is 5. Increase the amount to save more CPU, decrease
    // //  * to make the movement more consistent. Set to 0 if you want to disable path reusing.
    // //  */
    // // reusePath?: number;
    // // /**
    // //  * If `reusePath` is enabled and this option is set to true, the path will be stored in memory in the short serialized form using
    // //  * `Room.serializePath`. The default value is true.
    // //  */
    // // serializeMemory?: boolean;
    // // /**
    // //  * If this option is set to true, `moveTo` method will return `ERR_NOT_FOUND` if there is no memorized path to reuse. This can
    // //  * significantly save CPU time in some cases. The default value is false.
    // //  */
    // // noPathFinding?: boolean;
    // // /**
    // //  * Draw a line along the creep’s path using `RoomVisual.poly`. You can provide either an empty object or custom style parameters.
    // //  */
    // // visualizePathStyle?: PolyStyle;
    /**
      * An array of the room's objects or RoomPosition objects which should be treated as obstacles during the search. This option cannot
      * be used when the new PathFinder is enabled (use costCallback option instead).
      */
    var ignore: js.UndefOr[js.Array[Any | RoomPosition]] = js.undefined
  }
  object MoveToOpts {
    
    inline def apply(): MoveToOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToOpts]
    }
    
    extension [Self <: MoveToOpts](x: Self) {
      
      inline def setIgnore(value: js.Array[Any | RoomPosition]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (Any | RoomPosition)*): Self = StObject.set(x, "ignore", js.Array(value*))
    }
  }
  
  trait PathStep extends StObject {
    
    var x: Double
    
    // dx: number;
    var y: Double
  }
  object PathStep {
    
    inline def apply(x: Double, y: Double): PathStep = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PathStep]
    }
    
    extension [Self <: PathStep](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
