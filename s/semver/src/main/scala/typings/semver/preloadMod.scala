package typings.semver

import typings.semver.mod.CoerceOptions
import typings.semver.mod.Operator
import typings.semver.mod.Options
import typings.semver.mod.ReleaseType
import typings.semver.semverMod.^
import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import typings.semver.semverStrings.Greaterthansign
import typings.semver.semverStrings.Lessthansign
import typings.semver.semverStrings.`2Dot0Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preloadMod {
  
  @JSImport("semver/preload", "Comparator")
  @js.native
  class Comparator protected ()
    extends typings.semver.mod.Comparator {
    def this(comp: String) = this()
    def this(comp: typings.semver.comparatorMod.Comparator) = this()
    def this(comp: String, optionsOrLoose: Boolean) = this()
    def this(comp: String, optionsOrLoose: Options) = this()
    def this(comp: typings.semver.comparatorMod.Comparator, optionsOrLoose: Boolean) = this()
    def this(comp: typings.semver.comparatorMod.Comparator, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver/preload", "Range")
  @js.native
  class Range protected ()
    extends typings.semver.mod.Range {
    def this(range: String) = this()
    def this(range: typings.semver.rangeMod.Range) = this()
    def this(range: String, optionsOrLoose: Boolean) = this()
    def this(range: String, optionsOrLoose: Options) = this()
    def this(range: typings.semver.rangeMod.Range, optionsOrLoose: Boolean) = this()
    def this(range: typings.semver.rangeMod.Range, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver/preload", "SEMVER_SPEC_VERSION")
  @js.native
  val SEMVER_SPEC_VERSION: `2Dot0Dot0` = js.native
  
  @JSImport("semver/preload", "SemVer")
  @js.native
  class SemVer protected ()
    extends typings.semver.mod.SemVer {
    def this(version: String) = this()
    def this(version: typings.semver.semverMod.SemVer) = this()
    def this(version: String, optionsOrLoose: Boolean) = this()
    def this(version: String, optionsOrLoose: Options) = this()
    def this(version: typings.semver.semverMod.SemVer, optionsOrLoose: Boolean) = this()
    def this(version: typings.semver.semverMod.SemVer, optionsOrLoose: Options) = this()
  }
  
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  @JSImport("semver/preload", "clean")
  @js.native
  def clean(version: String): String | Null = js.native
  @JSImport("semver/preload", "clean")
  @js.native
  def clean(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "clean")
  @js.native
  def clean(version: String, optionsOrLoose: Options): String | Null = js.native
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: ^, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: ^, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: ^, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: ^, operator: Operator, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: ^, operator: Operator, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "cmp")
  @js.native
  def cmp(v1: ^, operator: Operator, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Coerces a string to SemVer if possible
    */
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: js.UndefOr[scala.Nothing], options: CoerceOptions): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: String): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: String, options: CoerceOptions): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: Double): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: Double, options: CoerceOptions): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: Null, options: CoerceOptions): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: ^): ^ | Null = js.native
  @JSImport("semver/preload", "coerce")
  @js.native
  def coerce(version: ^, options: CoerceOptions): ^ | Null = js.native
  
  /**
    * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    */
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: String, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: String, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: ^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: ^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: ^, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compare")
  @js.native
  def compare(v1: ^, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  @JSImport("semver/preload", "compareBuild")
  @js.native
  def compareBuild(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareBuild")
  @js.native
  def compareBuild(a: String, b: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareBuild")
  @js.native
  def compareBuild(a: ^, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareBuild")
  @js.native
  def compareBuild(a: ^, b: ^): `1` | `0` | `-1` = js.native
  
  @JSImport("semver/preload", "compareIdentifiers")
  @js.native
  def compareIdentifiers(): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  
  @JSImport("semver/preload", "compareLoose")
  @js.native
  def compareLoose(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareLoose")
  @js.native
  def compareLoose(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareLoose")
  @js.native
  def compareLoose(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "compareLoose")
  @js.native
  def compareLoose(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: String, v2: String): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: String, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: String, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: String, v2: ^): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: String, v2: ^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: String, v2: ^, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: ^, v2: String): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: ^, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: ^, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: ^, v2: ^): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: ^, v2: ^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver/preload", "diff")
  @js.native
  def diff(v1: ^, v2: ^, optionsOrLoose: Options): ReleaseType | Null = js.native
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: String, v2: String): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: String, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: ^, v2: String): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: ^, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "eq")
  @js.native
  def eq_(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 > v2
    */
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: String, v2: String): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: String, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: ^, v2: String): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: ^, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gt")
  @js.native
  def gt(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 >= v2
    */
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: String, v2: String): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: String, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: ^, v2: String): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: ^, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gte")
  @js.native
  def gte(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return true if version is greater than all the versions possible in the range.
    */
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: String, range: String): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: String, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: ^, range: String): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: ^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: ^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: ^, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: ^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "gtr")
  @js.native
  def gtr(version: ^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: String, release: ReleaseType): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, identifier: String): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(
    version: String,
    release: ReleaseType,
    optionsOrLoose: js.UndefOr[scala.Nothing],
    identifier: String
  ): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType, identifier: String): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType, optionsOrLoose: js.UndefOr[scala.Nothing], identifier: String): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver/preload", "inc")
  @js.native
  def inc(version: ^, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: String, range2: String): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: String, range2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: String, range2: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: String, range2: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: String, range2: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: String): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 < v2
    */
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: String, v2: String): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: String, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: ^, v2: String): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: ^, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lt")
  @js.native
  def lt(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 <= v2
    */
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: String, v2: String): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: String, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: ^, v2: String): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: ^, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "lte")
  @js.native
  def lte(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: String, range: String): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: String, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: ^, range: String): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: ^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: ^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: ^, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: ^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "ltr")
  @js.native
  def ltr(version: ^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return the major version number.
    */
  @JSImport("semver/preload", "major")
  @js.native
  def major(version: String): Double = js.native
  @JSImport("semver/preload", "major")
  @js.native
  def major(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/preload", "major")
  @js.native
  def major(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver/preload", "major")
  @js.native
  def major(version: ^): Double = js.native
  @JSImport("semver/preload", "major")
  @js.native
  def major(version: ^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/preload", "major")
  @js.native
  def major(version: ^, optionsOrLoose: Options): Double = js.native
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver/preload", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver/preload", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver/preload", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver/preload", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver/preload", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver/preload", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
  
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver/preload", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver/preload", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver/preload", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver/preload", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver/preload", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver/preload", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | ^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  @JSImport("semver/preload", "minVersion")
  @js.native
  def minVersion(range: String): ^ | Null = js.native
  @JSImport("semver/preload", "minVersion")
  @js.native
  def minVersion(range: String, optionsOrLoose: Boolean): ^ | Null = js.native
  @JSImport("semver/preload", "minVersion")
  @js.native
  def minVersion(range: String, optionsOrLoose: Options): ^ | Null = js.native
  @JSImport("semver/preload", "minVersion")
  @js.native
  def minVersion(range: typings.semver.rangeMod.^): ^ | Null = js.native
  @JSImport("semver/preload", "minVersion")
  @js.native
  def minVersion(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): ^ | Null = js.native
  @JSImport("semver/preload", "minVersion")
  @js.native
  def minVersion(range: typings.semver.rangeMod.^, optionsOrLoose: Options): ^ | Null = js.native
  
  /**
    * Return the minor version number.
    */
  @JSImport("semver/preload", "minor")
  @js.native
  def minor(version: String): Double = js.native
  @JSImport("semver/preload", "minor")
  @js.native
  def minor(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/preload", "minor")
  @js.native
  def minor(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver/preload", "minor")
  @js.native
  def minor(version: ^): Double = js.native
  @JSImport("semver/preload", "minor")
  @js.native
  def minor(version: ^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/preload", "minor")
  @js.native
  def minor(version: ^, optionsOrLoose: Options): Double = js.native
  
  /**
    * v1 != v2 The opposite of eq.
    */
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: String, v2: String): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: String, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: String, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: String, v2: ^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: ^, v2: String): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: ^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: ^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: ^, v2: ^): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: ^, v2: ^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "neq")
  @js.native
  def neq(v1: ^, v2: ^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: String, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: String, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: typings.semver.rangeMod.^, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: typings.semver.rangeMod.^, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: typings.semver.rangeMod.^, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: typings.semver.rangeMod.^, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: typings.semver.rangeMod.^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "outside")
  @js.native
  def outside(version: ^, range: typings.semver.rangeMod.^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: String): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: String, optionsOrLoose: Boolean): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: String, optionsOrLoose: Options): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: Null, optionsOrLoose: Boolean): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: Null, optionsOrLoose: Options): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: ^): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: ^, optionsOrLoose: Boolean): ^ | Null = js.native
  @JSImport("semver/preload", "parse")
  @js.native
  def parse(version: ^, optionsOrLoose: Options): ^ | Null = js.native
  
  /**
    * Return the patch version number.
    */
  @JSImport("semver/preload", "patch")
  @js.native
  def patch(version: String): Double = js.native
  @JSImport("semver/preload", "patch")
  @js.native
  def patch(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/preload", "patch")
  @js.native
  def patch(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver/preload", "patch")
  @js.native
  def patch(version: ^): Double = js.native
  @JSImport("semver/preload", "patch")
  @js.native
  def patch(version: ^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver/preload", "patch")
  @js.native
  def patch(version: ^, optionsOrLoose: Options): Double = js.native
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  @JSImport("semver/preload", "prerelease")
  @js.native
  def prerelease(version: String): js.Array[String] | Null = js.native
  @JSImport("semver/preload", "prerelease")
  @js.native
  def prerelease(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver/preload", "prerelease")
  @js.native
  def prerelease(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  @JSImport("semver/preload", "prerelease")
  @js.native
  def prerelease(version: ^): js.Array[String] | Null = js.native
  @JSImport("semver/preload", "prerelease")
  @js.native
  def prerelease(version: ^, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver/preload", "prerelease")
  @js.native
  def prerelease(version: ^, optionsOrLoose: Options): js.Array[String] | Null = js.native
  
  /**
    * The reverse of compare.
    *
    * Sorts in descending order when passed to `Array.sort()`.
    */
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: String, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: String, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: String, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: ^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: ^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: ^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: ^, v2: ^): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: ^, v2: ^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompare")
  @js.native
  def rcompare(v1: ^, v2: ^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  
  @JSImport("semver/preload", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver/preload", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  @JSImport("semver/preload", "rsort")
  @js.native
  def rsort[T /* <: String | ^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver/preload", "rsort")
  @js.native
  def rsort[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver/preload", "rsort")
  @js.native
  def rsort[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  
  /**
    * Return true if the version satisfies the range.
    */
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: String, range: String): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: String, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: ^, range: String): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: ^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: ^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: ^, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: ^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver/preload", "satisfies")
  @js.native
  def satisfies(version: ^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return a "simplified" range that matches the same items in `versions` list as the range specified.
    * Note that it does *not* guarantee that it would match the same versions in all cases,
    * only for the set of versions provided.
    * This is useful when generating ranges by joining together multiple versions with `||` programmatically,
    * to provide the user with something a bit more ergonomic.
    * If the provided range is shorter in string-length than the generated range, then that is returned.
    */
  @JSImport("semver/preload", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: String): String | typings.semver.rangeMod.^ = js.native
  @JSImport("semver/preload", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: String, options: Options): String | typings.semver.rangeMod.^ = js.native
  @JSImport("semver/preload", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: typings.semver.rangeMod.^): String | typings.semver.rangeMod.^ = js.native
  @JSImport("semver/preload", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: typings.semver.rangeMod.^, options: Options): String | typings.semver.rangeMod.^ = js.native
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  @JSImport("semver/preload", "sort")
  @js.native
  def sort[T /* <: String | ^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver/preload", "sort")
  @js.native
  def sort[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver/preload", "sort")
  @js.native
  def sort[T /* <: String | ^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: String, dom: String): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: String, dom: String, options: Options): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: String, dom: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: String, dom: typings.semver.rangeMod.^, options: Options): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: String): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: String, options: Options): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver/preload", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: typings.semver.rangeMod.^, options: Options): Boolean = js.native
  
  /**
    * Mostly just for testing and legacy API reasons
    */
  @JSImport("semver/preload", "toComparators")
  @js.native
  def toComparators(range: String): String = js.native
  @JSImport("semver/preload", "toComparators")
  @js.native
  def toComparators(range: String, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver/preload", "toComparators")
  @js.native
  def toComparators(range: String, optionsOrLoose: Options): String = js.native
  @JSImport("semver/preload", "toComparators")
  @js.native
  def toComparators(range: typings.semver.rangeMod.^): String = js.native
  @JSImport("semver/preload", "toComparators")
  @js.native
  def toComparators(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver/preload", "toComparators")
  @js.native
  def toComparators(range: typings.semver.rangeMod.^, optionsOrLoose: Options): String = js.native
  
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: String): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: String, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: Null, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: Null, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: ^): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: ^, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver/preload", "valid")
  @js.native
  def valid(version: ^, optionsOrLoose: Options): String | Null = js.native
  
  /**
    * Return the valid range or null if it's not valid
    */
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: String): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: String, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: String, optionsOrLoose: Options): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: Null, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: Null, optionsOrLoose: Options): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: typings.semver.rangeMod.^): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver/preload", "validRange")
  @js.native
  def validRange(range: typings.semver.rangeMod.^, optionsOrLoose: Options): String = js.native
}
