package typings.rxDom.mod

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "RefCountDisposable")
@js.native
class RefCountDisposable protected ()
  extends typings.rx.mod.RefCountDisposable {
  def this(disposable: IDisposable) = this()
}

