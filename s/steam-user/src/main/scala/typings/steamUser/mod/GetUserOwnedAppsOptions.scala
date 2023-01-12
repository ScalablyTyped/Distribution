package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserOwnedAppsOptions extends StObject {
  
  var filterAppids: js.UndefOr[js.Array[Double]] = js.undefined
  
  var includeFreeSub: js.UndefOr[Boolean] = js.undefined
  
  var includePlayedFreeGames: js.UndefOr[Boolean] = js.undefined
}
object GetUserOwnedAppsOptions {
  
  inline def apply(): GetUserOwnedAppsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserOwnedAppsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserOwnedAppsOptions] (val x: Self) extends AnyVal {
    
    inline def setFilterAppids(value: js.Array[Double]): Self = StObject.set(x, "filterAppids", value.asInstanceOf[js.Any])
    
    inline def setFilterAppidsUndefined: Self = StObject.set(x, "filterAppids", js.undefined)
    
    inline def setFilterAppidsVarargs(value: Double*): Self = StObject.set(x, "filterAppids", js.Array(value*))
    
    inline def setIncludeFreeSub(value: Boolean): Self = StObject.set(x, "includeFreeSub", value.asInstanceOf[js.Any])
    
    inline def setIncludeFreeSubUndefined: Self = StObject.set(x, "includeFreeSub", js.undefined)
    
    inline def setIncludePlayedFreeGames(value: Boolean): Self = StObject.set(x, "includePlayedFreeGames", value.asInstanceOf[js.Any])
    
    inline def setIncludePlayedFreeGamesUndefined: Self = StObject.set(x, "includePlayedFreeGames", js.undefined)
  }
}
