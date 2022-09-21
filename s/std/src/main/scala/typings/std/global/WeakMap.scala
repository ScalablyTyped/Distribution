package typings.std.global

import typings.std.WeakMapConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WeakMap")
@js.native
/* standard es2015.collection */
open class WeakMap[K /* <: js.Object */, V] ()
  extends StObject
     with typings.std.WeakMap[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
}
object WeakMap {
  
  inline def apply: WeakMapConstructor = js.Dynamic.global.selectDynamic("WeakMap").asInstanceOf[WeakMapConstructor]
}
