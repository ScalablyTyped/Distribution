package typings.rx.global.Rx

import typings.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Rx.RefCountDisposable")
@js.native
class RefCountDisposableCls protected ()
  extends typings.rx.Rx.RefCountDisposable {
  /**
    * Initializes a new instance of the RefCountDisposable with the specified disposable.
    * @constructor
    * @param {Disposable} disposable Underlying disposable.
    */
  def this(disposable: IDisposable) = this()
}
