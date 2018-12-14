package typings
package schwiftyLib.schwiftyMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  def knex(): knexLib.knexMod.Knex = js.native
  def models(): org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.Instantiable0[schwiftyLib.schwiftyMod.Model]] = js.native
  def models(all: scala.Boolean): org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.Instantiable0[schwiftyLib.schwiftyMod.Model]] = js.native
  def schwifty(config: js.Array[schwiftyLib.schwiftyMod.ModelClass]): scala.Unit = js.native
  def schwifty(config: schwiftyLib.Anon_Models): scala.Unit = js.native
  def schwifty(config: schwiftyLib.schwiftyMod.ModelClass): scala.Unit = js.native
}

