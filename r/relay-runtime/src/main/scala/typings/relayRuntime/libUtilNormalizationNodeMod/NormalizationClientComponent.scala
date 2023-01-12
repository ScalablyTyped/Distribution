package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationClientComponent
  extends StObject
     with NormalizationSelection {
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  
  // "ClientComponent";
  val fragment: NormalizationNode
  
  val kind: String
}
object NormalizationClientComponent {
  
  inline def apply(fragment: NormalizationNode, kind: String): NormalizationClientComponent = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationClientComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NormalizationClientComponent] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFragment(value: NormalizationNode): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
