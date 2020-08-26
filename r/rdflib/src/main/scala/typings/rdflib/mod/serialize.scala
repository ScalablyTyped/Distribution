package typings.rdflib.mod

import typings.rdflib.anon.Flags
import typings.rdflib.formulaMod.default
import typings.rdflib.typesMod.ContentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "serialize")
@js.native
object serialize extends js.Object {
  def apply(
    /** The graph or nodes that should be serialized */
  target: default | typings.rdflib.tfTypesMod.NamedNode | typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: js.UndefOr[typings.rdflib.storeMod.default],
    base: js.UndefOr[js.Any],
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: js.UndefOr[String | ContentType],
    callback: js.UndefOr[
      js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
    ],
    options: js.UndefOr[Flags]
  ): js.UndefOr[String] = js.native
}

