package typings.solidAuthClient.mod

import typings.node.eventsMod.EventEmitter
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolidAuthClient extends EventEmitter {
  def currentSession(): js.Promise[js.UndefOr[Session]] = js.native
  def currentSession(storage: AsyncStorage): js.Promise[js.UndefOr[Session]] = js.native
  def fetch(input: RequestInfo): js.Promise[Response] = js.native
  def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  def login(identityProvider: String): js.Promise[Unit] = js.native
  def login(identityProvider: String, options: LoginOptions): js.Promise[Unit] = js.native
  def logout(): js.Promise[Unit] = js.native
  def logout(storage: AsyncStorage): js.Promise[Unit] = js.native
  def popupLogin(): js.Promise[Session] = js.native
  def popupLogin(params: LoginOptions): js.Promise[Session] = js.native
  def stopTrackSession(callback: js.Function1[/* session */ js.UndefOr[Session], Unit]): Unit = js.native
  def trackSession(callback: js.Function1[/* session */ js.UndefOr[Session], Unit]): js.Promise[Unit] = js.native
}

