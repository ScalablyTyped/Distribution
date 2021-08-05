package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maxSatisfyingMod {
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  inline def apply[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  inline def apply[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = (^.asInstanceOf[js.Dynamic].apply(versions.asInstanceOf[js.Any], range.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  @JSImport("semver/ranges/max-satisfying", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
