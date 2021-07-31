package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.RoleDefinitionBindingCollection")
@js.native
class RoleDefinitionBindingCollection protected ()
  extends StObject
     with typings.sharepoint.SP.RoleDefinitionBindingCollection {
  def this(context: typings.sharepoint.SP.ClientRuntimeContext) = this()
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[typings.sharepoint.SP.RoleDefinition] = js.native
}
object RoleDefinitionBindingCollection {
  
  @JSGlobal("SP.RoleDefinitionBindingCollection")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def newObject(context: typings.sharepoint.SP.ClientRuntimeContext): typings.sharepoint.SP.RoleDefinitionBindingCollection = ^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any]).asInstanceOf[typings.sharepoint.SP.RoleDefinitionBindingCollection]
}
