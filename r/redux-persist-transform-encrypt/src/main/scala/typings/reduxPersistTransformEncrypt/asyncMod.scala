package typings.reduxPersistTransformEncrypt

import typings.reduxPersist.typesMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("redux-persist-transform-encrypt/async", JSImport.Default)
  @js.native
  def default[State, Raw](config: AsyncEncryptorConfig): Transform[State, Raw, _, _] = js.native
  
  @js.native
  trait AsyncEncryptorConfig extends StObject {
    
    var secretKey: String = js.native
  }
  object AsyncEncryptorConfig {
    
    @scala.inline
    def apply(secretKey: String): AsyncEncryptorConfig = {
      val __obj = js.Dynamic.literal(secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncEncryptorConfig]
    }
    
    @scala.inline
    implicit class AsyncEncryptorConfigMutableBuilder[Self <: AsyncEncryptorConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
}
