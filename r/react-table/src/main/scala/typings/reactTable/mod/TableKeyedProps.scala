package typings.reactTable.mod

import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableKeyedProps
  extends StObject
     with TableCommonProps {
  
  var key: Key
}
object TableKeyedProps {
  
  inline def apply(key: Key): TableKeyedProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyedProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableKeyedProps] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
