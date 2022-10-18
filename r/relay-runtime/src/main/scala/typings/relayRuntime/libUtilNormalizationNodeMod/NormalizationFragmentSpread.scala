package typings.relayRuntime.libUtilNormalizationNodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalizationFragmentSpread
  extends StObject
     with NormalizationSelection {
  
  val args: js.UndefOr[js.Array[NormalizationArgument] | Null] = js.undefined
  
  // "FragmentSpread";
  val fragment: NormalizationSplitOperation
  
  val kind: String
}
object NormalizationFragmentSpread {
  
  inline def apply(fragment: NormalizationSplitOperation, kind: String): NormalizationFragmentSpread = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationFragmentSpread]
  }
  
  extension [Self <: NormalizationFragmentSpread](x: Self) {
    
    inline def setArgs(value: js.Array[NormalizationArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: NormalizationArgument*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFragment(value: NormalizationSplitOperation): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
