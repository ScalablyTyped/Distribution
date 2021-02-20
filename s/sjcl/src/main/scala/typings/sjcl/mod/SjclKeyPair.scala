package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclKeyPair[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends StObject {
  
  var pub: P = js.native
  
  var sec: S = js.native
}
object SjclKeyPair {
  
  @scala.inline
  def apply[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */](pub: P, sec: S): SjclKeyPair[P, S] = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyPair[P, S]]
  }
  
  @scala.inline
  implicit class SjclKeyPairMutableBuilder[Self <: SjclKeyPair[_, _], P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] (val x: Self with (SjclKeyPair[P, S])) extends AnyVal {
    
    @scala.inline
    def setPub(value: P): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSec(value: S): Self = StObject.set(x, "sec", value.asInstanceOf[js.Any])
  }
}
