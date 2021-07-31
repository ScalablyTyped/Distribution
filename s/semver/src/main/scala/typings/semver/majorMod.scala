package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object majorMod {
  
  /**
    * Return the major version number.
    */
  @scala.inline
  def apply(version: String): Double = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def apply(version: String, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply(version: String, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply(version: typings.semver.semverMod.^): Double = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def apply(version: typings.semver.semverMod.^, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("semver/functions/major", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
