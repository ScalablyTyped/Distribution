package typings.rdfjsFetchLite

import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.DatasetCore
import typings.rdfJs.mod.DatasetCoreFactory
import typings.rdfJs.mod.Quad
import typings.rdfJs.mod.Stream
import typings.rdfjsFetchLite.anon.FnCall
import typings.rdfjsFetchLite.anon.PickparsersSinkMapEventEm
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.FormData
import typings.std.Headers
import typings.std.RequestInit
import typings.std.Response
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/fetch-lite", JSImport.Namespace)
  @js.native
  def apply(url: String, options: FormatsInit): js.Promise[RdfFetchResponse[Quad]] = js.native
  @JSImport("@rdfjs/fetch-lite", JSImport.Namespace)
  @js.native
  def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](url: String, options: FactoryInit[D, OutQuad, InQuad]): js.Promise[DatasetResponse[D, OutQuad, InQuad]] = js.native
  
  @js.native
  trait DatasetResponse[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends RdfFetchResponse[OutQuad] {
    
    def dataset(): js.Promise[D] = js.native
  }
  object DatasetResponse {
    
    @scala.inline
    def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](
      arrayBuffer: () => js.Promise[ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      dataset: () => js.Promise[D],
      formData: () => js.Promise[FormData],
      headers: Headers,
      json: () => js.Promise[_],
      ok: Boolean,
      quadStream: () => js.Promise[Stream[OutQuad]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      trailer: js.Promise[Headers],
      `type`: ResponseType,
      url: String
    ): DatasetResponse[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], dataset = js.Any.fromFunction0(dataset), formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatasetResponse[D, OutQuad, InQuad]]
    }
    
    @scala.inline
    implicit class DatasetResponseMutableBuilder[Self <: DatasetResponse[_, _, _], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] (val x: Self with (DatasetResponse[D, OutQuad, InQuad])) extends AnyVal {
      
      @scala.inline
      def setDataset(value: () => js.Promise[D]): Self = StObject.set(x, "dataset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FactoryInit[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] extends FormatsInit {
    
    var factory: DatasetCoreFactory[OutQuad, InQuad, D] = js.native
  }
  object FactoryInit {
    
    @scala.inline
    def apply[D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */](factory: DatasetCoreFactory[OutQuad, InQuad, D], formats: PickparsersSinkMapEventEm): FactoryInit[D, OutQuad, InQuad] = {
      val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FactoryInit[D, OutQuad, InQuad]]
    }
    
    @scala.inline
    implicit class FactoryInitMutableBuilder[Self <: FactoryInit[_, _, _], D /* <: DatasetCore[OutQuad, InQuad] */, OutQuad /* <: BaseQuad */, InQuad /* <: BaseQuad */] (val x: Self with (FactoryInit[D, OutQuad, InQuad])) extends AnyVal {
      
      @scala.inline
      def setFactory(value: DatasetCoreFactory[OutQuad, InQuad, D]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FormatsInit extends RequestInit {
    
    var fetch: js.UndefOr[FnCall] = js.native
    
    var formats: PickparsersSinkMapEventEm = js.native
  }
  object FormatsInit {
    
    @scala.inline
    def apply(formats: PickparsersSinkMapEventEm): FormatsInit = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatsInit]
    }
    
    @scala.inline
    implicit class FormatsInitMutableBuilder[Self <: FormatsInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: FnCall): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setFormats(value: PickparsersSinkMapEventEm): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RdfFetchResponse[Q /* <: BaseQuad */] extends Response {
    
    def quadStream(): js.Promise[Stream[Q]] = js.native
  }
  object RdfFetchResponse {
    
    @scala.inline
    def apply[Q /* <: BaseQuad */](
      arrayBuffer: () => js.Promise[ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      headers: Headers,
      json: () => js.Promise[_],
      ok: Boolean,
      quadStream: () => js.Promise[Stream[Q]],
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: () => js.Promise[String],
      trailer: js.Promise[Headers],
      `type`: ResponseType,
      url: String
    ): RdfFetchResponse[Q] = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], quadStream = js.Any.fromFunction0(quadStream), redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RdfFetchResponse[Q]]
    }
    
    @scala.inline
    implicit class RdfFetchResponseMutableBuilder[Self <: RdfFetchResponse[_], Q /* <: BaseQuad */] (val x: Self with RdfFetchResponse[Q]) extends AnyVal {
      
      @scala.inline
      def setQuadStream(value: () => js.Promise[Stream[Q]]): Self = StObject.set(x, "quadStream", js.Any.fromFunction0(value))
    }
  }
}
