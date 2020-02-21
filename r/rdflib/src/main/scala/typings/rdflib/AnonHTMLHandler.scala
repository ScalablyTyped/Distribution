package typings.rdflib

import typings.rdflib.mod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHTMLHandler extends js.Object {
  var HTMLHandler: Handler
  var N3Handler: Handler
  var RDFXMLHandler: Handler
  var TextHandler: Handler
  var XHTMLHandler: Handler
  var XMLHandler: Handler
}

object AnonHTMLHandler {
  @scala.inline
  def apply(
    HTMLHandler: Handler,
    N3Handler: Handler,
    RDFXMLHandler: Handler,
    TextHandler: Handler,
    XHTMLHandler: Handler,
    XMLHandler: Handler
  ): AnonHTMLHandler = {
    val __obj = js.Dynamic.literal(HTMLHandler = HTMLHandler.asInstanceOf[js.Any], N3Handler = N3Handler.asInstanceOf[js.Any], RDFXMLHandler = RDFXMLHandler.asInstanceOf[js.Any], TextHandler = TextHandler.asInstanceOf[js.Any], XHTMLHandler = XHTMLHandler.asInstanceOf[js.Any], XMLHandler = XMLHandler.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHTMLHandler]
  }
}

