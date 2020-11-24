package typings.rxDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-dom", "DisposableCls")
@js.native
class DisposableCls protected ()
  extends typings.rx.mod.DisposableCls {
  /**
    * Provides a set of static methods for creating Disposables.
    * @param {Function} dispose Action to run during the first call to dispose. The action is guaranteed to be run at most once.
    */
  def this(action: js.Function0[Unit]) = this()
}
