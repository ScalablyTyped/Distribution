package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toComparatorsMod {
  
  /**
    * Mostly just for testing and legacy API reasons
    */
  @scala.inline
  def apply(range: String): String = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(range: String, optionsOrLoose: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(range: String, optionsOrLoose: Options): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(range: typings.semver.rangeMod.^): String = ^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(range: typings.semver.rangeMod.^, optionsOrLoose: Options): String = (^.asInstanceOf[js.Dynamic].apply(range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("semver/ranges/to-comparators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
