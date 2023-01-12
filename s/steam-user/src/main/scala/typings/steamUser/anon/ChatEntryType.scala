package typings.steamUser.anon

import typings.steamUser.mod.EChatEntryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatEntryType extends StObject {
  
  var chatEntryType: js.UndefOr[EChatEntryType] = js.undefined
  
  var containsBbCode: js.UndefOr[Boolean] = js.undefined
}
object ChatEntryType {
  
  inline def apply(): ChatEntryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatEntryType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatEntryType] (val x: Self) extends AnyVal {
    
    inline def setChatEntryType(value: EChatEntryType): Self = StObject.set(x, "chatEntryType", value.asInstanceOf[js.Any])
    
    inline def setChatEntryTypeUndefined: Self = StObject.set(x, "chatEntryType", js.undefined)
    
    inline def setContainsBbCode(value: Boolean): Self = StObject.set(x, "containsBbCode", value.asInstanceOf[js.Any])
    
    inline def setContainsBbCodeUndefined: Self = StObject.set(x, "containsBbCode", js.undefined)
  }
}
