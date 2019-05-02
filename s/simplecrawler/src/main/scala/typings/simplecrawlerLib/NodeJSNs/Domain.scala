package typings
package simplecrawlerLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends EventEmitter {
  def add(emitter: Events): scala.Unit = js.native
  def bind(cb: js.Function2[/* err */ simplecrawlerLib.Error, /* data */ js.Any, _]): js.Any = js.native
  def dispose(): scala.Unit = js.native
  def intercept(cb: js.Function1[/* data */ js.Any, _]): js.Any = js.native
  def remove(emitter: Events): scala.Unit = js.native
  def run(fn: js.Function): scala.Unit = js.native
}

