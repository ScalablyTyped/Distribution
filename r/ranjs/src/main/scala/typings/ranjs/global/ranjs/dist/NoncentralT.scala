package typings.ranjs.global.ranjs.dist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ranjs.dist.NoncentralT")
@js.native
class NoncentralT ()
  extends typings.ranjs.mod.dist.NoncentralT {
  def this(nu: Double) = this()
  def this(nu: Double, mu: Double) = this()
  def this(nu: Unit, mu: Double) = this()
}
object NoncentralT {
  
  @JSGlobal("ranjs.dist.NoncentralT")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fnm(nu: Double, mu: Double, x: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fnm")(nu.asInstanceOf[js.Any], mu.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
}
