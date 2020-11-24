package typings.rxDom.mod

import typings.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-dom", "RefCountDisposableCls")
@js.native
class RefCountDisposableCls protected ()
  extends typings.rx.mod.RefCountDisposableCls {
  /**
    * Initializes a new instance of the RefCountDisposable with the specified disposable.
    * @constructor
    * @param {Disposable} disposable Underlying disposable.
    */
  def this(disposable: IDisposable) = this()
}
