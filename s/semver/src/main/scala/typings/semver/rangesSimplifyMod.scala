package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesSimplifyMod {
  
  /**
    * Return a "simplified" range that matches the same items in `versions` list as the range specified.
    * Note that it does *not* guarantee that it would match the same versions in all cases,
    * only for the set of versions provided.
    * This is useful when generating ranges by joining together multiple versions with `||` programmatically,
    * to provide the user with something a bit more ergonomic.
    * If the provided range is shorter in string-length than the generated range, then that is returned.
    */
  inline def apply(ranges: js.Array[String], range: String): String | typings.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].apply(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[String | typings.semver.classesRangeMod.^]
  inline def apply(ranges: js.Array[String], range: String, options: Options): String | typings.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].apply(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | typings.semver.classesRangeMod.^]
  inline def apply(ranges: js.Array[String], range: typings.semver.classesRangeMod.^): String | typings.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].apply(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[String | typings.semver.classesRangeMod.^]
  inline def apply(ranges: js.Array[String], range: typings.semver.classesRangeMod.^, options: Options): String | typings.semver.classesRangeMod.^ = (^.asInstanceOf[js.Dynamic].apply(ranges.asInstanceOf[js.Any], range.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | typings.semver.classesRangeMod.^]
  
  @JSImport("semver/ranges/simplify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
