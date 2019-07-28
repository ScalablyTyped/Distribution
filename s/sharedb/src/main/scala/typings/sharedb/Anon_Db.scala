package typings.sharedb

import typings.sharedb.sharedbMod.PubSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Db extends js.Object {
  var db: js.UndefOr[js.Any] = js.undefined
  var disableDocAction: js.UndefOr[Boolean] = js.undefined
  var disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.undefined
  var pubsub: js.UndefOr[PubSub] = js.undefined
}

object Anon_Db {
  @scala.inline
  def apply(
    db: js.Any = null,
    disableDocAction: js.UndefOr[Boolean] = js.undefined,
    disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.undefined,
    pubsub: PubSub = null
  ): Anon_Db = {
    val __obj = js.Dynamic.literal()
    if (db != null) __obj.updateDynamic("db")(db)
    if (!js.isUndefined(disableDocAction)) __obj.updateDynamic("disableDocAction")(disableDocAction)
    if (!js.isUndefined(disableSpaceDelimitedActions)) __obj.updateDynamic("disableSpaceDelimitedActions")(disableSpaceDelimitedActions)
    if (pubsub != null) __obj.updateDynamic("pubsub")(pubsub)
    __obj.asInstanceOf[Anon_Db]
  }
}

