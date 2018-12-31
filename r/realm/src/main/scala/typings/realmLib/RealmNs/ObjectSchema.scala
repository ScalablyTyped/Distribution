package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ObjectSchema
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchema }
  */
trait ObjectSchema extends js.Object {
  var name: java.lang.String
  var primaryKey: js.UndefOr[java.lang.String] = js.undefined
  var properties: PropertiesTypes
}

