package typings.rethinkdb.rethinkdbMod

import typings.rethinkdb.Anon_Timeout
import typings.rethinkdb.Anon_UseOutdated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var count: Aggregator = js.native
  val row: Row = js.native
  def asc(property: String): Sort = js.native
  def avg(prop: String): Aggregator = js.native
  def branch(test: Expression[Boolean], trueBranch: Expression[_], falseBranch: Expression[_]): Expression[_] = js.native
  def circle(point: Point, radius: Double): Geometry = js.native
  def circle(point: Point, radius: Double, options: CircleOptions): Geometry = js.native
  def connect(host: String): js.Promise[Connection] = js.native
  def connect(host: String, cb: js.Function2[/* err */ ReqlDriverError, /* conn */ Connection, Unit]): Unit = js.native
  def connect(opts: ConnectionOptions): js.Promise[Connection] = js.native
  def connect(opts: ConnectionOptions, cb: js.Function2[/* err */ ReqlDriverError, /* conn */ Connection, Unit]): Unit = js.native
  def db(name: String): Db = js.native
  def dbCreate(name: String): Operation[CreateResult] = js.native
  def dbDrop(name: String): Operation[DropResult] = js.native
  def dbList(): Operation[js.Array[String]] = js.native
  def desc(property: String): Sort = js.native
  def epochTime(): Expression[Time] = js.native
  def expr(stuff: js.Any): Expression[_] = js.native
  @JSName("js")
  def js_(jsString: String): Operation[_] = js.native
  @JSName("js")
  def js_(jsString: String, opts: Anon_Timeout): Operation[_] = js.native
  def now(): Expression[Time] = js.native
  def point(lng: Double, lat: Double): Point = js.native
  def polygon(point: Point*): Polygon = js.native
  def sum(prop: String): Aggregator = js.native
  def table(name: String): Table = js.native
  def table(name: String, options: Anon_UseOutdated): Table = js.native
  def uuid(): Operation[String] = js.native
  def uuid(input: String): Operation[String] = js.native
}

