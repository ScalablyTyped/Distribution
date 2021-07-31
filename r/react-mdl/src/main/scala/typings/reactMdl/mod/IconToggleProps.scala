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
  
  @scala.inline
  def apply(name: String): IconToggleProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconToggleProps]
  }
  
  @scala.inline
  implicit class IconTogglePropsMutableBuilder[Self <: IconToggleProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
