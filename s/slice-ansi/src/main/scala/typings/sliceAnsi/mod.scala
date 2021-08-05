package typings.sliceAnsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String, beginSlice: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(input: String, beginSlice: Double, endSlice: Double): String = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], beginSlice.asInstanceOf[js.Any], endSlice.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("slice-ansi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
