package typings
package solidDashAuthDashClientLib.solidDashAuthDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolidAuthClient
  extends nodeLib.eventsMod.EventEmitter {
  def currentSession(): js.Promise[js.UndefOr[Session]] = js.native
  def fetch(input: stdLib.RequestInfo): js.Promise[stdLib.Response] = js.native
  def fetch(input: stdLib.RequestInfo, init: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  def login(identityProvider: java.lang.String): js.Promise[scala.Unit] = js.native
  def logout(): js.Promise[scala.Unit] = js.native
  def popupLogin(params: solidDashAuthDashClientLib.Anon_PopupUri): js.Promise[Session] = js.native
  def trackSession(callback: js.Function1[/* session */ js.UndefOr[Session], scala.Unit]): scala.Unit = js.native
}

