package typings.requestPromiseNative

import org.scalablytyped.runtime.Shortcut
import typings.node.urlMod.Url
import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.request.mod.Response
import typings.request.mod.UriOptions
import typings.request.mod.UrlOptions
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("request-promise-native", JSImport.Namespace)
  @js.native
  val ^ : RequestPromiseAPI = js.native
  
  type FullResponse = Response
  
  /* Rewritten from type alias, can be one of: 
    - typings.requestPromiseNative.mod.OptionsWithUri
    - typings.requestPromiseNative.mod.OptionsWithUrl
  */
  trait Options extends StObject
  object Options {
    
    inline def OptionsWithUri(uri: String | Url): typings.requestPromiseNative.mod.OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.requestPromiseNative.mod.OptionsWithUri]
    }
    
    inline def OptionsWithUrl(url: String | Url): typings.requestPromiseNative.mod.OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.requestPromiseNative.mod.OptionsWithUrl]
    }
  }
  
  trait OptionsWithUri
    extends StObject
       with UriOptions
       with RequestPromiseOptions
       with Options
  object OptionsWithUri {
    
    inline def apply(uri: String | Url): OptionsWithUri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUri]
    }
  }
  
  trait OptionsWithUrl
    extends StObject
       with UrlOptions
       with RequestPromiseOptions
       with Options
  object OptionsWithUrl {
    
    inline def apply(url: String | Url): OptionsWithUrl = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithUrl]
    }
  }
  
  @js.native
  trait RequestPromise[T]
    extends Request
       with Promise[T] {
    
    def promise(): js.Promise[T] = js.native
  }
  
  type RequestPromiseAPI = RequestAPI[RequestPromise[Any], RequestPromiseOptions, RequiredUriUrl]
  
  trait RequestPromiseOptions
    extends StObject
       with CoreOptions {
    
    var resolveWithFullResponse: js.UndefOr[Boolean] = js.undefined
    
    var simple: js.UndefOr[Boolean] = js.undefined
    
    var transform: js.UndefOr[
        js.Function3[
          /* body */ Any, 
          /* response */ Response, 
          /* resolveWithFullResponse */ js.UndefOr[Boolean], 
          Any
        ]
      ] = js.undefined
    
    var transform2xxOnly: js.UndefOr[Boolean] = js.undefined
  }
  object RequestPromiseOptions {
    
    inline def apply(): RequestPromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestPromiseOptions]
    }
    
    extension [Self <: RequestPromiseOptions](x: Self) {
      
      inline def setResolveWithFullResponse(value: Boolean): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
      
      inline def setResolveWithFullResponseUndefined: Self = StObject.set(x, "resolveWithFullResponse", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setTransform(
        value: (/* body */ Any, /* response */ Response, /* resolveWithFullResponse */ js.UndefOr[Boolean]) => Any
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      inline def setTransform2xxOnly(value: Boolean): Self = StObject.set(x, "transform2xxOnly", value.asInstanceOf[js.Any])
      
      inline def setTransform2xxOnlyUndefined: Self = StObject.set(x, "transform2xxOnly", js.undefined)
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type _To = RequestPromiseAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RequestPromiseAPI = ^
}
