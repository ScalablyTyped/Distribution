package typings.redisClient.anon

import typings.redisClient.distLibCommandsClientKILLMod.ClientKillFilters.SKIP_ME
import typings.redisClient.distLibCommandsClientKILLMod.KillSkipMe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @redis/client.@redis/client/dist/lib/commands/CLIENT_KILL.KillFilter<@redis/client.@redis/client/dist/lib/commands/CLIENT_KILL.ClientKillFilters.SKIP_ME> & {  skipMe :boolean} */
trait KillFilterSKIPMEskipMeboo
  extends StObject
     with KillSkipMe {
  
  var filter: SKIP_ME
  
  var skipMe: Boolean
}
object KillFilterSKIPMEskipMeboo {
  
  inline def apply(filter: SKIP_ME, skipMe: Boolean): KillFilterSKIPMEskipMeboo = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], skipMe = skipMe.asInstanceOf[js.Any])
    __obj.asInstanceOf[KillFilterSKIPMEskipMeboo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KillFilterSKIPMEskipMeboo] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: SKIP_ME): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setSkipMe(value: Boolean): Self = StObject.set(x, "skipMe", value.asInstanceOf[js.Any])
  }
}
