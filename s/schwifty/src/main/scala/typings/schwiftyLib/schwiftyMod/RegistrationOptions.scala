package typings
package schwiftyLib.schwiftyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationOptions extends js.Object {
  var knex: js.UndefOr[
    (knexLib.knexMod.Knex[
      js.Object, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TResult */ _
    ]) | knexLib.knexMod.Config
  ] = js.undefined
  var migrateOnStart: js.UndefOr[
    scala.Boolean | schwiftyLib.schwiftyLibStrings.latest | schwiftyLib.schwiftyLibStrings.rollback
  ] = js.undefined
  var migrationsDir: js.UndefOr[java.lang.String] = js.undefined
  var models: js.UndefOr[js.Array[ModelClass] | java.lang.String] = js.undefined
  var teardownOnStop: js.UndefOr[scala.Boolean] = js.undefined
}

object RegistrationOptions {
  @scala.inline
  def apply(
    knex: (knexLib.knexMod.Knex[
      js.Object, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TResult */ _
    ]) | knexLib.knexMod.Config = null,
    migrateOnStart: scala.Boolean | schwiftyLib.schwiftyLibStrings.latest | schwiftyLib.schwiftyLibStrings.rollback = null,
    migrationsDir: java.lang.String = null,
    models: js.Array[ModelClass] | java.lang.String = null,
    teardownOnStop: js.UndefOr[scala.Boolean] = js.undefined
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

