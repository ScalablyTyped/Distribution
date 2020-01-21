package typings.simpleOauth2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.simpleOauth2.simpleOauth2Strings.access_token
  - typings.simpleOauth2.simpleOauth2Strings.refresh_token
*/
trait TokenType extends js.Object

object TokenType {
  @scala.inline
  def access_token: typings.simpleOauth2.simpleOauth2Strings.access_token = this.cast("access_token")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def refresh_token: typings.simpleOauth2.simpleOauth2Strings.refresh_token = this.cast("refresh_token")
}

