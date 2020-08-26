package typings.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase/database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  @js.native
  trait ThenableReference[T]
    extends js.Promise[T]
       with typings.reactNativeFirebase.mod.RNFirebase.database.Reference
  
  type DataSnapshot = typings.reactNativeFirebase.mod.RNFirebase.database.DataSnapshot
  type Database = typings.reactNativeFirebase.mod.RNFirebase.database.Database
  type DatabaseStatics = typings.reactNativeFirebase.mod.RNFirebase.database.DatabaseStatics
  type Query = typings.reactNativeFirebase.mod.RNFirebase.database.Query
  type QueryErrorCallback = typings.reactNativeFirebase.mod.RNFirebase.database.QueryErrorCallback
  type QueryEventType = typings.reactNativeFirebase.mod.RNFirebase.database.QueryEventType
  type QuerySuccessCallback = typings.reactNativeFirebase.mod.RNFirebase.database.QuerySuccessCallback
  type Reference = typings.reactNativeFirebase.mod.RNFirebase.database.Reference
  type RnReference = typings.reactNativeFirebase.mod.RNFirebase.database.RnReference
}

