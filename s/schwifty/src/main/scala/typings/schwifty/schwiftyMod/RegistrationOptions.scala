package typings.schwifty.schwiftyMod

import typings.knex.knexMod.Config
import typings.knex.knexMod.Knex
import typings.schwifty.schwiftyStrings.latest
import typings.schwifty.schwiftyStrings.rollback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationOptions extends js.Object {
  var knex: js.UndefOr[(Knex[_, js.Array[_]]) | Config] = js.undefined
  var migrateOnStart: js.UndefOr[Boolean | latest | rollback] = js.undefined
  var migrationsDir: js.UndefOr[String] = js.undefined
  var models: js.UndefOr[js.Array[ModelClass] | String] = js.undefined
  var teardownOnStop: js.UndefOr[Boolean] = js.undefined
}

object RegistrationOptions {
  @scala.inline
  def apply(
    knex: (Knex[_, js.Array[_]]) | Config = null,
    migrateOnStart: Boolean | latest | rollback = null,
    migrationsDir: String = null,
    models: js.Array[ModelClass] | String = null,
    teardownOnStop: js.UndefOr[Boolean] = js.undefined
  ): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (knex != null) __obj.updateDynamic("knex")(knex.asInstanceOf[js.Any])
    if (migrateOnStart != null) __obj.updateDynamic("migrateOnStart")(migrateOnStart.asInstanceOf[js.Any])
    if (migrationsDir != null) __obj.updateDynamic("migrationsDir")(migrationsDir)
    if (models != null) __obj.updateDynamic("models")(models.asInstanceOf[js.Any])
    if (!js.isUndefined(teardownOnStop)) __obj.updateDynamic("teardownOnStop")(teardownOnStop)
    __obj.asInstanceOf[RegistrationOptions]
  }
}

