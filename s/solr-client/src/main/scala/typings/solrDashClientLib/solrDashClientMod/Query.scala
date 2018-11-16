package typings
package solrDashClientLib.solrDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def bf(functions: java.lang.String): Query = js.native
  def boost(functions: java.lang.String): Query = js.native
  def bq(options: js.Object): Query = js.native
  def build(): java.lang.String = js.native
  def cursorMark(mark: java.lang.String): Query = js.native
  def debugQuery(): Query = js.native
  def defType(`type`: java.lang.String): Query = js.native
  def df(df: java.lang.String): Query = js.native
  def dismax(): Query = js.native
  def edismax(): Query = js.native
  def facet(options: FacetOptions): Query = js.native
  def fl(fields: java.lang.String): Query = js.native
  def fl(fields: js.Array[java.lang.String]): Query = js.native
  def group(options: GroupOptions): Query = js.native
  def groupBy(field: java.lang.String): Query = js.native
  def hl(options: HighlightOptions): Query = js.native
  def matchFilter(field: java.lang.String, value: java.lang.String): Query = js.native
  def matchFilter(field: java.lang.String, value: scala.Double): Query = js.native
  def matchFilter(field: java.lang.String, value: stdLib.Date): Query = js.native
  def mlt(options: MoreLikeThisOptions): Query = js.native
  def mm(minimum: java.lang.String): Query = js.native
  def mm(minimum: scala.Double): Query = js.native
  def pf(options: js.Object): Query = js.native
  def ps(slop: scala.Double): Query = js.native
  def q(q: java.lang.String): Query = js.native
  def q(q: js.Object): Query = js.native
  def qf(options: js.Object): Query = js.native
  def qop(op: java.lang.String): Query = js.native
  def qs(slop: scala.Double): Query = js.native
  def rangeFilter(options: js.Array[RangeFilterOption]): Query = js.native
  def requestHandler(handler: java.lang.String): Query = js.native
  def rows(rows: scala.Double): Query = js.native
  def set(parameters: java.lang.String): Query = js.native
  def sort(options: js.Object): Query = js.native
  def start(start: scala.Double): Query = js.native
  def tie(tiebreaker: scala.Double): Query = js.native
  def timeout(time: java.lang.String): Query = js.native
  def timeout(time: scala.Double): Query = js.native
}

