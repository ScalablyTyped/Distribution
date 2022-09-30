package typings.storybookTelemetry

import typings.std.Record
import typings.storybookTelemetry.anon.Name
import typings.storybookTelemetry.anon.PartialDependency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageVersionsMod {
  
  @JSImport("@storybook/telemetry/dist/ts3.9/package-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActualPackageVersion(packageName: String): js.Promise[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActualPackageVersion")(packageName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Name]]
  
  inline def getActualPackageVersions(packages: Record[String, PartialDependency]): js.Promise[js.Array[Name]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActualPackageVersions")(packages.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Name]]]
}
