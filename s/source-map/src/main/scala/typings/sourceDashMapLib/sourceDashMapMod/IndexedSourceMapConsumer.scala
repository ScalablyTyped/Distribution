package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexedSourceMapConsumer extends SourceMapConsumer {
  var sources: js.Array[java.lang.String] = js.native
}

@JSImport("source-map", "IndexedSourceMapConsumer")
@js.native
class IndexedSourceMapConsumerCls protected ()
  extends stdLib.Promise[IndexedSourceMapConsumer] {
  def this(rawSourceMap: java.lang.String) = this()
  def this(rawSourceMap: RawIndexMap) = this()
}

