package typings
package rruleLib.distEsmSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMethods extends js.Object {
  def after(date: stdLib.Date, inc: scala.Boolean): stdLib.Date
  def all(): js.Array[stdLib.Date]
  def before(date: stdLib.Date, inc: scala.Boolean): stdLib.Date
  def between(after: stdLib.Date, before: stdLib.Date, inc: scala.Boolean): js.Array[stdLib.Date]
}

object QueryMethods {
  @scala.inline
  def apply(
    after: (stdLib.Date, scala.Boolean) => stdLib.Date,
    all: () => js.Array[stdLib.Date],
    before: (stdLib.Date, scala.Boolean) => stdLib.Date,
    between: (stdLib.Date, stdLib.Date, scala.Boolean) => js.Array[stdLib.Date]
  ): QueryMethods = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), all = js.Any.fromFunction0(all), before = js.Any.fromFunction2(before), between = js.Any.fromFunction3(between))
  
    __obj.asInstanceOf[QueryMethods]
  }
}

