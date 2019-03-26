package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicSourceMapConsumer extends SourceMapConsumer {
  var file: java.lang.String = js.native
  var sourceRoot: java.lang.String = js.native
  var sources: js.Array[java.lang.String] = js.native
  var sourcesContent: js.Array[java.lang.String] = js.native
}

@JSImport("source-map", "BasicSourceMapConsumer")
@js.native
class BasicSourceMapConsumerCls protected ()
  extends stdLib.Promise[BasicSourceMapConsumer] {
  def this(rawSourceMap: java.lang.String) = this()
  def this(rawSourceMap: RawSourceMap) = this()
}

