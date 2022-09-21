package typings.reactNativeCommunityCliConfig

import typings.joi.mod.ValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CLIError * / any */ @JSImport("@react-native-community/cli-config/build/errors", "JoiError")
  @js.native
  open class JoiError protected () extends StObject {
    def this(joiError: ValidationError) = this()
  }
}
