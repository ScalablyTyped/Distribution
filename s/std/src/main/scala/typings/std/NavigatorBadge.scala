package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
@js.native
trait NavigatorBadge extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clearAppBadge) */
  /* standard dom */
  def clearAppBadge(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/setAppBadge) */
  /* standard dom */
  def setAppBadge(): js.Promise[Unit] = js.native
  def setAppBadge(contents: Double): js.Promise[Unit] = js.native
}
