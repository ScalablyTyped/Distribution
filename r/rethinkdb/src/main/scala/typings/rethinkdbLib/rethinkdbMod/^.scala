package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rethinkdb", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var count: rethinkdbLib.rethinkdbMod.Aggregator = js.native
  val row: rethinkdbLib.rethinkdbMod.Row = js.native
  def asc(property: java.lang.String): rethinkdbLib.rethinkdbMod.Sort = js.native
  def avg(prop: java.lang.String): rethinkdbLib.rethinkdbMod.Aggregator = js.native
  def branch(
    test: rethinkdbLib.rethinkdbMod.Expression[scala.Boolean],
    trueBranch: rethinkdbLib.rethinkdbMod.Expression[_],
    falseBranch: rethinkdbLib.rethinkdbMod.Expression[_]
  ): rethinkdbLib.rethinkdbMod.Expression[_] = js.native
  def circle(point: rethinkdbLib.rethinkdbMod.Point, radius: scala.Double): rethinkdbLib.rethinkdbMod.Geometry = js.native
  def circle(
    point: rethinkdbLib.rethinkdbMod.Point,
    radius: scala.Double,
    options: rethinkdbLib.rethinkdbMod.CircleOptions
  ): rethinkdbLib.rethinkdbMod.Geometry = js.native
  def connect(host: java.lang.String): js.Promise[rethinkdbLib.rethinkdbMod.Connection] = js.native
  def connect(
    host: java.lang.String,
    cb: js.Function2[
      /* err */ rethinkdbLib.rethinkdbMod.ReqlDriverError, 
      /* conn */ rethinkdbLib.rethinkdbMod.Connection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def connect(opts: rethinkdbLib.rethinkdbMod.ConnectionOptions): js.Promise[rethinkdbLib.rethinkdbMod.Connection] = js.native
  def connect(
    opts: rethinkdbLib.rethinkdbMod.ConnectionOptions,
    cb: js.Function2[
      /* err */ rethinkdbLib.rethinkdbMod.ReqlDriverError, 
      /* conn */ rethinkdbLib.rethinkdbMod.Connection, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def db(name: java.lang.String): rethinkdbLib.rethinkdbMod.Db = js.native
  def dbCreate(name: java.lang.String): rethinkdbLib.rethinkdbMod.Operation[rethinkdbLib.rethinkdbMod.CreateResult] = js.native
  def dbDrop(name: java.lang.String): rethinkdbLib.rethinkdbMod.Operation[rethinkdbLib.rethinkdbMod.DropResult] = js.native
  def dbList(): rethinkdbLib.rethinkdbMod.Operation[js.Array[java.lang.String]] = js.native
  def desc(property: java.lang.String): rethinkdbLib.rethinkdbMod.Sort = js.native
  def epochTime(): rethinkdbLib.rethinkdbMod.Expression[rethinkdbLib.rethinkdbMod.Time] = js.native
  def expr(stuff: js.Any): rethinkdbLib.rethinkdbMod.Expression[_] = js.native
  @JSName("js")
  def js_(jsString: java.lang.String): rethinkdbLib.rethinkdbMod.Operation[_] = js.native
  @JSName("js")
  def js_(jsString: java.lang.String, opts: rethinkdbLib.Anon_Timeout): rethinkdbLib.rethinkdbMod.Operation[_] = js.native
  def now(): rethinkdbLib.rethinkdbMod.Expression[rethinkdbLib.rethinkdbMod.Time] = js.native
  def point(lng: scala.Double, lat: scala.Double): rethinkdbLib.rethinkdbMod.Point = js.native
  def polygon(point: rethinkdbLib.rethinkdbMod.Point*): rethinkdbLib.rethinkdbMod.Polygon = js.native
  def sum(prop: java.lang.String): rethinkdbLib.rethinkdbMod.Aggregator = js.native
  def table(name: java.lang.String): rethinkdbLib.rethinkdbMod.Table = js.native
  def table(name: java.lang.String, options: rethinkdbLib.Anon_UseOutdated): rethinkdbLib.rethinkdbMod.Table = js.native
  def uuid(): rethinkdbLib.rethinkdbMod.Operation[java.lang.String] = js.native
  def uuid(input: java.lang.String): rethinkdbLib.rethinkdbMod.Operation[java.lang.String] = js.native
}

