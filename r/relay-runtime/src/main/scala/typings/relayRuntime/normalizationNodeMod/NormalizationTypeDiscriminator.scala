package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationTypeDiscriminator
  extends StObject
     with NormalizationSelection {
  
  // "TypeDiscriminator";
  val abstractKey: String
  
  val kind: String
}
object NormalizationTypeDiscriminator {
  
  inline def apply(abstractKey: String, kind: String): NormalizationTypeDiscriminator = {
    val __obj = js.Dynamic.literal(abstractKey = abstractKey.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationTypeDiscriminator]
  }
  
  extension [Self <: NormalizationTypeDiscriminator](x: Self) {
    
    inline def setAbstractKey(value: String): Self = StObject.set(x, "abstractKey", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
