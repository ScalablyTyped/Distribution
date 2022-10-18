package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsMinorMod {
  
  /**
    * Return the minor version number.
    */
  inline def apply(version: String): Double = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(version: String, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(version: String, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(version: typings.semver.classesSemverMod.^): Double = ^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(version: typings.semver.classesSemverMod.^, optionsOrLoose: Boolean): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(version: typings.semver.classesSemverMod.^, optionsOrLoose: Options): Double = (^.asInstanceOf[js.Dynamic].apply(version.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("semver/functions/minor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
