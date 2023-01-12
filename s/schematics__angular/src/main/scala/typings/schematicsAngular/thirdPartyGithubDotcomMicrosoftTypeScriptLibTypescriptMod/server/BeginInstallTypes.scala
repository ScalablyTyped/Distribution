package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginInstallTypes
  extends StObject
     with InstallTypes {
  
  @JSName("kind")
  val kind_BeginInstallTypes: EventBeginInstallTypes
}
object BeginInstallTypes {
  
  inline def apply(
    eventId: Double,
    kind: EventBeginInstallTypes,
    packagesToInstall: js.Array[String],
    projectName: String,
    typingsInstallerVersion: String
  ): BeginInstallTypes = {
    val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], packagesToInstall = packagesToInstall.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], typingsInstallerVersion = typingsInstallerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginInstallTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeginInstallTypes] (val x: Self) extends AnyVal {
    
    inline def setKind(value: EventBeginInstallTypes): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
