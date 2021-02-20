package typings.smshelper

import typings.smshelper.smshelperStrings.GSM_7BIT
import typings.smshelper.smshelperStrings.GSM_7BIT_EX
import typings.smshelper.smshelperStrings.UTF16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smshelper", "count")
  @js.native
  def count(text: String): Double = js.native
  
  @JSImport("smshelper", "detectEncoding")
  @js.native
  def detectEncoding(text: String): GSM_7BIT | GSM_7BIT_EX | UTF16 = js.native
  
  @JSImport("smshelper", "parts")
  @js.native
  def parts(text: String): Double = js.native
}
