package typings.stellarBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha256Hash extends StObject {
  
  var sha256Hash: js.Any = js.native
}
object Sha256Hash {
  
  @scala.inline
  def apply(sha256Hash: js.Any): Sha256Hash = {
    val __obj = js.Dynamic.literal(sha256Hash = sha256Hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sha256Hash]
  }
  
  @scala.inline
  implicit class Sha256HashMutableBuilder[Self <: Sha256Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha256Hash(value: js.Any): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
  }
}
