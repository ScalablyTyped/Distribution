package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.links

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.SHORT
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseStrings.UNGUESSABLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Links extends js.Object {
  /** Creates a standard dynamic link. */
  def createDynamicLink(dynamicLink: DynamicLink): js.Promise[String] = js.native
  /** Creates a short dynamic link. */
  @JSName("createShortDynamicLink")
  def createShortDynamicLink_SHORT(dynamicLink: DynamicLink, `type`: SHORT): js.Promise[String] = js.native
  @JSName("createShortDynamicLink")
  def createShortDynamicLink_UNGUESSABLE(dynamicLink: DynamicLink, `type`: UNGUESSABLE): js.Promise[String] = js.native
  /**
    * Returns the URL that the app has been launched from. If the app was
    * not launched from a URL the return value will be null.
    */
  def getInitialLink(): js.Promise[String | Null] = js.native
  /**
    * Subscribe to URL open events while the app is still running.
    * The listener is called from URL open events whilst the app is still
    * running, use getInitialLink for URLs which cause the app to open
    * from a previously closed / not running state.
    * Returns an unsubscribe function, call the returned function to
    * unsubscribe from all future events.
    */
  def onLink(listener: js.Function1[/* url */ String, Unit]): js.Function0[Unit] = js.native
}

