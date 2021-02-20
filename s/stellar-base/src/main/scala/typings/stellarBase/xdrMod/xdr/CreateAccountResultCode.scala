package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.createAccountAlreadyExist
import typings.stellarBase.stellarBaseStrings.createAccountLowReserve
import typings.stellarBase.stellarBaseStrings.createAccountMalformed
import typings.stellarBase.stellarBaseStrings.createAccountSuccess
import typings.stellarBase.stellarBaseStrings.createAccountUnderfunded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAccountResultCode extends StObject {
  
  val name: createAccountSuccess | createAccountMalformed | createAccountUnderfunded | createAccountLowReserve | createAccountAlreadyExist = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` = js.native
}
object CreateAccountResultCode {
  
  @scala.inline
  def apply(
    name: createAccountSuccess | createAccountMalformed | createAccountUnderfunded | createAccountLowReserve | createAccountAlreadyExist,
    value: `0` | `-1` | `-2` | `-3` | `-4`
  ): CreateAccountResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountResultCode]
  }
  
  @scala.inline
  implicit class CreateAccountResultCodeMutableBuilder[Self <: CreateAccountResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: createAccountSuccess | createAccountMalformed | createAccountUnderfunded | createAccountLowReserve | createAccountAlreadyExist
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
