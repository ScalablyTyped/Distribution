package typings.stringz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stringz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def indexOf(str: String, searchStr: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(str.asInstanceOf[js.Any], searchStr.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def indexOf(str: String, searchStr: String, pos: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("indexOf")(str.asInstanceOf[js.Any], searchStr.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def length(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def limit(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Double, padString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], padString.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Double, padString: String, padPosition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], padString.asInstanceOf[js.Any], padPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Double, padString: Unit, padPosition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], padString.asInstanceOf[js.Any], padPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Unit, padString: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], padString.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Unit, padString: String, padPosition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], padString.asInstanceOf[js.Any], padPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def limit(str: String, limit: Unit, padString: Unit, padPosition: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("limit")(str.asInstanceOf[js.Any], limit.asInstanceOf[js.Any], padString.asInstanceOf[js.Any], padPosition.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def substr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def substr(str: String, begin: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def substr(str: String, begin: Double, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def substr(str: String, begin: Unit, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substr")(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def substring(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def substring(str: String, begin: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def substring(str: String, begin: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def substring(str: String, begin: Unit, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substring")(str.asInstanceOf[js.Any], begin.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def toArray(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
