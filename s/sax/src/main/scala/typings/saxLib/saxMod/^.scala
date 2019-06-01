package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EVENTS: js.Array[java.lang.String] = js.native
  def createStream(): SAXStream = js.native
  def createStream(strict: scala.Boolean): SAXStream = js.native
  def createStream(strict: scala.Boolean, opt: SAXOptions): SAXStream = js.native
  def parser(): SAXParser = js.native
  def parser(strict: scala.Boolean): SAXParser = js.native
  def parser(strict: scala.Boolean, opt: SAXOptions): SAXParser = js.native
}

