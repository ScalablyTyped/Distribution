package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobStatic extends js.Object {
  // this require external module https://github.com/DefinitelyTyped/DefinitelyTyped/tree/master/types/oboe
  var JSONStream: js.Any = js.native
  var android: AndroidApi = js.native
  var base64: reactDashNativeDashFetchDashBlobLib.Anon_Decode = js.native
  var fs: FS = js.native
  var ios: IOSApi = js.native
  var net: Net = js.native
  var polyfill: Polyfill = js.native
  def config(options: RNFetchBlobConfig): RNFetchBlobStatic = js.native
  def fetch(method: reactDashNativeDashFetchDashBlobLib.Methods, url: java.lang.String): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(
    method: reactDashNativeDashFetchDashBlobLib.Methods,
    url: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): StatefulPromise[FetchBlobResponse] = js.native
  def fetch(
    method: reactDashNativeDashFetchDashBlobLib.Methods,
    url: java.lang.String,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    body: js.Any
  ): StatefulPromise[FetchBlobResponse] = js.native
  def session(name: java.lang.String): RNFetchBlobSession = js.native
  def wrap(path: java.lang.String): java.lang.String = js.native
}

