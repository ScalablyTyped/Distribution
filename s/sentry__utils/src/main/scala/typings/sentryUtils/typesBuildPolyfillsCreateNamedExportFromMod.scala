package typings.sentryUtils

import typings.sentryUtils.typesBuildPolyfillsTypesMod.GenericObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBuildPolyfillsCreateNamedExportFromMod {
  
  @JSImport("@sentry/utils/types/buildPolyfills/_createNamedExportFrom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNamedExportFrom(obj: GenericObject, localName: String, importedName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_createNamedExportFrom")(obj.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], importedName.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
