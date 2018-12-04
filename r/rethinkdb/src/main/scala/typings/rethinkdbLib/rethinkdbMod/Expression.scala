package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expression[T]
  extends Writeable
     with Operation[T]
     with HasFields[Expression[scala.Double]] {
  def apply(prop: java.lang.String): Expression[_] = js.native
  def add(n: Expression[scala.Double]): Expression[scala.Double] = js.native
  def add(n: scala.Double): Expression[scala.Double] = js.native
  def and(b: Expression[scala.Boolean]): Expression[scala.Boolean] = js.native
  def and(b: scala.Boolean): Expression[scala.Boolean] = js.native
  def append(prop: java.lang.String): Expression[js.Object] = js.native
  def contains(prop: java.lang.String): Expression[scala.Boolean] = js.native
  def default(value: T): Expression[T] = js.native
  def distance(geometry: Geometry): Expression[scala.Double] = js.native
  def distance(geometry: Geometry, options: DistanceOptions): Expression[scala.Double] = js.native
  def div(n: scala.Double): Expression[scala.Double] = js.native
  def eq(v: js.Any): Expression[scala.Boolean] = js.native
  def eq(v: Expression[_]): Expression[scala.Boolean] = js.native
  def ge(value: T): Expression[scala.Boolean] = js.native
  def gt(value: T): Expression[scala.Boolean] = js.native
  def le(value: T): Expression[scala.Boolean] = js.native
  def lt(value: T): Expression[scala.Boolean] = js.native
  def merge(query: Expression[js.Object]): Expression[js.Object] = js.native
  def mod(n: scala.Double): Expression[scala.Double] = js.native
  def mul(n: scala.Double): Expression[scala.Double] = js.native
  def ne(v: js.Any): Expression[scala.Boolean] = js.native
  def ne(v: Expression[_]): Expression[scala.Boolean] = js.native
  def not(): Expression[scala.Boolean] = js.native
  def or(b: Expression[scala.Boolean]): Expression[scala.Boolean] = js.native
  def or(b: scala.Boolean): Expression[scala.Boolean] = js.native
  /**
           * Retrieve how many seconds elapsed between today and `date`.
           *
           * See: https://rethinkdb.com/api/javascript/sub/
           *
           * Example:
           *
           *     r.now().sub(365 * 24 * 60 * 60)
           */
  def sub(date: Time): Expression[scala.Double] = js.native
  /**
           * Subtract two numbers.
           *
           * See: https://rethinkdb.com/api/javascript/sub/
           *
           * Example:
           *
           *     r.expr(2).sub(2).run(conn, callback)
           */
  def sub(n: scala.Double, numbers: scala.Double*): Expression[scala.Double] = js.native
}

