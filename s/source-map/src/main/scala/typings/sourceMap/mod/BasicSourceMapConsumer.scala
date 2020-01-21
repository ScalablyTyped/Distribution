package typings.sourceMap.mod

import org.scalablytyped.runtime.TopLevel
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
object BasicSourceMapConsumer extends TopLevel[BasicSourceMapConsumerConstructor]

