package typings
package realmLib.RealmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * ObjectSchemaProperty
     * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~ObjectSchemaProperty }
     */

trait ObjectSchemaProperty extends js.Object {
  var default: js.UndefOr[js.Any] = js.undefined
  var indexed: js.UndefOr[scala.Boolean] = js.undefined
  var objectType: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var property: js.UndefOr[java.lang.String] = js.undefined
  var `type`: PropertyType
}

