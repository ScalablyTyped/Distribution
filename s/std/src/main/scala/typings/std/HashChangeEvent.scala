package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Events that fire when the fragment identifier of the URL has changed.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent)
  */
@js.native
trait HashChangeEvent
  extends StObject
     with Event {
  
  /**
    * Returns the URL of the session history entry that is now current.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/newURL)
    */
  /* standard dom */
  val newURL: java.lang.String = js.native
  
  /**
    * Returns the URL of the session history entry that was previously current.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HashChangeEvent/oldURL)
    */
  /* standard dom */
  val oldURL: java.lang.String = js.native
}
