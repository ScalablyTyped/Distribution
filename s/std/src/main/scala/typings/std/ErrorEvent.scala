package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Events providing information related to errors in scripts or in files. */
@js.native
trait ErrorEvent
  extends StObject
     with Event {
  
  /* standard dom */
  val colno: Double = js.native
  
  /* standard dom */
  val error: Any = js.native
  
  /* standard dom */
  val filename: java.lang.String = js.native
  
  /* standard dom */
  val lineno: Double = js.native
  
  /* standard dom */
  val message: java.lang.String = js.native
}
