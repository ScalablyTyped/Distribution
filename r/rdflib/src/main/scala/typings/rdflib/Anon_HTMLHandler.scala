package typings.rdflib

import typings.rdflib.rdflibMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HTMLHandler extends js.Object {
  var HTMLHandler: Handler
  var N3Handler: Handler
  var RDFXMLHandler: Handler
  var TextHandler: Handler
  var XHTMLHandler: Handler
  var XMLHandler: Handler
}

object Anon_HTMLHandler {
  @scala.inline
  def apply(
    HTMLHandler: Handler,
    N3Handler: Handler,
    RDFXMLHandler: Handler,
    TextHandler: Handler,
    XHTMLHandler: Handler,
    XMLHandler: Handler
  ): Anon_HTMLHandler = {
    val __obj = js.Dynamic.literal(HTMLHandler = HTMLHandler, N3Handler = N3Handler, RDFXMLHandler = RDFXMLHandler, TextHandler = TextHandler, XHTMLHandler = XHTMLHandler, XMLHandler = XMLHandler)
  
    __obj.asInstanceOf[Anon_HTMLHandler]
  }
}

