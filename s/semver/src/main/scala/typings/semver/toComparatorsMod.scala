package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toComparatorsMod {
  
  /**
    * Mostly just for testing and legacy API reasons
    */
  inline def apply(range: String): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def apply(range: String, optionsOrLoose: Boolean): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  inline def apply(range: String, optionsOrLoose: Options): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  inline def apply(range: typings.semver.rangeMod.^): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  inline def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  inline def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Options): js.Array[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String]]]
  
  @JSImport("semver/ranges/to-comparators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
