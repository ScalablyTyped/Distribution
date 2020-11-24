package typings.rcUpload.anon

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-upload.rc-upload/es/interface.RcFile & {  webkitRelativePath :string | undefined} */
@js.native
trait RcFilewebkitRelativePaths extends js.Object {
  
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  val lastModified: Double = js.native
  
  val name: String = js.native
  
  val size: Double = js.native
  
  def slice(): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: String): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
  
  def stream(): ReadableStream[_] = js.native
  
  def text(): js.Promise[String] = js.native
  
  val `type`: String = js.native
  
  var uid: String = js.native
  
  var webkitRelativePath: js.UndefOr[String] = js.native
}
