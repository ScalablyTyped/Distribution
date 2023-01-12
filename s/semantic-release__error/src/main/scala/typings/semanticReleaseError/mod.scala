package typings.semanticReleaseError

import typings.semanticReleaseError.semanticReleaseErrorBooleans.`true`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@semantic-release/error", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with SemanticReleaseError {
    def this(message: String) = this()
    def this(message: String, code: String) = this()
    def this(message: Unit, code: String) = this()
    def this(message: String, code: String, details: String) = this()
    def this(message: String, code: Unit, details: String) = this()
    def this(message: Unit, code: String, details: String) = this()
    def this(message: Unit, code: Unit, details: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    /* CompleteClass */
    @JSName("name")
    var name_SemanticReleaseError: typings.semanticReleaseError.semanticReleaseErrorStrings.SemanticReleaseError = js.native
    
    /* CompleteClass */
    var semanticRelease: `true` = js.native
  }
  
  trait SemanticReleaseError
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
    
    var details: js.UndefOr[String] = js.undefined
    
    @JSName("name")
    var name_SemanticReleaseError: typings.semanticReleaseError.semanticReleaseErrorStrings.SemanticReleaseError
    
    var semanticRelease: `true`
  }
  object SemanticReleaseError {
    
    inline def apply(message: String): SemanticReleaseError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = "SemanticReleaseError", semanticRelease = true)
      __obj.asInstanceOf[SemanticReleaseError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticReleaseError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setName(value: typings.semanticReleaseError.semanticReleaseErrorStrings.SemanticReleaseError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSemanticRelease(value: `true`): Self = StObject.set(x, "semanticRelease", value.asInstanceOf[js.Any])
    }
  }
}
