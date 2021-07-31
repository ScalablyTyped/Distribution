package typings.snsValidator

import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sns-validator", JSImport.Namespace)
  @js.native
  /**
    * Create a new MessageValidator
    * @param hostPattern - A pattern used to validate that a message's certificate originates from a trusted domain. Default: `/^sns\.[a-zA-Z0-9\-]{3,}\.amazonaws\.com(\.cn)?$/`
    * @param encoding - The encoding of the messages being signed. Default is `utf8`
    */
  class ^ ()
    extends StObject
       with MessageValidator {
    def this(hostPattern: RegExp) = this()
    def this(hostPattern: Unit, encoding: String) = this()
    def this(hostPattern: RegExp, encoding: String) = this()
  }
  
  @js.native
  trait MessageValidator extends StObject {
    
    /**
      * Validates a message's signature and passes it to the provided callback.
      * @param hash Can be the raw or parsed message.
      * @param cb The callback which is called with the message when it is valid or with an Error when it isn't.
      */
    def validate(hash: String, cb: js.Function2[/* err */ Error | Null, /* message */ js.UndefOr[js.Object], Unit]): Unit = js.native
    def validate(
      hash: js.Object,
      cb: js.Function2[/* err */ Error | Null, /* message */ js.UndefOr[js.Object], Unit]
    ): Unit = js.native
  }
}
