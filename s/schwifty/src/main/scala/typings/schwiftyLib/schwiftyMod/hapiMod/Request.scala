package typings
package schwiftyLib.schwiftyMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  def knex(): knexLib.knexMod.Knex = js.native
  def models(): ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.Instantiable0[schwiftyLib.schwiftyMod.Model]] = js.native
  def models(all: scala.Boolean): ScalablyTyped.runtime.StringDictionary[ScalablyTyped.runtime.Instantiable0[schwiftyLib.schwiftyMod.Model]] = js.native
}

