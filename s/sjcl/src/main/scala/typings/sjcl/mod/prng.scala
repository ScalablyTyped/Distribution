package typings.sjcl.mod

import typings.sjcl.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("sjcl", "prng")
@js.native
open class prng protected ()
  extends StObject
     with SjclRandom {
  def this(defaultParanoia: Double) = this()
}
object prng {
  
  inline def apply: SjclRandomStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("prng").asInstanceOf[SjclRandomStatic]
}
