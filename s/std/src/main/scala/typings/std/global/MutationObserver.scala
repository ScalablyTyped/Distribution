package typings.std.global

import typings.std.MutationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MutationObserver")
@js.native
open class MutationObserver protected ()
  extends StObject
     with typings.std.MutationObserver {
  /* standard dom */
  def this(callback: MutationCallback) = this()
}
