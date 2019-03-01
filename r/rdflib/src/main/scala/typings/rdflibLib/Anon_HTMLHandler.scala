package typings
package rdflibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HTMLHandler extends js.Object {
  var HTMLHandler: rdflibLib.rdflibMod.Handler
  var N3Handler: rdflibLib.rdflibMod.Handler
  var RDFXMLHandler: rdflibLib.rdflibMod.Handler
  var TextHandler: rdflibLib.rdflibMod.Handler
  var XHTMLHandler: rdflibLib.rdflibMod.Handler
  var XMLHandler: rdflibLib.rdflibMod.Handler
}

object Anon_HTMLHandler {
  @scala.inline
  def apply(
    HTMLHandler: rdflibLib.rdflibMod.Handler,
    N3Handler: rdflibLib.rdflibMod.Handler,
    RDFXMLHandler: rdflibLib.rdflibMod.Handler,
    TextHandler: rdflibLib.rdflibMod.Handler,
    XHTMLHandler: rdflibLib.rdflibMod.Handler,
    XMLHandler: rdflibLib.rdflibMod.Handler
  ): Anon_HTMLHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("HTMLHandler")(HTMLHandler)
    __obj.updateDynamic("N3Handler")(N3Handler)
    __obj.updateDynamic("RDFXMLHandler")(RDFXMLHandler)
    __obj.updateDynamic("TextHandler")(TextHandler)
    __obj.updateDynamic("XHTMLHandler")(XHTMLHandler)
    __obj.updateDynamic("XMLHandler")(XMLHandler)
    __obj.asInstanceOf[Anon_HTMLHandler]
  }
}

