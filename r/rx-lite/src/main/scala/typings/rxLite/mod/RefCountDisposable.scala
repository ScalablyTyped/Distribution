package typings.rxLite.mod

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-lite", "RefCountDisposable")
@js.native
class RefCountDisposable protected ()
  extends typings.rxLite.Rx.RefCountDisposable {
  def this(disposable: IDisposable) = this()
}
