package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.FactoryOrValue
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.mod.ConnectableObservable
import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallSubjectFactorySelector extends StObject {
  
  def apply[T](SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]]): ConnectableObservable[T] = js.native
  def apply[T](
    SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]],
    selector: MonoTypeOperatorFunction[T]
  ): Observable_[T] = js.native
  def apply[T](subjectOrSubjectFactory: FactoryOrValue[Subject[T]]): ConnectableObservable[T] = js.native
}
