package typings.realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Realm {
  
  type App[FunctionsFactoryType /* <: js.Object */, CustomDataType /* <: js.Object */] = typings.realm.Realm.App_[FunctionsFactoryType, CustomDataType]
  
  type CollectionChangeCallback[T] = js.Function2[
    /* collection */ typings.realm.Realm.Collection[T], 
    /* changes */ typings.realm.Realm.CollectionChangeSet, 
    scala.Unit
  ]
  
  type ConnectionNotificationCallback = js.Function2[
    /* newState */ typings.realm.Realm.ConnectionState, 
    /* oldState */ typings.realm.Realm.ConnectionState, 
    scala.Unit
  ]
  
  type Credentials[PayloadType /* <: js.Object */] = typings.realm.Realm.Credentials_[PayloadType]
  
  type ErrorCallback = js.Function2[
    /* session */ typings.realm.Realm.App.Sync.Session, 
    /* error */ typings.realm.Realm.SyncError, 
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
  
  /**
    * realm configuration used for overriding default configuration values.
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  // object props type
  type ObjectPropsType = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ProgressNotificationCallback = js.Function2[/* transferred */ scala.Double, /* transferable */ scala.Double, scala.Unit]
  
  // properties types
  type PropertiesTypes = org.scalablytyped.runtime.StringDictionary[
    typings.realm.Realm.PropertyType | typings.realm.Realm.ObjectSchemaProperty | typings.realm.Realm.ObjectSchema
  ]
  
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
    - typings.realm.realmStrings.decimal128
    - typings.realm.realmStrings.objectId
    - typings.realm.realmStrings.string
    - typings.realm.realmStrings.data
    - typings.realm.realmStrings.date
    - typings.realm.realmStrings.list
    - typings.realm.realmStrings.linkingObjects
  */
  type PropertyType = typings.realm.Realm._PropertyType | java.lang.String
  
  /**
    * A function which executes on the MongoDB Realm platform.
    */
  type RealmFunction[R, A /* <: js.Array[_] */] = js.Function1[/* args */ A, js.Promise[R]]
  
  type Services = typings.realm.Realm.Services_
  
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, scala.Boolean])
  
  type UserMap = org.scalablytyped.runtime.StringDictionary[typings.realm.Realm.User[typings.realm.Realm.DefaultFunctionsFactory, js.Any]]
}
