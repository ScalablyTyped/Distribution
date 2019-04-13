package typings
package sequelizeDashFixturesLib.sequelizeDashFixturesMod.SequelizeFixturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var log: js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]] = js.undefined
  var modifyFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
  var transaction: js.UndefOr[sequelizeLib.sequelizeMod.Transaction] = js.undefined
  var transformFixtureDataFn: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    log: /* message */ java.lang.String => scala.Unit = null,
    modifyFixtureDataFn: /* data */ js.Any => _ = null,
    transaction: sequelizeLib.sequelizeMod.Transaction = null,
    transformFixtureDataFn: /* data */ js.Any => _ = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (modifyFixtureDataFn != null) __obj.updateDynamic("modifyFixtureDataFn")(js.Any.fromFunction1(modifyFixtureDataFn))
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (transformFixtureDataFn != null) __obj.updateDynamic("transformFixtureDataFn")(js.Any.fromFunction1(transformFixtureDataFn))
    __obj.asInstanceOf[Options]
  }
}

