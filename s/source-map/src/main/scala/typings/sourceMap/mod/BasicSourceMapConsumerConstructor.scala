package typings.sourceMap.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicSourceMapConsumerConstructor
  extends Instantiable1[
      (/* rawSourceMap */ RawSourceMap) | (/* rawSourceMap */ String), 
      js.Promise[BasicSourceMapConsumer]
    ] {
  /**
    * Create a BasicSourceMapConsumer from a SourceMapGenerator.
    *
    * @param sourceMap
    *        The source map that will be consumed.
    */
  def fromSourceMap(sourceMap: SourceMapGenerator): js.Promise[BasicSourceMapConsumer] = js.native
}

