package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisProjectConcurrent extends StObject {
  
  def apply[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]]): Observable_[R] = js.native
  def apply[T, R](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[R]], concurrent: Double): Observable_[R] = js.native
}
