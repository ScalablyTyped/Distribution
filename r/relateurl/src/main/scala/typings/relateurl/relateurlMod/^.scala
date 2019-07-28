package typings.relateurl.relateurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relateurl", JSImport.Namespace)
@js.native
class ^ protected () extends RelateUrl {
  def this(from: String) = this()
  def this(from: String, options: Options) = this()
}

@JSImport("relateurl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ABSOLUTE: String = js.native
  var PATH_RELATIVE: String = js.native
  var ROOT_RELATIVE: String = js.native
  var SHORTEST: String = js.native
  def relate(from: String, to: String): String = js.native
  def relate(from: String, to: String, options: Options): String = js.native
}

