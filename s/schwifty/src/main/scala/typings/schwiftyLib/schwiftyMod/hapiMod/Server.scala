package typings
package schwiftyLib.schwiftyMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server extends js.Object {
  def knex(): knexLib.knexMod.Knex[
    js.Object, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for TResult */ _
  ] = js.native
  def models(): org.scalablytyped.runtime.StringDictionary[schwiftyLib.Anon_GetJoiSchema] = js.native
  def models(all: scala.Boolean): org.scalablytyped.runtime.StringDictionary[schwiftyLib.Anon_GetJoiSchema] = js.native
  def schwifty(config: js.Array[schwiftyLib.schwiftyMod.ModelClass]): scala.Unit = js.native
  def schwifty(config: schwiftyLib.Anon_Knex): scala.Unit = js.native
  def schwifty(config: schwiftyLib.schwiftyMod.ModelClass): scala.Unit = js.native
}

