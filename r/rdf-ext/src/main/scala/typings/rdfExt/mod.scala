package typings.rdfExt

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Stream
import typings.rdfJs.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rdf-ext", JSImport.Namespace)
  @js.native
  class ^ ()
    extends typings.rdfExt.dataFactoryMod.^
  @JSImport("rdf-ext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("rdf-ext", "Parsers")
  @js.native
  def Parsers: SinkMap[EventEmitter, Stream] = js.native
  @scala.inline
  def Parsers_=(x: SinkMap[EventEmitter, Stream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Parsers")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext", "Serializers")
  @js.native
  def Serializers: SinkMap[Stream, EventEmitter] = js.native
  @scala.inline
  def Serializers_=(x: SinkMap[Stream, EventEmitter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Serializers")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext", "asEvent")
  @js.native
  def asEvent: js.Function1[/* p */ js.Any, EventEmitter] = js.native
  @scala.inline
  def asEvent_=(x: js.Function1[/* p */ js.Any, EventEmitter]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("asEvent")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("rdf-ext", "waitFor")
  @js.native
  def waitFor: js.Function1[/* event */ js.Any, js.Promise[js.Any]] = js.native
  @scala.inline
  def waitFor_=(x: js.Function1[/* event */ js.Any, js.Promise[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(x.asInstanceOf[js.Any])
  
  type DataFactoryExt = typings.rdfExt.dataFactoryMod.^
  
  @js.native
  trait SinkMap[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] extends /* mediaType */ StringDictionary[Sink[InputStream, OutputStream]] {
    
    def find(mediaType: String): Sink[InputStream, OutputStream] = js.native
    
    def `import`(mediaType: String, input: js.Any, options: js.Any): js.Any = js.native
    
    def list(): js.Array[String] = js.native
  }
  object SinkMap {
    
    @scala.inline
    def apply[InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */](
      find: String => Sink[InputStream, OutputStream],
      `import`: (String, js.Any, js.Any) => js.Any,
      list: () => js.Array[String]
    ): SinkMap[InputStream, OutputStream] = {
      val __obj = js.Dynamic.literal(find = js.Any.fromFunction1(find), list = js.Any.fromFunction0(list))
      __obj.updateDynamic("import")(js.Any.fromFunction3(`import`))
      __obj.asInstanceOf[SinkMap[InputStream, OutputStream]]
    }
    
    @scala.inline
    implicit class SinkMapMutableBuilder[Self <: SinkMap[_, _], InputStream /* <: EventEmitter */, OutputStream /* <: EventEmitter */] (val x: Self with (SinkMap[InputStream, OutputStream])) extends AnyVal {
      
      @scala.inline
      def setFind(value: String => Sink[InputStream, OutputStream]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setImport(value: (String, js.Any, js.Any) => js.Any): Self = StObject.set(x, "import", js.Any.fromFunction3(value))
      
      @scala.inline
      def setList(value: () => js.Array[String]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
    }
  }
}
