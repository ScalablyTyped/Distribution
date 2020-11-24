package typings.realm.global.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Realm.JsonSerializationReplacer")
@js.native
object JsonSerializationReplacer extends js.Object {
  
  /**
    * JsonSerializationReplacer solves circular structures when serializing Realm entities
    * @example JSON.stringify(realm.objects("Person"), Realm.JsonSerializationReplacer)
    */
  def apply(key: String, `val`: js.Any): js.Any = js.native
}
