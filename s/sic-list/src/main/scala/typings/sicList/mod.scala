package typings.sicList

import org.scalablytyped.runtime.StringDictionary
import typings.sicList.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sic-list", "getCode")
  @js.native
  def getCode(description: String): js.UndefOr[String] = js.native
  
  @JSImport("sic-list", "getCodeList")
  @js.native
  def getCodeList(): StringDictionary[String] = js.native
  
  @JSImport("sic-list", "getCodes")
  @js.native
  def getCodes(): js.Array[String] = js.native
  
  @JSImport("sic-list", "getData")
  @js.native
  def getData(): js.Array[Code] = js.native
  
  @JSImport("sic-list", "getDescription")
  @js.native
  def getDescription(code: String): js.UndefOr[String] = js.native
  
  @JSImport("sic-list", "getDescriptionList")
  @js.native
  def getDescriptionList(): StringDictionary[String] = js.native
  
  @JSImport("sic-list", "getDescriptions")
  @js.native
  def getDescriptions(): js.Array[String] = js.native
  
  @JSImport("sic-list", "overwrite")
  @js.native
  def overwrite(sics: js.Array[Code]): Unit = js.native
}
