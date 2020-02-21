package typings.relayCompiler

import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import typings.relayCompiler.schemaMod.Argument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs extends js.Object {
  var args: js.Array[Argument]
  var isClient: Boolean
  var locations: js.Array[DirectiveLocationEnum]
  var name: String
}

object AnonArgs {
  @scala.inline
  def apply(
    args: js.Array[Argument],
    isClient: Boolean,
    locations: js.Array[DirectiveLocationEnum],
    name: String
  ): AnonArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isClient = isClient.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArgs]
  }
}

