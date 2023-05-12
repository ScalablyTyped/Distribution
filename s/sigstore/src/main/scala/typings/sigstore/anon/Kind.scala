package typings.sigstore.anon

import typings.sigstore.`distTlogTypes@GeneratedIntotoMod`.IntotoV002Schema
import typings.sigstore.distTlogTypesMod.IntotoKind
import typings.sigstore.sigstoreStrings.`0Dot0Dot2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with IntotoKind {
  
  var apiVersion: `0Dot0Dot2`
  
  var kind: /* "intoto" */ String
  
  var spec: IntotoV002Schema
}
object Kind {
  
  inline def apply(kind: /* "intoto" */ String, spec: IntotoV002Schema): Kind = {
    val __obj = js.Dynamic.literal(apiVersion = "0.0.2", kind = kind.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: `0Dot0Dot2`): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: /* "intoto" */ String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: IntotoV002Schema): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
