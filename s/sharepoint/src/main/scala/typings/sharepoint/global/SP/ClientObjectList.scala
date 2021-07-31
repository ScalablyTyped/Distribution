package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientObjectList")
@js.native
class ClientObjectList[T] protected ()
  extends StObject
     with typings.sharepoint.SP.ClientObjectList[T] {
  def this(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    objectPath: typings.sharepoint.SP.ObjectPath,
    childItemType: js.Any
  ) = this()
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
}
