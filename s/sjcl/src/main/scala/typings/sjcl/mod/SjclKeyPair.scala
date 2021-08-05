package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SjclKeyPair[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends StObject {
  
  var pub: P
  
  var sec: S
}
object SjclKeyPair {
  
  inline def apply[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */](pub: P, sec: S): SjclKeyPair[P, S] = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyPair[P, S]]
  }
  
  extension [Self <: SjclKeyPair[?, ?], P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */](x: Self & (SjclKeyPair[P, S])) {
    
    inline def setPub(value: P): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
    
    inline def setSec(value: S): Self = StObject.set(x, "sec", value.asInstanceOf[js.Any])
  }
}
