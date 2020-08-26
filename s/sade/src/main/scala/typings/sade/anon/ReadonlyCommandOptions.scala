package typings.sade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<sade.sade.CommandOptions> */
@js.native
trait ReadonlyCommandOptions extends js.Object {
  val alias: js.UndefOr[String | js.Array[String]] = js.native
  val default: js.UndefOr[Boolean] = js.native
}

object ReadonlyCommandOptions {
  @scala.inline
  def apply(): ReadonlyCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyCommandOptions]
  }
  @scala.inline
  implicit class ReadonlyCommandOptionsOps[Self <: ReadonlyCommandOptions] (val x: Self) extends AnyVal {
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

