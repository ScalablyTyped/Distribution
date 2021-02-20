package typings.requestPromiseNative

import org.scalablytyped.runtime.Shortcut
import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.request.mod.Response
import typings.request.mod.UriOptions
import typings.request.mod.UrlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("request-promise-native", JSImport.Namespace)
  @js.native
  val ^ : RequestPromiseAPI = js.native
  
  type FullResponse = Response
  
  type Options = OptionsWithUri | OptionsWithUrl
  
  type OptionsWithUri = UriOptions with RequestPromiseOptions
  
  type OptionsWithUrl = UrlOptions with RequestPromiseOptions
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - js.Thenable because Inheritance from two classes. Inlined 
  - js.Promise because Inheritance from two classes. Inlined  */ @js.native
  trait RequestPromise[T] extends Request {
    
    def promise(): js.Promise[T] = js.native
  }
  
  type RequestPromiseAPI = RequestAPI[RequestPromise[js.Any], RequestPromiseOptions, RequiredUriUrl]
  
  @js.native
  trait RequestPromiseOptions extends CoreOptions {
    
    var resolveWithFullResponse: js.UndefOr[Boolean] = js.native
    
    var simple: js.UndefOr[Boolean] = js.native
    
    var transform: js.UndefOr[
        js.Function3[
          /* body */ js.Any, 
          /* response */ Response, 
          /* resolveWithFullResponse */ js.UndefOr[Boolean], 
          _
        ]
      ] = js.native
    
    var transform2xxOnly: js.UndefOr[Boolean] = js.native
  }
  object RequestPromiseOptions {
    
    @scala.inline
    def apply(): RequestPromiseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestPromiseOptions]
    }
    
    @scala.inline
    implicit class RequestPromiseOptionsMutableBuilder[Self <: RequestPromiseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolveWithFullResponse(value: Boolean): Self = StObject.set(x, "resolveWithFullResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveWithFullResponseUndefined: Self = StObject.set(x, "resolveWithFullResponse", js.undefined)
      
      @scala.inline
      def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      @scala.inline
      def setTransform(
        value: (/* body */ js.Any, /* response */ Response, /* resolveWithFullResponse */ js.UndefOr[Boolean]) => _
      ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransform2xxOnly(value: Boolean): Self = StObject.set(x, "transform2xxOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform2xxOnlyUndefined: Self = StObject.set(x, "transform2xxOnly", js.undefined)
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    }
  }
  
  type _To = RequestPromiseAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RequestPromiseAPI = ^
}
