package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathUtils extends js.Object {
  def compare(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Double | scala.Null = js.native
  def create(attrs: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def create(attrs: java.lang.String): immutableLib.immutableMod.List[scala.Double] = js.native
  def crop(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): js.Array[immutableLib.immutableMod.List[scala.Double]] = js.native
  def crop(
    a: immutableLib.immutableMod.List[scala.Double],
    b: immutableLib.immutableMod.List[scala.Double],
    size: scala.Double
  ): js.Array[immutableLib.immutableMod.List[scala.Double]] = js.native
  def decrement(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def decrement(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  def decrement(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double, index: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  def increment(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def increment(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  def increment(path: immutableLib.immutableMod.List[scala.Double], n: scala.Double, index: scala.Double): immutableLib.immutableMod.List[scala.Double] = js.native
  def isAbove(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  def isAfter(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  def isBefore(
    path: immutableLib.immutableMod.List[scala.Double],
    target: immutableLib.immutableMod.List[scala.Double]
  ): scala.Boolean = js.native
  def lift(path: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
  def max(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): scala.Double = js.native
  def min(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): scala.Double = js.native
  def relate(a: immutableLib.immutableMod.List[scala.Double], b: immutableLib.immutableMod.List[scala.Double]): immutableLib.immutableMod.List[scala.Double] = js.native
}

