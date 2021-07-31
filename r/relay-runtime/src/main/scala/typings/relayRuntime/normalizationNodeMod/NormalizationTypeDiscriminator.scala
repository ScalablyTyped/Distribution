package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationTypeDiscriminator
  extends StObject
     with NormalizationSelection {
  
  // 'TypeDiscriminator';
  val abstractKey: String
  
  val kind: String
}
object NormalizationTypeDiscriminator {
  
  @scala.inline
  def apply(abstractKey: String, kind: String): NormalizationTypeDiscriminator = {
    val __obj = js.Dynamic.literal(abstractKey = abstractKey.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationTypeDiscriminator]
  }
  
  @scala.inline
  implicit class NormalizationTypeDiscriminatorMutableBuilder[Self <: NormalizationTypeDiscriminator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstractKey(value: String): Self = StObject.set(x, "abstractKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
