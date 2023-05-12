package typings.shippo.mod

import typings.shippo.mod.Refund.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refund
  extends StObject
     with Metadata {
  
  var status: js.UndefOr[Status] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
  
  var transaction: js.UndefOr[String] = js.undefined
}
object Refund {
  
  inline def apply(object_created: String, object_id: String, object_owner: String, object_updated: String): Refund = {
    val __obj = js.Dynamic.literal(object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Refund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Refund] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.shippo.shippoStrings.QUEUED
    - typings.shippo.shippoStrings.PENDING
    - typings.shippo.shippoStrings.SUCCESS
    - typings.shippo.shippoStrings.ERROR
  */
  trait Status extends StObject
  object Status {
    
    inline def ERROR: typings.shippo.shippoStrings.ERROR = "ERROR".asInstanceOf[typings.shippo.shippoStrings.ERROR]
    
    inline def PENDING: typings.shippo.shippoStrings.PENDING = "PENDING".asInstanceOf[typings.shippo.shippoStrings.PENDING]
    
    inline def QUEUED: typings.shippo.shippoStrings.QUEUED = "QUEUED".asInstanceOf[typings.shippo.shippoStrings.QUEUED]
    
    inline def SUCCESS: typings.shippo.shippoStrings.SUCCESS = "SUCCESS".asInstanceOf[typings.shippo.shippoStrings.SUCCESS]
  }
}
