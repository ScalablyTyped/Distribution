package typings.rword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateIndexesMod {
  
  @JSImport("rword/dist/lib/generate-indexes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def generateIndexes(length: Double, count: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateIndexes")(length.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
