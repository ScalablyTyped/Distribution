package typings.sigstoreProtobufSpecs.`dist@GeneratedSigstoreCommonMod`

import typings.sigstoreProtobufSpecs.anon.Regexp
import typings.sigstoreProtobufSpecs.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubjectAlternativeName extends StObject {
  
  var identity: js.UndefOr[Regexp | Value] = js.undefined
  
  var `type`: SubjectAlternativeNameType
}
object SubjectAlternativeName {
  
  inline def apply(`type`: SubjectAlternativeNameType): SubjectAlternativeName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectAlternativeName]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/sigstore_common", "SubjectAlternativeName")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): SubjectAlternativeName = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[SubjectAlternativeName]
  
  inline def toJSON(message: SubjectAlternativeName): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubjectAlternativeName] (val x: Self) extends AnyVal {
    
    inline def setIdentity(value: Regexp | Value): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setType(value: SubjectAlternativeNameType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
