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
    
    @scala.inline
    def apply(): `0` = {
      val __obj = js.Dynamic.literal(o = "-")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setO(value: `-_`): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`[T]
    extends StObject
       with DiffOp[T] {
    
    var o: L
    
    var v: NumberDictionary[js.Any]
  }
  object `1` {
    
    @scala.inline
    def apply[T](v: NumberDictionary[js.Any]): `1`[T] = {
      val __obj = js.Dynamic.literal(o = "L", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`[T]]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`[?], T] (val x: Self & `1`[T]) extends AnyVal {
      
      @scala.inline
      def setO(value: L): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: NumberDictionary[js.Any]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait Accesstoken extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    @scala.inline
    def apply(): Accesstoken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    }
  }
  
  trait Authorize extends StObject {
    
    def authorize(username: String, password: String): js.Promise[Accesstoken]
    
    def create(username: String, password: String): js.Promise[Accesstoken]
  }
  object Authorize {
    
    @scala.inline
    def apply(
      authorize: (String, String) => js.Promise[Accesstoken],
      create: (String, String) => js.Promise[Accesstoken]
    ): Authorize = {
      val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize), create = js.Any.fromFunction2(create))
      __obj.asInstanceOf[Authorize]
    }
    
    @scala.inline
    implicit class AuthorizeMutableBuilder[Self <: Authorize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorize(value: (String, String) => js.Promise[Accesstoken]): Self = StObject.set(x, "authorize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreate(value: (String, String) => js.Promise[Accesstoken]): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
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
    
    @scala.inline
    def apply[T](id: EntityId, `object`: T): Id[T] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("modify")
      __obj.asInstanceOf[Id[T]]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id[?], T] (val x: Self & Id[T]) extends AnyVal {
      
      @scala.inline
      def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: modify): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait O[T]
    extends StObject
       with DiffOp[T] {
    
    var o: Plussign
    
    var v: T
  }
  object O {
    
    @scala.inline
    def apply[T](v: T): O[T] = {
      val __obj = js.Dynamic.literal(o = "+", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[O[T]]
    }
    
    @scala.inline
    implicit class OMutableBuilder[Self <: O[?], T] (val x: Self & O[T]) extends AnyVal {
      
      @scala.inline
      def setO(value: Plussign): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: T): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait OV
    extends StObject
       with DiffOp[js.Any] {
    
    var o: I
    
    var v: Double
  }
  object OV {
    
    @scala.inline
    def apply(v: Double): OV = {
      val __obj = js.Dynamic.literal(o = "I", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[OV]
    }
    
    @scala.inline
    implicit class OVMutableBuilder[Self <: OV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setO(value: I): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply[T](`object`: T, originalChange: Change[T]): Object[T] = {
      val __obj = js.Dynamic.literal(originalChange = originalChange.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("full")
      __obj.asInstanceOf[Object[T]]
    }
    
    @scala.inline
    implicit class ObjectMutableBuilder[Self <: Object[?], T] (val x: Self & Object[T]) extends AnyVal {
      
      @scala.inline
      def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalChange(value: Change[T]): Self = StObject.set(x, "originalChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: full): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sync extends StObject {
    
    var sync: Boolean
  }
  object Sync {
    
    @scala.inline
    def apply(sync: Boolean): Sync = {
      val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sync]
    }
    
    @scala.inline
    implicit class SyncMutableBuilder[Self <: Sync] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with LocalQueuedChange[js.Any] {
    
    var id: EntityId
    
    var `type`: remove
  }
  object Type {
    
    @scala.inline
    def apply(id: EntityId): Type = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("remove")
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: EntityId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait V[T]
    extends StObject
       with DiffOp[T] {
    
    var o: r
    
    var v: T
  }
  object V {
    
    @scala.inline
    def apply[T](v: T): V[T] = {
      val __obj = js.Dynamic.literal(o = "r", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[V[T]]
    }
    
    @scala.inline
    implicit class VMutableBuilder[Self <: V[?], T] (val x: Self & V[T]) extends AnyVal {
      
      @scala.inline
      def setO(value: r): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: T): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VDMPDiff
    extends StObject
       with DiffOp[js.Any] {
    
    var o: d
    
    var v: DMPDiff
  }
  object VDMPDiff {
    
    @scala.inline
    def apply(v: DMPDiff): VDMPDiff = {
      val __obj = js.Dynamic.literal(o = "d", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[VDMPDiff]
    }
    
    @scala.inline
    implicit class VDMPDiffMutableBuilder[Self <: VDMPDiff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setO(value: d): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: DMPDiff): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  trait VJSONDiff[T]
    extends StObject
       with DiffOp[T] {
    
    var o: typings.simperium.simperiumStrings.O
    
    var v: JSONDiff[T]
  }
  object VJSONDiff {
    
    @scala.inline
    def apply[T](v: JSONDiff[T]): VJSONDiff[T] = {
      val __obj = js.Dynamic.literal(o = "O", v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[VJSONDiff[T]]
    }
    
    @scala.inline
    implicit class VJSONDiffMutableBuilder[Self <: VJSONDiff[?], T] (val x: Self & VJSONDiff[T]) extends AnyVal {
      
      @scala.inline
      def setO(value: typings.simperium.simperiumStrings.O): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: JSONDiff[T]): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
}
