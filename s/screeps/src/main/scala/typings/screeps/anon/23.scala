package typings.screeps.anon

import typings.screeps.screepsStrings.UHO2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends StObject {
  
  var OH: UHO2 = js.native
}
object `23` {
  
  @scala.inline
  def apply(OH: UHO2): `23` = {
    val __obj = js.Dynamic.literal(OH = OH.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOH(value: UHO2): Self = StObject.set(x, "OH", value.asInstanceOf[js.Any])
  }
}
