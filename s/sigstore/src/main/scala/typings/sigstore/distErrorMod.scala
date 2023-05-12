package typings.sigstore

import typings.sigstore.anon.Cause
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distErrorMod {
  
  @JSImport("sigstore/dist/error", "InternalError")
  @js.native
  open class InternalError protected ()
    extends StObject
       with BaseError {
    def this(param0: Cause) = this()
    
    var code: InternalErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sigstore/dist/error", "PolicyError")
  @js.native
  open class PolicyError ()
    extends StObject
       with BaseError {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sigstore/dist/error", "ValidationError")
  @js.native
  open class ValidationError ()
    extends StObject
       with BaseError {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("sigstore/dist/error", "VerificationError")
  @js.native
  open class VerificationError ()
    extends StObject
       with BaseError {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait BaseError
    extends StObject
       with Error
  object BaseError {
    
    inline def apply(message: String, name: String): BaseError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseError]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sigstore.sigstoreStrings.TLOG_FETCH_ENTRY_ERROR
    - typings.sigstore.sigstoreStrings.TLOG_CREATE_ENTRY_ERROR
    - typings.sigstore.sigstoreStrings.CA_CREATE_SIGNING_CERTIFICATE_ERROR
    - typings.sigstore.sigstoreStrings.TUF_FIND_TARGET_ERROR
    - typings.sigstore.sigstoreStrings.TUF_REFRESH_METADATA_ERROR
    - typings.sigstore.sigstoreStrings.TUF_DOWNLOAD_TARGET_ERROR
    - typings.sigstore.sigstoreStrings.TUF_READ_TARGET_ERROR
  */
  trait InternalErrorCode extends StObject
  object InternalErrorCode {
    
    inline def CA_CREATE_SIGNING_CERTIFICATE_ERROR: typings.sigstore.sigstoreStrings.CA_CREATE_SIGNING_CERTIFICATE_ERROR = "CA_CREATE_SIGNING_CERTIFICATE_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.CA_CREATE_SIGNING_CERTIFICATE_ERROR]
    
    inline def TLOG_CREATE_ENTRY_ERROR: typings.sigstore.sigstoreStrings.TLOG_CREATE_ENTRY_ERROR = "TLOG_CREATE_ENTRY_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.TLOG_CREATE_ENTRY_ERROR]
    
    inline def TLOG_FETCH_ENTRY_ERROR: typings.sigstore.sigstoreStrings.TLOG_FETCH_ENTRY_ERROR = "TLOG_FETCH_ENTRY_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.TLOG_FETCH_ENTRY_ERROR]
    
    inline def TUF_DOWNLOAD_TARGET_ERROR: typings.sigstore.sigstoreStrings.TUF_DOWNLOAD_TARGET_ERROR = "TUF_DOWNLOAD_TARGET_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.TUF_DOWNLOAD_TARGET_ERROR]
    
    inline def TUF_FIND_TARGET_ERROR: typings.sigstore.sigstoreStrings.TUF_FIND_TARGET_ERROR = "TUF_FIND_TARGET_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.TUF_FIND_TARGET_ERROR]
    
    inline def TUF_READ_TARGET_ERROR: typings.sigstore.sigstoreStrings.TUF_READ_TARGET_ERROR = "TUF_READ_TARGET_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.TUF_READ_TARGET_ERROR]
    
    inline def TUF_REFRESH_METADATA_ERROR: typings.sigstore.sigstoreStrings.TUF_REFRESH_METADATA_ERROR = "TUF_REFRESH_METADATA_ERROR".asInstanceOf[typings.sigstore.sigstoreStrings.TUF_REFRESH_METADATA_ERROR]
  }
}
