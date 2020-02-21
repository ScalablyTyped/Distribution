package typings.rdflib.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "parse")
@js.native
object parse extends js.Object {
  def apply(
    str: String,
    kb: Formula,
    base: String,
    contentType: String,
    callback: js.Function2[/* error */ js.Any, /* kb */ Formula, Unit]
  ): Unit = js.native
}

