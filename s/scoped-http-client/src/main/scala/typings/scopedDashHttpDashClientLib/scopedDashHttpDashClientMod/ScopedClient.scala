package typings
package scopedDashHttpDashClientLib.scopedDashHttpDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scoped-http-client", "ScopedClient")
@js.native
class ScopedClient protected () extends js.Object {
  def this(url: java.lang.String, options: Options) = this()
  def auth(): ScopedClient = js.native
  def auth(user: java.lang.String): ScopedClient = js.native
  def auth(user: java.lang.String, pass: java.lang.String): ScopedClient = js.native
  def del(): ResponseCallback = js.native
  def del(callback: RequestCallback): ResponseCallback = js.native
  def del(reqBody: java.lang.String): ResponseCallback = js.native
  def del(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def delete(): ResponseCallback = js.native
  def delete(callback: RequestCallback): ResponseCallback = js.native
  def delete(reqBody: java.lang.String): ResponseCallback = js.native
  def delete(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def encoding(): ScopedClient = js.native
  def encoding(e: java.lang.String): ScopedClient = js.native
  def fullPath(p: java.lang.String): java.lang.String = js.native
  def get(): ResponseCallback = js.native
  def get(callback: RequestCallback): ResponseCallback = js.native
  def get(reqBody: java.lang.String): ResponseCallback = js.native
  def get(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def head(): ResponseCallback = js.native
  def head(callback: RequestCallback): ResponseCallback = js.native
  def head(reqBody: java.lang.String): ResponseCallback = js.native
  def head(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def header(name: java.lang.String, value: java.lang.String): ScopedClient = js.native
  def headers(h: js.Any): ScopedClient = js.native
  def host(h: java.lang.String): ScopedClient = js.native
  def join(suffix: java.lang.String): java.lang.String = js.native
  def patch(): ResponseCallback = js.native
  def patch(callback: RequestCallback): ResponseCallback = js.native
  def patch(reqBody: java.lang.String): ResponseCallback = js.native
  def patch(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def path(p: java.lang.String): ScopedClient = js.native
  def port(p: java.lang.String): ScopedClient = js.native
  def port(p: scala.Double): ScopedClient = js.native
  def post(): ResponseCallback = js.native
  def post(callback: RequestCallback): ResponseCallback = js.native
  def post(reqBody: java.lang.String): ResponseCallback = js.native
  def post(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def protocol(p: java.lang.String): ScopedClient = js.native
  def put(): ResponseCallback = js.native
  def put(callback: RequestCallback): ResponseCallback = js.native
  def put(reqBody: java.lang.String): ResponseCallback = js.native
  def put(reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def query(key: js.Any): ScopedClient = js.native
  def query(key: js.Any, value: js.Any): ScopedClient = js.native
  def request(method: java.lang.String): ResponseCallback = js.native
  def request(method: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def request(method: java.lang.String, reqBody: java.lang.String): ResponseCallback = js.native
  def request(method: java.lang.String, reqBody: java.lang.String, callback: RequestCallback): ResponseCallback = js.native
  def scope(options: Options): ScopedClient = js.native
  def scope(options: Options, callback: ScopeCallback): ScopedClient = js.native
  // tslint:disable-next-line unified-signatures
  def scope(url: java.lang.String): ScopedClient = js.native
  def scope(url: java.lang.String, callback: ScopeCallback): ScopedClient = js.native
  def scope(url: java.lang.String, options: Options): ScopedClient = js.native
  def scope(url: java.lang.String, options: Options, callback: ScopeCallback): ScopedClient = js.native
  def timeout(time: js.Any): ScopedClient = js.native
}

