package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationVariable
  extends StObject
     with NormalizationArgument {
  
  val kind: String
  
  // 'Variable';
  val name: String
  
  val `type`: js.UndefOr[String | Null] = js.undefined
  
  val variableName: String
}
object NormalizationVariable {
  
  @scala.inline
  def apply(kind: String, name: String, variableName: String): NormalizationVariable = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationVariable]
  }
  
  @scala.inline
  implicit class NormalizationVariableMutableBuilder[Self <: NormalizationVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
  }
}
