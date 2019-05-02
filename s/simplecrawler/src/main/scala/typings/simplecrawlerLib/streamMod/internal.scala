package typings
package simplecrawlerLib.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait internal
  extends simplecrawlerLib.eventsMod.EventEmitter {
  def pipe[T /* <: simplecrawlerLib.NodeJSNs.WritableStream */](destination: T): T = js.native
  def pipe[T /* <: simplecrawlerLib.NodeJSNs.WritableStream */](destination: T, options: simplecrawlerLib.Anon_End): T = js.native
}

