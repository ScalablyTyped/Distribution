package typings.std.global

import typings.std.WeakRefConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WeakRef")
@js.native
open class WeakRef[T /* <: js.Object */] protected ()
  extends StObject
     with typings.std.WeakRef[T] {
  /**
    * Creates a WeakRef instance for the given target object.
    * @param target The target object for the WeakRef instance.
    */
  /* standard es2021.weakref */
  def this(target: T) = this()
}
object WeakRef {
  
  inline def apply: WeakRefConstructor = js.Dynamic.global.selectDynamic("WeakRef").asInstanceOf[WeakRefConstructor]
}
