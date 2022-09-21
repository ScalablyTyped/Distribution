package typings.sharepoint

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MQuery extends StObject {
  
  def apply(objectOrElement: js.Array[HTMLElement]): MQueryResultSetElements = js.native
  def apply(objectOrElement: MQueryResultSetElements): MQueryResultSetElements = js.native
  def apply(objectOrElement: HTMLElement): MQueryResultSetElements = js.native
  def apply(selector: String): MQueryResultSetElements = js.native
  def apply(selector: String, context: Any): MQueryResultSetElements = js.native
  def apply[T](): MQueryResultSet[T] = js.native
  def apply[T](`object`: T): MQueryResultSet[T] = js.native
  def apply[T](`object`: MQueryResultSet[T]): MQueryResultSet[T] = js.native
  
  def contains(container: HTMLElement, contained: HTMLElement): Boolean = js.native
  
  def data(element: HTMLElement): Any = js.native
  def data(element: HTMLElement, key: String): Any = js.native
  def data(element: HTMLElement, key: String, value: Any): Any = js.native
  def data(element: HTMLElement, key: Unit, value: Any): Any = js.native
  
  def every[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def every[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: Any
  ): Boolean = js.native
  def every[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def every[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: Any
  ): Boolean = js.native
  
  def extend(deep: Boolean, target: Any, objs: Any*): Any = js.native
  def extend(target: Any, objs: Any*): Any = js.native
  
  def filter[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): js.Array[T] = js.native
  def filter[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: Any
  ): js.Array[T] = js.native
  def filter[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): MQueryResultSet[T] = js.native
  def filter[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: Any
  ): MQueryResultSet[T] = js.native
  
  def forEach[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  def forEach[T](
    obj: js.Array[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit],
    context: Any
  ): Unit = js.native
  def forEach[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit]
  ): Unit = js.native
  def forEach[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Unit],
    context: Any
  ): Unit = js.native
  
  def hasData(element: HTMLElement): Boolean = js.native
  
  def indexOf[T](obj: js.Array[T], `object`: T): Double = js.native
  def indexOf[T](obj: js.Array[T], `object`: T, startIndex: Double): Double = js.native
  
  def isArray(obj: Any): Boolean = js.native
  
  def isBoolean(obj: Any): Boolean = js.native
  
  def isDefined(obj: Any): Boolean = js.native
  
  def isDefinedAndNotNull(obj: Any): Boolean = js.native
  
  def isElement(obj: Any): Boolean = js.native
  
  def isEmptyObject(obj: Any): Boolean = js.native
  
  def isFunction(obj: Any): Boolean = js.native
  
  def isMQueryResultSet(obj: Any): Boolean = js.native
  
  def isNode(obj: Any): Boolean = js.native
  
  def isNotNull(obj: Any): Boolean = js.native
  
  def isNull(obj: Any): Boolean = js.native
  
  def isNumber(obj: Any): Boolean = js.native
  
  def isObject(obj: Any): Boolean = js.native
  
  def isString(obj: Any): Boolean = js.native
  
  def isUndefined(obj: Any): Boolean = js.native
  
  def isUndefinedOrNull(obj: Any): Boolean = js.native
  
  def lastIndexOf[T](obj: js.Array[T], `object`: T): Double = js.native
  def lastIndexOf[T](obj: js.Array[T], `object`: T, startIndex: Double): Double = js.native
  
  def makeArray[T](obj: Any): js.Array[Any] = js.native
  
  def map[T, U](
    array: js.Array[T],
    callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], U]
  ): js.Array[U] = js.native
  def map[T, U](
    array: MQueryResultSet[T],
    callback: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], U]
  ): MQueryResultSet[U] = js.native
  
  def proxy(context: Any, name: String, args: Any*): Any = js.native
  def proxy(fn: js.Function1[/* repeated */ Any, Any], context: Any, args: Any*): js.Function1[/* repeated */ Any, Any] = js.native
  
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
    context: Any
  ): Boolean = js.native
  def some[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean]
  ): Boolean = js.native
  def some[T](
    obj: MQueryResultSet[T],
    fn: js.Function2[/* elementOfArray */ T, /* indexInArray */ js.UndefOr[Double], Boolean],
    context: Any
  ): Boolean = js.native
  
  def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](fn: T, interval: Double, shouldOverrideThrottle: Boolean): T = js.native
}
