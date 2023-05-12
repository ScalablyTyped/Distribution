package typings.simpleIcons

import org.scalablytyped.runtime.StringDictionary
import typings.simpleIcons.typesMod.License
import typings.std.Intl.Collator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sdkMod {
  
  @JSImport("simple-icons/sdk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("simple-icons/sdk", "URL_REGEX")
  @js.native
  val URL_REGEX: js.RegExp = js.native
  
  @JSImport("simple-icons/sdk", "collator")
  @js.native
  val collator: Collator = js.native
  
  inline def getDirnameFromImportMeta(importMetaUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirnameFromImportMeta")(importMetaUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIconDataPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDataPath")().asInstanceOf[String]
  inline def getIconDataPath(rootDir: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDataPath")(rootDir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIconSlug(icon: IconData): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconSlug")(icon.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIconsData(): js.Array[IconData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconsData")().asInstanceOf[js.Array[IconData]]
  inline def getIconsData(rootDir: String): js.Array[IconData] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconsData")(rootDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[IconData]]
  
  inline def getIconsDataString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconsDataString")().asInstanceOf[String]
  inline def getIconsDataString(rootDir: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconsDataString")(rootDir.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getThirdPartyExtensions(): js.Promise[js.Array[ThirdPartyExtension]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThirdPartyExtensions")().asInstanceOf[js.Promise[js.Array[ThirdPartyExtension]]]
  inline def getThirdPartyExtensions(readmePath: String): js.Promise[js.Array[ThirdPartyExtension]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThirdPartyExtensions")(readmePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ThirdPartyExtension]]]
  
  inline def htmlFriendlyToTitle(htmlFriendlyTitle: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlFriendlyToTitle")(htmlFriendlyTitle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeColor(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeColor")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeNewlines(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeNewlines")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def slugToVariableName(slug: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("slugToVariableName")(slug.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def svgToPath(svg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("svgToPath")(svg.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def titleToHtmlFriendly(brandTitle: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleToHtmlFriendly")(brandTitle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def titleToSlug(title: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleToSlug")(title.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Aliases extends StObject {
    
    var aka: js.UndefOr[js.Array[String]] = js.undefined
    
    var dup: js.UndefOr[js.Array[DuplicateAlias]] = js.undefined
    
    var loc: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object Aliases {
    
    inline def apply(): Aliases = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Aliases]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
      
      inline def setAka(value: js.Array[String]): Self = StObject.set(x, "aka", value.asInstanceOf[js.Any])
      
      inline def setAkaUndefined: Self = StObject.set(x, "aka", js.undefined)
      
      inline def setAkaVarargs(value: String*): Self = StObject.set(x, "aka", js.Array(value*))
      
      inline def setDup(value: js.Array[DuplicateAlias]): Self = StObject.set(x, "dup", value.asInstanceOf[js.Any])
      
      inline def setDupUndefined: Self = StObject.set(x, "dup", js.undefined)
      
      inline def setDupVarargs(value: DuplicateAlias*): Self = StObject.set(x, "dup", js.Array(value*))
      
      inline def setLoc(value: StringDictionary[String]): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    }
  }
  
  trait DuplicateAlias extends StObject {
    
    var guidelines: js.UndefOr[String] = js.undefined
    
    var hex: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object DuplicateAlias {
    
    inline def apply(title: String): DuplicateAlias = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuplicateAlias]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplicateAlias] (val x: Self) extends AnyVal {
      
      inline def setGuidelines(value: String): Self = StObject.set(x, "guidelines", value.asInstanceOf[js.Any])
      
      inline def setGuidelinesUndefined: Self = StObject.set(x, "guidelines", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setHexUndefined: Self = StObject.set(x, "hex", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconData extends StObject {
    
    var aliases: js.UndefOr[Aliases] = js.undefined
    
    var guidelines: js.UndefOr[String] = js.undefined
    
    var hex: String
    
    var license: js.UndefOr[License] = js.undefined
    
    var slug: js.UndefOr[String] = js.undefined
    
    var source: String
    
    var title: String
  }
  object IconData {
    
    inline def apply(hex: String, source: String, title: String): IconData = {
      val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconData] (val x: Self) extends AnyVal {
      
      inline def setAliases(value: Aliases): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
      
      inline def setGuidelines(value: String): Self = StObject.set(x, "guidelines", value.asInstanceOf[js.Any])
      
      inline def setGuidelinesUndefined: Self = StObject.set(x, "guidelines", js.undefined)
      
      inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: License): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThirdPartyExtension extends StObject {
    
    var author: ThirdPartyExtensionSubject
    
    var module: ThirdPartyExtensionSubject
  }
  object ThirdPartyExtension {
    
    inline def apply(author: ThirdPartyExtensionSubject, module: ThirdPartyExtensionSubject): ThirdPartyExtension = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdPartyExtension]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThirdPartyExtension] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: ThirdPartyExtensionSubject): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setModule(value: ThirdPartyExtensionSubject): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThirdPartyExtensionSubject extends StObject {
    
    var name: String
    
    var url: String
  }
  object ThirdPartyExtensionSubject {
    
    inline def apply(name: String, url: String): ThirdPartyExtensionSubject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThirdPartyExtensionSubject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThirdPartyExtensionSubject] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
