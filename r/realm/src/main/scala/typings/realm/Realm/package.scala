package typings.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Realm {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Partial

  type CollectionChangeCallback[T] = js.Function2[/* collection */ Collection[T], /* change */ CollectionChangeSet, Unit]
  /**
    * A function which can be called to migrate a Realm from one version of the schema to another.
    */
  type MigrationCallback = js.Function2[/* oldRealm */ typings.realm.Realm, /* newRealm */ typings.realm.Realm, Unit]
  type ObjectChangeCallback = js.Function2[/* object */ Object, /* changes */ ObjectChangeSet, Unit]
  // object props type
  type ObjectPropsType = StringDictionary[js.Any]
  /**
    * realm configuration used for overriding default configuration values.
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  type PartialConfiguration = Partial[Configuration]
  // properties types
  type PropertiesTypes = StringDictionary[PropertyType | ObjectSchemaProperty]
  /**
    * PropertyType
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~PropertyType }
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.realm.realmStrings.bool
    - typings.realm.realmStrings.int
    - typings.realm.realmStrings.float
    - typings.realm.realmStrings.double
    - typings.realm.realmStrings.string
    - typings.realm.realmStrings.data
    - typings.realm.realmStrings.date
    - typings.realm.realmStrings.list
    - typings.realm.realmStrings.linkingObjects
  */
  type PropertyType = _PropertyType | String
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[String] | (js.Tuple2[String, Boolean])
}
