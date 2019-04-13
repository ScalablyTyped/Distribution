package typings
package relateurlLib.relateurlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relateurl", JSImport.Namespace)
@js.native
class ^ protected () extends RelateUrl {
  def this(from: java.lang.String) = this()
  def this(from: java.lang.String, options: Options) = this()
}

@JSImport("relateurl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ABSOLUTE: java.lang.String = js.native
  var PATH_RELATIVE: java.lang.String = js.native
  var ROOT_RELATIVE: java.lang.String = js.native
  var SHORTEST: java.lang.String = js.native
  def relate(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  def relate(from: java.lang.String, to: java.lang.String, options: Options): java.lang.String = js.native
}

