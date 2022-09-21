package typings.std.global

import typings.std.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Set")
@js.native
/* standard es2015.collection */
open class Set[T] ()
  extends StObject
     with typings.std.Set[T] {
  def this(values: js.Array[T]) = this()
}
object Set {
  
  inline def apply: SetConstructor = js.Dynamic.global.selectDynamic("Set").asInstanceOf[SetConstructor]
}
