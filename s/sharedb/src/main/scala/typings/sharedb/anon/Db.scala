package typings.sharedb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.mod.ExtraDB
import typings.sharedb.mod.PubSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Db extends js.Object {
  var db: js.UndefOr[js.Any] = js.native
  var disableDocAction: js.UndefOr[Boolean] = js.native
  var disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.native
  var extraDbs: js.UndefOr[StringDictionary[ExtraDB]] = js.native
  var pubsub: js.UndefOr[PubSub] = js.native
}

object Db {
  @scala.inline
  def apply(): Db = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Db]
  }
  @scala.inline
  implicit class DbOps[Self <: Db] (val x: Self) extends AnyVal {
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
    def setDb(value: js.Any): Self = this.set("db", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDb: Self = this.set("db", js.undefined)
    @scala.inline
    def setDisableDocAction(value: Boolean): Self = this.set("disableDocAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDocAction: Self = this.set("disableDocAction", js.undefined)
    @scala.inline
    def setDisableSpaceDelimitedActions(value: Boolean): Self = this.set("disableSpaceDelimitedActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSpaceDelimitedActions: Self = this.set("disableSpaceDelimitedActions", js.undefined)
    @scala.inline
    def setExtraDbs(value: StringDictionary[ExtraDB]): Self = this.set("extraDbs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraDbs: Self = this.set("extraDbs", js.undefined)
    @scala.inline
    def setPubsub(value: PubSub): Self = this.set("pubsub", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubsub: Self = this.set("pubsub", js.undefined)
  }
  
}

