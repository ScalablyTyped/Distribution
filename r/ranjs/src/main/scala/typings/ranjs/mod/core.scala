package typings.ranjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ranjs", "core")
@js.native
object core extends js.Object {
  
  def char(): js.UndefOr[scala.Nothing] = js.native
  def char(values: String): String = js.native
  def char(values: String, n: Double): js.Array[String] = js.native
  
  def choice(): js.UndefOr[scala.Nothing] = js.native
  def choice[T](values: js.Array[T]): T = js.native
  def choice[T](values: js.Array[T], n: Double): js.Array[T] = js.native
  
  def coin[T, U](head: T, tail: U): T | U = js.native
  def coin[T, U](head: T, tail: U, p: Double): T | U = js.native
  def coin[T, U](head: T, tail: U, p: Double, n: Double): js.Array[T | U] = js.native
  
  def float(max: Double): Double = js.native
  def float(min: Double, max: Double): Double = js.native
  def float(min: Double, max: Double, n: Double): js.Array[Double] = js.native
  
  def int(max: Double): Double = js.native
  def int(min: Double, max: Double): Double = js.native
  def int(min: Double, max: Double, n: Double): js.Array[Double] = js.native
  
  def seed(value: String): Unit = js.native
  def seed(value: Double): Unit = js.native
  
  def shuffle[T](values: js.Array[T]): js.Array[T] = js.native
}
