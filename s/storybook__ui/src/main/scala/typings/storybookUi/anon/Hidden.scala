package typings.storybookUi.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hidden extends StObject {
  
  var hidden: Boolean = js.native
  
  var position: CSSProperties = js.native
}
object Hidden {
  
  @scala.inline
  def apply(hidden: Boolean, position: CSSProperties): Hidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  @scala.inline
  implicit class HiddenMutableBuilder[Self <: Hidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: CSSProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
