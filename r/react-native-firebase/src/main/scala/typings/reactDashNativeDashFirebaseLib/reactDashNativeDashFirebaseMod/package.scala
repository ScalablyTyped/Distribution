package typings
package reactDashNativeDashFirebaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashFirebaseMod {
  // type AdmobModule = FirebaseModuleAndStatics<RNFirebase.admob.AdMob>;
  type AnalyticsModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Analytics, 
    js.Object
  ]
  type AuthModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.Auth, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.authNs.AuthStatics
  ]
  type ConfigModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.configNs.Config, 
    js.Object
  ]
  type CrashlyticsModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.crashlyticsNs.Crashlytics, 
    js.Object
  ]
  type DatabaseModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.Database, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.databaseNs.DatabaseStatics
  ]
  type FirebaseModuleAndStatics[M, S] = reactDashNativeDashFirebaseLib.Anon_NativeModuleExists[M] with S
  type FirestoreModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Firestore, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FirestoreStatics
  ]
  type FunctionsModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.Functions, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.functionsNs.FunctionsStatics
  ]
  type IidModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.iidNs.InstanceId, 
    js.Object
  ]
  type LinksModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.Links, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.linksNs.LinksStatics
  ]
  type MessagingModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.Messaging, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.messagingNs.MessagingStatics
  ]
  type NotificationsModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.Notifications, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.NotificationsStatics
  ]
  type PerfModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.perfNs.Perf, 
    js.Object
  ]
  type StorageModule = FirebaseModuleAndStatics[
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.Storage, 
    reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.StorageStatics
  ]
}
