package typings.rxDom.mod

import typings.rx.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "CompositeDisposableCls")
@js.native
class CompositeDisposableCls protected ()
  extends typings.rx.mod.CompositeDisposableCls {
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

