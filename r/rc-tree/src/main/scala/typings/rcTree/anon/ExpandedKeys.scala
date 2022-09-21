package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedKeys extends StObject {
  
  var expandedKeys: js.Array[typings.rcTree.interfaceMod.Key]
}
object ExpandedKeys {
  
  inline def apply(expandedKeys: js.Array[typings.rcTree.interfaceMod.Key]): ExpandedKeys = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedKeys]
  }
  
  extension [Self <: ExpandedKeys](x: Self) {
    
    inline def setExpandedKeys(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
  }
}
