package typings
package atProtobufjsPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@protobufjs/path", JSImport.Namespace)
@js.native
object pathMod extends js.Object {
  def isAbsolute(path: java.lang.String): scala.Boolean = js.native
  def normalize(path: java.lang.String): java.lang.String = js.native
  def resolve(originPath: java.lang.String, includePath: java.lang.String): java.lang.String = js.native
  def resolve(originPath: java.lang.String, includePath: java.lang.String, alreadyNormalized: scala.Boolean): java.lang.String = js.native
}

