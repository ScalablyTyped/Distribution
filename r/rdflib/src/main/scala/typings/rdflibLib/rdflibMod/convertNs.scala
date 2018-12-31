package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "convert")
@js.native
object convertNs extends js.Object {
  /**
    * Converts an n3 string to JSON
    * @param n3String The n3 string
    * @param jsonCallback Callback when the operation terminated
    */
  def convertToJson(
    n3String: java.lang.String,
    jsonCallback: js.Function2[/* err */ java.lang.String, /* jsonString */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Converts an n3 string to n-quads
    * @param n3String The n3 string
    * @param nquadCallback Callback when the operation terminated
    */
  def convertToNQuads(
    n3String: java.lang.String,
    nquadCallback: js.Function2[/* err */ java.lang.String, /* nquadString */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

