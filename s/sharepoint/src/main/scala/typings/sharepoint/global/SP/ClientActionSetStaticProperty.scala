package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientActionSetStaticProperty")
@js.native
open class ClientActionSetStaticProperty protected ()
  extends StObject
     with typings.sharepoint.SP.ClientAction {
  def this(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    typeId: String,
    propName: String,
    propValue: Any
  ) = this()
  
  /* CompleteClass */
  override def get_id(): Double = js.native
  
  /* CompleteClass */
  override def get_name(): String = js.native
  
  /* CompleteClass */
  override def get_path(): typings.sharepoint.SP.ObjectPath = js.native
}
