package typings.request.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestAPI[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions] extends StObject {
  
  def apply(options: TUriUrlOptions with TOptions): TRequest = js.native
  def apply(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def apply(uri: String): TRequest = js.native
  def apply(uri: String, callback: RequestCallback): TRequest = js.native
  def apply(uri: String, options: TOptions): TRequest = js.native
  def apply(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def apply(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def cookie(str: String): js.UndefOr[Cookie] = js.native
  
  var debug: Boolean = js.native
  
  def defaults(options: TOptions): RequestAPI[TRequest, TOptions, RequiredUriUrl] = js.native
  def defaults(options: RequiredUriUrl with TOptions): DefaultUriUrlRequestApi[TRequest, TOptions, OptionalUriUrl] = js.native
  
  def del(options: TUriUrlOptions with TOptions): TRequest = js.native
  def del(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def del(uri: String): TRequest = js.native
  def del(uri: String, callback: RequestCallback): TRequest = js.native
  def del(uri: String, options: TOptions): TRequest = js.native
  def del(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def del(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def delete(options: TUriUrlOptions with TOptions): TRequest = js.native
  def delete(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def delete(uri: String): TRequest = js.native
  def delete(uri: String, callback: RequestCallback): TRequest = js.native
  def delete(uri: String, options: TOptions): TRequest = js.native
  def delete(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def delete(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def forever(agentOptions: js.Any, optionsArg: js.Any): TRequest = js.native
  
  def get(options: TUriUrlOptions with TOptions): TRequest = js.native
  def get(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def get(uri: String): TRequest = js.native
  def get(uri: String, callback: RequestCallback): TRequest = js.native
  def get(uri: String, options: TOptions): TRequest = js.native
  def get(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def get(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def head(options: TUriUrlOptions with TOptions): TRequest = js.native
  def head(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def head(uri: String): TRequest = js.native
  def head(uri: String, callback: RequestCallback): TRequest = js.native
  def head(uri: String, options: TOptions): TRequest = js.native
  def head(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def head(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def initParams(uriOrOpts: RequiredUriUrl with TOptions): RequiredUriUrl with TOptions = js.native
  def initParams(uriOrOpts: RequiredUriUrl with TOptions, callback: RequestCallback): RequiredUriUrl with TOptions = js.native
  def initParams(uriOrOpts: String, callback: RequestCallback): RequiredUriUrl with TOptions = js.native
  def initParams(uri: String): RequiredUriUrl with TOptions = js.native
  def initParams(uri: String, options: TOptions): RequiredUriUrl with TOptions = js.native
  def initParams(uri: String, options: TOptions, callback: RequestCallback): RequiredUriUrl with TOptions = js.native
  def initParams(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): RequiredUriUrl with TOptions = js.native
  
  def jar(): CookieJar = js.native
  def jar(store: js.Any): CookieJar = js.native
  
  def patch(options: TUriUrlOptions with TOptions): TRequest = js.native
  def patch(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def patch(uri: String): TRequest = js.native
  def patch(uri: String, callback: RequestCallback): TRequest = js.native
  def patch(uri: String, options: TOptions): TRequest = js.native
  def patch(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def patch(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def post(options: TUriUrlOptions with TOptions): TRequest = js.native
  def post(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def post(uri: String): TRequest = js.native
  def post(uri: String, callback: RequestCallback): TRequest = js.native
  def post(uri: String, options: TOptions): TRequest = js.native
  def post(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def post(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
  
  def put(options: TUriUrlOptions with TOptions): TRequest = js.native
  def put(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def put(uri: String): TRequest = js.native
  def put(uri: String, callback: RequestCallback): TRequest = js.native
  def put(uri: String, options: TOptions): TRequest = js.native
  def put(uri: String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def put(uri: String, options: js.UndefOr[scala.Nothing], callback: RequestCallback): TRequest = js.native
}
