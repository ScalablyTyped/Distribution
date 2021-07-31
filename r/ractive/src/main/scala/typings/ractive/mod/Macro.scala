package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Macro extends MacroFn {
  
  /** Get the css data for this macro at the given keypath. */
  def styleGet(keypath: String): js.Any = js.native
  
  /** Set the css data for this macro at the given keypath to the given value. */
  def styleSet(keypath: String, value: js.Any): js.Promise[Unit] = js.native
  /** Set the given map of values in the css data for this macro. */
  def styleSet(map: ValueMap): js.Promise[Unit] = js.native
}
