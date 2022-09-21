package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.schematicsAngular.typescriptMod.RenameInfoSuccess
  - typings.schematicsAngular.typescriptMod.RenameInfoFailure
*/
trait RenameInfo extends StObject
object RenameInfo {
  
  inline def RenameInfoFailure(localizedErrorMessage: java.lang.String): typings.schematicsAngular.typescriptMod.RenameInfoFailure = {
    val __obj = js.Dynamic.literal(canRename = false, localizedErrorMessage = localizedErrorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.RenameInfoFailure]
  }
  
  inline def RenameInfoSuccess(
    displayName: java.lang.String,
    fullDisplayName: java.lang.String,
    kind: ScriptElementKind,
    kindModifiers: java.lang.String,
    triggerSpan: TextSpan
  ): typings.schematicsAngular.typescriptMod.RenameInfoSuccess = {
    val __obj = js.Dynamic.literal(canRename = true, displayName = displayName.asInstanceOf[js.Any], fullDisplayName = fullDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], kindModifiers = kindModifiers.asInstanceOf[js.Any], triggerSpan = triggerSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.schematicsAngular.typescriptMod.RenameInfoSuccess]
  }
}
