package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Body extends js.Object {
  val bodyUsed: scala.Boolean
  def arrayBuffer(): stdLib.Promise[stdLib.ArrayBuffer]
  def blob(): stdLib.Promise[Blob]
  def formData(): stdLib.Promise[FormData]
  def json(): stdLib.Promise[_]
  def text(): stdLib.Promise[java.lang.String]
}

