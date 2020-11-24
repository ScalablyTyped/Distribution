package typings.sourceMap.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexedSourceMapConsumer extends SourceMapConsumer {
  
  var sources: js.Array[String] = js.native
}
@JSImport("source-map", "IndexedSourceMapConsumer")
@js.native
object IndexedSourceMapConsumer extends TopLevel[IndexedSourceMapConsumerConstructor]
