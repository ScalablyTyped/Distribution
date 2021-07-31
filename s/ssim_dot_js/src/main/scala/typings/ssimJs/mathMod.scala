package typings.ssimJs

import typings.ssimJs.typesMod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("ssim.js/dist/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add2d(A: Matrix, increase: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("add2d")(A.asInstanceOf[js.Any], increase.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def add2d(A: Matrix, increase: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("add2d")(A.asInstanceOf[js.Any], increase.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def average(xn: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(xn.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def covariance(values1: js.Array[Double], values2: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("covariance")(values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def covariance(values1: js.Array[Double], values2: js.Array[Double], average1: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("covariance")(values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any], average1.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def covariance(values1: js.Array[Double], values2: js.Array[Double], average1: Double, average2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("covariance")(values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any], average1.asInstanceOf[js.Any], average2.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def covariance(values1: js.Array[Double], values2: js.Array[Double], average1: Unit, average2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("covariance")(values1.asInstanceOf[js.Any], values2.asInstanceOf[js.Any], average1.asInstanceOf[js.Any], average2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def divide2d(A: Matrix, divisor: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("divide2d")(A.asInstanceOf[js.Any], divisor.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def divide2d(A: Matrix, divisor: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("divide2d")(A.asInstanceOf[js.Any], divisor.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def floor(xn: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(xn.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @scala.inline
  def mean2d(A: Matrix): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mean2d")(A.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def multiply2d(A: Matrix, multiplier: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply2d")(A.asInstanceOf[js.Any], multiplier.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def multiply2d(A: Matrix, multiplier: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply2d")(A.asInstanceOf[js.Any], multiplier.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def square2d(A: Matrix): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("square2d")(A.asInstanceOf[js.Any]).asInstanceOf[Matrix]
  
  @scala.inline
  def subtract2d(A: Matrix, decrease: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract2d")(A.asInstanceOf[js.Any], decrease.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  @scala.inline
  def subtract2d(A: Matrix, decrease: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract2d")(A.asInstanceOf[js.Any], decrease.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  @scala.inline
  def sum(xn: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(xn.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def sum2d(hasData: Matrix): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum2d")(hasData.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def variance(values: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("variance")(values.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def variance(values: js.Array[Double], avg: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("variance")(values.asInstanceOf[js.Any], avg.asInstanceOf[js.Any])).asInstanceOf[Double]
}
