package typings.smshelper

import typings.smshelper.smshelperStrings.GSM_7BIT
import typings.smshelper.smshelperStrings.GSM_7BIT_EX
import typings.smshelper.smshelperStrings.UTF16
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smshelper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def count(text: String): Double = js.native
  
  def detectEncoding(text: String): GSM_7BIT | GSM_7BIT_EX | UTF16 = js.native
  
  def parts(text: String): Double = js.native
}
