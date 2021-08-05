package typings.qiniuJs.mod

import typings.qiniuJs.qiniuJsStrings.Center
import typings.qiniuJs.qiniuJsStrings.East
import typings.qiniuJs.qiniuJsStrings.North
import typings.qiniuJs.qiniuJsStrings.NorthEast
import typings.qiniuJs.qiniuJsStrings.NorthWest
import typings.qiniuJs.qiniuJsStrings.South
import typings.qiniuJs.qiniuJsStrings.SouthEast
import typings.qiniuJs.qiniuJsStrings.SouthWest
import typings.qiniuJs.qiniuJsStrings.West
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaterMarkFopOptions1
  extends StObject
     with WaterMarkOptions1 {
  
  var fop: typings.qiniuJs.qiniuJsStrings.watermark
}
object WaterMarkFopOptions1 {
  
  inline def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    image: String
  ): WaterMarkFopOptions1 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fop = "watermark", gravity = gravity.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], mode = 1)
    __obj.asInstanceOf[WaterMarkFopOptions1]
  }
  
  extension [Self <: WaterMarkFopOptions1](x: Self) {
    
    inline def setFop(value: typings.qiniuJs.qiniuJsStrings.watermark): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
  }
}
