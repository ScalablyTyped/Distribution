package typings.screeps.anon

import typings.screeps.screepsStrings.XLHO2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `30` extends StObject {
  
  var X: XLHO2 = js.native
}
object `30` {
  
  @scala.inline
  def apply(X: XLHO2): `30` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: XLHO2): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
  }
}
