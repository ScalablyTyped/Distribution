package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MQuery extends js.Object {
  def apply(objectOrElement: js.Array[stdLib.HTMLElement]): MQueryResultSetElements = js.native
  def apply(objectOrElement: MQueryResultSetElements): MQueryResultSetElements = js.native
  def apply(objectOrElement: stdLib.HTMLElement): MQueryResultSetElements = js.native
  def apply(selector: java.lang.String): MQueryResultSetElements = js.native
  def apply(selector: java.lang.String, context: js.Any): MQueryResultSetElements = js.native
  def apply[T](): MQueryResultSet[T] = js.native
  def apply[T](`object`: T): MQueryResultSet[T] = js.native
  def apply[T](`object`: MQueryResultSet[T]): MQueryResultSet[T] = js.native
  def contains(container: stdLib.HTMLElement, contained: stdLib.HTMLElement): scala.Boolean = js.native
  def data(element: stdLib.HTMLElement): js.Any = js.native
  def data(element: stdLib.HTMLElement, key: java.lang.String): js.Any = js.native
  def data(element: stdLib.HTMLElement, key: java.lang.String, value: js.Any): js.Any = js.native
  def every[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): scala.Boolean = js.native
  def every[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def every[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): scala.Boolean = js.native
  def every[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def extend(deep: scala.Boolean, target: js.Any, objs: js.Any*): js.Any = js.native
  def extend(target: js.Any, objs: js.Any*): js.Any = js.native
  def filter[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): js.Array[T] = js.native
  def filter[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): js.Array[T] = js.native
  def filter[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): MQueryResultSet[T] = js.native
  def filter[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): MQueryResultSet[T] = js.native
  def forEach[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def forEach[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Unit],
    context: js.Any
  ): scala.Unit = js.native
  def forEach[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  def forEach[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Unit],
    context: js.Any
  ): scala.Unit = js.native
  def hasData(element: stdLib.HTMLElement): scala.Boolean = js.native
  def indexOf[T](obj: js.Array[T], `object`: T): scala.Double = js.native
  def indexOf[T](obj: js.Array[T], `object`: T, startIndex: scala.Double): scala.Double = js.native
  def isArray(obj: js.Any): scala.Boolean = js.native
  def isBoolean(obj: js.Any): scala.Boolean = js.native
  def isDefined(obj: js.Any): scala.Boolean = js.native
  def isDefinedAndNotNull(obj: js.Any): scala.Boolean = js.native
  def isElement(obj: js.Any): scala.Boolean = js.native
  def isEmptyObject(obj: js.Any): scala.Boolean = js.native
  def isFunction(obj: js.Any): scala.Boolean = js.native
  def isMQueryResultSet(obj: js.Any): scala.Boolean = js.native
  def isNode(obj: js.Any): scala.Boolean = js.native
  def isNotNull(obj: js.Any): scala.Boolean = js.native
  def isNull(obj: js.Any): scala.Boolean = js.native
  def isNumber(obj: js.Any): scala.Boolean = js.native
  def isObject(obj: js.Any): scala.Boolean = js.native
  def isString(obj: js.Any): scala.Boolean = js.native
  def isUndefined(obj: js.Any): scala.Boolean = js.native
  def isUndefinedOrNull(obj: js.Any): scala.Boolean = js.native
  def lastIndexOf[T](obj: js.Array[T], `object`: T): scala.Double = js.native
  def lastIndexOf[T](obj: js.Array[T], `object`: T, startIndex: scala.Double): scala.Double = js.native
  def makeArray[T](obj: js.Any): js.Array[_] = js.native
  def map[T, U](
    array: js.Array[T],
    callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], U]
  ): js.Array[U] = js.native
  def map[T, U](
    array: MQueryResultSet[T],
    callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], U]
  ): MQueryResultSet[U] = js.native
  def proxy(context: js.Any, name: java.lang.String, args: js.Any*): js.Any = js.native
  def proxy(fn: js.Function1[/* repeated */ js.Any, _], context: js.Any, args: js.Any*): js.Function1[/* repeated */ js.Any, _] = js.native
  def ready(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeData(element: stdLib.HTMLElement): MQueryResultSetElements = js.native
  def removeData(element: stdLib.HTMLElement, name: java.lang.String): MQueryResultSetElements = js.native
  def some[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): scala.Boolean = js.native
  def some[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def some[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean]
  ): scala.Boolean = js.native
  def some[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[scala.Double], scala.Boolean],
    context: js.Any
  ): scala.Boolean = js.native
  def throttle[T /* <: js.Function1[/* repeated */ js.Any, _] */](fn: T, interval: scala.Double, shouldOverrideThrottle: scala.Boolean): T = js.native
}

