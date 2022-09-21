package typings.sharepoint.global.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CUI.ListNode")
@js.native
open class ListNode[T] protected ()
  extends StObject
     with typings.sharepoint.CUI.ListNode[T] {
  def this(data: T, prev: typings.sharepoint.CUI.ListNode[T], next: typings.sharepoint.CUI.ListNode[T]) = this()
  
  /* CompleteClass */
  var data: T = js.native
  
  /* CompleteClass */
  var next: typings.sharepoint.CUI.ListNode[T] = js.native
  
  /* CompleteClass */
  var previous: typings.sharepoint.CUI.ListNode[T] = js.native
}
