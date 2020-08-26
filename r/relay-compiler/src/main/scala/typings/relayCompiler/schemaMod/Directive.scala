package typings.relayCompiler.schemaMod

import typings.graphql.directiveLocationMod.DirectiveLocationEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  args :std.ReadonlyArray<relay-compiler.relay-compiler/lib/core/Schema.Argument>,   isClient :boolean,   locations :std.ReadonlyArray<graphql.graphql.DirectiveLocationEnum>,   name :string}> */
@js.native
trait Directive extends js.Object {
  val args: js.Array[Argument] = js.native
  val isClient: Boolean = js.native
  val locations: js.Array[DirectiveLocationEnum] = js.native
  val name: String = js.native
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
  @scala.inline
  implicit class DirectiveOps[Self <: Directive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: Argument*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[Argument]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsClient(value: Boolean): Self = this.set("isClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationsVarargs(value: DirectiveLocationEnum*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[DirectiveLocationEnum]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

