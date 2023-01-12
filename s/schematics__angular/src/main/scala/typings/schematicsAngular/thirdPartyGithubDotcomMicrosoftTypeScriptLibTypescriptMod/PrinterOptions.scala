package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrinterOptions extends StObject {
  
  var newLine: js.UndefOr[NewLineKind] = js.undefined
  
  var noEmitHelpers: js.UndefOr[Boolean] = js.undefined
  
  var omitTrailingSemicolon: js.UndefOr[Boolean] = js.undefined
  
  var removeComments: js.UndefOr[Boolean] = js.undefined
}
object PrinterOptions {
  
  inline def apply(): PrinterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrinterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrinterOptions] (val x: Self) extends AnyVal {
    
    inline def setNewLine(value: NewLineKind): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
    
    inline def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
    
    inline def setNoEmitHelpers(value: Boolean): Self = StObject.set(x, "noEmitHelpers", value.asInstanceOf[js.Any])
    
    inline def setNoEmitHelpersUndefined: Self = StObject.set(x, "noEmitHelpers", js.undefined)
    
    inline def setOmitTrailingSemicolon(value: Boolean): Self = StObject.set(x, "omitTrailingSemicolon", value.asInstanceOf[js.Any])
    
    inline def setOmitTrailingSemicolonUndefined: Self = StObject.set(x, "omitTrailingSemicolon", js.undefined)
    
    inline def setRemoveComments(value: Boolean): Self = StObject.set(x, "removeComments", value.asInstanceOf[js.Any])
    
    inline def setRemoveCommentsUndefined: Self = StObject.set(x, "removeComments", js.undefined)
  }
}
