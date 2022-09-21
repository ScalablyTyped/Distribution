package typings.reactSketchapp.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformBridge extends StObject {
  
  def createStringMeasurer(textNodes: js.Array[TextNode], maxWidth: Double): Size = js.native
  
  def findFontName(style: TextStyle): String = js.native
  
  def makeImageDataFromUrl(): String = js.native
  def makeImageDataFromUrl(url: String): String = js.native
}
