package typings.rdflib

import typings.rdflib.formulaMod.default
import typings.rdflib.typesMod.ContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/parse", JSImport.Namespace)
@js.native
object parseMod extends js.Object {
  def default(str: String, kb: typings.rdflib.formulaMod.default, base: String): Unit = js.native
  def default(
    str: String,
    kb: typings.rdflib.formulaMod.default,
    base: String,
    contentType: js.UndefOr[scala.Nothing],
    callback: CallbackFunc
  ): Unit = js.native
  def default(str: String, kb: typings.rdflib.formulaMod.default, base: String, contentType: String): Unit = js.native
  def default(
    str: String,
    kb: typings.rdflib.formulaMod.default,
    base: String,
    contentType: String,
    callback: CallbackFunc
  ): Unit = js.native
  def default(str: String, kb: typings.rdflib.formulaMod.default, base: String, contentType: ContentType): Unit = js.native
  def default(
    str: String,
    kb: typings.rdflib.formulaMod.default,
    base: String,
    contentType: ContentType,
    callback: CallbackFunc
  ): Unit = js.native
  type CallbackFunc = js.Function2[/* error */ js.Any, /* kb */ default | Null, Unit]
}

