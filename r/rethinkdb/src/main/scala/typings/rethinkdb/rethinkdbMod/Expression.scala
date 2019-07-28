package typings.rethinkdb.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression[T]
  extends Writeable
     with Operation[T]
     with HasFields[Expression[Double]] {
  def apply(prop: String): Expression[_] = js.native
  def add(n: Double): Expression[Double] = js.native
  def add(n: Expression[Double]): Expression[Double] = js.native
  def and(b: Boolean): Expression[Boolean] = js.native
  def and(b: Expression[Boolean]): Expression[Boolean] = js.native
  def append(prop: String): Expression[js.Object] = js.native
  def contains(prop: String): Expression[Boolean] = js.native
  def default(value: T): Expression[T] = js.native
  def distance(geometry: Geometry): Expression[Double] = js.native
  def distance(geometry: Geometry, options: DistanceOptions): Expression[Double] = js.native
  def div(n: Double): Expression[Double] = js.native
  def eq(v: js.Any): Expression[Boolean] = js.native
  def eq(v: Expression[_]): Expression[Boolean] = js.native
  def ge(value: T): Expression[Boolean] = js.native
  def gt(value: T): Expression[Boolean] = js.native
  def le(value: T): Expression[Boolean] = js.native
  def lt(value: T): Expression[Boolean] = js.native
  def merge(query: Expression[js.Object]): Expression[js.Object] = js.native
  def mod(n: Double): Expression[Double] = js.native
  def mul(n: Double): Expression[Double] = js.native
  def ne(v: js.Any): Expression[Boolean] = js.native
  def ne(v: Expression[_]): Expression[Boolean] = js.native
  def not(): Expression[Boolean] = js.native
  def or(b: Boolean): Expression[Boolean] = js.native
  def or(b: Expression[Boolean]): Expression[Boolean] = js.native
  /**
    * Retrieve how many seconds elapsed between today and `date`.
    *
    * See: https://rethinkdb.com/api/javascript/sub/
    *
    * Example:
    *
    *     r.now().sub(365 * 24 * 60 * 60)
    */
  def sub(date: Time): Expression[Double] = js.native
  /**
    * Subtract two numbers.
    *
    * See: https://rethinkdb.com/api/javascript/sub/
    *
    * Example:
    *
    *     r.expr(2).sub(2).run(conn, callback)
    */
  def sub(n: Double, numbers: Double*): Expression[Double] = js.native
}

