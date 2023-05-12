package typings.rdfjsEnvironment

import typings.node.eventsMod.EventEmitter
import typings.rdfjsEnvironment.anon.Factory
import typings.rdfjsSinkMap.mod.SinkMap
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormatsMod {
  
  @JSImport("@rdfjs/environment/lib/Formats", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Formats {
    def this(arg: Factory) = this()
    
    /* CompleteClass */
    override def `import`(other: Formats): Formats = js.native
    
    /* CompleteClass */
    var parsers: SinkMap[EventEmitter, Stream[Quad]] = js.native
    
    /* CompleteClass */
    var serializers: SinkMap[Stream[Quad], EventEmitter] = js.native
  }
  
  trait Formats extends StObject {
    
    def `import`(other: Formats): Formats
    
    var parsers: SinkMap[EventEmitter, Stream[Quad]]
    
    var serializers: SinkMap[Stream[Quad], EventEmitter]
  }
  object Formats {
    
    inline def apply(
      `import`: Formats => Formats,
      parsers: SinkMap[EventEmitter, Stream[Quad]],
      serializers: SinkMap[Stream[Quad], EventEmitter]
    ): Formats = {
      val __obj = js.Dynamic.literal(parsers = parsers.asInstanceOf[js.Any], serializers = serializers.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(js.Any.fromFunction1(`import`))
      __obj.asInstanceOf[Formats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Formats] (val x: Self) extends AnyVal {
      
      inline def setImport(value: Formats => Formats): Self = StObject.set(x, "import", js.Any.fromFunction1(value))
      
      inline def setParsers(value: SinkMap[EventEmitter, Stream[Quad]]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
      
      inline def setSerializers(value: SinkMap[Stream[Quad], EventEmitter]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    }
  }
}
