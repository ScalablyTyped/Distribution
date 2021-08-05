package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListItemProps
  extends StObject
     with HTMLProps[js.Any] {
  
  var threeLine: js.UndefOr[Boolean] = js.undefined
  
  var twoLine: js.UndefOr[Boolean] = js.undefined
}
object ListItemProps {
  
  inline def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  
  extension [Self <: ListItemProps](x: Self) {
    
    inline def setThreeLine(value: Boolean): Self = StObject.set(x, "threeLine", value.asInstanceOf[js.Any])
    
    inline def setThreeLineUndefined: Self = StObject.set(x, "threeLine", js.undefined)
    
    inline def setTwoLine(value: Boolean): Self = StObject.set(x, "twoLine", value.asInstanceOf[js.Any])
    
    inline def setTwoLineUndefined: Self = StObject.set(x, "twoLine", js.undefined)
  }
}
