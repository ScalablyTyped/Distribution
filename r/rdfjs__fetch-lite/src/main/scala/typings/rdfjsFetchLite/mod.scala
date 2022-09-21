package typings.rdfjsFetchLite

import typings.rdfjsFetchLite.anon.FnCall
import typings.rdfjsFetchLite.anon.Typeofformats
import typings.rdfjsTypes.dataModelMod.BaseQuad
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.datasetMod.DatasetCoreFactory
import typings.rdfjsTypes.streamMod.Stream
import typings.std.Blob
import typings.std.FormData
import typings.std.RequestInit
import typings.std.Response
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[Quad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[RdfFetchResponse[Quad]]]
  inline def default[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: FactoryInit[D, OutQuad, InQuad]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DatasetResponse[D, OutQuad, InQuad]]]
  
  @JSImport("@rdfjs/fetch-lite", "Headers")
  @js.native
  val Headers: typings.std.Headers = js.native
  
  trait DatasetResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */]
    extends StObject
       with RdfFetchResponse[OutQuad] {
    
    def dataset(): js.Promise[D]
  }
  object DatasetResponse {
    
    inline def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      dataset: () => js.Promise[D],
      formData: () => js.Promise[FormData],
      headers: typings.std.Headers,
      json: () => js.Promise[Any],
      ok: Boolean,
      quadStream: () => js.Promise[Stream[OutQuad]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: ResponseType,
      url: String
    ): DatasetResponse[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], dataset = js.Any.fromFunction0(dataset), formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatasetResponse[D, OutQuad, InQuad]]
    }
    
    extension [Self <: DatasetResponse[?, ?, ?], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](x: Self & (DatasetResponse[D, OutQuad, InQuad])) {
      
      inline def setDataset(value: () => js.Promise[D]): Self = StObject.set(x, "dataset", js.Any.fromFunction0(value))
    }
  }
  
  trait FactoryInit[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */]
    extends StObject
       with FormatsInit {
    
    var factory: DatasetCoreFactory[OutQuad, InQuad, D]
  }
  object FactoryInit {
    
    inline def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](factory: DatasetCoreFactory[OutQuad, InQuad, D], formats: Typeofformats): FactoryInit[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactoryInit[D, OutQuad, InQuad]]
    }
    
    extension [Self <: FactoryInit[?, ?, ?], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](x: Self & (FactoryInit[D, OutQuad, InQuad])) {
      
      inline def setFactory(value: DatasetCoreFactory[OutQuad, InQuad, D]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatsInit
    extends StObject
       with RequestInit {
    
    var fetch: js.UndefOr[FnCall] = js.undefined
    
    var formats: Typeofformats
  }
  object FormatsInit {
    
    inline def apply(formats: Typeofformats): FormatsInit = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatsInit]
    }
    
    extension [Self <: FormatsInit](x: Self) {
      
      inline def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFormats(value: Typeofformats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    }
  }
  
  trait RdfFetchResponse[Q /* <: BaseQuad */]
    extends StObject
       with Response {
    
    def quadStream(): js.Promise[Stream[Q]]
  }
  object RdfFetchResponse {
    
    inline def apply[Q /* <: BaseQuad */](
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      headers: typings.std.Headers,
      json: () => js.Promise[Any],
      ok: Boolean,
      quadStream: () => js.Promise[Stream[Q]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: ResponseType,
      url: String
    ): RdfFetchResponse[Q] = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RdfFetchResponse[Q]]
    }
    
    extension [Self <: RdfFetchResponse[?], Q /* <: BaseQuad */](x: Self & RdfFetchResponse[Q]) {
      
      inline def setQuadStream(value: () => js.Promise[Stream[Q]]): Self = StObject.set(x, "quadStream", js.Any.fromFunction0(value))
    }
  }
}
