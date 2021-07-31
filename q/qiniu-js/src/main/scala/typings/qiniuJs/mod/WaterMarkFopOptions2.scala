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

trait WaterMarkFopOptions2
  extends StObject
     with WaterMarkOptions2 {
  
  var fop: typings.qiniuJs.qiniuJsStrings.watermark
}
object WaterMarkFopOptions2 {
  
  @scala.inline
  def apply(
    dissolve: Double,
    dx: Double,
    dy: Double,
    fill: String,
    font: String,
    fontsize: Double,
    gravity: NorthWest | North | NorthEast | West | Center | East | SouthWest | South | SouthEast,
    text: String
  ): WaterMarkFopOptions2 = {
    val __obj = js.Dynamic.literal(dissolve = dissolve.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontsize = fontsize.asInstanceOf[js.Any], fop = "watermark", gravity = gravity.asInstanceOf[js.Any], mode = 2, text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterMarkFopOptions2]
  }
  
  @scala.inline
  implicit class WaterMarkFopOptions2MutableBuilder[Self <: WaterMarkFopOptions2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFop(value: typings.qiniuJs.qiniuJsStrings.watermark): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
  }
}
