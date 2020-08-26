package typings.scriptableIos.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * _Event driven XML parser._
  *
  * Constructs an event driven XML parser. It does not itself do any parsing therfore the callback functions must be set before starting to parse.
  * @see https://docs.scriptable.app/xmlparser/#-new-xmlparser
  */
@JSGlobal("XMLParser")
@js.native
class XMLParser protected ()
  extends typings.scriptableIos.XMLParser {
  /**
    * _Event driven XML parser._
    *
    * Constructs an event driven XML parser. It does not itself do any parsing therfore the callback functions must be set before starting to parse.
    * @param string - XML string to be parsed.
    * @see https://docs.scriptable.app/xmlparser/#-new-xmlparser
    */
  def this(string: String) = this()
}

