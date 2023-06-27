package typings.std.global

import typings.std.EpochTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("GeolocationPosition")
@js.native
/* standard dom */
open class GeolocationPosition ()
  extends StObject
     with typings.std.GeolocationPosition {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/coords) */
  /* standard dom */
  /* CompleteClass */
  override val coords: typings.std.GeolocationCoordinates = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: EpochTimeStamp = js.native
}
