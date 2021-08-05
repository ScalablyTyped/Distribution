package typings.streamsaver

import typings.std.QueuingStrategy
import typings.std.ReadableStream
import typings.std.Transformer
import typings.std.UnderlyingSink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("streamsaver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("streamsaver", "TransformStream")
  @js.native
  class TransformStream[I, O] protected ()
    extends StObject
       with typings.std.TransformStream[I, O] {
    def this(
      transformer: Transformer[I, O],
      writableStrategy: QueuingStrategy[I],
      readableStrategy: QueuingStrategy[O]
    ) = this()
    
    /* CompleteClass */
    override val readable: ReadableStream[O] = js.native
    
    /* CompleteClass */
    override val writable: typings.std.WritableStream[I] = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("streamsaver", "WritableStream")
  @js.native
  class WritableStream[W] ()
    extends StObject
       with typings.std.WritableStream[W] {
    def this(underlyingSink: UnderlyingSink[W]) = this()
    def this(underlyingSink: Unit, strategy: QueuingStrategy[W]) = this()
    def this(underlyingSink: UnderlyingSink[W], strategy: QueuingStrategy[W]) = this()
  }
  
  inline def createWriteStream(filename: String): typings.std.WritableStream[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.std.WritableStream[js.Any]]
  inline def createWriteStream(filename: String, options: CreateWriteStreamOptions[js.Any, js.Any]): typings.std.WritableStream[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.WritableStream[js.Any]]
  
  @JSImport("streamsaver", "mitm")
  @js.native
  def mitm: String = js.native
  inline def mitm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mitm")(x.asInstanceOf[js.Any])
  
  @JSImport("streamsaver", "supported")
  @js.native
  def supported: Boolean = js.native
  inline def supported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("supported")(x.asInstanceOf[js.Any])
  
  @JSImport("streamsaver", "version")
  @js.native
  val version: Version_ = js.native
  
  trait CreateWriteStreamOptions[I, O] extends StObject {
    
    /**
      * URL to serve the stream from. This is the URL that the browser is going to request from the service worker.
      * You might need to provide this if you're using a custom service worker.
      */
    var pathname: js.UndefOr[String] = js.undefined
    
    var readableStrategy: js.UndefOr[QueuingStrategy[O]] = js.undefined
    
    /**
      * Indicates the size of the streamed data and allows the browser to show progress while downloading.
      */
    var size: js.UndefOr[Double] = js.undefined
    
    var writableStrategy: js.UndefOr[QueuingStrategy[I]] = js.undefined
  }
  object CreateWriteStreamOptions {
    
    inline def apply[I, O](): CreateWriteStreamOptions[I, O] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateWriteStreamOptions[I, O]]
    }
    
    extension [Self <: CreateWriteStreamOptions[?, ?], I, O](x: Self & (CreateWriteStreamOptions[I, O])) {
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setReadableStrategy(value: QueuingStrategy[O]): Self = StObject.set(x, "readableStrategy", value.asInstanceOf[js.Any])
      
      inline def setReadableStrategyUndefined: Self = StObject.set(x, "readableStrategy", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setWritableStrategy(value: QueuingStrategy[I]): Self = StObject.set(x, "writableStrategy", value.asInstanceOf[js.Any])
      
      inline def setWritableStrategyUndefined: Self = StObject.set(x, "writableStrategy", js.undefined)
    }
  }
  
  trait Version_ extends StObject {
    
    var dot: Double
    
    var full: String
    
    var major: Double
    
    var minor: Double
  }
  object Version_ {
    
    inline def apply(dot: Double, full: String, major: Double, minor: Double): Version_ = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version_]
    }
    
    extension [Self <: Version_](x: Self) {
      
      inline def setDot(value: Double): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setMajor(value: Double): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: Double): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    }
  }
}
