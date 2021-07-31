package typings.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AbortController")
@js.native
class AbortController ()
  extends StObject
     with typings.std.AbortController {
  
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
    */
  /* CompleteClass */
  override def abort(): Unit = js.native
  
  /**
    * Returns the AbortSignal object associated with this object.
    */
  /* CompleteClass */
  override val signal: typings.std.AbortSignal = js.native
}
