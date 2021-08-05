package typings.reduxPersistTransformEncrypt

import typings.reduxPersist.typesMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-persist-transform-encrypt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State, Raw](config: EncryptorConfig): Transform[State, Raw, js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[Transform[State, Raw, js.Any, js.Any]]
  
  trait EncryptorConfig extends StObject {
    
    var onError: js.UndefOr[js.Function1[/* err */ Error, Unit]] = js.undefined
    
    var secretKey: String
  }
  object EncryptorConfig {
    
    inline def apply(secretKey: String): EncryptorConfig = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptorConfig]
    }
    
    extension [Self <: EncryptorConfig](x: Self) {
      
      inline def setOnError(value: /* err */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
