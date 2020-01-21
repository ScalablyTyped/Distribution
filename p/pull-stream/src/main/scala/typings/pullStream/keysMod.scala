package typings.pullStream

import typings.pullStream.mod.Source
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sources/keys", JSImport.Namespace)
@js.native
object keysMod extends js.Object {
  def apply(obj: js.Array[_]): Source[String] = js.native
  def apply(obj: js.Array[_], onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[String] = js.native
  /**
    * Stream the key names from an object (or array).
    */
  def apply(obj: js.Object): Source[String] = js.native
  def apply(obj: js.Object, onAbort: js.Function1[/* err */ js.UndefOr[Error | Null], _]): Source[String] = js.native
}

