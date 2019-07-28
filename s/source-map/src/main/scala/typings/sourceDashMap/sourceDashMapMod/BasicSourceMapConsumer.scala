package typings.sourceDashMap.sourceDashMapMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicSourceMapConsumer extends SourceMapConsumer {
  var file: String = js.native
  var sourceRoot: String = js.native
  var sources: js.Array[String] = js.native
  var sourcesContent: js.Array[String] = js.native
}

@JSImport("source-map", "BasicSourceMapConsumer")
@js.native
class BasicSourceMapConsumerCls protected () extends Promise[BasicSourceMapConsumer] {
  def this(rawSourceMap: String) = this()
  def this(rawSourceMap: RawSourceMap) = this()
}

