package typings.reactNativeFirebase.mod

import typings.reactNativeFirebase.anon.Call
import typings.reactNativeFirebase.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: Firebase = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[Firebase]

inline def analytics: AnalyticsModule = ^.asInstanceOf[js.Dynamic].selectDynamic("analytics").asInstanceOf[AnalyticsModule]

inline def auth: AuthModule = ^.asInstanceOf[js.Dynamic].selectDynamic("auth").asInstanceOf[AuthModule]

inline def config: ConfigModule = ^.asInstanceOf[js.Dynamic].selectDynamic("config").asInstanceOf[ConfigModule]

inline def crashlytics: CrashlyticsModule = ^.asInstanceOf[js.Dynamic].selectDynamic("crashlytics").asInstanceOf[CrashlyticsModule]

inline def database: DatabaseModule = ^.asInstanceOf[js.Dynamic].selectDynamic("database").asInstanceOf[DatabaseModule]

inline def functions: FunctionsModule = ^.asInstanceOf[js.Dynamic].selectDynamic("functions").asInstanceOf[FunctionsModule]

inline def iid: IidModule = ^.asInstanceOf[js.Dynamic].selectDynamic("iid").asInstanceOf[IidModule]

inline def storage: StorageModule = ^.asInstanceOf[js.Dynamic].selectDynamic("storage").asInstanceOf[StorageModule]

type FirebaseModuleAndStatics[M, S] = Call[M] & S
