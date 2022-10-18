package typings.semver

import typings.semver.mod.RangeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangesIntersectsMod {
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  inline def apply(range1: String, range2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: String, range2: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: String, range2: typings.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: String, range2: typings.semver.classesRangeMod.^, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: String, range2: typings.semver.classesRangeMod.^, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: typings.semver.classesRangeMod.^, range2: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: typings.semver.classesRangeMod.^, range2: String, optionsOrLoose: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: typings.semver.classesRangeMod.^, range2: String, optionsOrLoose: RangeOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(range1: typings.semver.classesRangeMod.^, range2: typings.semver.classesRangeMod.^): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    range1: typings.semver.classesRangeMod.^,
    range2: typings.semver.classesRangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    range1: typings.semver.classesRangeMod.^,
    range2: typings.semver.classesRangeMod.^,
    optionsOrLoose: RangeOptions
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(range1.asInstanceOf[js.Any], range2.asInstanceOf[js.Any], optionsOrLoose.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("semver/ranges/intersects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
