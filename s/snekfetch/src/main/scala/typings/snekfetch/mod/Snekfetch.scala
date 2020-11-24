package typings.snekfetch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Snekfetch extends Readable {
  
  def attach(name: String, data: String): Snekfetch = js.native
  def attach(name: String, data: String, filename: String): Snekfetch = js.native
  def attach(name: String, data: js.Object): Snekfetch = js.native
  def attach(name: String, data: js.Object, filename: String): Snekfetch = js.native
  def attach(name: String, data: Buffer): Snekfetch = js.native
  def attach(name: String, data: Buffer, filename: String): Snekfetch = js.native
  
  def `catch`(rejector: js.Function1[/* err */ Error, _]): js.Promise[SnekfetchResponse] = js.native
  
  var data: js.Any = js.native
  
  def end(): js.Promise[SnekfetchResponse] = js.native
  def end[T](cb: js.Function2[/* err */ Error | Null, /* res */ SnekfetchResponse | Error | Null, T]): js.Promise[T] = js.native
  
  def query(name: String): Snekfetch = js.native
  def query(name: String, value: String): Snekfetch = js.native
  def query(name: StringDictionary[js.Any]): Snekfetch = js.native
  def query(name: StringDictionary[js.Any], value: String): Snekfetch = js.native
  
  var request: ClientRequest = js.native
  
  val response: SnekfetchResponse | Null = js.native
  
  def send(): Snekfetch = js.native
  def send(data: String): Snekfetch = js.native
  def send(data: js.Object): Snekfetch = js.native
  def send(data: Buffer): Snekfetch = js.native
  
  def set(name: String): Snekfetch = js.native
  def set(name: String, value: String): Snekfetch = js.native
  def set(name: StringDictionary[js.Any]): Snekfetch = js.native
  def set(name: StringDictionary[js.Any], value: String): Snekfetch = js.native
  
  def `then`(): js.Promise[SnekfetchResponse] = js.native
  def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T]): js.Promise[T] = js.native
  def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T], rejector: js.Function1[/* err */ Error, _]): js.Promise[T] = js.native
}
