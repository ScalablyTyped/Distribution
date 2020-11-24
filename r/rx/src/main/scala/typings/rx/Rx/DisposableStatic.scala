package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisposableStatic
  extends /**
  * Provides a set of static methods for creating Disposables.
  * @param {Function} dispose Action to run during the first call to dispose. The action is guaranteed to be run at most once.
  */
Instantiable1[/* action */ js.Function0[Unit], Disposable] {
  
  /**
    * Creates a disposable object that invokes the specified action when disposed.
    * @param {Function} dispose Action to run during the first call to dispose. The action is guaranteed to be run at most once.
    * @return {Disposable} The disposable object that runs the given action upon disposal.
    */
  def create(action: js.Function0[Unit]): Disposable = js.native
  
  /**
    * Gets the disposable that does nothing when disposed.
    */
  var empty: IDisposable = js.native
  
  /**
    * Validates whether the given object is a disposable
    * @param {Object} Object to test whether it has a dispose method
    * @returns {Boolean} true if a disposable object, else false.
    */
  def isDisposable(d: js.Any): Boolean = js.native
}
