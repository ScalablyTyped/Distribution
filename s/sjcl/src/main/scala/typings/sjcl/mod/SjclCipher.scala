package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclCipher extends StObject {
  
  def decrypt(data: js.Array[Double]): js.Array[Double]
  
  def encrypt(data: js.Array[Double]): js.Array[Double]
}
object SjclCipher {
  
  inline def apply(decrypt: js.Array[Double] => js.Array[Double], encrypt: js.Array[Double] => js.Array[Double]): SjclCipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[SjclCipher]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclCipher] (val x: Self) extends AnyVal {
    
    inline def setDecrypt(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "decrypt", js.Any.fromFunction1(value))
    
    inline def setEncrypt(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "encrypt", js.Any.fromFunction1(value))
  }
}
