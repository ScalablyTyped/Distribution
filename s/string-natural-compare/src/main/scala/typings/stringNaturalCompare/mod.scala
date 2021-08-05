package typings.stringNaturalCompare

import typings.stringNaturalCompare.anon.Alphabet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(a: String, b: String, options: Alphabet): Double = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("string-natural-compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
