package typings.ranjs.mod

import typings.ranjs.anon.D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object la {
  
  @JSImport("ranjs", "la.Matrix")
  @js.native
  open class Matrix () extends StObject {
    def this(arg: js.Array[js.Array[Double]]) = this()
    def this(arg: Double) = this()
    def this(arg: Matrix) = this()
    
    def act(vec: Vector): Vector = js.native
    
    def add(mat: Matrix): Matrix = js.native
    
    def f(func: js.Function1[/* d */ Double, Double]): Matrix = js.native
    
    def ij(i: Double, j: Double): Double = js.native
    def ij(i: Double, j: Double, value: Double): Unit = js.native
    
    def ldl(): D = js.native
    
    def m(): js.Array[js.Array[Double]] = js.native
    
    def mult(max: Matrix): Matrix = js.native
    
    def scale(s: Double): Matrix = js.native
    
    def t(): Matrix = js.native
  }
  
  @JSImport("ranjs", "la.Vector")
  @js.native
  open class Vector () extends StObject {
    def this(arg: js.Array[Double]) = this()
    def this(arg: Double) = this()
    def this(arg: Vector) = this()
    
    def add(vec: Vector): Vector = js.native
    
    def dot(vec: Vector): Double = js.native
    
    def f(func: js.Function1[/* d */ Double, Double]): Vector = js.native
    
    def i(i: Double): Double = js.native
    def i(i: Double, value: Double): Unit = js.native
    
    def scale(s: Double): Vector = js.native
    
    def v(): js.Array[Double] = js.native
  }
}
