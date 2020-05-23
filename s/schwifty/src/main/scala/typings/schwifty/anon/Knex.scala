package typings.schwifty.anon

import typings.knex.mod.Config
import typings.schwifty.mod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Knex extends js.Object {
  var knex: (typings.knex.mod.Knex[_, js.Array[_]]) | Config[_]
  var migrationsDir: String
  var models: js.Array[ModelClass]
}

object Knex {
  @scala.inline
  def apply(
    knex: (typings.knex.mod.Knex[_, js.Array[_]]) | Config[_],
    migrationsDir: String,
    models: js.Array[ModelClass]
  ): Knex = {
    val __obj = js.Dynamic.literal(knex = knex.asInstanceOf[js.Any], migrationsDir = migrationsDir.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knex]
  }
}

