package typings
package simpleDashOauth2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  /** Creates an OAuth2.AccessToken instance */
  def create(tokenToUse: simpleDashOauth2Lib.simpleDashOauth2Mod.Token): simpleDashOauth2Lib.simpleDashOauth2Mod.AccessToken
}

object Anon_Create {
  @scala.inline
  def apply(
    create: js.Function1[
      simpleDashOauth2Lib.simpleDashOauth2Mod.Token, 
      simpleDashOauth2Lib.simpleDashOauth2Mod.AccessToken
    ]
  ): Anon_Create = {
    val __obj = js.Dynamic.literal(create = create)
  
    __obj.asInstanceOf[Anon_Create]
  }
}

