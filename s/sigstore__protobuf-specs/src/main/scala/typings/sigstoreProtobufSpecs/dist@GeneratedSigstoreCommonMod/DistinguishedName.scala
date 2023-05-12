package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistinguishedName extends StObject {
  
  var commonName: String
  
  var organization: String
}
object DistinguishedName {
  
  inline def apply(commonName: String, organization: String): DistinguishedName = {
    val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistinguishedName]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "DistinguishedName")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): DistinguishedName = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[DistinguishedName]
  
  inline def toJSON(message: DistinguishedName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistinguishedName] (val x: Self) extends AnyVal {
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
  }
}
