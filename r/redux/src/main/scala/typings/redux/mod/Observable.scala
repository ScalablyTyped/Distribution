package typings.redux.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observable[T] extends js.Object {
  
  def apply(): Observable[T] = js.native
  
  /**
    * The minimal observable subscription method.
    * @param {Object} observer Any object that can be used as an observer.
    * The observer object should have a `next` method.
    * @returns {subscription} An object with an `unsubscribe` method that can
    * be used to unsubscribe the observable from the store, and prevent further
    * emission of values from the observable.
    */
  def subscribe(observer: Observer[T]): /* import warning: importer.ImportType#apply Failed type conversion: redux.anon.Unsubscribe[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Symbol.observable * / any] */ js.Any = js.native
}
