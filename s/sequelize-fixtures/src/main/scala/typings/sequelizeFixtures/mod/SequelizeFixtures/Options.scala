package typings.sequelizeFixtures.mod.SequelizeFixtures

import typings.sequelize.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var log: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var modifyFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var transaction: js.UndefOr[Transaction] = js.undefined
  var transformFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: String = null,
    log: /* message */ String => Unit = null,
    modifyFixtureDataFn: /* data */ js.Any => _ = null,
    transaction: Transaction = null,
    transformFixtureDataFn: /* data */ js.Any => _ = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (modifyFixtureDataFn != null) __obj.updateDynamic("modifyFixtureDataFn")(js.Any.fromFunction1(modifyFixtureDataFn))
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (transformFixtureDataFn != null) __obj.updateDynamic("transformFixtureDataFn")(js.Any.fromFunction1(transformFixtureDataFn))
    __obj.asInstanceOf[Options]
  }
}

