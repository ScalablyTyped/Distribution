package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ObjectPathMethod")
@js.native
open class ObjectPathMethod protected ()
  extends StObject
     with typings.sharepoint.SP.ObjectPath {
  def this(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    parent: typings.sharepoint.SP.ObjectPath,
    methodName: String,
    parameters: js.Array[Any]
  ) = this()
  
  /* CompleteClass */
  override def setPendingReplace(): Unit = js.native
}
