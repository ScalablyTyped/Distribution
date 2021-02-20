package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("ssim.js/dist/math", "add2d")
  @js.native
  def add2d(A: Matrix, increase: Double): Matrix = js.native
  @JSImport("ssim.js/dist/math", "add2d")
  @js.native
  def add2d(A: Matrix, increase: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/math", "average")
  @js.native
  def average(xn: js.Array[Double]): Double = js.native
  
  @JSImport("ssim.js/dist/math", "covariance")
  @js.native
  def covariance(values1: js.Array[Double], values2: js.Array[Double]): Double = js.native
  @JSImport("ssim.js/dist/math", "covariance")
  @js.native
  def covariance(
    values1: js.Array[Double],
    values2: js.Array[Double],
    average1: js.UndefOr[scala.Nothing],
    average2: Double
  ): Double = js.native
  @JSImport("ssim.js/dist/math", "covariance")
  @js.native
  def covariance(values1: js.Array[Double], values2: js.Array[Double], average1: Double): Double = js.native
  @JSImport("ssim.js/dist/math", "covariance")
  @js.native
  def covariance(values1: js.Array[Double], values2: js.Array[Double], average1: Double, average2: Double): Double = js.native
  
  @JSImport("ssim.js/dist/math", "divide2d")
  @js.native
  def divide2d(A: Matrix, divisor: Double): Matrix = js.native
  @JSImport("ssim.js/dist/math", "divide2d")
  @js.native
  def divide2d(A: Matrix, divisor: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/math", "floor")
  @js.native
  def floor(xn: js.Array[Double]): js.Array[Double] = js.native
  
  @JSImport("ssim.js/dist/math", "mean2d")
  @js.native
  def mean2d(A: Matrix): Double = js.native
  
  @JSImport("ssim.js/dist/math", "multiply2d")
  @js.native
  def multiply2d(A: Matrix, multiplier: Double): Matrix = js.native
  @JSImport("ssim.js/dist/math", "multiply2d")
  @js.native
  def multiply2d(A: Matrix, multiplier: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/math", "square2d")
  @js.native
  def square2d(A: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/math", "subtract2d")
  @js.native
  def subtract2d(A: Matrix, decrease: Double): Matrix = js.native
  @JSImport("ssim.js/dist/math", "subtract2d")
  @js.native
  def subtract2d(A: Matrix, decrease: Matrix): Matrix = js.native
  
  @JSImport("ssim.js/dist/math", "sum")
  @js.native
  def sum(xn: js.Array[Double]): Double = js.native
  
  @JSImport("ssim.js/dist/math", "sum2d")
  @js.native
  def sum2d(hasData: Matrix): Double = js.native
  
  @JSImport("ssim.js/dist/math", "variance")
  @js.native
  def variance(values: js.Array[Double]): Double = js.native
  @JSImport("ssim.js/dist/math", "variance")
  @js.native
  def variance(values: js.Array[Double], avg: Double): Double = js.native
}
