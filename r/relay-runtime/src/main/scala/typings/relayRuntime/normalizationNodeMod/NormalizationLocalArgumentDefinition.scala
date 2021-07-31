package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationLocalArgumentDefinition extends StObject {
  
  var defaultValue: js.Any
  
  var kind: String
  
  var name: String
}
object NormalizationLocalArgumentDefinition {
  
  @scala.inline
  def apply(defaultValue: js.Any, kind: String, name: String): NormalizationLocalArgumentDefinition = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationLocalArgumentDefinition]
  }
  
  @scala.inline
  implicit class NormalizationLocalArgumentDefinitionMutableBuilder[Self <: NormalizationLocalArgumentDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: js.Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
