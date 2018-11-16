package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sax", "SAXStream")
@js.native
class SAXStream protected ()
  extends nodeLib.streamMod.Duplex {
  def this(strict: scala.Boolean, opt: SAXOptions) = this()
  var _parser: SAXParser = js.native
}

