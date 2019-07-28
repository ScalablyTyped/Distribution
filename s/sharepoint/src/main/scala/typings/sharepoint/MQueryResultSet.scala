package typings.sharepoint

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MQueryResultSet[T] extends /* index */ NumberDictionary[T] {
  def contains(contained: T): Boolean = js.native
  def every(fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]): Boolean = js.native
  def every(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): Boolean = js.native
  def filter(fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]): MQueryResultSet[T] = js.native
  def filter(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): MQueryResultSet[T] = js.native
  def forEach(fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit]): Unit = js.native
  def forEach(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit],
    context: js.Any
  ): Unit = js.native
  def indexOf(`object`: js.Any): Double = js.native
  def indexOf(`object`: js.Any, startIndex: Double): Double = js.native
  def lastIndexOf(`object`: js.Any): Double = js.native
  def lastIndexOf(`object`: js.Any, startIndex: Double): Double = js.native
  def map(callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], _]): MQueryResultSet[T] = js.native
  def some(fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]): Boolean = js.native
  def some(
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): Boolean = js.native
}

