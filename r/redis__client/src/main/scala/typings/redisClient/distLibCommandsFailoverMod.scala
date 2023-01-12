package typings.redisClient

import typings.redisClient.anon.FORCE
import typings.redisClient.redisClientBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCommandsFailoverMod {
  
  @JSImport("@redis/client/dist/lib/commands/FAILOVER", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformArguments(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")().asInstanceOf[js.Array[String]]
  inline def transformArguments(options: FailoverOptions): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[String]
  
  trait FailoverOptions extends StObject {
    
    var ABORT: js.UndefOr[`true`] = js.undefined
    
    var TIMEOUT: js.UndefOr[Double] = js.undefined
    
    var TO: js.UndefOr[FORCE] = js.undefined
  }
  object FailoverOptions {
    
    inline def apply(): FailoverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FailoverOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FailoverOptions] (val x: Self) extends AnyVal {
      
      inline def setABORT(value: `true`): Self = StObject.set(x, "ABORT", value.asInstanceOf[js.Any])
      
      inline def setABORTUndefined: Self = StObject.set(x, "ABORT", js.undefined)
      
      inline def setTIMEOUT(value: Double): Self = StObject.set(x, "TIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setTIMEOUTUndefined: Self = StObject.set(x, "TIMEOUT", js.undefined)
      
      inline def setTO(value: FORCE): Self = StObject.set(x, "TO", value.asInstanceOf[js.Any])
      
      inline def setTOUndefined: Self = StObject.set(x, "TO", js.undefined)
    }
  }
}
