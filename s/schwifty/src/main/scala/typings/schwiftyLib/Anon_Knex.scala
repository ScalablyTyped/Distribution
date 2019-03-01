package typings
package schwiftyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Knex extends js.Object {
  var knex: knexLib.knexMod.Knex | knexLib.knexMod.KnexNs.Config
  var migrationsDir: java.lang.String
  var models: js.Array[schwiftyLib.schwiftyMod.ModelClass]
}

object Anon_Knex {
  @scala.inline
  def apply(
    knex: knexLib.knexMod.Knex | knexLib.knexMod.KnexNs.Config,
    migrationsDir: java.lang.String,
    models: js.Array[schwiftyLib.schwiftyMod.ModelClass]
  ): Anon_Knex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("knex")(knex.asInstanceOf[js.Any])
    __obj.updateDynamic("migrationsDir")(migrationsDir)
    __obj.updateDynamic("models")(models)
    __obj.asInstanceOf[Anon_Knex]
  }
}

