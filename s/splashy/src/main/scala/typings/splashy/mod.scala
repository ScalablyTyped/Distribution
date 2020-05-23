package typings.splashy

import typings.node.Buffer
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("splashy", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(source: ImageSource): js.Promise[js.Array[String]] = js.native
  type ImageSource = String | HTMLImageElement | Buffer
}

