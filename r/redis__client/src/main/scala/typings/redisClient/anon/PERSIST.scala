package typings.redisClient.anon

import typings.redisClient.distLibCommandsGetexMod.GetExModes
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PERSIST
  extends StObject
     with GetExModes {
  
  var PERSIST: `true`
}
object PERSIST {
  
  inline def apply(): PERSIST = {
    val __obj = js.Dynamic.literal(PERSIST = true)
    __obj.asInstanceOf[PERSIST]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PERSIST] (val x: Self) extends AnyVal {
    
    inline def setPERSIST(value: `true`): Self = StObject.set(x, "PERSIST", value.asInstanceOf[js.Any])
  }
}
