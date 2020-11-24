package typings.rxLite.mod

import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-lite", "Disposable")
@js.native
class Disposable protected ()
  extends typings.rxLite.Rx.Disposable {
  def this(action: js.Function0[Unit]) = this()
}
/* static members */
@JSImport("rx-lite", "Disposable")
@js.native
object Disposable extends js.Object {
  
  def create(action: js.Function0[Unit]): IDisposable = js.native
  
  var empty: IDisposable = js.native
}
