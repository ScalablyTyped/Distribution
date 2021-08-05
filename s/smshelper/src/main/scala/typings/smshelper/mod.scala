package typings.smshelper

import typings.smshelper.smshelperStrings.GSM_7BIT
import typings.smshelper.smshelperStrings.GSM_7BIT_EX
import typings.smshelper.smshelperStrings.UTF16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smshelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def detectEncoding(text: String): GSM_7BIT | GSM_7BIT_EX | UTF16 = ^.asInstanceOf[js.Dynamic].applyDynamic("detectEncoding")(text.asInstanceOf[js.Any]).asInstanceOf[GSM_7BIT | GSM_7BIT_EX | UTF16]
  
  inline def parts(text: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parts")(text.asInstanceOf[js.Any]).asInstanceOf[Double]
}
