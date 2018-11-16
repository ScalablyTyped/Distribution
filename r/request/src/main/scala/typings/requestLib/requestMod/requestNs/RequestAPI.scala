package typings
package requestLib.requestMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestAPI[TRequest /* <: Request */, TOptions /* <: CoreOptions */, TUriUrlOptions] extends js.Object {
  var debug: scala.Boolean = js.native
  def apply(options: TUriUrlOptions with TOptions): TRequest = js.native
  def apply(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def apply(uri: java.lang.String): TRequest = js.native
  def apply(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def apply(uri: java.lang.String, options: TOptions): TRequest = js.native
  def apply(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def cookie(str: java.lang.String): js.UndefOr[Cookie] = js.native
  def defaults(options: TOptions): RequestAPI[TRequest, TOptions, RequiredUriUrl] = js.native
  def defaults(options: RequiredUriUrl with TOptions): DefaultUriUrlRequestApi[TRequest, TOptions, OptionalUriUrl] = js.native
  def del(options: TUriUrlOptions with TOptions): TRequest = js.native
  def del(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def del(uri: java.lang.String): TRequest = js.native
  def del(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def del(uri: java.lang.String, options: TOptions): TRequest = js.native
  def del(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def delete(options: TUriUrlOptions with TOptions): TRequest = js.native
  def delete(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def delete(uri: java.lang.String): TRequest = js.native
  def delete(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def delete(uri: java.lang.String, options: TOptions): TRequest = js.native
  def delete(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def forever(agentOptions: js.Any, optionsArg: js.Any): TRequest = js.native
  def get(options: TUriUrlOptions with TOptions): TRequest = js.native
  def get(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def get(uri: java.lang.String): TRequest = js.native
  def get(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def get(uri: java.lang.String, options: TOptions): TRequest = js.native
  def get(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def head(options: TUriUrlOptions with TOptions): TRequest = js.native
  def head(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def head(uri: java.lang.String): TRequest = js.native
  def head(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def head(uri: java.lang.String, options: TOptions): TRequest = js.native
  def head(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def initParams(uriOrOpts: (java.lang.String | RequiredUriUrl) with TOptions): RequiredUriUrl with TOptions = js.native
  def initParams(uriOrOpts: (java.lang.String | RequiredUriUrl) with TOptions, callback: RequestCallback): RequiredUriUrl with TOptions = js.native
  def initParams(uri: java.lang.String): RequiredUriUrl with TOptions = js.native
  def initParams(uri: java.lang.String, options: TOptions): RequiredUriUrl with TOptions = js.native
  def initParams(uri: java.lang.String, options: TOptions, callback: RequestCallback): RequiredUriUrl with TOptions = js.native
  def jar(): CookieJar = js.native
  def jar(store: js.Any): CookieJar = js.native
  def patch(options: TUriUrlOptions with TOptions): TRequest = js.native
  def patch(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def patch(uri: java.lang.String): TRequest = js.native
  def patch(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def patch(uri: java.lang.String, options: TOptions): TRequest = js.native
  def patch(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def post(options: TUriUrlOptions with TOptions): TRequest = js.native
  def post(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def post(uri: java.lang.String): TRequest = js.native
  def post(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def post(uri: java.lang.String, options: TOptions): TRequest = js.native
  def post(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
  def put(options: TUriUrlOptions with TOptions): TRequest = js.native
  def put(options: TUriUrlOptions with TOptions, callback: RequestCallback): TRequest = js.native
  def put(uri: java.lang.String): TRequest = js.native
  def put(uri: java.lang.String, callback: RequestCallback): TRequest = js.native
  def put(uri: java.lang.String, options: TOptions): TRequest = js.native
  def put(uri: java.lang.String, options: TOptions, callback: RequestCallback): TRequest = js.native
}

