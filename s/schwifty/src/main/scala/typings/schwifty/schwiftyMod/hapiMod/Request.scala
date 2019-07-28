package typings.schwifty.schwiftyMod.hapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.knex.knexMod.Knex
import typings.schwifty.TypeofClassModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  def knex(): Knex[_, js.Array[_]] = js.native
  def models(): StringDictionary[TypeofClassModel] = js.native
  def models(all: Boolean): StringDictionary[TypeofClassModel] = js.native
}

