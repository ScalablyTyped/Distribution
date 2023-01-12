package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArgsTableDataProps extends StObject {
  
  var args: js.UndefOr[Args] = js.undefined
  
  var globals: js.UndefOr[Globals] = js.undefined
  
  var rows: ArgTypes
}
object ArgsTableDataProps {
  
  inline def apply(rows: ArgTypes): ArgsTableDataProps = {
    val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsTableDataProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArgsTableDataProps] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: Args): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setGlobals(value: Globals): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    inline def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    inline def setRows(value: ArgTypes): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
