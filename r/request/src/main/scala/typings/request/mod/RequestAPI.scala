package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAPI[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions] extends StObject {
  
  def apply(options: TUriUrlOptions & TOptions): TRequest = js.native
  def apply(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def apply(uri: String): TRequest = js.native
  def apply(uri: String, callback: RequestCallback): TRequest = js.native
  def apply(uri: String, options: TOptions): TRequest = js.native
  def apply(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def apply(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def cookie(str: String): js.UndefOr[Cookie] = js.native
  
  var debug: Boolean = js.native
  
  def defaults(options: RequiredUriUrl & TOptions): DefaultUriUrlRequestApi[TRequest, TOptions, OptionalUriUrl] = js.native
  @JSName("defaults")
  def defaults_RequestAPI(options: TOptions): RequestAPI[TRequest, TOptions, RequiredUriUrl] = js.native
  
  def del(options: TUriUrlOptions & TOptions): TRequest = js.native
  def del(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def del(uri: String): TRequest = js.native
  def del(uri: String, callback: RequestCallback): TRequest = js.native
  def del(uri: String, options: TOptions): TRequest = js.native
  def del(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def del(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def delete(options: TUriUrlOptions & TOptions): TRequest = js.native
  def delete(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def delete(uri: String): TRequest = js.native
  def delete(uri: String, callback: RequestCallback): TRequest = js.native
  def delete(uri: String, options: TOptions): TRequest = js.native
  def delete(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def delete(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def forever(agentOptions: Any, optionsArg: Any): TRequest = js.native
  
  def get(options: TUriUrlOptions & TOptions): TRequest = js.native
  def get(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def get(uri: String): TRequest = js.native
  def get(uri: String, callback: RequestCallback): TRequest = js.native
  def get(uri: String, options: TOptions): TRequest = js.native
  def get(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def get(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def head(options: TUriUrlOptions & TOptions): TRequest = js.native
  def head(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def head(uri: String): TRequest = js.native
  def head(uri: String, callback: RequestCallback): TRequest = js.native
  def head(uri: String, options: TOptions): TRequest = js.native
  def head(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def head(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def initParams(uriOrOpts: RequiredUriUrl & TOptions): RequiredUriUrl & TOptions = js.native
  def initParams(uriOrOpts: RequiredUriUrl & TOptions, callback: RequestCallback): RequiredUriUrl & TOptions = js.native
  def initParams(uriOrOpts: String, callback: RequestCallback): RequiredUriUrl & TOptions = js.native
  def initParams(uri: String): RequiredUriUrl & TOptions = js.native
  def initParams(uri: String, options: TOptions): RequiredUriUrl & TOptions = js.native
  def initParams(uri: String, options: TOptions, callback: RequestCallback): RequiredUriUrl & TOptions = js.native
  def initParams(uri: String, options: Unit, callback: RequestCallback): RequiredUriUrl & TOptions = js.native
  
  def jar(): CookieJar = js.native
  def jar(store: Any): CookieJar = js.native
  
  def patch(options: TUriUrlOptions & TOptions): TRequest = js.native
  def patch(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def patch(uri: String): TRequest = js.native
  def patch(uri: String, callback: RequestCallback): TRequest = js.native
  def patch(uri: String, options: TOptions): TRequest = js.native
  def patch(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def patch(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def post(options: TUriUrlOptions & TOptions): TRequest = js.native
  def post(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def post(uri: String): TRequest = js.native
  def post(uri: String, callback: RequestCallback): TRequest = js.native
  def post(uri: String, options: TOptions): TRequest = js.native
  def post(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def post(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
  
  def put(options: TUriUrlOptions & TOptions): TRequest = js.native
  def put(options: TUriUrlOptions & TOptions, callback: RequestCallback): TRequest = js.native
  def put(uri: String): TRequest = js.native
  def put(uri: String, callback: RequestCallback): TRequest = js.native
  def put(uri: String, options: TOptions): TRequest = js.native
  def put(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def put(uri: String, options: Unit, callback: RequestCallback): TRequest = js.native
}
