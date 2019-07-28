package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credential extends js.Object {
  var credential: String
  var credentialProvider: String
}

object Anon_Credential {
  @scala.inline
  def apply(credential: String, credentialProvider: String): Anon_Credential = {
    val __obj = js.Dynamic.literal(credential = credential, credentialProvider = credentialProvider)
  
    __obj.asInstanceOf[Anon_Credential]
  }
}

