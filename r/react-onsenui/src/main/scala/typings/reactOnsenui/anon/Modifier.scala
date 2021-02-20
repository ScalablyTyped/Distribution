package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modifier extends StObject {
  
  var modifier: js.UndefOr[String] = js.native
}
object Modifier {
  
  @scala.inline
  def apply(): Modifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modifier]
  }
  
  @scala.inline
  implicit class ModifierMutableBuilder[Self <: Modifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
