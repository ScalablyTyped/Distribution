package typings.ssdeep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssdeep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(hash1: String, hash2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(hash1.asInstanceOf[js.Any], hash2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hash(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashFromFile(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_from_file")(path.asInstanceOf[js.Any]).asInstanceOf[String]
}
