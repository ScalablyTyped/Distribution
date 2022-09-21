package typings.saneEmailValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(email: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("sane-email-validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * An ASCII only version of the validator.
    */
  inline def isAsciiEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAsciiEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * An inverted check is also exposed for the ASCII only version.
    */
  inline def isNotAsciiEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotAsciiEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * An inverted check is also exposed.
    */
  inline def isNotEmail(email: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmail")(email.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
