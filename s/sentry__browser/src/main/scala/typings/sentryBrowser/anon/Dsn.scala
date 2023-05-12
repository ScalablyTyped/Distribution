package typings.sentryBrowser.anon

import typings.sentryTypes.typesDsnMod.DsnComponents
import typings.sentryTypes.typesSdkmetadataMod.SdkMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dsn extends StObject {
  
  var dsn: js.UndefOr[DsnComponents] = js.undefined
  
  var metadata: js.UndefOr[SdkMetadata] = js.undefined
  
  var tunnel: js.UndefOr[String] = js.undefined
}
object Dsn {
  
  inline def apply(): Dsn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dsn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dsn] (val x: Self) extends AnyVal {
    
    inline def setDsn(value: DsnComponents): Self = StObject.set(x, "dsn", value.asInstanceOf[js.Any])
    
    inline def setDsnUndefined: Self = StObject.set(x, "dsn", js.undefined)
    
    inline def setMetadata(value: SdkMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTunnel(value: String): Self = StObject.set(x, "tunnel", value.asInstanceOf[js.Any])
    
    inline def setTunnelUndefined: Self = StObject.set(x, "tunnel", js.undefined)
  }
}
