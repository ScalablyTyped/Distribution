package typings.sdkBase.mod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends EventEmitter {
  
  def await(args: js.Any*): js.Promise[_] = js.native
  
  def awaitFirst(args: js.Any*): js.Promise[_] = js.native
  
  var isReady: Boolean = js.native
  
  var options: BaseOptions = js.native
  
  def ready(): js.Promise[_] = js.native
  def ready(err: Error): Unit = js.native
  def ready(readyCallback: js.Function): Unit = js.native
  def ready(ready: Boolean): Unit = js.native
}
