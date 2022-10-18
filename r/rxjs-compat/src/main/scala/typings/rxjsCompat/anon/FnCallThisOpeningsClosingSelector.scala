package typings.rxjsCompat.anon

import typings.rxjs.distTypesInternalTypesMod.SubscribableOrPromise
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisOpeningsClosingSelector extends StObject {
  
  def apply[T, O](
    openings: SubscribableOrPromise[O],
    closingSelector: js.Function1[/* value */ O, SubscribableOrPromise[Any]]
  ): Observable_[js.Array[T]] = js.native
}
