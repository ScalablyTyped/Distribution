package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
class RoleDefinitionBindingCollection protected ()
  extends typings.sharepoint.SP.RoleDefinitionBindingCollection {
  def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typings.sharepoint.SP.RoleDefinition] = js.native
}

/* static members */
@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
object RoleDefinitionBindingCollection extends js.Object {
  def newObject(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.RoleDefinitionBindingCollection = js.native
}

