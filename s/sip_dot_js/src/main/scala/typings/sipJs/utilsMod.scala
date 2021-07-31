package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("sip.js/lib/core/messages/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createRandomToken(size: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createRandomToken")(size.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def createRandomToken(size: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRandomToken")(size.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getReasonPhrase(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getReasonPhrase")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def headerize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("headerize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def newTag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newTag")().asInstanceOf[String]
  
  @scala.inline
  def utf8Length(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utf8Length")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
}
