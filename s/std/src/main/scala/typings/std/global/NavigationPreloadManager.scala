package typings.std.global

import typings.std.NavigationPreloadState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("NavigationPreloadManager")
@js.native
/* standard dom */
open class NavigationPreloadManager ()
  extends StObject
     with typings.std.NavigationPreloadManager {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/disable) */
  /* standard dom */
  /* CompleteClass */
  override def disable(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/enable) */
  /* standard dom */
  /* CompleteClass */
  override def enable(): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/getState) */
  /* standard dom */
  /* CompleteClass */
  override def getState(): js.Promise[NavigationPreloadState] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/NavigationPreloadManager/setHeaderValue) */
  /* standard dom */
  /* CompleteClass */
  override def setHeaderValue(value: java.lang.String): js.Promise[Unit] = js.native
}
