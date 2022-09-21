package typings.semverCompareMulti

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-compare-multi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cmp(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def newComparer(): js.Function2[/* a */ String, /* b */ String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("newComparer")().asInstanceOf[js.Function2[/* a */ String, /* b */ String, Double]]
  inline def newComparer(separators: js.Array[String]): js.Function2[/* a */ String, /* b */ String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("newComparer")(separators.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ String, /* b */ String, Double]]
}
