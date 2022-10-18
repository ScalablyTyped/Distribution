package typings.primereact.columnColumnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnHeaderOptions extends StObject {
  
  var props: Any
}
object ColumnHeaderOptions {
  
  inline def apply(props: Any): ColumnHeaderOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnHeaderOptions]
  }
  
  extension [Self <: ColumnHeaderOptions](x: Self) {
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
