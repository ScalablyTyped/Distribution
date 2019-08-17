package typings.reactDashNativeDashFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashFirebaseMod {
  import typings.reactDashNativeDashFirebase.Anon_NativeModuleExists
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.Analytics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.Auth
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.AuthStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.configNs.Config
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.crashlyticsNs.Crashlytics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.Database
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.DatabaseStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Firestore
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FirestoreStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.FunctionsStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.iidNs.InstanceId
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.Links
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.LinksStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.Messaging
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.MessagingStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.Notifications
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.NotificationsStatics
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.perfNs.Perf
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.Storage
  import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.StorageStatics

  // type AdmobModule = FirebaseModuleAndStatics<RNFirebase.admob.AdMob>;
  type AnalyticsModule = FirebaseModuleAndStatics[Analytics, js.Object]
  type AuthModule = FirebaseModuleAndStatics[Auth, AuthStatics]
  type ConfigModule = FirebaseModuleAndStatics[Config, js.Object]
  type CrashlyticsModule = FirebaseModuleAndStatics[Crashlytics, js.Object]
  type DatabaseModule = FirebaseModuleAndStatics[Database, DatabaseStatics]
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
