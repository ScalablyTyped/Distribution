package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.BooleanResult
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityIdentifier extends ClientObject {
  
  def containsLocalizedDisplayName(): BooleanResult = js.native
  
  def getDefaultDisplayName(): StringResult = js.native
  
  def getLocalizedDisplayName(): StringResult = js.native
  
  def get_identifierType(): String = js.native
  
  def get_name(): String = js.native
}
