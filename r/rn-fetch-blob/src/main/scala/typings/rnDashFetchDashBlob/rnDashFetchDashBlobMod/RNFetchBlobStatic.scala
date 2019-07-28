package typings.rnDashFetchDashBlob.rnDashFetchDashBlobMod

import org.scalablytyped.runtime.StringDictionary
import typings.rnDashFetchDashBlob.Anon_Decode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobStatic extends js.Object {
  // this require external module https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/oboe
  var JSONStream: js.Any = js.native
  var android: AndroidApi = js.native
  var base64: Anon_Decode = js.native
  var fs: FS = js.native
  var ios: IOSApi = js.native
  var net: Net = js.native
  var polyfill: Polyfill = js.native
  def config(options: RNFetchBlobConfig): RNFetchBlobStatic = js.native
  def fetch(method: Methods, url: String): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(method: Methods, url: String, headers: StringDictionary[String]): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(method: Methods, url: String, headers: StringDictionary[String], body: js.Object): StatefulPromise[FetchBlobResponse] = js.native
  def session(name: String): RNFetchBlobSession = js.native
  def wrap(path: String): String = js.native
}

