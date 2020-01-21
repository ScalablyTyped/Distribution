package typings.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Realm {
  type CollectionChangeCallback[T] = js.Function2[
    /* collection */ typings.realm.Realm.Collection[T], 
    /* change */ typings.realm.Realm.CollectionChangeSet, 
    scala.Unit
  ]
  /**
    * A function which can be called to migrate a Realm from one version of the schema to another.
    */
  type MigrationCallback = js.Function2[/* oldRealm */ typings.realm.Realm, /* newRealm */ typings.realm.Realm, scala.Unit]
  type ObjectChangeCallback = js.Function2[
    /* object */ typings.realm.Realm.Object, 
    /* changes */ typings.realm.Realm.ObjectChangeSet, 
    scala.Unit
  ]
  // object props type
  type ObjectPropsType = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * realm configuration used for overriding default configuration values.
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  type PartialConfiguration = typings.std.Partial[typings.realm.Realm.Configuration]
  // properties types
  type PropertiesTypes = org.scalablytyped.runtime.StringDictionary[typings.realm.Realm.PropertyType | typings.realm.Realm.ObjectSchemaProperty]
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
  type PropertyType = typings.realm.Realm._PropertyType | java.lang.String
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, scala.Boolean])
}
