package typings.storybookComponents.`distTs3Dot9Modules@typesPrettierIndexMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SupportLanguage extends StObject {
  
  var aceMode: js.UndefOr[String] = js.undefined
  
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var codemirrorMimeType: js.UndefOr[String] = js.undefined
  
  var codemirrorMode: js.UndefOr[String] = js.undefined
  
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  
  var filenames: js.UndefOr[js.Array[String]] = js.undefined
  
  var group: js.UndefOr[String] = js.undefined
  
  var linguistLanguageId: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var parsers: js.Array[BuiltInParserName | String]
  
  var since: js.UndefOr[String] = js.undefined
  
  var tmScope: js.UndefOr[String] = js.undefined
  
  var vscodeLanguageIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SupportLanguage {
  
  inline def apply(name: String, parsers: js.Array[BuiltInParserName | String]): SupportLanguage = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportLanguage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SupportLanguage] (val x: Self) extends AnyVal {
    
    inline def setAceMode(value: String): Self = StObject.set(x, "aceMode", value.asInstanceOf[js.Any])
    
    inline def setAceModeUndefined: Self = StObject.set(x, "aceMode", js.undefined)
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setCodemirrorMimeType(value: String): Self = StObject.set(x, "codemirrorMimeType", value.asInstanceOf[js.Any])
    
    inline def setCodemirrorMimeTypeUndefined: Self = StObject.set(x, "codemirrorMimeType", js.undefined)
    
    inline def setCodemirrorMode(value: String): Self = StObject.set(x, "codemirrorMode", value.asInstanceOf[js.Any])
    
    inline def setCodemirrorModeUndefined: Self = StObject.set(x, "codemirrorMode", js.undefined)
    
    inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
    
    inline def setFilenames(value: js.Array[String]): Self = StObject.set(x, "filenames", value.asInstanceOf[js.Any])
    
    inline def setFilenamesUndefined: Self = StObject.set(x, "filenames", js.undefined)
    
    inline def setFilenamesVarargs(value: String*): Self = StObject.set(x, "filenames", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setLinguistLanguageId(value: Double): Self = StObject.set(x, "linguistLanguageId", value.asInstanceOf[js.Any])
    
    inline def setLinguistLanguageIdUndefined: Self = StObject.set(x, "linguistLanguageId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParsers(value: js.Array[BuiltInParserName | String]): Self = StObject.set(x, "parsers", value.asInstanceOf[js.Any])
    
    inline def setParsersVarargs(value: (BuiltInParserName | String)*): Self = StObject.set(x, "parsers", js.Array(value*))
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setTmScope(value: String): Self = StObject.set(x, "tmScope", value.asInstanceOf[js.Any])
    
    inline def setTmScopeUndefined: Self = StObject.set(x, "tmScope", js.undefined)
    
    inline def setVscodeLanguageIds(value: js.Array[String]): Self = StObject.set(x, "vscodeLanguageIds", value.asInstanceOf[js.Any])
    
    inline def setVscodeLanguageIdsUndefined: Self = StObject.set(x, "vscodeLanguageIds", js.undefined)
    
    inline def setVscodeLanguageIdsVarargs(value: String*): Self = StObject.set(x, "vscodeLanguageIds", js.Array(value*))
  }
}
