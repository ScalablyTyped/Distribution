package typings.rdflib.mod

import typings.rdflib.formulaMod.default
import typings.rdflib.parseMod.CallbackFunc
import typings.rdflib.typesMod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "parse")
@js.native
object parse extends js.Object {
  def apply(str: String, kb: default, base: String): Unit = js.native
  def apply(
    str: String,
    kb: default,
    base: String,
    contentType: js.UndefOr[scala.Nothing],
    callback: CallbackFunc
  ): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: String): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: String, callback: CallbackFunc): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: ContentType): Unit = js.native
  def apply(str: String, kb: default, base: String, contentType: ContentType, callback: CallbackFunc): Unit = js.native
}

