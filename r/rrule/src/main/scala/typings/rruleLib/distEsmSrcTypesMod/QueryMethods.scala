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

