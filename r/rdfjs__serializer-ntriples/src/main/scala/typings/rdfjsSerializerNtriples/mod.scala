package typings.rdfjsSerializerNtriples

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-ntriples", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Serializer[Q]
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter]
  object Serializer {
    
    @scala.inline
    def apply[Q /* <: BaseQuad */](`import`: Stream[Q] => EventEmitter): Serializer[Q] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Serializer[Q]]
    }
  }
}
