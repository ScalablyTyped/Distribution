package typings.refreshFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fetch[T] extends js.Object {
  var fetch: T
  def refreshToken(): js.Promise[Unit]
  def shouldRefreshToken(error: js.Any): Boolean
}

object Fetch {
  @scala.inline
  def apply[T](fetch: T, refreshToken: () => js.Promise[Unit], shouldRefreshToken: js.Any => Boolean): Fetch[T] = {
    val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], refreshToken = js.Any.fromFunction0(refreshToken), shouldRefreshToken = js.Any.fromFunction1(shouldRefreshToken))
    __obj.asInstanceOf[Fetch[T]]
  }
}

