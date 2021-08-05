package typings.reactMdl.mod

import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconToggleProps
  extends StObject
     with HTMLProps[js.Any]
     with RippleComponent {
  
  @JSName("name")
  var name_IconToggleProps: String
}
object IconToggleProps {
  
  inline def apply(name: String): IconToggleProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleProps]
  }
  
  extension [Self <: IconToggleProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
