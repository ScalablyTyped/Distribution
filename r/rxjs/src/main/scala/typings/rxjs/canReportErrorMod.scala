package typings.rxjs

import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscriberMod.Subscriber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/util/canReportError", JSImport.Namespace)
@js.native
object canReportErrorMod extends js.Object {
  
  def canReportError(observer: Subject[_]): Boolean = js.native
  def canReportError(observer: Subscriber[_]): Boolean = js.native
}
