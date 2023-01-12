package typings.rateLimiterFlexible.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRLWrapperBlackAndWhiteOptions extends StObject {
  
  var blackList: js.UndefOr[js.Array[Double | String]] = js.undefined
  
  var isBlackListed: js.UndefOr[js.Function1[/* key */ Any, Boolean]] = js.undefined
  
  var isWhiteListed: js.UndefOr[js.Function1[/* key */ Any, Boolean]] = js.undefined
  
  var limiter: RateLimiterAbstract
  
  var runActionAnyway: js.UndefOr[Boolean] = js.undefined
  
  var whiteList: js.UndefOr[js.Array[Double | String]] = js.undefined
}
object IRLWrapperBlackAndWhiteOptions {
  
  inline def apply(limiter: RateLimiterAbstract): IRLWrapperBlackAndWhiteOptions = {
    val __obj = js.Dynamic.literal(limiter = limiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRLWrapperBlackAndWhiteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRLWrapperBlackAndWhiteOptions] (val x: Self) extends AnyVal {
    
    inline def setBlackList(value: js.Array[Double | String]): Self = StObject.set(x, "blackList", value.asInstanceOf[js.Any])
    
    inline def setBlackListUndefined: Self = StObject.set(x, "blackList", js.undefined)
    
    inline def setBlackListVarargs(value: (Double | String)*): Self = StObject.set(x, "blackList", js.Array(value*))
    
    inline def setIsBlackListed(value: /* key */ Any => Boolean): Self = StObject.set(x, "isBlackListed", js.Any.fromFunction1(value))
    
    inline def setIsBlackListedUndefined: Self = StObject.set(x, "isBlackListed", js.undefined)
    
    inline def setIsWhiteListed(value: /* key */ Any => Boolean): Self = StObject.set(x, "isWhiteListed", js.Any.fromFunction1(value))
    
    inline def setIsWhiteListedUndefined: Self = StObject.set(x, "isWhiteListed", js.undefined)
    
    inline def setLimiter(value: RateLimiterAbstract): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
    
    inline def setRunActionAnyway(value: Boolean): Self = StObject.set(x, "runActionAnyway", value.asInstanceOf[js.Any])
    
    inline def setRunActionAnywayUndefined: Self = StObject.set(x, "runActionAnyway", js.undefined)
    
    inline def setWhiteList(value: js.Array[Double | String]): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
    
    inline def setWhiteListUndefined: Self = StObject.set(x, "whiteList", js.undefined)
    
    inline def setWhiteListVarargs(value: (Double | String)*): Self = StObject.set(x, "whiteList", js.Array(value*))
  }
}
