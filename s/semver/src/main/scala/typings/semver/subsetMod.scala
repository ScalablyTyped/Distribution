package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subsetMod {
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  inline def apply(sub: String, dom: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: String, dom: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: String, dom: typings.semver.rangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: String, dom: typings.semver.rangeMod.^, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typings.semver.rangeMod.^, dom: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typings.semver.rangeMod.^, dom: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typings.semver.rangeMod.^, dom: typings.semver.rangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(sub: typings.semver.rangeMod.^, dom: typings.semver.rangeMod.^, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].apply(sub.asInstanceOf[js.Any], dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/ranges/subset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
