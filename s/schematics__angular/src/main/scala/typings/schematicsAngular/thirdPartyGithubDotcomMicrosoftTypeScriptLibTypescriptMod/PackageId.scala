package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Unique identifier with a package name and version.
  * If changing this, remember to change `packageIdIsEqual`.
  */
trait PackageId extends StObject {
  
  /**
    * Name of the package.
    * Should not include `@types`.
    * If accessing a non-index file, this should include its name e.g. "foo/bar".
    */
  var name: java.lang.String
  
  /**
    * Name of a submodule within this package.
    * May be "".
    */
  var subModuleName: java.lang.String
  
  /** Version of the package, e.g. "1.2.3" */
  var version: java.lang.String
}
object PackageId {
  
  inline def apply(name: java.lang.String, subModuleName: java.lang.String, version: java.lang.String): PackageId = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subModuleName = subModuleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageId] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubModuleName(value: java.lang.String): Self = StObject.set(x, "subModuleName", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: java.lang.String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
