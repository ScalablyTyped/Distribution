package typings.screepsArena

import typings.screepsArena.anon.Error
import typings.screepsArena.gameConstantsMod.BuildableStructure
import typings.screepsArena.gameConstantsMod.DirectionConstant
import typings.screepsArena.gameConstantsMod.TERRAIN_SWAMP
import typings.screepsArena.gameConstantsMod.TERRAIN_WALL
import typings.screepsArena.gamePathFinderMod.FindPathOpts
import typings.screepsArena.gamePathFinderMod.PathStep
import typings.screepsArena.gamePrototypesMod.Constructor
import typings.screepsArena.gamePrototypesMod.GameObject
import typings.screepsArena.gamePrototypesMod.Id
import typings.screepsArena.gamePrototypesMod.RoomPosition
import typings.screepsArena.screepsArenaInts.`0`
import typings.screepsArena.screepsArenaInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gameUtilsMod {
  
  @JSImport("game/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConstructionSite(x: Double, y: Double, structureType: Constructor[BuildableStructure]): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("createConstructionSite")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], structureType.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  inline def findClosestByPath[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestByPath")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def findClosestByPath[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T], opts: FindPathOpts): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestByPath")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findClosestByRange[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestByRange")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def findInRange[T /* <: RoomPosition */](fromPos: RoomPosition, positions: js.Array[T], range: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findInRange")(fromPos.asInstanceOf[js.Any], positions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def findPath(fromPos: RoomPosition, toPos: RoomPosition): js.Array[PathStep] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPath")(fromPos.asInstanceOf[js.Any], toPos.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathStep]]
  inline def findPath(fromPos: RoomPosition, toPos: RoomPosition, opts: FindPathOpts): js.Array[PathStep] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPath")(fromPos.asInstanceOf[js.Any], toPos.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[PathStep]]
  
  inline def getDirection(dx: Double, dy: Double): DirectionConstant = (^.asInstanceOf[js.Dynamic].applyDynamic("getDirection")(dx.asInstanceOf[js.Any], dy.asInstanceOf[js.Any])).asInstanceOf[DirectionConstant]
  
  inline def getDistance(a: RoomPosition, b: RoomPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistance")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getHeapStatistics(): HeapStatistics = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeapStatistics")().asInstanceOf[HeapStatistics]
  
  inline def getObjectById[T](id: Id[T]): T | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectById")(id.asInstanceOf[js.Any]).asInstanceOf[T | Null]
  
  inline def getObjects(): js.Array[GameObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjects")().asInstanceOf[js.Array[GameObject]]
  
  inline def getObjectsByPrototype[T](prototype: Constructor[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getObjectsByPrototype")(prototype.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def getRange(a: RoomPosition, b: RoomPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRange")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTerrainAt(pos: RoomPosition): TERRAIN_WALL | TERRAIN_SWAMP | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("getTerrainAt")(pos.asInstanceOf[js.Any]).asInstanceOf[TERRAIN_WALL | TERRAIN_SWAMP | `0`]
  
  inline def getTime(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTime")().asInstanceOf[Double]
  
  trait HeapStatistics extends StObject {
    
    var does_zap_garbage: `0` | `1`
    
    var externally_allocated_size: Double
    
    var heap_size_limit: Double
    
    var malloced_memory: Double
    
    var peak_malloced_memory: Double
    
    var total_available_size: Double
    
    var total_heap_size: Double
    
    var total_heap_size_executable: Double
    
    var total_physical_size: Double
    
    var used_heap_size: Double
  }
  object HeapStatistics {
    
    inline def apply(
      does_zap_garbage: `0` | `1`,
      externally_allocated_size: Double,
      heap_size_limit: Double,
      malloced_memory: Double,
      peak_malloced_memory: Double,
      total_available_size: Double,
      total_heap_size: Double,
      total_heap_size_executable: Double,
      total_physical_size: Double,
      used_heap_size: Double
    ): HeapStatistics = {
      val __obj = js.Dynamic.literal(does_zap_garbage = does_zap_garbage.asInstanceOf[js.Any], externally_allocated_size = externally_allocated_size.asInstanceOf[js.Any], heap_size_limit = heap_size_limit.asInstanceOf[js.Any], malloced_memory = malloced_memory.asInstanceOf[js.Any], peak_malloced_memory = peak_malloced_memory.asInstanceOf[js.Any], total_available_size = total_available_size.asInstanceOf[js.Any], total_heap_size = total_heap_size.asInstanceOf[js.Any], total_heap_size_executable = total_heap_size_executable.asInstanceOf[js.Any], total_physical_size = total_physical_size.asInstanceOf[js.Any], used_heap_size = used_heap_size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeapStatistics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeapStatistics] (val x: Self) extends AnyVal {
      
      inline def setDoes_zap_garbage(value: `0` | `1`): Self = StObject.set(x, "does_zap_garbage", value.asInstanceOf[js.Any])
      
      inline def setExternally_allocated_size(value: Double): Self = StObject.set(x, "externally_allocated_size", value.asInstanceOf[js.Any])
      
      inline def setHeap_size_limit(value: Double): Self = StObject.set(x, "heap_size_limit", value.asInstanceOf[js.Any])
      
      inline def setMalloced_memory(value: Double): Self = StObject.set(x, "malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setPeak_malloced_memory(value: Double): Self = StObject.set(x, "peak_malloced_memory", value.asInstanceOf[js.Any])
      
      inline def setTotal_available_size(value: Double): Self = StObject.set(x, "total_available_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size(value: Double): Self = StObject.set(x, "total_heap_size", value.asInstanceOf[js.Any])
      
      inline def setTotal_heap_size_executable(value: Double): Self = StObject.set(x, "total_heap_size_executable", value.asInstanceOf[js.Any])
      
      inline def setTotal_physical_size(value: Double): Self = StObject.set(x, "total_physical_size", value.asInstanceOf[js.Any])
      
      inline def setUsed_heap_size(value: Double): Self = StObject.set(x, "used_heap_size", value.asInstanceOf[js.Any])
    }
  }
}
