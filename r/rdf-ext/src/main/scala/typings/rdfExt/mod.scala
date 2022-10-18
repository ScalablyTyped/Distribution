package typings.rdfExt

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import typings.rdfjsTypes.streamMod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-ext", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends typings.rdfExt.libDataFactoryMod.^
  @JSImport("rdf-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("rdf-ext", "Parsers")
  @js.native
  def Parsers: SinkMap[EventEmitter, Stream] = js.native
  inline def Parsers_=(x: SinkMap[EventEmitter, Stream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parsers")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext", "Serializers")
  @js.native
  def Serializers: SinkMap[Stream, EventEmitter] = js.native
  inline def Serializers_=(x: SinkMap[Stream, EventEmitter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Serializers")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext", "asEvent")
  @js.native
  def asEvent: js.Function1[/* p */ Any, EventEmitter] = js.native
  inline def asEvent_=(x: js.Function1[/* p */ Any, EventEmitter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asEvent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext", "waitFor")
  @js.native
  def waitFor: js.Function1[/* event */ Any, js.Promise[Any]] = js.native
  inline def waitFor_=(x: js.Function1[/* event */ Any, js.Promise[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(x.asInstanceOf[js.Any])
  
  type DataFactoryExt = typings.rdfExt.libDataFactoryMod.^
  
  trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */]
    extends StObject
       with /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] {
    
    def find(mediaType: String): Sink[InputStream, OutputStream]
    
    def `import`(mediaType: String, input: Any, options: Any): Any
    
    def list(): js.Array[String]
  }
  object SinkMap {
    
    inline def apply[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](
      find: String => Sink[InputStream, OutputStream],
      `import`: (String, Any, Any) => Any,
      list: () => js.Array[String]
    ): SinkMap[InputStream, OutputStream] = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), list = js.Any.fromFunction0(list))
      __obj.updateDynamic("import")(js.Any.fromFunction3(`import`))
      __obj.asInstanceOf[SinkMap[InputStream, OutputStream]]
    }
    
    extension [Self <: SinkMap[?, ?], InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](x: Self & (SinkMap[InputStream, OutputStream])) {
      
      inline def setFind(value: String => Sink[InputStream, OutputStream]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setImport(value: (String, Any, Any) => Any): Self = StObject.set(x, "import", js.Any.fromFunction3(value))
      
      inline def setList(value: () => js.Array[String]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    }
  }
}
