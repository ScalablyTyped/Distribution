package typings.randomJs

import typings.randomJs.typesMod.Distribution
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realMod {
  
  @JSImport("random-js/dist/distribution/real", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def real(min: Double, max: Double): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("real")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
  @scala.inline
  def real(min: Double, max: Double, inclusive: Boolean): Distribution[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("real")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Distribution[Double]]
}
