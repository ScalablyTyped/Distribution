package typings.scrollIntoView.ScrollIntoView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** type will be 'complete' if the scroll completed or 'canceled' if the current scroll was canceled by a new scroll */
/* Rewritten from type alias, can be one of: 
  - typings.scrollIntoView.scrollIntoViewStrings.complete
  - typings.scrollIntoView.scrollIntoViewStrings.canceled
*/
trait callbackParameterType extends js.Object
object callbackParameterType {
  
  @scala.inline
  def canceled: typings.scrollIntoView.scrollIntoViewStrings.canceled = "canceled".asInstanceOf[typings.scrollIntoView.scrollIntoViewStrings.canceled]
  
  @scala.inline
  def complete: typings.scrollIntoView.scrollIntoViewStrings.complete = "complete".asInstanceOf[typings.scrollIntoView.scrollIntoViewStrings.complete]
}
