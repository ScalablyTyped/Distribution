package typings.reactTimePicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedUtilsMod {
  
  @JSImport("react-time-picker/dist/cjs/shared/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAmPmLabels(): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAmPmLabels")().asInstanceOf[js.Tuple2[String, String]]
  inline def getAmPmLabels(locale: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAmPmLabels")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def safeMax(args: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("safeMax")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
  
  inline def safeMin(args: Any*): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("safeMin")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Double]
}
