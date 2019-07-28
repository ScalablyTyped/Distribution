package typings.solrDashClient.solrDashClientMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends js.Object {
  def bf(functions: String): Query = js.native
  def boost(functions: String): Query = js.native
  def bq(options: js.Object): Query = js.native
  def build(): String = js.native
  def cursorMark(mark: String): Query = js.native
  def debugQuery(): Query = js.native
  def defType(`type`: String): Query = js.native
  def df(df: String): Query = js.native
  def dismax(): Query = js.native
  def edismax(): Query = js.native
  def facet(options: FacetOptions): Query = js.native
  def fl(fields: String): Query = js.native
  def fl(fields: js.Array[String]): Query = js.native
  def group(options: GroupOptions): Query = js.native
  def groupBy(field: String): Query = js.native
  def hl(options: HighlightOptions): Query = js.native
  def matchFilter(field: String, value: String): Query = js.native
  def matchFilter(field: String, value: Double): Query = js.native
  def matchFilter(field: String, value: Date): Query = js.native
  def mlt(options: MoreLikeThisOptions): Query = js.native
  def mm(minimum: String): Query = js.native
  def mm(minimum: Double): Query = js.native
  def pf(options: js.Object): Query = js.native
  def ps(slop: Double): Query = js.native
  def q(q: String): Query = js.native
  def q(q: js.Object): Query = js.native
  def qf(options: js.Object): Query = js.native
  def qop(op: String): Query = js.native
  def qs(slop: Double): Query = js.native
  def rangeFilter(options: js.Array[RangeFilterOption]): Query = js.native
  def requestHandler(handler: String): Query = js.native
  def rows(rows: Double): Query = js.native
  def set(parameters: String): Query = js.native
  def sort(options: js.Object): Query = js.native
  def start(start: Double): Query = js.native
  def tie(tiebreaker: Double): Query = js.native
  def timeout(time: String): Query = js.native
  def timeout(time: Double): Query = js.native
}

