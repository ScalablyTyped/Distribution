package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Sink
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/concat", JSImport.Namespace)
@js.native
object sinksConcatMod extends js.Object {
  /**
    * Concat stream of strings into single string, then call `cb`.
    */
  def apply(): Sink[String] = js.native
  def apply(cb: js.Function2[/* err */ Error | Null, /* result */ String, _]): Sink[String] = js.native
}

