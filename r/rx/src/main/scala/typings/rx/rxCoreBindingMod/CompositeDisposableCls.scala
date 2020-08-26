package typings.rx.rxCoreBindingMod

import typings.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx.core.binding", "CompositeDisposable")
@js.native
class CompositeDisposableCls protected ()
  extends typings.rx.Rx.CompositeDisposable {
  /**
    * Represents a group of disposable resources that are disposed together.
    * @constructor
    */
  def this(disposables: IDisposable*) = this()
  /**
    * Represents a group of disposable resources that are disposed together.
    * @constructor
    */
  def this(disposables: js.Array[IDisposable]) = this()
}

