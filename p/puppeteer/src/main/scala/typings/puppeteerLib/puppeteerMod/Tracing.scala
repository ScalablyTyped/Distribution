package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tracing extends js.Object {
  def start(options: TracingStartOptions): js.Promise[scala.Unit]
  def stop(): js.Promise[nodeLib.Buffer]
}

