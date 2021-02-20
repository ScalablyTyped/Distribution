package typings.stellarSdk.serverApiMod.ServerApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRecordSigners extends StObject {
  
  var key: String = js.native
  
  var `type`: String = js.native
  
  var weight: Double = js.native
}
object AccountRecordSigners {
  
  @scala.inline
  def apply(key: String, `type`: String, weight: Double): AccountRecordSigners = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecordSigners]
  }
  
  @scala.inline
  implicit class AccountRecordSignersMutableBuilder[Self <: AccountRecordSigners] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
