package typings.rxjs

import typings.rxjs.subjectMod.Subject
import typings.rxjs.subscriberMod.Subscriber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canReportErrorMod {
  
  @JSImport("rxjs/internal/util/canReportError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canReportError(observer: Subject[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReportError")(observer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def canReportError(observer: Subscriber[js.Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canReportError")(observer.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
