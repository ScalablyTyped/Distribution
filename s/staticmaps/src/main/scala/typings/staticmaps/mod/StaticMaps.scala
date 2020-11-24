package typings.staticmaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticMaps extends js.Object {
  
  def addLine(options: AddLineOptions): Unit = js.native
  
  def addMarker(options: AddMarkerOptions): Unit = js.native
  
  def addMultiPolygon(options: AddMultiPolygonOptions): Unit = js.native
  
  def addPolygon(options: AddPolygonOptions): Unit = js.native
  
  def addText(options: AddTextOptions): Unit = js.native
  
  var image: StaticMapsImage = js.native
  
  def render(): js.Promise[Unit] = js.native
  def render(center: js.UndefOr[scala.Nothing], zoom: Double): js.Promise[Unit] = js.native
  def render(center: js.Array[Double]): js.Promise[Unit] = js.native
  def render(center: js.Array[Double], zoom: Double): js.Promise[Unit] = js.native
}
