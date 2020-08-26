package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iot extends js.Object {
  var description: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var sql: String = js.native
  var sqlVersion: String = js.native
}

object Iot {
  @scala.inline
  def apply(name: String, sql: String, sqlVersion: String): Iot = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iot]
  }
  @scala.inline
  implicit class IotOps[Self <: Iot] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSql(value: String): Self = this.set("sql", value.asInstanceOf[js.Any])
    @scala.inline
    def setSqlVersion(value: String): Self = this.set("sqlVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}

