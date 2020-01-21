package typings.scopedHttpClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scoped-http-client", "ScopedClient")
@js.native
class ScopedClient protected () extends js.Object {
  def this(url: String, options: Options) = this()
  def auth(): ScopedClient = js.native
  def auth(user: String): ScopedClient = js.native
  def auth(user: String, pass: String): ScopedClient = js.native
  def del(): ResponseCallback = js.native
  def del(callback: RequestCallback): ResponseCallback = js.native
  def del(reqBody: String): ResponseCallback = js.native
  def del(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def delete(): ResponseCallback = js.native
  def delete(callback: RequestCallback): ResponseCallback = js.native
  def delete(reqBody: String): ResponseCallback = js.native
  def delete(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def encoding(): ScopedClient = js.native
  def encoding(e: String): ScopedClient = js.native
  def fullPath(p: String): String = js.native
  def get(): ResponseCallback = js.native
  def get(callback: RequestCallback): ResponseCallback = js.native
  def get(reqBody: String): ResponseCallback = js.native
  def get(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def head(): ResponseCallback = js.native
  def head(callback: RequestCallback): ResponseCallback = js.native
  def head(reqBody: String): ResponseCallback = js.native
  def head(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def header(name: String, value: String): ScopedClient = js.native
  def headers(h: js.Any): ScopedClient = js.native
  def host(h: String): ScopedClient = js.native
  def join(suffix: String): String = js.native
  def patch(): ResponseCallback = js.native
  def patch(callback: RequestCallback): ResponseCallback = js.native
  def patch(reqBody: String): ResponseCallback = js.native
  def patch(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def path(p: String): ScopedClient = js.native
  def port(p: String): ScopedClient = js.native
  def port(p: Double): ScopedClient = js.native
  def post(): ResponseCallback = js.native
  def post(callback: RequestCallback): ResponseCallback = js.native
  def post(reqBody: String): ResponseCallback = js.native
  def post(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def protocol(p: String): ScopedClient = js.native
  def put(): ResponseCallback = js.native
  def put(callback: RequestCallback): ResponseCallback = js.native
  def put(reqBody: String): ResponseCallback = js.native
  def put(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def query(key: js.Any): ScopedClient = js.native
  def query(key: js.Any, value: js.Any): ScopedClient = js.native
  def request(method: String): ResponseCallback = js.native
  def request(method: String, callback: RequestCallback): ResponseCallback = js.native
  def request(method: String, reqBody: String): ResponseCallback = js.native
  def request(method: String, reqBody: String, callback: RequestCallback): ResponseCallback = js.native
  def scope(options: Options): ScopedClient = js.native
  def scope(options: Options, callback: ScopeCallback): ScopedClient = js.native
  // tslint:disable-next-line unified-signatures
  def scope(url: String): ScopedClient = js.native
  def scope(url: String, callback: ScopeCallback): ScopedClient = js.native
  def scope(url: String, options: Options): ScopedClient = js.native
  def scope(url: String, options: Options, callback: ScopeCallback): ScopedClient = js.native
  def timeout(time: js.Any): ScopedClient = js.native
}

