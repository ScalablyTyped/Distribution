package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicSourceMapConsumerConstructor
  extends ScalablyTyped.runtime.Instantiable1[
      (/* rawSourceMap */ RawSourceMap) | (/* rawSourceMap */ java.lang.String), 
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

