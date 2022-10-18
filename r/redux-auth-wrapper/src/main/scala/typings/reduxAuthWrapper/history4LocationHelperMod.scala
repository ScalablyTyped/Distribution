package typings.reduxAuthWrapper

import typings.reduxAuthWrapper.history3LocationHelperMod.LocationHelper
import typings.reduxAuthWrapper.history3LocationHelperMod.LocationHelperConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object history4LocationHelperMod {
  
  @JSImport("redux-auth-wrapper/history4/locationHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Props](config: LocationHelperConfig[Props]): LocationHelper[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[LocationHelper[Props]]
}
