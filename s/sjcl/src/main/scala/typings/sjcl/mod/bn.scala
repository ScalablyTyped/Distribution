package typings.sjcl.mod

import typings.sjcl.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sjcl", "bn")
@js.native
class bn ()
  extends StObject
     with BigNumber {
  def this(n: String) = this()
  def this(n: Double) = this()
  def this(n: BigNumber) = this()
}
object bn {
  
  inline def apply: BigNumberStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("bn").asInstanceOf[BigNumberStatic]
}
