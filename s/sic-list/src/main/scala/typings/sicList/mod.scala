package typings.sicList

import org.scalablytyped.runtime.StringDictionary
import typings.sicList.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sic-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCode(description: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(description.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getCodeList(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodeList")().asInstanceOf[StringDictionary[String]]
  
  inline def getCodes(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCodes")().asInstanceOf[js.Array[String]]
  
  inline def getData(): js.Array[Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")().asInstanceOf[js.Array[Code]]
  
  inline def getDescription(code: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescription")(code.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getDescriptionList(): StringDictionary[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptionList")().asInstanceOf[StringDictionary[String]]
  
  inline def getDescriptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDescriptions")().asInstanceOf[js.Array[String]]
  
  inline def overwrite(sics: js.Array[Code]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overwrite")(sics.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
