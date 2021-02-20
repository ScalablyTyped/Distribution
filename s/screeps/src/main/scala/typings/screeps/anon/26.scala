package typings.screeps.anon

import typings.screeps.screepsStrings.XKH2O
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `26` extends StObject {
  
  var X: XKH2O = js.native
}
object `26` {
  
  @scala.inline
  def apply(X: XKH2O): `26` = {
    val __obj = js.Dynamic.literal(X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: XKH2O): Self = StObject.set(x, "X", value.asInstanceOf[js.Any])
  }
}
