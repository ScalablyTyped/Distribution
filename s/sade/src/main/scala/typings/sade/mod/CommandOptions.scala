package typings.sade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandOptions extends js.Object {
  /**
    * Optionally define one or more aliases for the current Command.
    * When declared, the `opts.alias` value is passed directly to the [`prog.alias`](#progaliasnames) method.
    */
  var alias: js.UndefOr[String | js.Array[String]] = js.native
  var default: js.UndefOr[Boolean] = js.native
}

object CommandOptions {
  @scala.inline
  def apply(): CommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandOptions]
  }
  @scala.inline
  implicit class CommandOptionsOps[Self <: CommandOptions] (val x: Self) extends AnyVal {
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
    def setAliasVarargs(value: String*): Self = this.set("alias", js.Array(value :_*))
    @scala.inline
    def setAlias(value: String | js.Array[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

