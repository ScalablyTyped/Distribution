package typings.rethinkdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def asc(property: java.lang.String): typings.rethinkdb.mod.Sort = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("asc")(property.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Sort]

inline def avg(prop: java.lang.String): typings.rethinkdb.mod.Aggregator = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("avg")(prop.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Aggregator]

inline def branch(
  test: typings.rethinkdb.mod.Expression[scala.Boolean],
  trueBranch: typings.rethinkdb.mod.Expression[js.Any],
  falseBranch: typings.rethinkdb.mod.Expression[js.Any]
): typings.rethinkdb.mod.Expression[js.Any] = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("branch")(test.asInstanceOf[js.Any], trueBranch.asInstanceOf[js.Any], falseBranch.asInstanceOf[js.Any])).asInstanceOf[typings.rethinkdb.mod.Expression[js.Any]]

inline def circle(point: typings.rethinkdb.mod.Point_, radius: scala.Double): typings.rethinkdb.mod.Geometry = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(point.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[typings.rethinkdb.mod.Geometry]
inline def circle(
  point: typings.rethinkdb.mod.Point_,
  radius: scala.Double,
  options: typings.rethinkdb.mod.CircleOptions
): typings.rethinkdb.mod.Geometry = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("circle")(point.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rethinkdb.mod.Geometry]

inline def connect(host: java.lang.String): js.Promise[typings.rethinkdb.mod.Connection] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(host.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.rethinkdb.mod.Connection]]
inline def connect(
  host: java.lang.String,
  cb: js.Function2[
  /* err */ typings.rethinkdb.mod.ReqlDriverError, 
  /* conn */ typings.rethinkdb.mod.Connection, 
  scala.Unit
]
): scala.Unit = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(host.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def connect(opts: typings.rethinkdb.mod.ConnectionOptions): js.Promise[typings.rethinkdb.mod.Connection] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.rethinkdb.mod.Connection]]
inline def connect(
  opts: typings.rethinkdb.mod.ConnectionOptions,
  cb: js.Function2[
  /* err */ typings.rethinkdb.mod.ReqlDriverError, 
  /* conn */ typings.rethinkdb.mod.Connection, 
  scala.Unit
]
): scala.Unit = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def count: typings.rethinkdb.mod.Aggregator = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].selectDynamic("count").asInstanceOf[typings.rethinkdb.mod.Aggregator]
inline def count_=(x: typings.rethinkdb.mod.Aggregator): scala.Unit = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])

inline def db(name: java.lang.String): typings.rethinkdb.mod.Db_ = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("db")(name.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Db_]

inline def dbCreate(name: java.lang.String): typings.rethinkdb.mod.Operation[typings.rethinkdb.mod.CreateResult] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dbCreate")(name.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Operation[typings.rethinkdb.mod.CreateResult]]

inline def dbDrop(name: java.lang.String): typings.rethinkdb.mod.Operation[typings.rethinkdb.mod.DropResult] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dbDrop")(name.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Operation[typings.rethinkdb.mod.DropResult]]

inline def dbList(): typings.rethinkdb.mod.Operation[js.Array[java.lang.String]] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dbList")().asInstanceOf[typings.rethinkdb.mod.Operation[js.Array[java.lang.String]]]

inline def desc(property: java.lang.String): typings.rethinkdb.mod.Sort = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("desc")(property.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Sort]

inline def epochTime(): typings.rethinkdb.mod.Expression[typings.rethinkdb.mod.Time] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("epochTime")().asInstanceOf[typings.rethinkdb.mod.Expression[typings.rethinkdb.mod.Time]]

inline def expr(stuff: js.Any): typings.rethinkdb.mod.Expression[js.Any] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("expr")(stuff.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Expression[js.Any]]

inline def js_(jsString: java.lang.String): typings.rethinkdb.mod.Operation[js.Any] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("js")(jsString.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Operation[js.Any]]
inline def js_(jsString: java.lang.String, opts: typings.rethinkdb.anon.Timeout): typings.rethinkdb.mod.Operation[js.Any] = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("js")(jsString.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.rethinkdb.mod.Operation[js.Any]]

inline def now(): typings.rethinkdb.mod.Expression[typings.rethinkdb.mod.Time] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.rethinkdb.mod.Expression[typings.rethinkdb.mod.Time]]

inline def point(lng: scala.Double, lat: scala.Double): typings.rethinkdb.mod.Point_ = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("point")(lng.asInstanceOf[js.Any], lat.asInstanceOf[js.Any])).asInstanceOf[typings.rethinkdb.mod.Point_]

inline def polygon(point: typings.rethinkdb.mod.Point_ *): typings.rethinkdb.mod.Polygon_ = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(point.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Polygon_]

inline def row: typings.rethinkdb.mod.Row_ = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].selectDynamic("row").asInstanceOf[typings.rethinkdb.mod.Row_]

inline def sum(prop: java.lang.String): typings.rethinkdb.mod.Aggregator = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("sum")(prop.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Aggregator]

inline def table(name: java.lang.String): typings.rethinkdb.mod.Table_ = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(name.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Table_]
inline def table(name: java.lang.String, options: typings.rethinkdb.anon.UseOutdated): typings.rethinkdb.mod.Table_ = (typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("table")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.rethinkdb.mod.Table_]

inline def uuid(): typings.rethinkdb.mod.Operation[java.lang.String] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[typings.rethinkdb.mod.Operation[java.lang.String]]
inline def uuid(input: java.lang.String): typings.rethinkdb.mod.Operation[java.lang.String] = typings.rethinkdb.mod.^.asInstanceOf[js.Dynamic].applyDynamic("uuid")(input.asInstanceOf[js.Any]).asInstanceOf[typings.rethinkdb.mod.Operation[java.lang.String]]

type ExpressionFunction[U] = js.Function1[
/* doc */ typings.rethinkdb.mod.Expression[js.Any], 
typings.rethinkdb.mod.Expression[U]]

type IndexFunction[U] = typings.rethinkdb.mod.Expression[U] | js.Array[typings.rethinkdb.mod.Expression[U]] | (js.Function1[
/* doc */ typings.rethinkdb.mod.Expression[js.Any], 
typings.rethinkdb.mod.Expression[U] | js.Array[typings.rethinkdb.mod.Expression[U]]])

type JoinFunction[U] = js.Function2[
/* left */ typings.rethinkdb.mod.Expression[js.Any], 
/* right */ typings.rethinkdb.mod.Expression[js.Any], 
typings.rethinkdb.mod.Expression[U]]

type Polygon_ = typings.rethinkdb.mod.Geometry

type ReduceFunction[U] = js.Function2[
/* acc */ typings.rethinkdb.mod.Expression[js.Any], 
/* val */ typings.rethinkdb.mod.Expression[js.Any], 
typings.rethinkdb.mod.Expression[U]]

/**
  * An error has occurred within the driver. This may be a driver bug, or it may
  * be an unfulfillable command, such as an unserializable query.
  *
  * See https://www.rethinkdb.com/docs/error-types/
  */
type ReqlDriverError = typings.rethinkdb.mod.ReqlError

type ReqlError = typings.std.Error
