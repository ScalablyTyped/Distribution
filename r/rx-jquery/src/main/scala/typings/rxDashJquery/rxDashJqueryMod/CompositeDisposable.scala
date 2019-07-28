package typings.rxDashJquery.rxDashJqueryMod

import typings.rxDashCore.RxNs.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "CompositeDisposable")
@js.native
class CompositeDisposable protected ()
  extends typings.rxDashLite.RxNs.CompositeDisposable {
  def this(disposables: IDisposable*) = this()
  def this(disposables: js.Array[IDisposable]) = this()
}

