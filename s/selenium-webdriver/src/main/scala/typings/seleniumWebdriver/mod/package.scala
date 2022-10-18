package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumWebdriver.libCapabilitiesMod.IBrowser
import typings.seleniumWebdriver.libCapabilitiesMod.ICapability
import typings.seleniumWebdriver.libInputMod.IKey
import typings.seleniumWebdriver.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Browser: IBrowser = ^.asInstanceOf[js.Dynamic].selectDynamic("Browser").asInstanceOf[IBrowser]

inline def Capability: ICapability = ^.asInstanceOf[js.Dynamic].selectDynamic("Capability").asInstanceOf[ICapability]

inline def Key: IKey = ^.asInstanceOf[js.Dynamic].selectDynamic("Key").asInstanceOf[IKey]

inline def checkedLocator(locator: Locator): typings.seleniumWebdriver.libByMod.By | js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("checkedLocator")(locator.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.libByMod.By | js.Function]

inline def escapeCss(css: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeCss")(css.asInstanceOf[js.Any]).asInstanceOf[String]

inline def locateWith(by: Locator): typings.seleniumWebdriver.libByMod.RelativeBy = ^.asInstanceOf[js.Dynamic].applyDynamic("locateWith")(by.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.libByMod.RelativeBy]

inline def withTagName(tagName: typings.seleniumWebdriver.libByMod.By): typings.seleniumWebdriver.libByMod.RelativeBy = ^.asInstanceOf[js.Dynamic].applyDynamic("withTagName")(tagName.asInstanceOf[js.Any]).asInstanceOf[typings.seleniumWebdriver.libByMod.RelativeBy]

type ConditionFn[T] = js.Function1[/* webdriver */ WebDriver, T | Null | (js.Promise[T | Null])]

type IWebElementId = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.seleniumWebdriver.libByMod.By
  - js.Function
  - typings.seleniumWebdriver.libByMod.ByHash
  - typings.seleniumWebdriver.libByMod.RelativeBy
*/
type Locator = _Locator | js.Function
