package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tracing extends js.Object {
  def start(options: TracingStartOptions): stdLib.Promise[scala.Unit]
  def stop(): stdLib.Promise[nodeLib.Buffer]
}

