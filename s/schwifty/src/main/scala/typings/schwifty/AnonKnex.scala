package typings.schwifty

import typings.knex.mod.Config
import typings.knex.mod.Knex
import typings.schwifty.mod.ModelClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKnex extends js.Object {
  var knex: (Knex[_, js.Array[_]]) | Config[_]
  var migrationsDir: String
  var models: js.Array[ModelClass]
}

object AnonKnex {
  @scala.inline
  def apply(knex: (Knex[_, js.Array[_]]) | Config[_], migrationsDir: String, models: js.Array[ModelClass]): AnonKnex = {
    val __obj = js.Dynamic.literal(knex = knex.asInstanceOf[js.Any], migrationsDir = migrationsDir.asInstanceOf[js.Any], models = models.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKnex]
  }
}

