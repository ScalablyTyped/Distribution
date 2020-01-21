package typings.stackUtils.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stack-utils", JSImport.Namespace)
@js.native
class ^ () extends StackUtils {
  def this(options: Options) = this()
}

@JSImport("stack-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def nodeInternals(): js.Array[RegExp] = js.native
}

