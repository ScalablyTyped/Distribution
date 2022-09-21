package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCompilerProperty
  extends StObject
     with ComponentCompilerStaticProperty {
  
  var internal: Boolean
  
  var name: String
}
object ComponentCompilerProperty {
  
  inline def apply(
    complexType: ComponentCompilerPropertyComplexType,
    docs: CompilerJsDoc,
    internal: Boolean,
    mutable: Boolean,
    name: String,
    optional: Boolean,
    required: Boolean,
    `type`: ComponentCompilerPropertyType
  ): ComponentCompilerProperty = {
    val __obj = js.Dynamic.literal(complexType = complexType.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentCompilerProperty]
  }
  
  extension [Self <: ComponentCompilerProperty](x: Self) {
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
