package typings.sourceMapJs

import typings.sourceMapJs.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceMapConsumerMod {
  
  @JSImport("source-map-js/lib/source-map-consumer", "SourceMapConsumer")
  @js.native
  open class SourceMapConsumer protected ()
    extends typings.sourceMapJs.mod.SourceMapConsumer {
    def this(rawSourceMap: RawSourceMap) = this()
  }
  /* static members */
  object SourceMapConsumer {
    
    @JSImport("source-map-js/lib/source-map-consumer", "SourceMapConsumer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("source-map-js/lib/source-map-consumer", "SourceMapConsumer.GENERATED_ORDER")
    @js.native
    def GENERATED_ORDER: Double = js.native
    inline def GENERATED_ORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GENERATED_ORDER")(x.asInstanceOf[js.Any])
    
    @JSImport("source-map-js/lib/source-map-consumer", "SourceMapConsumer.GREATEST_LOWER_BOUND")
    @js.native
    def GREATEST_LOWER_BOUND: Double = js.native
    inline def GREATEST_LOWER_BOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATEST_LOWER_BOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("source-map-js/lib/source-map-consumer", "SourceMapConsumer.LEAST_UPPER_BOUND")
    @js.native
    def LEAST_UPPER_BOUND: Double = js.native
    inline def LEAST_UPPER_BOUND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEAST_UPPER_BOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("source-map-js/lib/source-map-consumer", "SourceMapConsumer.ORIGINAL_ORDER")
    @js.native
    def ORIGINAL_ORDER: Double = js.native
    inline def ORIGINAL_ORDER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGINAL_ORDER")(x.asInstanceOf[js.Any])
  }
}
