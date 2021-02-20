package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`-1`
import typings.stellarBase.stellarBaseNumbers.`-2`
import typings.stellarBase.stellarBaseNumbers.`-3`
import typings.stellarBase.stellarBaseNumbers.`-4`
import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseStrings.manageDataInvalidName
import typings.stellarBase.stellarBaseStrings.manageDataLowReserve
import typings.stellarBase.stellarBaseStrings.manageDataNameNotFound
import typings.stellarBase.stellarBaseStrings.manageDataNotSupportedYet
import typings.stellarBase.stellarBaseStrings.manageDataSuccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageDataResultCode extends StObject {
  
  val name: manageDataSuccess | manageDataNotSupportedYet | manageDataNameNotFound | manageDataLowReserve | manageDataInvalidName = js.native
  
  val value: `0` | `-1` | `-2` | `-3` | `-4` = js.native
}
object ManageDataResultCode {
  
  @scala.inline
  def apply(
    name: manageDataSuccess | manageDataNotSupportedYet | manageDataNameNotFound | manageDataLowReserve | manageDataInvalidName,
    value: `0` | `-1` | `-2` | `-3` | `-4`
  ): ManageDataResultCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageDataResultCode]
  }
  
  @scala.inline
  implicit class ManageDataResultCodeMutableBuilder[Self <: ManageDataResultCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(
      value: manageDataSuccess | manageDataNotSupportedYet | manageDataNameNotFound | manageDataLowReserve | manageDataInvalidName
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `-1` | `-2` | `-3` | `-4`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
