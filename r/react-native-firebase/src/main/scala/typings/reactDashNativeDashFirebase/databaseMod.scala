package typings.reactDashNativeDashFirebase

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase/database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  @js.native
  trait ThenableReference[T]
    extends typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Reference
       with Promise[T]
  
  type DataSnapshot = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.DataSnapshot
  type Database = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Database
  type DatabaseStatics = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.DatabaseStatics
  type Query = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Query
  type QueryErrorCallback = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.QueryErrorCallback
  type QueryEventType = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.QueryEventType
  type QuerySuccessCallback = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.QuerySuccessCallback
  type Reference = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Reference
  type RnReference = typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.RnReference
}

