package typings.rdflib

import typings.rdflib.anon.Flags
import typings.rdflib.tfTypesMod.BlankNode
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.typesMod.ContentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/serialize", JSImport.Namespace)
@js.native
object serializeMod extends js.Object {
  def default(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.formulaMod.default | NamedNode | BlankNode,
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

