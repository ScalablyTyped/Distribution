package typings.sha.shaMod

import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sha", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check[R](fileName: String, expected: String, cb: CheckCallback[R]): Unit | R = js.native
  def check[R](fileName: String, expected: String, options: ShaOptions, cb: CheckCallback[R]): Unit | R = js.native
  def checkSync(fileName: String, expected: String): Unit = js.native
  def checkSync(fileName: String, expected: String, options: ShaOptions): Unit = js.native
  def get(fileName: String, cb: GetCallback): Unit = js.native
  def get(fileName: String, options: ShaOptions, cb: GetCallback): Unit = js.native
  def getSync(fileName: String): String = js.native
  def getSync(fileName: String, options: ShaOptions): String = js.native
  def stream(expected: String): Transform = js.native
  def stream(expected: String, options: ShaOptions): Transform = js.native
}

