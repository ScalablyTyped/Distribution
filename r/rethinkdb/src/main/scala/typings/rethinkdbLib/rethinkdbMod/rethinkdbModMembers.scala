package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", JSImport.Namespace)
@js.native
object rethinkdbModMembers extends js.Object {
  var count: Aggregator = js.native
  val row: Row = js.native
  def asc(property: java.lang.String): Sort = js.native
  def avg(prop: java.lang.String): Aggregator = js.native
  def branch(test: Expression[scala.Boolean], trueBranch: Expression[_], falseBranch: Expression[_]): Expression[_] = js.native
  def circle(point: Point, radius: scala.Double): Geometry = js.native
  def circle(point: Point, radius: scala.Double, options: CircleOptions): Geometry = js.native
  def connect(host: java.lang.String): stdLib.Promise[Connection] = js.native
  def connect(
    host: java.lang.String,
    cb: js.Function2[/* err */ ReqlDriverError, /* conn */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def connect(opts: ConnectionOptions): stdLib.Promise[Connection] = js.native
  def connect(
    opts: ConnectionOptions,
    cb: js.Function2[/* err */ ReqlDriverError, /* conn */ Connection, scala.Unit]
  ): scala.Unit = js.native
  def db(name: java.lang.String): Db = js.native
  def dbCreate(name: java.lang.String): Operation[CreateResult] = js.native
  def dbDrop(name: java.lang.String): Operation[DropResult] = js.native
  def dbList(): Operation[js.Array[java.lang.String]] = js.native
  def desc(property: java.lang.String): Sort = js.native
  def epochTime(): Expression[Time] = js.native
  def expr(stuff: js.Any): Expression[_] = js.native
  @JSName("js")
  def `js_`(jsString: java.lang.String): Operation[_] = js.native
  @JSName("js")
  def `js_`(jsString: java.lang.String, opts: rethinkdbLib.Anon_Timeout): Operation[_] = js.native
  def now(): Expression[Time] = js.native
  def point(lng: scala.Double, lat: scala.Double): Point = js.native
  def polygon(point: Point*): Polygon = js.native
  def sum(prop: java.lang.String): Aggregator = js.native
  def table(name: java.lang.String): Table = js.native
  def table(name: java.lang.String, options: rethinkdbLib.Anon_UseOutdated): Table = js.native
  def uuid(): Operation[java.lang.String] = js.native
  def uuid(input: java.lang.String): Operation[java.lang.String] = js.native
}

