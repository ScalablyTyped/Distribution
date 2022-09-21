package typings.screepsArena

import typings.screepsArena.constantsMod.BodyPartConstant
import typings.screepsArena.constantsMod.ERR_BUSY
import typings.screepsArena.constantsMod.ERR_FULL
import typings.screepsArena.constantsMod.ERR_INVALID_ARGS
import typings.screepsArena.constantsMod.ERR_INVALID_TARGET
import typings.screepsArena.constantsMod.ERR_NOT_ENOUGH_ENERGY
import typings.screepsArena.constantsMod.ResourceConstant
import typings.screepsArena.gamePrototypesMod.ConstructionSite
import typings.screepsArena.gamePrototypesMod.Creep
import typings.screepsArena.gamePrototypesMod.RoomPosition
import typings.screepsArena.gamePrototypesMod.Structure
import typings.screepsArena.gamePrototypesMod.StructureConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Error extends StObject {
    
    var error: js.UndefOr[ERR_INVALID_ARGS | ERR_INVALID_TARGET | ERR_FULL] = js.undefined
    
    var `object`: js.UndefOr[ConstructionSite] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: ERR_INVALID_ARGS | ERR_INVALID_TARGET | ERR_FULL): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setObject(value: ConstructionSite): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    }
  }
  
  trait ErrorObject extends StObject {
    
    var error: js.UndefOr[ERR_BUSY | ERR_INVALID_ARGS | ERR_NOT_ENOUGH_ENERGY] = js.undefined
    
    var `object`: js.UndefOr[Creep] = js.undefined
  }
  object ErrorObject {
    
    inline def apply(): ErrorObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorObject]
    }
    
    extension [Self <: ErrorObject](x: Self) {
      
      inline def setError(value: ERR_BUSY | ERR_INVALID_ARGS | ERR_NOT_ENOUGH_ENERGY): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setObject(value: Creep): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    }
  }
  
  trait Hits extends StObject {
    
    var hits: Double
    
    var `type`: BodyPartConstant
  }
  object Hits {
    
    inline def apply(hits: Double, `type`: BodyPartConstant): Hits = {
      val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hits]
    }
    
    extension [Self <: Hits](x: Self) {
      
      inline def setHits(value: Double): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
      
      inline def setType(value: BodyPartConstant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Object extends StObject {
    
    var error: js.UndefOr[ERR_BUSY | ERR_INVALID_ARGS | ERR_NOT_ENOUGH_ENERGY] = js.undefined
    
    var `object`: js.UndefOr[Structure[StructureConstant]] = js.undefined
  }
  object Object {
    
    inline def apply(): Object = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Object]
    }
    
    extension [Self <: Object](x: Self) {
      
      inline def setError(value: ERR_BUSY | ERR_INVALID_ARGS | ERR_NOT_ENOUGH_ENERGY): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setObject(value: Structure[StructureConstant]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    }
  }
  
  trait Pos extends StObject {
    
    var pos: RoomPosition
    
    var range: Double
  }
  object Pos {
    
    inline def apply(pos: RoomPosition, range: Double): Pos = {
      val __obj = js.Dynamic.literal(pos = pos.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pos]
    }
    
    extension [Self <: Pos](x: Self) {
      
      inline def setPos(value: RoomPosition): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined screeps-arena.game/prototypes.Store<screeps-arena.game/constants.ResourceConstant> */
  @js.native
  trait StoreResourceConstant extends StObject {
    
    var energy: Double = js.native
    
    /**
      * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
      * @param resource The type of the resource.
      * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
      */
    def getCapacity(): Double | Null = js.native
    def getCapacity(resource: ResourceConstant): Double | Null = js.native
    
    /**
      * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
      * @param resource The type of the resource.
      * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
      */
    def getFreeCapacity(): Double | Null = js.native
    def getFreeCapacity(resource: ResourceConstant): Double | Null = js.native
    
    /**
      * Returns the capacity used by the specified resource. For a general purpose store, it returns total used capacity if `resource` is undefined.
      * @param resource The type of the resource.
      * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
      */
    def getUsedCapacity(): Double | Null = js.native
    def getUsedCapacity(resource: ResourceConstant): Double | Null = js.native
  }
}
