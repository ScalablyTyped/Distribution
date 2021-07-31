package typings.rgbHex

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(red: Double, green: Double, blue: Double): String = (^.asInstanceOf[js.Dynamic].apply(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(red: Double, green: Double, blue: Double, alpha: String): String = (^.asInstanceOf[js.Dynamic].apply(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(red: Double, green: Double, blue: Double, alpha: Double): String = (^.asInstanceOf[js.Dynamic].apply(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(rgba: String): String = ^.asInstanceOf[js.Dynamic].apply(rgba.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("rgb-hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
