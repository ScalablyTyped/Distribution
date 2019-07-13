package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credential extends js.Object {
  var credential: java.lang.String
  var credentialProvider: java.lang.String
}

object Anon_Credential {
  @scala.inline
  def apply(credential: java.lang.String, credentialProvider: java.lang.String): Anon_Credential = {
    val __obj = js.Dynamic.literal(credential = credential, credentialProvider = credentialProvider)
  
    __obj.asInstanceOf[Anon_Credential]
  }
}

