package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseMod {
  
  @JSImport("react-native-uuid/dist/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(s: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def parse(s: String, buf: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parse(s: String, buf: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def parse(s: String, buf: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
