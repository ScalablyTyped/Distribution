package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisPredicateDefaultValue extends StObject {
  
  def apply[T, D](): Observable_[T | D] = js.native
  def apply[T, D](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[T | D] = js.native
  def apply[T, D](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
    defaultValue: D
  ): Observable_[T | D] = js.native
  def apply[T, D](predicate: Null, defaultValue: D): Observable_[T | D] = js.native
  def apply[T, D](predicate: Unit, defaultValue: D): Observable_[T | D] = js.native
}
