package typings.redisBloom

import typings.redisBloom.redisBloomBooleans.`true`
import typings.redisBloom.redisBloomStrings.OK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommandsBloomReserveMod {
  
  @JSImport("@redis/bloom/dist/commands/bloom/RESERVE", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/bloom/dist/commands/bloom/RESERVE", "FIRST_KEY_INDEX")
  @js.native
  val FIRST_KEY_INDEX: /* 1 */ Double = js.native
  
  inline def transformArguments(key: String, errorRate: Double, capacity: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], errorRate.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def transformArguments(key: String, errorRate: Double, capacity: Double, options: ReserveOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(key.asInstanceOf[js.Any], errorRate.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def transformReply(): OK = ^.asInstanceOf[js.Dynamic].applyDynamic("transformReply")().asInstanceOf[OK]
  
  trait ReserveOptions extends StObject {
    
    var EXPANSION: js.UndefOr[Double] = js.undefined
    
    var NONSCALING: js.UndefOr[`true`] = js.undefined
  }
  object ReserveOptions {
    
    inline def apply(): ReserveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReserveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReserveOptions] (val x: Self) extends AnyVal {
      
      inline def setEXPANSION(value: Double): Self = StObject.set(x, "EXPANSION", value.asInstanceOf[js.Any])
      
      inline def setEXPANSIONUndefined: Self = StObject.set(x, "EXPANSION", js.undefined)
      
      inline def setNONSCALING(value: `true`): Self = StObject.set(x, "NONSCALING", value.asInstanceOf[js.Any])
      
      inline def setNONSCALINGUndefined: Self = StObject.set(x, "NONSCALING", js.undefined)
    }
  }
}
