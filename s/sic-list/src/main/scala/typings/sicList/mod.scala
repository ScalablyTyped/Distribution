package typings.sicList

import org.scalablytyped.runtime.StringDictionary
import typings.sicList.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sic-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getCode(description: String): js.UndefOr[String] = js.native
  def getCodeList(): StringDictionary[String] = js.native
  def getCodes(): js.Array[String] = js.native
  def getData(): js.Array[Code] = js.native
  def getDescription(code: String): js.UndefOr[String] = js.native
  def getDescriptionList(): StringDictionary[String] = js.native
  def getDescriptions(): js.Array[String] = js.native
  def overwrite(sics: js.Array[Code]): Unit = js.native
}

