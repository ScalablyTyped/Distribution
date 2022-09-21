package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemActionProps
  extends StObject
     with HTMLProps[Any] {
  
  var info: js.UndefOr[String] = js.undefined
}
object ListItemActionProps {
  
  inline def apply(): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemActionProps]
  }
  
  extension [Self <: ListItemActionProps](x: Self) {
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
  }
}
