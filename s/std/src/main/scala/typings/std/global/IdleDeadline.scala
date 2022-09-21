package typings.std.global

import typings.std.DOMHighResTimeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IdleDeadline")
@js.native
/* standard dom */
open class IdleDeadline ()
  extends StObject
     with typings.std.IdleDeadline {
  
  /* standard dom */
  /* CompleteClass */
  override val didTimeout: scala.Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def timeRemaining(): DOMHighResTimeStamp = js.native
}
