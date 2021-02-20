package typings.sharp.mod

import typings.sharp.sharpStrings.and
import typings.sharp.sharpStrings.eor
import typings.sharp.sharpStrings.or
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoolEnum extends StObject {
  
  var and: typings.sharp.sharpStrings.and = js.native
  
  var eor: typings.sharp.sharpStrings.eor = js.native
  
  var or: typings.sharp.sharpStrings.or = js.native
}
object BoolEnum {
  
  @scala.inline
  def apply(and: and, eor: eor, or: or): BoolEnum = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], eor = eor.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoolEnum]
  }
  
  @scala.inline
  implicit class BoolEnumMutableBuilder[Self <: BoolEnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnd(value: and): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEor(value: eor): Self = StObject.set(x, "eor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOr(value: or): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
  }
}
