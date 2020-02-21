package typings.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "convert")
@js.native
object convert extends js.Object {
  /**
    * Converts an n3 string to JSON
    * @param n3String The n3 string
    * @param jsonCallback Callback when the operation terminated
    */
  def convertToJson(n3String: String, jsonCallback: js.Function2[/* err */ String, /* jsonString */ String, Unit]): Unit = js.native
  /**
    * Converts an n3 string to n-quads
    * @param n3String The n3 string
    * @param nquadCallback Callback when the operation terminated
    */
  def convertToNQuads(n3String: String, nquadCallback: js.Function2[/* err */ String, /* nquadString */ String, Unit]): Unit = js.native
}

