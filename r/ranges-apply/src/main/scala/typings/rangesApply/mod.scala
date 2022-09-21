package typings.rangesApply

import typings.rangesSort.mod.Ranges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ranges-apply", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rApply(str: String, originalRangesArr: Ranges): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rApply")(str.asInstanceOf[js.Any], originalRangesArr.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def rApply(
    str: String,
    originalRangesArr: Ranges,
    progressFn: js.Function1[/* percentageDone */ Double, Unit]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rApply")(str.asInstanceOf[js.Any], originalRangesArr.asInstanceOf[js.Any], progressFn.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ranges-apply", "version")
  @js.native
  val version: String = js.native
}
