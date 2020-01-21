package typings.sourceMap.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map", "BasicSourceMapConsumer")
@js.native
class BasicSourceMapConsumerCls protected () extends Promise[BasicSourceMapConsumer] {
  def this(rawSourceMap: String) = this()
  def this(rawSourceMap: RawSourceMap) = this()
}

