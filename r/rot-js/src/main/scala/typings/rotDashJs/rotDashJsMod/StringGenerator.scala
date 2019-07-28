package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "StringGenerator")
@js.native
class StringGenerator () extends js.Object {
  def this(options: StringGeneratorOptions) = this()
  def clear(): Unit = js.native
  def generate(): String = js.native
  def getStats(): String = js.native
  def observe(str: String): Unit = js.native
}

