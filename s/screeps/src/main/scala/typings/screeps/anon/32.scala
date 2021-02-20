package typings.screeps.anon

import typings.screeps.screepsStrings.XKHO2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `32` extends StObject {
  
  var X: XKHO2 = js.native
}
object `32` {
  
  @scala.inline
  def apply(X: XKHO2): `32` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`32`]
  }
  
  @scala.inline
  implicit class `32MutableBuilder`[Self <: `32`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: XKHO2): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
  }
}
