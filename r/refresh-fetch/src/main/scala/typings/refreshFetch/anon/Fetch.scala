package typings.refreshFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fetch[T] extends js.Object {
  
  var fetch: T = js.native
  
  def refreshToken(): js.Promise[Unit] = js.native
  
  def shouldRefreshToken(error: js.Any): Boolean = js.native
}
object Fetch {
  
  @scala.inline
  def apply[T](fetch: T, refreshToken: () => js.Promise[Unit], shouldRefreshToken: js.Any => Boolean): Fetch[T] = {
    val __obj = js.Dynamic.literal(fetch = fetch.asInstanceOf[js.Any], refreshToken = js.Any.fromFunction0(refreshToken), shouldRefreshToken = js.Any.fromFunction1(shouldRefreshToken))
    __obj.asInstanceOf[Fetch[T]]
  }
  
  @scala.inline
  implicit class FetchOps[Self <: Fetch[_], T] (val x: Self with Fetch[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFetch(value: T): Self = this.set("fetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: () => js.Promise[Unit]): Self = this.set("refreshToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShouldRefreshToken(value: js.Any => Boolean): Self = this.set("shouldRefreshToken", js.Any.fromFunction1(value))
  }
}
