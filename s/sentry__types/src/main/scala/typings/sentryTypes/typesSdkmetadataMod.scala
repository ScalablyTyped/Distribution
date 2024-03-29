package typings.sentryTypes

import typings.sentryTypes.typesSdkinfoMod.SdkInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSdkmetadataMod {
  
  trait SdkMetadata extends StObject {
    
    var sdk: js.UndefOr[SdkInfo] = js.undefined
  }
  object SdkMetadata {
    
    inline def apply(): SdkMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SdkMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SdkMetadata] (val x: Self) extends AnyVal {
      
      inline def setSdk(value: SdkInfo): Self = StObject.set(x, "sdk", value.asInstanceOf[js.Any])
      
      inline def setSdkUndefined: Self = StObject.set(x, "sdk", js.undefined)
    }
  }
}
