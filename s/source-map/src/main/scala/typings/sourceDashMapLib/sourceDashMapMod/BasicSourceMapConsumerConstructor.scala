package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicSourceMapConsumerConstructor
  extends ScalablyTyped.runtime.Instantiable1[
      (/* rawSourceMap */ RawSourceMap) | (/* rawSourceMap */ java.lang.String), 
      stdLib.Promise[BasicSourceMapConsumer]
    ] {
  /**
       * Create a BasicSourceMapConsumer from a SourceMapGenerator.
       *
       * @param sourceMap
       *        The source map that will be consumed.
       */
  def fromSourceMap(sourceMap: SourceMapGenerator): stdLib.Promise[BasicSourceMapConsumer] = js.native
}

