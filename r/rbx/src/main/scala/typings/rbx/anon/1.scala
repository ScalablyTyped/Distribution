package typings.rbx.anon

import typings.rbx.rbxStrings.centered
import typings.rbx.rbxStrings.justified
import typings.rbx.rbxStrings.left
import typings.rbx.rbxStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var value: centered | justified | left | right = js.native
}
object `1` {
  
  @scala.inline
  def apply(value: centered | justified | left | right): `1` = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: centered | justified | left | right): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
