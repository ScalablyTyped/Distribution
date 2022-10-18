package typings.snyk

import typings.snyk.distLibErrorsMod.CustomError
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIacServiceMappingsMod {
  
  @JSImport("snyk/dist/lib/iac/service-mappings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("snyk/dist/lib/iac/service-mappings", "InvalidServiceError")
  @js.native
  open class InvalidServiceError protected () extends CustomError {
    def this(msg: String) = this()
  }
  
  inline def createIgnorePattern(services: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createIgnorePattern")(services.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createIgnorePatternWithMap(services: js.Array[String], serviceMap: Map[String, js.Array[String]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createIgnorePatternWithMap")(services.asInstanceOf[js.Any], serviceMap.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def findServiceMappingForType(`type`: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findServiceMappingForType")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("snyk/dist/lib/iac/service-mappings", "services2resources")
  @js.native
  val services2resources: Map[String, js.Array[String]] = js.native
  
  inline def verifyServiceMappingExists(services: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyServiceMappingExists")(services.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
