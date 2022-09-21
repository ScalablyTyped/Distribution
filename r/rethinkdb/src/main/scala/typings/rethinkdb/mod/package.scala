package typings.rethinkdb.mod

import typings.rethinkdb.anon.Timeout
import typings.rethinkdb.anon.UseOutdated
import typings.rethinkdb.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def asc(property: String): Sort = ^.asInstanceOf[js.Dynamic].applyDynamic("asc")(property.asInstanceOf[js.Any]).asInstanceOf[Sort]

inline def avg(prop: String): Aggregator = ^.asInstanceOf[js.Dynamic].applyDynamic("avg")(prop.asInstanceOf[js.Any]).asInstanceOf[Aggregator]

inline def branch(test: Expression[Boolean], trueBranch: Expression[Any], falseBranch: Expression[Any]): Expression[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("branch")(test.asInstanceOf[js.Any], trueBranch.asInstanceOf[js.Any], falseBranch.asInstanceOf[js.Any])).asInstanceOf[Expression[Any]]

inline def circle(point: Point_, radius: Double): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(point.asInstanceOf[js.Any], radius.asInstanceOf[js.Any])).asInstanceOf[Geometry]
inline def circle(point: Point_, radius: Double, options: CircleOptions): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("circle")(point.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Geometry]

inline def connect(host: String): js.Promise[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(host.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Connection]]
inline def connect(host: String, cb: js.Function2[js.Error, /* conn */ Connection, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(host.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def connect(opts: ConnectionOptions): js.Promise[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Connection]]
inline def connect(opts: ConnectionOptions, cb: js.Function2[js.Error, /* conn */ Connection, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def count: Aggregator = ^.asInstanceOf[js.Dynamic].selectDynamic("count").asInstanceOf[Aggregator]
inline def count_=(x: Aggregator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])

inline def db(name: String): Db_ = ^.asInstanceOf[js.Dynamic].applyDynamic("db")(name.asInstanceOf[js.Any]).asInstanceOf[Db_]

inline def dbCreate(name: String): Operation[CreateResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("dbCreate")(name.asInstanceOf[js.Any]).asInstanceOf[Operation[CreateResult]]

inline def dbDrop(name: String): Operation[DropResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDrop")(name.asInstanceOf[js.Any]).asInstanceOf[Operation[DropResult]]

inline def dbList(): Operation[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dbList")().asInstanceOf[Operation[js.Array[String]]]

inline def desc(property: String): Sort = ^.asInstanceOf[js.Dynamic].applyDynamic("desc")(property.asInstanceOf[js.Any]).asInstanceOf[Sort]

inline def epochTime(): Expression[Time] = ^.asInstanceOf[js.Dynamic].applyDynamic("epochTime")().asInstanceOf[Expression[Time]]

inline def expr(stuff: Any): Expression[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("expr")(stuff.asInstanceOf[js.Any]).asInstanceOf[Expression[Any]]

inline def js_(jsString: String): Operation[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("js")(jsString.asInstanceOf[js.Any]).asInstanceOf[Operation[Any]]
inline def js_(jsString: String, opts: Timeout): Operation[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("js")(jsString.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Operation[Any]]

inline def now(): Expression[Time] = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Expression[Time]]

inline def point(lng: Double, lat: Double): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(lng.asInstanceOf[js.Any], lat.asInstanceOf[js.Any])).asInstanceOf[Point_]

inline def polygon(point: Point_ *): Polygon_ = ^.asInstanceOf[js.Dynamic].applyDynamic("polygon")(point.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Polygon_]

inline def row: Row_ = ^.asInstanceOf[js.Dynamic].selectDynamic("row").asInstanceOf[Row_]

inline def sum(prop: String): Aggregator = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(prop.asInstanceOf[js.Any]).asInstanceOf[Aggregator]

inline def table(name: String): Table_ = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(name.asInstanceOf[js.Any]).asInstanceOf[Table_]
inline def table(name: String, options: UseOutdated): Table_ = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Table_]

inline def uuid(): Operation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[Operation[String]]
inline def uuid(input: String): Operation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")(input.asInstanceOf[js.Any]).asInstanceOf[Operation[String]]

type ExpressionFunction[U] = js.Function1[/* doc */ Expression[Any], Expression[U]]

type IndexFunction[U] = Expression[U] | js.Array[Expression[U]] | (js.Function1[/* doc */ Expression[Any], Expression[U] | js.Array[Expression[U]]])

type JoinFunction[U] = js.Function2[/* left */ Expression[Any], /* right */ Expression[Any], Expression[U]]

type Polygon_ = Geometry

type ReduceFunction[U] = js.Function2[/* acc */ Expression[Any], /* val */ Expression[Any], Expression[U]]

/**
  * An error has occurred within the driver. This may be a driver bug, or it may
  * be an unfulfillable command, such as an unserializable query.
  *
  * See https://www.rethinkdb.com/docs/error-types/
  */
type ReqlDriverError = js.Error

type ReqlError = js.Error
