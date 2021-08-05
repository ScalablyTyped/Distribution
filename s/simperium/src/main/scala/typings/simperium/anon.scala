package typings.simperium

import org.scalablytyped.runtime.NumberDictionary
import typings.simperium.mod.Change
import typings.simperium.mod.DMPDiff
import typings.simperium.mod.DiffOp
import typings.simperium.mod.EntityId
import typings.simperium.mod.JSONDiff
import typings.simperium.mod.LocalQueuedChange
import typings.simperium.simperiumStrings.I
import typings.simperium.simperiumStrings.L
import typings.simperium.simperiumStrings.Plussign
import typings.simperium.simperiumStrings.`-_`
import typings.simperium.simperiumStrings.d
import typings.simperium.simperiumStrings.full
import typings.simperium.simperiumStrings.modify
import typings.simperium.simperiumStrings.r
import typings.simperium.simperiumStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with DiffOp[js.Any] {
    
    var o: `-_`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(o = "-")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setO(value: `-_`): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`[T]
    extends StObject
       with DiffOp[T] {
    
    var o: L
    
    var v: NumberDictionary[js.Any]
  }
  object `1` {
    
    inline def apply[T](v: NumberDictionary[js.Any]): `1`[T] = {
      val __obj = js.Dynamic.literal(o = "L", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[T]]
    }
    
    extension [Self <: `1`[?], T](x: Self & `1`[T]) {
      
      inline def setO(value: L): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setV(value: NumberDictionary[js.Any]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Accesstoken extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    inline def apply(): Accesstoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accesstoken]
    }
    
    extension [Self <: Accesstoken](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    }
  }
  
  trait Authorize extends StObject {
    
    def authorize(username: String, password: String): js.Promise[Accesstoken]
    
    def create(username: String, password: String): js.Promise[Accesstoken]
  }
  object Authorize {
    
    inline def apply(
      authorize: (String, String) => js.Promise[Accesstoken],
      create: (String, String) => js.Promise[Accesstoken]
    ): Authorize = {
      val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize), create = js.Any.fromFunction2(create))
      __obj.asInstanceOf[Authorize]
    }
    
    extension [Self <: Authorize](x: Self) {
      
      inline def setAuthorize(value: (String, String) => js.Promise[Accesstoken]): Self = StObject.set(x, "authorize", js.Any.fromFunction2(value))
      
      inline def setCreate(value: (String, String) => js.Promise[Accesstoken]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    }
  }
  
  trait Id[T]
    extends StObject
       with LocalQueuedChange[T] {
    
    var id: EntityId
    
    var `object`: T
    
    var `type`: modify
  }
  object Id {
    
    inline def apply[T](id: EntityId, `object`: T): Id[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("modify")
      __obj.asInstanceOf[Id[T]]
    }
    
    extension [Self <: Id[?], T](x: Self & Id[T]) {
      
      inline def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: modify): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait O[T]
    extends StObject
       with DiffOp[T] {
    
    var o: Plussign
    
    var v: T
  }
  object O {
    
    inline def apply[T](v: T): O[T] = {
      val __obj = js.Dynamic.literal(o = "+", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[O[T]]
    }
    
    extension [Self <: O[?], T](x: Self & O[T]) {
      
      inline def setO(value: Plussign): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setV(value: T): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait OV
    extends StObject
       with DiffOp[js.Any] {
    
    var o: I
    
    var v: Double
  }
  object OV {
    
    inline def apply(v: Double): OV = {
      val __obj = js.Dynamic.literal(o = "I", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[OV]
    }
    
    extension [Self <: OV](x: Self) {
      
      inline def setO(value: I): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Object[T]
    extends StObject
       with LocalQueuedChange[T] {
    
    var `object`: T
    
    var originalChange: Change[T]
    
    var `type`: full
  }
  object Object {
    
    inline def apply[T](`object`: T, originalChange: Change[T]): Object[T] = {
      val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("full")
      __obj.asInstanceOf[Object[T]]
    }
    
    extension [Self <: Object[?], T](x: Self & Object[T]) {
      
      inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOriginalChange(value: Change[T]): Self = StObject.set(x, "originalChange", value.asInstanceOf[js.Any])
      
      inline def setType(value: full): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sync extends StObject {
    
    var sync: Boolean
  }
  object Sync {
    
    inline def apply(sync: Boolean): Sync = {
      val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sync]
    }
    
    extension [Self <: Sync](x: Self) {
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with LocalQueuedChange[js.Any] {
    
    var id: EntityId
    
    var `type`: remove
  }
  object Type {
    
    inline def apply(id: EntityId): Type = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait V[T]
    extends StObject
       with DiffOp[T] {
    
    var o: r
    
    var v: T
  }
  object V {
    
    inline def apply[T](v: T): V[T] = {
      val __obj = js.Dynamic.literal(o = "r", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[V[T]]
    }
    
    extension [Self <: V[?], T](x: Self & V[T]) {
      
      inline def setO(value: r): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setV(value: T): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VDMPDiff
    extends StObject
       with DiffOp[js.Any] {
    
    var o: d
    
    var v: DMPDiff
  }
  object VDMPDiff {
    
    inline def apply(v: DMPDiff): VDMPDiff = {
      val __obj = js.Dynamic.literal(o = "d", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[VDMPDiff]
    }
    
    extension [Self <: VDMPDiff](x: Self) {
      
      inline def setO(value: d): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setV(value: DMPDiff): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VJSONDiff[T]
    extends StObject
       with DiffOp[T] {
    
    var o: typings.simperium.simperiumStrings.O
    
    var v: JSONDiff[T]
  }
  object VJSONDiff {
    
    inline def apply[T](v: JSONDiff[T]): VJSONDiff[T] = {
      val __obj = js.Dynamic.literal(o = "O", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[VJSONDiff[T]]
    }
    
    extension [Self <: VJSONDiff[?], T](x: Self & VJSONDiff[T]) {
      
      inline def setO(value: typings.simperium.simperiumStrings.O): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setV(value: JSONDiff[T]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
