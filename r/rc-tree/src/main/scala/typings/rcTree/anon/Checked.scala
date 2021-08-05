package typings.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: js.Array[typings.rcTree.interfaceMod.Key]
  
  var halfChecked: js.Array[typings.rcTree.interfaceMod.Key]
}
object Checked {
  
  inline def apply(
    checked: js.Array[typings.rcTree.interfaceMod.Key],
    halfChecked: js.Array[typings.rcTree.interfaceMod.Key]
  ): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], halfChecked = halfChecked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "checked", js.Array(value :_*))
    
    inline def setHalfChecked(value: js.Array[typings.rcTree.interfaceMod.Key]): Self = StObject.set(x, "halfChecked", value.asInstanceOf[js.Any])
    
    inline def setHalfCheckedVarargs(value: typings.rcTree.interfaceMod.Key*): Self = StObject.set(x, "halfChecked", js.Array(value :_*))
  }
}
