package typings
package schwiftyLib.schwiftyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationOptions extends js.Object {
  var knex: js.UndefOr[knexLib.knexMod.Knex | knexLib.knexMod.KnexNs.Config] = js.undefined
  var migrateOnStart: js.UndefOr[
    scala.Boolean | schwiftyLib.schwiftyLibStrings.latest | schwiftyLib.schwiftyLibStrings.rollback
  ] = js.undefined
  var migrationsDir: js.UndefOr[java.lang.String] = js.undefined
  var models: js.UndefOr[js.Array[ModelClass] | java.lang.String] = js.undefined
  var teardownOnStop: js.UndefOr[scala.Boolean] = js.undefined
}

