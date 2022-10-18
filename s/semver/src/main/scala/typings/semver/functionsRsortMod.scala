package typings.semver

import typings.semver.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionsRsortMod {
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  inline def apply[T /* <: String | typings.semver.classesSemverMod.^ */](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def apply[T /* <: String | typings.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def apply[T /* <: String | typings.semver.classesSemverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = (^.asInstanceOf[js.Dynamic].apply(list.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("semver/functions/rsort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
