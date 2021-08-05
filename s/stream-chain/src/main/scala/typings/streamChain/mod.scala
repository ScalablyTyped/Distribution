package typings.streamChain

import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stream-chain", JSImport.Namespace)
  @js.native
  class ^ protected () extends Chain_ {
    def this(fns: js.Array[StreamItem]) = this()
    def this(fns: js.Array[StreamItem], options: ChainOptions) = this()
  }
  @JSImport("stream-chain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chain(fns: js.Array[StreamItem]): Chain_ = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(fns.asInstanceOf[js.Any]).asInstanceOf[Chain_]
  inline def chain(fns: js.Array[StreamItem], options: ChainOptions): Chain_ = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(fns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chain_]
  
  trait ChainOptions
    extends StObject
       with DuplexOptions {
    
    var skipEvents: js.UndefOr[Boolean] = js.undefined
  }
  object ChainOptions {
    
    inline def apply(): ChainOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChainOptions]
    }
    
    extension [Self <: ChainOptions](x: Self) {
      
      inline def setSkipEvents(value: Boolean): Self = StObject.set(x, "skipEvents", value.asInstanceOf[js.Any])
      
      inline def setSkipEventsUndefined: Self = StObject.set(x, "skipEvents", js.undefined)
    }
  }
  
  @js.native
  trait Chain_ extends Duplex {
    
    var input: Stream = js.native
    
    var output: Stream = js.native
    
    var streams: js.Array[Stream] = js.native
  }
  
  type Stream = Readable | Writable | Duplex | Transform
  
  type StreamItem = Stream | TransformFunction
  
  type TransformFunction = js.Function2[/* chunk */ js.Any, /* encoding */ js.UndefOr[String], js.Any]
}
