package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisPredicateThisArg extends StObject {
  
  def apply[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Boolean] = js.native
  def apply[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
    thisArg: Any
  ): Observable_[Boolean] = js.native
}
