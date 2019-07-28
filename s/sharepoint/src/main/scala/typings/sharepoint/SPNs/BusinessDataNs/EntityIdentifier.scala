package typings.sharepoint.SPNs.BusinessDataNs

import typings.sharepoint.SPNs.BooleanResult
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.EntityIdentifier")
@js.native
class EntityIdentifier () extends ClientObject {
  def containsLocalizedDisplayName(): BooleanResult = js.native
  def getDefaultDisplayName(): StringResult = js.native
  def getLocalizedDisplayName(): StringResult = js.native
  def get_identifierType(): String = js.native
  def get_name(): String = js.native
}

