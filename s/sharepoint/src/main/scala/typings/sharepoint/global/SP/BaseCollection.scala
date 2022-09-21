package typings.sharepoint.global.SP

import typings.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.BaseCollection")
@js.native
open class BaseCollection[T] ()
  extends StObject
     with typings.sharepoint.SP.BaseCollection[T] {
  
  /* CompleteClass */
  override def getEnumerator(): IEnumerator[T] = js.native
  
  /* CompleteClass */
  override def get_count(): Double = js.native
  
  /* CompleteClass */
  override def itemAtIndex(index: Double): T = js.native
}
