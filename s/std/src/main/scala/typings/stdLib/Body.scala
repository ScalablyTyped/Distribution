package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Body extends js.Object {
  val body: ReadableStream | scala.Null
  val bodyUsed: scala.Boolean
  def arrayBuffer(): Promise[ArrayBuffer]
  def blob(): Promise[Blob]
  def formData(): Promise[FormData]
  def json(): Promise[_]
  def text(): Promise[java.lang.String]
}

