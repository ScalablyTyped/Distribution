package typings.schwifty

import typings.knex.knexMod.Config
import typings.knex.knexMod.Knex
import typings.schwifty.schwiftyMod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Knex extends js.Object {
  var knex: (Knex[_, js.Array[_]]) | Config
  var migrationsDir: String
  var models: js.Array[ModelClass]
}

object Anon_Knex {
  @scala.inline
  def apply(knex: (Knex[_, js.Array[_]]) | Config, migrationsDir: String, models: js.Array[ModelClass]): Anon_Knex = {
    val __obj = js.Dynamic.literal(knex = knex.asInstanceOf[js.Any], migrationsDir = migrationsDir, models = models)
  
    __obj.asInstanceOf[Anon_Knex]
  }
}

