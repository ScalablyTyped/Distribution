package typings.reactTable.mod

import typings.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableKeyedProps extends TableCommonProps {
  
  var key: Key = js.native
}
object TableKeyedProps {
  
  @scala.inline
  def apply(key: Key): TableKeyedProps = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableKeyedProps]
  }
  
  @scala.inline
  implicit class TableKeyedPropsMutableBuilder[Self <: TableKeyedProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
