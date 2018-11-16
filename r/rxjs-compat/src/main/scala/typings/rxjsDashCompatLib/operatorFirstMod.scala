package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/first", JSImport.Namespace)
@js.native
object operatorFirstMod extends js.Object {
  def first[T, D](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T | D] = js.native
  def first[T, D](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[T | D] = js.native
  def first[T, D](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      scala.Boolean
    ],
    defaultValue: D
  ): rxjsLib.rxjsMod.Observable[T | D] = js.native
  def first[T, D](`this`: rxjsLib.rxjsMod.Observable[T], predicate: scala.Null, defaultValue: D): rxjsLib.rxjsMod.Observable[T | D] = js.native
  @JSName("first")
  def first_TST[T, S /* <: T */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      /* is S */scala.Boolean
    ]
  ): rxjsLib.rxjsMod.Observable[S] = js.native
  @JSName("first")
  def first_TST[T, S /* <: T */](
    `this`: rxjsLib.rxjsMod.Observable[T],
    predicate: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* source */ rxjsLib.rxjsMod.Observable[T], 
      /* is S */scala.Boolean
    ],
    defaultValue: S
  ): rxjsLib.rxjsMod.Observable[S] = js.native
}

