package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MQueryResultSet[T]
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[T] {
  def contains(contained: T): scala.Boolean = js.native
  def every(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): scala.Boolean = js.native
  def every(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def filter(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): MQueryResultSet[T] = js.native
  def filter(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): MQueryResultSet[T] = js.native
  def forEach(fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Unit]): scala.Unit = js.native
  def forEach(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Unit],
    context: js.Any
  ): scala.Unit = js.native
  def indexOf(`object`: js.Any): scala.Double = js.native
  def indexOf(`object`: js.Any, startIndex: scala.Double): scala.Double = js.native
  def lastIndexOf(`object`: js.Any): scala.Double = js.native
  def lastIndexOf(`object`: js.Any, startIndex: scala.Double): scala.Double = js.native
  def map(callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], _]): MQueryResultSet[T] = js.native
  def some(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): scala.Boolean = js.native
  def some(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
}

