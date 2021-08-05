package typings.reactVirtualized.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeAndPositionInfo
  extends StObject
     with SizeInfo
     with PositionInfo
object SizeAndPositionInfo {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): SizeAndPositionInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeAndPositionInfo]
  }
}
