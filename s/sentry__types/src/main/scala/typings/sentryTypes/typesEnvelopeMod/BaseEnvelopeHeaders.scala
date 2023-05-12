package typings.sentryTypes.typesEnvelopeMod

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesSdkinfoMod.SdkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseEnvelopeHeaders
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dsn: js.UndefOr[String] = js.undefined
  
  var sdk: js.UndefOr[SdkInfo] = js.undefined
}
object BaseEnvelopeHeaders {
  
  inline def apply(): BaseEnvelopeHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseEnvelopeHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseEnvelopeHeaders] (val x: Self) extends AnyVal {
    
    inline def setDsn(value: String): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
    
    inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
    
    inline def setSdk(value: SdkInfo): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
    
    inline def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
  }
}
