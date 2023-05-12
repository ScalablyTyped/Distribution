package typings.sigstore.anon

import typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV001Schema
import typings.sigstore.distTlogTypesMod.IntotoKind
import typings.sigstore.sigstoreStrings.`0Dot0Dot1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiVersion
  extends StObject
     with IntotoKind {
  
  var apiVersion: `0Dot0Dot1`
  
  var kind: /* "intoto" */ String
  
  var spec: IntotoV001Schema
}
object ApiVersion {
  
  inline def apply(kind: /* "intoto" */ String, spec: IntotoV001Schema): ApiVersion = {
    val __obj = js.Dynamic.literal(apiVersion = "0.0.1", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApiVersion] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: `0Dot0Dot1`): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: /* "intoto" */ String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: IntotoV001Schema): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
