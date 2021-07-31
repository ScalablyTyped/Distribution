package typings.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.ListEnumerator")
@js.native
class ListEnumerator[T] protected ()
  extends StObject
     with typings.sharepoint.CUI.ListEnumerator[T] {
  def this(index: js.Any) = this()
  
  /* CompleteClass */
  override def get_current(): T = js.native
  
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
  
  /* CompleteClass */
  override def movePrevious(): Boolean = js.native
  
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
}
