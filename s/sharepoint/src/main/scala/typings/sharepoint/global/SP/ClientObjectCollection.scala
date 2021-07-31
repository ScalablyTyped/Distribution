package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a base class for a collection of objects on a remote client. */
@JSGlobal("SP.ClientObjectCollection")
@js.native
class ClientObjectCollection[T] ()
  extends StObject
     with typings.sharepoint.SP.ClientObjectCollection[T] {
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
}
