package typings.rxjsCompat.anon

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisObservables extends StObject {
  
  def apply[T](observables: (Observable_[T] | js.Array[Observable_[T]])*): Observable_[T] = js.native
  def apply[T](observables: js.Array[Observable_[T]]): Observable_[T] = js.native
}
