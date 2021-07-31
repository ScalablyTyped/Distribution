package typings.sourceMap.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicSourceMapConsumerConstructor
  extends StObject
     with Instantiable1[
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
