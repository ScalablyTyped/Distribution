package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StringDictionary
import typings.stencilCore.anon.Latest
import typings.stencilCore.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJsonData extends StObject {
  
  var bin: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var browser: js.UndefOr[String] = js.undefined
  
  var collection: js.UndefOr[String] = js.undefined
  
  @JSName("collection:main")
  var collectionColonmain: js.UndefOr[String] = js.undefined
  
  var dependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var devDependencies: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var `dist-tags`: js.UndefOr[Latest] = js.undefined
  
  var files: js.UndefOr[js.Array[String]] = js.undefined
  
  @JSName("jsnext:main")
  var jsnextColonmain: js.UndefOr[String] = js.undefined
  
  var keywords: js.UndefOr[js.Array[String]] = js.undefined
  
  var license: js.UndefOr[String] = js.undefined
  
  var main: js.UndefOr[String] = js.undefined
  
  var module: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `private`: js.UndefOr[Boolean] = js.undefined
  
  var repository: js.UndefOr[Type] = js.undefined
  
  var scripts: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var types: js.UndefOr[String] = js.undefined
  
  var unpkg: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object PackageJsonData {
  
  inline def apply(): PackageJsonData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageJsonData]
  }
  
  extension [Self <: PackageJsonData](x: Self) {
    
    inline def setBin(value: StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
    
    inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionColonmain(value: String): Self = StObject.set(x, "collection:main", value.asInstanceOf[js.Any])
    
    inline def setCollectionColonmainUndefined: Self = StObject.set(x, "collection:main", js.undefined)
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setDependencies(value: StringDictionary[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDevDependencies(value: StringDictionary[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
    
    inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
    
    inline def `setDist-tags`(value: Latest): Self = StObject.set(x, "dist-tags", value.asInstanceOf[js.Any])
    
    inline def `setDist-tagsUndefined`: Self = StObject.set(x, "dist-tags", js.undefined)
    
    inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setJsnextColonmain(value: String): Self = StObject.set(x, "jsnext:main", value.asInstanceOf[js.Any])
    
    inline def setJsnextColonmainUndefined: Self = StObject.set(x, "jsnext:main", js.undefined)
    
    inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
    
    inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
    
    inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
    
    inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    inline def setRepository(value: Type): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setScripts(value: StringDictionary[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setUnpkg(value: String): Self = StObject.set(x, "unpkg", value.asInstanceOf[js.Any])
    
    inline def setUnpkgUndefined: Self = StObject.set(x, "unpkg", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
