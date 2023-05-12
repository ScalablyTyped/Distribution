package typings.rdfjsFetchLite

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsFetchLite.mod.FormatsInit
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.Response
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/fetch-lite/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FetchFactory {
    
    /* CompleteClass */
    override def clone(original: FetchFactory): FetchFactory = js.native
    
    /* CompleteClass */
    override def fetch(url: String): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]] = js.native
    /* CompleteClass */
    override def fetch(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]] = js.native
    /* CompleteClass */
    @JSName("fetch")
    var fetch_Original: Fetch = js.native
  }
  @JSImport("@rdfjs/fetch-lite/Factory", JSImport.Default)
  @js.native
  val default: FetchFactoryCtor = js.native
  
  @js.native
  trait Fetch extends StObject {
    
    def apply(url: String): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]] = js.native
    def apply(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]] = js.native
    
    var Headers: typings.std.Headers = js.native
    
    def config(key: String, value: Any): Unit = js.native
  }
  
  trait FetchFactory extends StObject {
    
    def clone(original: FetchFactory): FetchFactory
    
    def fetch(url: String): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]]
    def fetch(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[DatasetCore[Quad, Quad], Quad, Quad]]
    @JSName("fetch")
    var fetch_Original: Fetch
  }
  object FetchFactory {
    
    inline def apply(clone_ : FetchFactory => FetchFactory, fetch: Fetch): FetchFactory = {
      val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any])
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[FetchFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchFactory] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: FetchFactory => FetchFactory): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      inline def setFetch(value: Fetch): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FetchFactoryCtor
    extends StObject
       with Instantiable0[FetchFactory]
  
  trait RdfFetchResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */]
    extends StObject
       with Response {
    
    def dataset(): js.Promise[D]
    
    def quadStream(): js.Promise[Stream[OutQuad]]
  }
  object RdfFetchResponse {
    
    inline def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      dataset: () => js.Promise[D],
      formData: () => js.Promise[FormData],
      headers: Headers,
      json: () => js.Promise[Any],
      ok: Boolean,
      quadStream: () => js.Promise[Stream[OutQuad]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: ResponseType,
      url: String
    ): RdfFetchResponse[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], dataset = js.Any.fromFunction0(dataset), formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RdfFetchResponse[D, OutQuad, InQuad]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RdfFetchResponse[?, ?, ?], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] (val x: Self & (RdfFetchResponse[D, OutQuad, InQuad])) extends AnyVal {
      
      inline def setDataset(value: () => js.Promise[D]): Self = StObject.set(x, "dataset", js.Any.fromFunction0(value))
      
      inline def setQuadStream(value: () => js.Promise[Stream[OutQuad]]): Self = StObject.set(x, "quadStream", js.Any.fromFunction0(value))
    }
  }
  
  type _To = FetchFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `factoryMod.foo` */
  override def _to: FetchFactoryCtor = default
}
