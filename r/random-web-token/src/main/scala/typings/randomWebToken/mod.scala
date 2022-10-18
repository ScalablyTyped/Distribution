package typings.randomWebToken

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-web-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /*
    * @description async validator for genSync() and genAsync() or other Token
    *
    * @param {string} type same type as the generated Token
    *
    * @param {number} length same length as the generated Token
    *
    * @param {string} token The received token from genSync() or genAsync()
    *
    * @param {string | undefined} allowedPlusCharacters (This is optional) extra allowed characters in string -> "!%/"
    *
    * @example asyncValidator("extra", 50, token, "")
    * @returns {Promise<boolean>}
    */
  inline def asyncValidator(`type`: Types, length: Double, token: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncValidator")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def asyncValidator(`type`: Types, length: Double, token: String, allowedPlusCharacters: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncValidator")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any], token.asInstanceOf[js.Any], allowedPlusCharacters.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  /*
    * @description async token generator
    *
    * @param {string} type "normal", "normal+", "medium", "medium+", "extra" or "onlyNumbers"
    *
    * - "normal" = (a-z)
    * - "normal+" = (A-Z)
    * - "medium" = (a-z + 0-9)
    * - "medium+" = (A-Z + 0-9)
    * - "extra" = (a-Z + 0-9)
    * - "onlyNumbers" = (0-9)
    *
    * @param {number} length length of token
    * @example genAsync("extra", 100)
    * @returns {Promise<string>}
    */
  inline def genAsync(`type`: Types, length: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("genAsync")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /*
    * @description sync token generator
    *
    * @param {string} type "normal", "normal+", "medium", "medium+", "extra" or "onlyNumbers"
    *
    * - "normal" = (a-z)
    * - "normal+" = (A-Z)
    * - "medium" = (a-z + 0-9)
    * - "medium+" = (A-Z + 0-9)
    * - "extra" = (a-Z + 0-9)
    * - "onlyNumbers" = (0-9)
    *
    * @param {number} length length of token
    * @example genSync("extra", 100)
    * @returns {string}
    */
  inline def genSync(`type`: Types, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("genSync")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /*
    * @description sync validator for genSync() and genAsync() or other Token
    *
    * @param {string} type same type as the generated Token
    *
    * @param {number} length same length as the generated Token
    *
    * @param {string} token The received token from genSync() or genAsync()
    *
    * @param {string | undefined} allowedPlusCharacters (This is optional) extra allowed characters in string -> "!%/"
    *
    * @example syncValidator("extra", 50, token, "")
    * @returns {boolean}
    */
  inline def syncValidator(`type`: Types, length: Double, token: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("syncValidator")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def syncValidator(`type`: Types, length: Double, token: String, allowedPlusCharacters: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("syncValidator")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any], token.asInstanceOf[js.Any], allowedPlusCharacters.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /*
    * @description Create a Token with your own characters
    *
    * @param {string} characters string Sample: "abc123" generate a token with a,b,c,1,2,3 characters
    * @param {number} length length of the token
    * @example withMyOwnCharacters("abc123", 100)
    * @returns {Promise<string>}
    */
  inline def withMyOwnCharacters(`type`: String, length: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("withMyOwnCharacters")(`type`.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.randomWebToken.randomWebTokenStrings.normal
    - typings.randomWebToken.randomWebTokenStrings.normalPlussign
    - typings.randomWebToken.randomWebTokenStrings.medium
    - typings.randomWebToken.randomWebTokenStrings.mediumPlussign
    - typings.randomWebToken.randomWebTokenStrings.extra
    - typings.randomWebToken.randomWebTokenStrings.onlyNumbers
  */
  trait Types extends StObject
  object Types {
    
    inline def extra: typings.randomWebToken.randomWebTokenStrings.extra = "extra".asInstanceOf[typings.randomWebToken.randomWebTokenStrings.extra]
    
    inline def medium: typings.randomWebToken.randomWebTokenStrings.medium = "medium".asInstanceOf[typings.randomWebToken.randomWebTokenStrings.medium]
    
    inline def mediumPlussign: typings.randomWebToken.randomWebTokenStrings.mediumPlussign = "medium+".asInstanceOf[typings.randomWebToken.randomWebTokenStrings.mediumPlussign]
    
    inline def normal: typings.randomWebToken.randomWebTokenStrings.normal = "normal".asInstanceOf[typings.randomWebToken.randomWebTokenStrings.normal]
    
    inline def normalPlussign: typings.randomWebToken.randomWebTokenStrings.normalPlussign = "normal+".asInstanceOf[typings.randomWebToken.randomWebTokenStrings.normalPlussign]
    
    inline def onlyNumbers: typings.randomWebToken.randomWebTokenStrings.onlyNumbers = "onlyNumbers".asInstanceOf[typings.randomWebToken.randomWebTokenStrings.onlyNumbers]
  }
}
