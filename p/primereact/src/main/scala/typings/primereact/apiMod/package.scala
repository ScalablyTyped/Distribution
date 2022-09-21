package typings.primereact.apiMod

import typings.primereact.anon.Locale
import typings.primereact.apiMod.^
import typings.primereact.primereactStrings.self
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: APIOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[APIOptions]

inline def PrimeIcons: PrimeIconsOptions = ^.asInstanceOf[js.Dynamic].selectDynamic("PrimeIcons").asInstanceOf[PrimeIconsOptions]

inline def addLocale(locale: String, options: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def locale(locale: String): Locale = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(locale.asInstanceOf[js.Any]).asInstanceOf[Locale]

inline def localeOption(key: String, locale: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("localeOption")(key.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def localeOptions(locale: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("localeOptions")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Object]

inline def updateLocaleOption(key: String, value: Any, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocaleOption")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def updateLocaleOptions(options: js.Object, locale: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLocaleOptions")(options.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Unit]

type AppendToType = js.UndefOr[self | HTMLElement | Null]
