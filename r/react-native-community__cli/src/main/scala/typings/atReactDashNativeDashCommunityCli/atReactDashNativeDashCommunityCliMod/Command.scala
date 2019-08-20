package typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import typings.atReactDashNativeDashCommunityCli.Anon_Cmd
import typings.atReactDashNativeDashCommunityCli.Anon_Ctx
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var examples: js.UndefOr[js.Array[Anon_Cmd]] = js.undefined
  var name: String
  var options: js.UndefOr[js.Array[Anon_Ctx]] = js.undefined
  def func(argv: js.Array[String], ctx: Config, args: Record[String, String]): js.Promise[Unit]
}

object Command {
  @scala.inline
  def apply(
    func: (js.Array[String], Config, Record[String, String]) => js.Promise[Unit],
    name: String,
    description: String = null,
    examples: js.Array[Anon_Cmd] = null,
    options: js.Array[Anon_Ctx] = null
  ): Command = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), name = name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (examples != null) __obj.updateDynamic("examples")(examples)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Command]
  }
}

