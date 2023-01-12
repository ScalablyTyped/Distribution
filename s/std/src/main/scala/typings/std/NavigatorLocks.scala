package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait NavigatorLocks extends StObject {
  
  /* standard dom */
  val locks: LockManager
}
object NavigatorLocks {
  
  inline def apply(locks: LockManager): NavigatorLocks = {
    val __obj = js.Dynamic.literal(locks = locks.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigatorLocks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigatorLocks] (val x: Self) extends AnyVal {
    
    inline def setLocks(value: LockManager): Self = StObject.set(x, "locks", value.asInstanceOf[js.Any])
  }
}
