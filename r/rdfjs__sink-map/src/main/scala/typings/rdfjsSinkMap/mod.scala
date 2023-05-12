package typings.rdfjsSinkMap

import typings.node.eventsMod.EventEmitter
import typings.rdfjsTypes.streamMod.Sink
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/sink-map", JSImport.Default)
  @js.native
  open class default[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] () extends SinkMap[InputStream, OutputStream]
  
  @JSImport("@rdfjs/sink-map", "SinkMap")
  @js.native
  open class SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] ()
    extends StObject
       with Map[String, Sink[InputStream, OutputStream]] {
    
    def `import`(mediaType: String, input: InputStream): OutputStream | Null = js.native
    def `import`(mediaType: String, input: InputStream, options: Any): OutputStream | Null = js.native
  }
}
