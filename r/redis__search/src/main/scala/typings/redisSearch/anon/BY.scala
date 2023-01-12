package typings.redisSearch.anon

import typings.redisSearch.distCommandsMod.PropertyName
import typings.redisSearch.redisSearchStrings.ASC
import typings.redisSearch.redisSearchStrings.DESC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BY extends StObject {
  
  var BY: PropertyName
  
  var DIRECTION: js.UndefOr[ASC | DESC] = js.undefined
}
object BY {
  
  inline def apply(BY: PropertyName): BY = {
    val __obj = js.Dynamic.literal(BY = BY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BY] (val x: Self) extends AnyVal {
    
    inline def setBY(value: PropertyName): Self = StObject.set(x, "BY", value.asInstanceOf[js.Any])
    
    inline def setDIRECTION(value: ASC | DESC): Self = StObject.set(x, "DIRECTION", value.asInstanceOf[js.Any])
    
    inline def setDIRECTIONUndefined: Self = StObject.set(x, "DIRECTION", js.undefined)
  }
}
