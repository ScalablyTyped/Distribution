package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildEntry extends StObject {
  
  var bundles: js.Array[BuildBundle]
  
  var components: js.Array[BuildComponent]
  
  var encapsulations: js.Array[Encapsulation]
  
  var entryId: String
  
  var inputs: js.Array[String]
  
  var modes: js.UndefOr[js.Array[String]] = js.undefined
}
object BuildEntry {
  
  inline def apply(
    bundles: js.Array[BuildBundle],
    components: js.Array[BuildComponent],
    encapsulations: js.Array[Encapsulation],
    entryId: String,
    inputs: js.Array[String]
  ): BuildEntry = {
    val __obj = js.Dynamic.literal(bundles = bundles.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], encapsulations = encapsulations.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildEntry]
  }
  
  extension [Self <: BuildEntry](x: Self) {
    
    inline def setBundles(value: js.Array[BuildBundle]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesVarargs(value: BuildBundle*): Self = StObject.set(x, "bundles", js.Array(value*))
    
    inline def setComponents(value: js.Array[BuildComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: BuildComponent*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setEncapsulations(value: js.Array[Encapsulation]): Self = StObject.set(x, "encapsulations", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationsVarargs(value: Encapsulation*): Self = StObject.set(x, "encapsulations", js.Array(value*))
    
    inline def setEntryId(value: String): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value*))
    
    inline def setModes(value: js.Array[String]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setModesUndefined: Self = StObject.set(x, "modes", js.undefined)
    
    inline def setModesVarargs(value: String*): Self = StObject.set(x, "modes", js.Array(value*))
  }
}
