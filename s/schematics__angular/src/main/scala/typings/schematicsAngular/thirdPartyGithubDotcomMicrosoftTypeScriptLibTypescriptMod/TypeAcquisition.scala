package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeAcquisition
  extends StObject
     with /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  
  var disableFilenameBasedTypeAcquisition: js.UndefOr[Boolean] = js.undefined
  
  var enable: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}
object TypeAcquisition {
  
  inline def apply(): TypeAcquisition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeAcquisition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeAcquisition] (val x: Self) extends AnyVal {
    
    inline def setDisableFilenameBasedTypeAcquisition(value: Boolean): Self = StObject.set(x, "disableFilenameBasedTypeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setDisableFilenameBasedTypeAcquisitionUndefined: Self = StObject.set(x, "disableFilenameBasedTypeAcquisition", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setExclude(value: js.Array[java.lang.String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: java.lang.String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: js.Array[java.lang.String]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: java.lang.String*): Self = StObject.set(x, "include", js.Array(value*))
  }
}
