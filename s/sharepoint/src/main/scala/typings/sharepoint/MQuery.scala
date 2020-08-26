package typings.sharepoint

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MQuery extends js.Object {
  def apply(objectOrElement: js.Array[HTMLElement]): MQueryResultSetElements = js.native
  def apply(objectOrElement: MQueryResultSetElements): MQueryResultSetElements = js.native
  def apply(objectOrElement: HTMLElement): MQueryResultSetElements = js.native
  def apply(selector: String): MQueryResultSetElements = js.native
  def apply(selector: String, context: js.Any): MQueryResultSetElements = js.native
  def apply[T](): MQueryResultSet[T] = js.native
  def apply[T](`object`: T): MQueryResultSet[T] = js.native
  def apply[T](`object`: MQueryResultSet[T]): MQueryResultSet[T] = js.native
  def contains(container: HTMLElement, contained: HTMLElement): Boolean = js.native
  def data(element: HTMLElement): js.Any = js.native
  def data(element: HTMLElement, key: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
  def data(element: HTMLElement, key: String): js.Any = js.native
  def data(element: HTMLElement, key: String, value: js.Any): js.Any = js.native
  def every[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def every[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): Boolean = js.native
  def every[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def every[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): Boolean = js.native
  def extend(deep: Boolean, target: js.Any, objs: js.Any*): js.Any = js.native
  def extend(target: js.Any, objs: js.Any*): js.Any = js.native
  def filter[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): js.Array[T] = js.native
  def filter[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): js.Array[T] = js.native
  def filter[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): MQueryResultSet[T] = js.native
  def filter[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): MQueryResultSet[T] = js.native
  def forEach[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  def forEach[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit],
    context: js.Any
  ): Unit = js.native
  def forEach[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  def forEach[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit],
    context: js.Any
  ): Unit = js.native
  def hasData(element: HTMLElement): Boolean = js.native
  def indexOf[T](obj: js.Array[T], `object`: T): Double = js.native
  def indexOf[T](obj: js.Array[T], `object`: T, startIndex: Double): Double = js.native
  def isArray(obj: js.Any): Boolean = js.native
  def isBoolean(obj: js.Any): Boolean = js.native
  def isDefined(obj: js.Any): Boolean = js.native
  def isDefinedAndNotNull(obj: js.Any): Boolean = js.native
  def isElement(obj: js.Any): Boolean = js.native
  def isEmptyObject(obj: js.Any): Boolean = js.native
  def isFunction(obj: js.Any): Boolean = js.native
  def isMQueryResultSet(obj: js.Any): Boolean = js.native
  def isNode(obj: js.Any): Boolean = js.native
  def isNotNull(obj: js.Any): Boolean = js.native
  def isNull(obj: js.Any): Boolean = js.native
  def isNumber(obj: js.Any): Boolean = js.native
  def isObject(obj: js.Any): Boolean = js.native
  def isString(obj: js.Any): Boolean = js.native
  def isUndefined(obj: js.Any): Boolean = js.native
  def isUndefinedOrNull(obj: js.Any): Boolean = js.native
  def lastIndexOf[T](obj: js.Array[T], `object`: T): Double = js.native
  def lastIndexOf[T](obj: js.Array[T], `object`: T, startIndex: Double): Double = js.native
  def makeArray[T](obj: js.Any): js.Array[_] = js.native
  def map[T, U](
    array: js.Array[T],
    callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], U]
  ): js.Array[U] = js.native
  def map[T, U](
    array: MQueryResultSet[T],
    callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], U]
  ): MQueryResultSet[U] = js.native
  def proxy(context: js.Any, name: String, args: js.Any*): js.Any = js.native
  def proxy(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, _] = js.native
  def ready(callback: js.Function0[Unit]): Unit = js.native
  def removeData(element: HTMLElement): MQueryResultSetElements = js.native
  def removeData(element: HTMLElement, name: String): MQueryResultSetElements = js.native
  def some[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def some[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): Boolean = js.native
  def some[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def some[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: js.Any
  ): Boolean = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](fn: T, interval: Double, shouldOverrideThrottle: Boolean): T = js.native
}

