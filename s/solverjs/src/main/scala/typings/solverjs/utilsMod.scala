package typings.solverjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("solverjs/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def URLShortener(id: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("URLShortener")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def checkCamelCase(varName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCamelCase")(varName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkFlatCase(varname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFlatCase")(varname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkKebabCase(varName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkKebabCase")(varName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkPascalCase(VarName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPascalCase")(VarName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def checkSnakeCase(varName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSnakeCase")(varName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def containNumber(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containNumber")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def contatinSpecial(word: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("contatinSpecial")(word.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def dateToDay(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dateToDay")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def dobToAge(date: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dobToAge")(date.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def ext(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ext")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isKeywordExists(str: String, keyword: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKeywordExists")(str.asInstanceOf[js.Any], keyword.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def keywordExtractor(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("keywordExtractor")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def railwayTimeConversion(timeString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("railwayTimeConversion")(timeString.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sort(arr: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sort")(arr.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def sort(arr: js.Array[Double], reverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sort")(arr.asInstanceOf[js.Any], reverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
