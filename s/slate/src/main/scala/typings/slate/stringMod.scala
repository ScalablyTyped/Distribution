package typings.slate

import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("slate/dist/utils/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def codepointsIteratorRTL(str: String): Generator[String, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("codepointsIteratorRTL")(str.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Any]]
  
  inline def getCharacterDistance(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getCharacterDistance")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getCharacterDistance(str: String, isRTL: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getCharacterDistance")(str.asInstanceOf[js.Any], isRTL.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getWordDistance(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWordDistance")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWordDistance(text: String, isRTL: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWordDistance")(text.asInstanceOf[js.Any], isRTL.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def splitByCharacterDistance(str: String, dist: Double): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitByCharacterDistance")(str.asInstanceOf[js.Any], dist.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  inline def splitByCharacterDistance(str: String, dist: Double, isRTL: Boolean): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitByCharacterDistance")(str.asInstanceOf[js.Any], dist.asInstanceOf[js.Any], isRTL.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
}
