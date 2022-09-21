package typings.reachAutoId

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/auto-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useId(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[js.UndefOr[String]]
  inline def useId(idFromProps: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(idFromProps.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(idFromProps: Double): js.UndefOr[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(idFromProps.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double]]
  
  inline def useId_Double(idFromProps: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(idFromProps.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def useId_Union(idFromProps: String): js.UndefOr[String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(idFromProps.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Double]]
}
