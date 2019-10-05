package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashFirebaseMod {
  import typings.reactDashNativeDashFirebase.Anon_NativeModuleExists
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.Analytics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.Auth
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.AuthStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.config.Config
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.crashlytics.Crashlytics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.Database
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.database.DatabaseStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Firestore
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.FirestoreStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.functions.Functions
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.functions.FunctionsStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.iid.InstanceId
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links.Links
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links.LinksStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging.Messaging
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.messaging.MessagingStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.Notifications
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.notifications.NotificationsStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.perf.Perf
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.Storage
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.storage.StorageStatics

  // type AdmobModule = FirebaseModuleAndStatics<RNFirebase.admob.AdMob>;
  type AnalyticsModule = FirebaseModuleAndStatics[Analytics, js.Object]
  type AuthModule = FirebaseModuleAndStatics[Auth, AuthStatics]
  type ConfigModule = FirebaseModuleAndStatics[Config, js.Object]
  type CrashlyticsModule = FirebaseModuleAndStatics[Crashlytics, js.Object]
  type DatabaseModule = FirebaseModuleAndStatics[Database, DatabaseStatics]
  type Firebase = Firebase_
  type FirebaseModuleAndStatics[M, S] = Anon_NativeModuleExists[M] with S
  type FirestoreModule = FirebaseModuleAndStatics[Firestore, FirestoreStatics]
  type FunctionsModule = FirebaseModuleAndStatics[Functions, FunctionsStatics]
  type IidModule = FirebaseModuleAndStatics[InstanceId, js.Object]
  type LinksModule = FirebaseModuleAndStatics[Links, LinksStatics]
  type MessagingModule = FirebaseModuleAndStatics[Messaging, MessagingStatics]
  type NotificationsModule = FirebaseModuleAndStatics[Notifications, NotificationsStatics]
  type PerfModule = FirebaseModuleAndStatics[Perf, js.Object]
  type StorageModule = FirebaseModuleAndStatics[Storage, StorageStatics]
}
