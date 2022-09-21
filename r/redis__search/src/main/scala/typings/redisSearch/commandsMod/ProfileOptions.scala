package typings.redisSearch.commandsMod

import typings.redisSearch.redisSearchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileOptions extends StObject {
  
  var LIMITED: js.UndefOr[`true`] = js.undefined
}
object ProfileOptions {
  
  inline def apply(): ProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileOptions]
  }
  
  extension [Self <: ProfileOptions](x: Self) {
    
    inline def setLIMITED(value: `true`): Self = StObject.set(x, "LIMITED", value.asInstanceOf[js.Any])
    
    inline def setLIMITEDUndefined: Self = StObject.set(x, "LIMITED", js.undefined)
  }
}
