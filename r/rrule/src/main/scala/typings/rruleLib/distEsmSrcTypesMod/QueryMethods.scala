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
    after: js.Function2[stdLib.Date, scala.Boolean, stdLib.Date],
    all: js.Function0[js.Array[stdLib.Date]],
    before: js.Function2[stdLib.Date, scala.Boolean, stdLib.Date],
    between: js.Function3[stdLib.Date, stdLib.Date, scala.Boolean, js.Array[stdLib.Date]]
  ): QueryMethods = {
    val __obj = js.Dynamic.literal(after = after, all = all, before = before, between = between)
  
    __obj.asInstanceOf[QueryMethods]
  }
}

