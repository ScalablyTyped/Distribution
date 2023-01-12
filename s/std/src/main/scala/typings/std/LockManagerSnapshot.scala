package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LockManagerSnapshot extends StObject {
  
  /* standard dom */
  var held: js.UndefOr[js.Array[LockInfo]] = js.undefined
  
  /* standard dom */
  var pending: js.UndefOr[js.Array[LockInfo]] = js.undefined
}
object LockManagerSnapshot {
  
  inline def apply(): LockManagerSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LockManagerSnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LockManagerSnapshot] (val x: Self) extends AnyVal {
    
    inline def setHeld(value: js.Array[LockInfo]): Self = StObject.set(x, "held", value.asInstanceOf[js.Any])
    
    inline def setHeldUndefined: Self = StObject.set(x, "held", js.undefined)
    
    inline def setHeldVarargs(value: LockInfo*): Self = StObject.set(x, "held", js.Array(value*))
    
    inline def setPending(value: js.Array[LockInfo]): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
    
    inline def setPendingVarargs(value: LockInfo*): Self = StObject.set(x, "pending", js.Array(value*))
  }
}
