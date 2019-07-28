package typings.sax.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EVENTS: js.Array[String] = js.native
  def createStream(): SAXStream = js.native
  def createStream(strict: Boolean): SAXStream = js.native
  def createStream(strict: Boolean, opt: SAXOptions): SAXStream = js.native
  def parser(): SAXParser = js.native
  def parser(strict: Boolean): SAXParser = js.native
  def parser(strict: Boolean, opt: SAXOptions): SAXParser = js.native
}

