package typings.sizeof

import typings.sizeof.sizeofBooleans.`false`
import typings.sizeof.sizeofBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sizeof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(bytes: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sizeof(`object`: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def sizeof_false(`object`: js.Any, pretty: `false`): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(`object`.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sizeof_true(`object`: js.Any, pretty: `true`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sizeof")(`object`.asInstanceOf[js.Any], pretty.asInstanceOf[js.Any])).asInstanceOf[String]
}
