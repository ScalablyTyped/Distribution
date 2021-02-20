package typings.ranjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSImport("ranjs", "core.char")
  @js.native
  def char(): js.UndefOr[scala.Nothing] = js.native
  @JSImport("ranjs", "core.char")
  @js.native
  def char(values: String): String = js.native
  @JSImport("ranjs", "core.char")
  @js.native
  def char(values: String, n: Double): js.Array[String] = js.native
  
  @JSImport("ranjs", "core.choice")
  @js.native
  def choice(): js.UndefOr[scala.Nothing] = js.native
  @JSImport("ranjs", "core.choice")
  @js.native
  def choice[T](values: js.Array[T]): T = js.native
  @JSImport("ranjs", "core.choice")
  @js.native
  def choice[T](values: js.Array[T], n: Double): js.Array[T] = js.native
  
  @JSImport("ranjs", "core.coin")
  @js.native
  def coin[T, U](head: T, tail: U): T | U = js.native
  @JSImport("ranjs", "core.coin")
  @js.native
  def coin[T, U](head: T, tail: U, p: Double): T | U = js.native
  @JSImport("ranjs", "core.coin")
  @js.native
  def coin[T, U](head: T, tail: U, p: Double, n: Double): js.Array[T | U] = js.native
  
  @JSImport("ranjs", "core.float")
  @js.native
  def float(max: Double): Double = js.native
  @JSImport("ranjs", "core.float")
  @js.native
  def float(min: Double, max: Double): Double = js.native
  // tslint:disable-line unified-signatures
  @JSImport("ranjs", "core.float")
  @js.native
  def float(min: Double, max: Double, n: Double): js.Array[Double] = js.native
  
  @JSImport("ranjs", "core.int")
  @js.native
  def int(max: Double): Double = js.native
  @JSImport("ranjs", "core.int")
  @js.native
  def int(min: Double, max: Double): Double = js.native
  // tslint:disable-line unified-signatures
  @JSImport("ranjs", "core.int")
  @js.native
  def int(min: Double, max: Double, n: Double): js.Array[Double] = js.native
  
  @JSImport("ranjs", "core.seed")
  @js.native
  def seed(value: String): Unit = js.native
  @JSImport("ranjs", "core.seed")
  @js.native
  def seed(value: Double): Unit = js.native
  
  @JSImport("ranjs", "core.shuffle")
  @js.native
  def shuffle[T](values: js.Array[T]): js.Array[T] = js.native
}
