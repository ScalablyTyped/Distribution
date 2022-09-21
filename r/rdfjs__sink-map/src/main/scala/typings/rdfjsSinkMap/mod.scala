package typings.rdfjsSinkMap

import typings.node.eventsMod.EventEmitter
import typings.rdfjsTypes.streamMod.Sink
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/sink-map", JSImport.Namespace)
  @js.native
  open class ^[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] ()
    extends StObject
       with SinkMap[InputStream, OutputStream]
  
  @js.native
  trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */]
    extends StObject
       with Map[String, Sink[InputStream, OutputStream]] {
    
    def `import`(mediaType: String, input: InputStream): OutputStream | Null = js.native
    def `import`(mediaType: String, input: InputStream, options: Any): OutputStream | Null = js.native
  }
}
