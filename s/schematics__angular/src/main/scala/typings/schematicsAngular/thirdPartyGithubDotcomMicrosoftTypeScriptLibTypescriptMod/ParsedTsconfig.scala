package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedTsconfig extends StObject {
  
  /**
    * Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet
    */
  var extendedConfigPath: js.UndefOr[java.lang.String] = js.undefined
  
  var options: js.UndefOr[CompilerOptions] = js.undefined
  
  var raw: Any
  
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  
  var watchOptions: js.UndefOr[WatchOptions] = js.undefined
}
object ParsedTsconfig {
  
  inline def apply(raw: Any): ParsedTsconfig = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTsconfig]
  }
  
  extension [Self <: ParsedTsconfig](x: Self) {
    
    inline def setExtendedConfigPath(value: java.lang.String): Self = StObject.set(x, "extendedConfigPath", value.asInstanceOf[js.Any])
    
    inline def setExtendedConfigPathUndefined: Self = StObject.set(x, "extendedConfigPath", js.undefined)
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setRaw(value: Any): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisition(value: TypeAcquisition): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisitionUndefined: Self = StObject.set(x, "typeAcquisition", js.undefined)
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
  }
}
