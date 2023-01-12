package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedKeys extends StObject {
  
  var expandedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]
}
object ExpandedKeys {
  
  inline def apply(expandedKeys: js.Array[typings.rcTree.esInterfaceMod.Key]): ExpandedKeys = {
    val __obj = js.Dynamic.literal(expandedKeys = expandedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandedKeys] (val x: Self) extends AnyVal {
    
    inline def setExpandedKeys(value: js.Array[typings.rcTree.esInterfaceMod.Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedKeysVarargs(value: typings.rcTree.esInterfaceMod.Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
  }
}
