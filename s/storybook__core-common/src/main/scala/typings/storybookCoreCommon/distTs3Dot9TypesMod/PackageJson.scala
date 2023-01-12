package typings.storybookCoreCommon.distTs3Dot9TypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.storybookCoreCommon.storybookCoreCommonStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJson
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var dependencies: js.UndefOr[Record[String, String]] = js.undefined
  
  var devDependencies: js.UndefOr[Record[String, String]] = js.undefined
  
  var eslintConfig: js.UndefOr[Record[String, Any]] = js.undefined
  
  var name: String
  
  var peerDependencies: js.UndefOr[Record[String, String]] = js.undefined
  
  var scripts: js.UndefOr[Record[String, String]] = js.undefined
  
  var `type`: js.UndefOr[module] = js.undefined
  
  var version: String
}
object PackageJson {
  
  inline def apply(name: String, version: String): PackageJson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
    
    inline def setDependencies(value: Record[String, String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDevDependencies(value: Record[String, String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
    
    inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
    
    inline def setEslintConfig(value: Record[String, Any]): Self = StObject.set(x, "eslintConfig", value.asInstanceOf[js.Any])
    
    inline def setEslintConfigUndefined: Self = StObject.set(x, "eslintConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPeerDependencies(value: Record[String, String]): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
    
    inline def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
    
    inline def setScripts(value: Record[String, String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setType(value: module): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
