package typings.sourceMap.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("source-map", "IndexedSourceMapConsumer")
@js.native
class IndexedSourceMapConsumerCls protected () extends Promise[IndexedSourceMapConsumer] {
  def this(rawSourceMap: String) = this()
  def this(rawSourceMap: RawIndexMap) = this()
}

