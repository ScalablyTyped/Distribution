package typings.reactNativeFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // type AdmobModule = FirebaseModuleAndStatics<RNFirebase.admob.AdMob>;
  type AnalyticsModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[typings.reactNativeFirebase.mod.RNFirebase.Analytics, js.Object]
  type AuthModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.auth.Auth, 
    typings.reactNativeFirebase.mod.RNFirebase.auth.AuthStatics
  ]
  type ConfigModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[typings.reactNativeFirebase.mod.RNFirebase.config.Config, js.Object]
  type CrashlyticsModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[typings.reactNativeFirebase.mod.RNFirebase.crashlytics.Crashlytics, js.Object]
  type DatabaseModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.database.Database, 
    typings.reactNativeFirebase.mod.RNFirebase.database.DatabaseStatics
  ]
  type Firebase = typings.reactNativeFirebase.mod.Firebase_
  type FirebaseModuleAndStatics[M, S] = typings.reactNativeFirebase.AnonNativeModuleExists[M] with S
  type FirestoreModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.firestore.Firestore, 
    typings.reactNativeFirebase.mod.RNFirebase.firestore.FirestoreStatics
  ]
  type FunctionsModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.functions.Functions, 
    typings.reactNativeFirebase.mod.RNFirebase.functions.FunctionsStatics
  ]
  type IidModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[typings.reactNativeFirebase.mod.RNFirebase.iid.InstanceId, js.Object]
  type LinksModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.links.Links, 
    typings.reactNativeFirebase.mod.RNFirebase.links.LinksStatics
  ]
  type MessagingModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.messaging.Messaging, 
    typings.reactNativeFirebase.mod.RNFirebase.messaging.MessagingStatics
  ]
  type NotificationsModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.notifications.Notifications, 
    typings.reactNativeFirebase.mod.RNFirebase.notifications.NotificationsStatics
  ]
  type PerfModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[typings.reactNativeFirebase.mod.RNFirebase.perf.Perf, js.Object]
  type StorageModule = typings.reactNativeFirebase.mod.FirebaseModuleAndStatics[
    typings.reactNativeFirebase.mod.RNFirebase.storage.Storage, 
    typings.reactNativeFirebase.mod.RNFirebase.storage.StorageStatics
  ]
}
