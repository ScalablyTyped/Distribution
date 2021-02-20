package typings.rxDom.mod

import typings.rx.Rx.Comparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("rx-dom", "RecordedCls")
@js.native
class RecordedCls protected ()
  extends typings.rx.mod.RecordedCls {
  /**
    * Creates a new object recording the production of the specified value at the given virtual time.
    *
    * @constructor
    * @param {Number} time Virtual time the value was produced on.
    * @param {Mixed} value Value that was produced.
    * @param {Function} comparer An optional comparer.
    */
  def this(time: Double, value: js.Any) = this()
  def this(time: Double, value: js.Any, equalityComparer: Comparer[_, Boolean]) = this()
}
