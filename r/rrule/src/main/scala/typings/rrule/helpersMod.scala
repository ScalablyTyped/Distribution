package typings.rrule

import typings.rrule.anon.Div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("rrule/dist/esm/src/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def clone_[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def divmod(a: Double, b: Double): Div = (^.asInstanceOf[js.Dynamic].applyDynamic("divmod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Div]
  
  @scala.inline
  def empty[T](): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Boolean]
  @scala.inline
  def empty[T](obj: js.Array[T]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def includes[T](arr: js.Array[T], `val`: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def includes[T](arr: Null, `val`: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def includes[T](arr: Unit, `val`: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includes")(arr.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isArray(arg: js.Any): /* is std.Array<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<any> */ Boolean]
  
  @scala.inline
  def isNumber(): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")().asInstanceOf[/* is number */ Boolean]
  @scala.inline
  def isNumber(value: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  @scala.inline
  def isPresent[T](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")().asInstanceOf[/* is T */ Boolean]
  @scala.inline
  def isPresent[T](value: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(value.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  @scala.inline
  def isWeekdayStr(): /* is rrule.rrule/dist/esm/src/weekday.WeekdayStr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekdayStr")().asInstanceOf[/* is rrule.rrule/dist/esm/src/weekday.WeekdayStr */ Boolean]
  @scala.inline
  def isWeekdayStr(value: js.Any): /* is rrule.rrule/dist/esm/src/weekday.WeekdayStr */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWeekdayStr")(value.asInstanceOf[js.Any]).asInstanceOf[/* is rrule.rrule/dist/esm/src/weekday.WeekdayStr */ Boolean]
  
  @scala.inline
  def notEmpty[T](): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notEmpty")().asInstanceOf[/* is std.Array<T> */ Boolean]
  @scala.inline
  def notEmpty[T](obj: js.Array[T]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("notEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  @scala.inline
  def padStart(item: String, targetLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(item.asInstanceOf[js.Any], targetLength.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def padStart(item: String, targetLength: Double, padString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(item.asInstanceOf[js.Any], targetLength.asInstanceOf[js.Any], padString.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def padStart(item: Double, targetLength: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(item.asInstanceOf[js.Any], targetLength.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def padStart(item: Double, targetLength: Double, padString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("padStart")(item.asInstanceOf[js.Any], targetLength.asInstanceOf[js.Any], padString.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def pymod(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pymod")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def range(start: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  @scala.inline
  def range(start: Double, end: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def repeat[T](value: T, times: Double): js.Array[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(value.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[js.Array[T | js.Array[T]]]
  @scala.inline
  def repeat[T](value: js.Array[T], times: Double): js.Array[T | js.Array[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(value.asInstanceOf[js.Any], times.asInstanceOf[js.Any])).asInstanceOf[js.Array[T | js.Array[T]]]
  
  @scala.inline
  def split(str: String, sep: String, num: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("split")(str.asInstanceOf[js.Any], sep.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @scala.inline
  def toArray[T](item: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(item.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  @scala.inline
  def toArray[T](item: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(item.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
