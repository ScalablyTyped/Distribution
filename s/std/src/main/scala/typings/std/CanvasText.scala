package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasText extends StObject {
  
  /* standard dom */
  def fillText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def fillText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
  
  /* standard dom */
  def measureText(text: java.lang.String): TextMetrics = js.native
  
  /* standard dom */
  def strokeText(text: java.lang.String, x: Double, y: Double): Unit = js.native
  def strokeText(text: java.lang.String, x: Double, y: Double, maxWidth: Double): Unit = js.native
}
