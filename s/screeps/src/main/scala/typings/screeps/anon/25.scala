package typings.screeps.anon

import typings.screeps.screepsStrings.XLH2O
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `25` extends StObject {
  
  var X: XLH2O = js.native
}
object `25` {
  
  @scala.inline
  def apply(X: XLH2O): `25` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: XLH2O): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
  }
}
