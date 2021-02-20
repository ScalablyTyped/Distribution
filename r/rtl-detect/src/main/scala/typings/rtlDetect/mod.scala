package typings.rtlDetect

import typings.rtlDetect.rtlDetectStrings.ltr
import typings.rtlDetect.rtlDetectStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rtl-detect", "getLangDir")
  @js.native
  def getLangDir(strLocale: String): ltr | rtl = js.native
  
  @JSImport("rtl-detect", "isRtlLang")
  @js.native
  def isRtlLang(strLocale: String): js.UndefOr[Boolean] = js.native
}
