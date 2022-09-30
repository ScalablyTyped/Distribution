package typings.reduxPersistTransformEncrypt

import typings.reduxPersist.typesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("redux-persist-transform-encrypt/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State, Raw](config: AsyncEncryptorConfig): Transform[State, Raw, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, Any, Any]]
  
  trait AsyncEncryptorConfig extends StObject {
    
    var secretKey: String
  }
  object AsyncEncryptorConfig {
    
    inline def apply(secretKey: String): AsyncEncryptorConfig = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncEncryptorConfig]
    }
    
    extension [Self <: AsyncEncryptorConfig](x: Self) {
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
