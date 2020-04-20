package typings.relayCompiler.schemaMod

import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  args  :std.ReadonlyArray<relay-compiler.relay-compiler/lib/core/Schema.Argument>,   isClient  :boolean,   locations  :std.ReadonlyArray<graphql.graphql.DirectiveLocationEnum>,   name  :string}> */
trait Directive extends js.Object {
  val args: js.Array[Argument]
  val isClient: Boolean
  val locations: js.Array[DirectiveLocationEnum]
  val name: String
}

object Directive {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    isClient: Boolean,
    locations: js.Array[DirectiveLocationEnum],
    name: String
  ): Directive = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isClient = isClient.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
}

