package typings.rtlDetect

import typings.rtlDetect.rtlDetectStrings.ltr
import typings.rtlDetect.rtlDetectStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rtl-detect", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getLangDir(strLocale: String): ltr | rtl = js.native
  
  def isRtlLang(strLocale: String): js.UndefOr[Boolean] = js.native
}
