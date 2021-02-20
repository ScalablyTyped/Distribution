package typings.semver

import typings.semver.comparatorMod.^
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

object mod {
  
  @JSImport("semver", "Comparator")
  @js.native
  class Comparator protected () extends ^ {
    def this(comp: String) = this()
    def this(comp: typings.semver.comparatorMod.Comparator) = this()
    def this(comp: String, optionsOrLoose: Boolean) = this()
    def this(comp: String, optionsOrLoose: Options) = this()
    def this(comp: typings.semver.comparatorMod.Comparator, optionsOrLoose: Boolean) = this()
    def this(comp: typings.semver.comparatorMod.Comparator, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver", "Range")
  @js.native
  class Range protected ()
    extends typings.semver.rangeMod.^ {
    def this(range: String) = this()
    def this(range: typings.semver.rangeMod.Range) = this()
    def this(range: String, optionsOrLoose: Boolean) = this()
    def this(range: String, optionsOrLoose: Options) = this()
    def this(range: typings.semver.rangeMod.Range, optionsOrLoose: Boolean) = this()
    def this(range: typings.semver.rangeMod.Range, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver", "SEMVER_SPEC_VERSION")
  @js.native
  val SEMVER_SPEC_VERSION: `2Dot0Dot0` = js.native
  
  @JSImport("semver", "SemVer")
  @js.native
  class SemVer protected ()
    extends typings.semver.semverMod.^ {
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
  @JSImport("semver", "clean")
  @js.native
  def clean(version: String): String | Null = js.native
  @JSImport("semver", "clean")
  @js.native
  def clean(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "clean")
  @js.native
  def clean(version: String, optionsOrLoose: Options): String | Null = js.native
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typings.semver.semverMod.^, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typings.semver.semverMod.^, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typings.semver.semverMod.^, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typings.semver.semverMod.^, operator: Operator, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(
    v1: typings.semver.semverMod.^,
    operator: Operator,
    v2: typings.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(
    v1: typings.semver.semverMod.^,
    operator: Operator,
    v2: typings.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Coerces a string to SemVer if possible
    */
  @JSImport("semver", "coerce")
  @js.native
  def coerce(): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: js.UndefOr[scala.Nothing], options: CoerceOptions): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: String): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: String, options: CoerceOptions): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: Double): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: Double, options: CoerceOptions): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: Null, options: CoerceOptions): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: typings.semver.semverMod.^): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: typings.semver.semverMod.^, options: CoerceOptions): typings.semver.semverMod.^ | Null = js.native
  
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
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typings.semver.semverMod.^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  
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
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: String, b: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: typings.semver.semverMod.^, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: typings.semver.semverMod.^, b: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: String, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: typings.semver.semverMod.^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: String): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: typings.semver.semverMod.^): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typings.semver.semverMod.^, v2: String): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): ReleaseType | Null = js.native
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typings.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 > v2
    */
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typings.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 >= v2
    */
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typings.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return true if version is greater than all the versions possible in the range.
    */
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: String): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typings.semver.semverMod.^, range: String): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: String,
    release: ReleaseType,
    optionsOrLoose: js.UndefOr[scala.Nothing],
    identifier: String
  ): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typings.semver.semverMod.^, release: ReleaseType): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typings.semver.semverMod.^, release: ReleaseType, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: typings.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: js.UndefOr[scala.Nothing],
    identifier: String
  ): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typings.semver.semverMod.^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: typings.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Boolean,
    identifier: String
  ): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typings.semver.semverMod.^, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: typings.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Options,
    identifier: String
  ): String | Null = js.native
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: String): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: String): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typings.semver.rangeMod.^, range2: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 < v2
    */
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typings.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * v1 <= v2
    */
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typings.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: String): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typings.semver.semverMod.^, range: String): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return the major version number.
    */
  @JSImport("semver", "major")
  @js.native
  def major(version: String): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: typings.semver.semverMod.^): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: typings.semver.semverMod.^, optionsOrLoose: Options): Double = js.native
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
  
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typings.semver.semverMod.^ */](versions: js.Array[T], range: typings.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: String): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: String, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: String, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: typings.semver.rangeMod.^): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: typings.semver.rangeMod.^, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = js.native
  
  /**
    * Return the minor version number.
    */
  @JSImport("semver", "minor")
  @js.native
  def minor(version: String): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: typings.semver.semverMod.^): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: typings.semver.semverMod.^, optionsOrLoose: Options): Double = js.native
  
  /**
    * v1 != v2 The opposite of eq.
    */
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typings.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typings.semver.rangeMod.^, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: String, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Greaterthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typings.semver.semverMod.^,
    range: typings.semver.rangeMod.^,
    hilo: Lessthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  @JSImport("semver", "parse")
  @js.native
  def parse(): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: String): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: String, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: String, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: Null, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: Null, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: typings.semver.semverMod.^): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): typings.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: typings.semver.semverMod.^, optionsOrLoose: Options): typings.semver.semverMod.^ | Null = js.native
  
  /**
    * Return the patch version number.
    */
  @JSImport("semver", "patch")
  @js.native
  def patch(version: String): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: typings.semver.semverMod.^): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: typings.semver.semverMod.^, optionsOrLoose: Options): Double = js.native
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: String): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: typings.semver.semverMod.^): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: typings.semver.semverMod.^, optionsOrLoose: Options): js.Array[String] | Null = js.native
  
  /**
    * The reverse of compare.
    *
    * Sorts in descending order when passed to `Array.sort()`.
    */
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: typings.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typings.semver.semverMod.^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typings.semver.semverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typings.semver.semverMod.^, v2: typings.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  @JSImport("semver", "rsort")
  @js.native
  def rsort[T /* <: String | typings.semver.semverMod.^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver", "rsort")
  @js.native
  def rsort[T /* <: String | typings.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver", "rsort")
  @js.native
  def rsort[T /* <: String | typings.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  
  /**
    * Return true if the version satisfies the range.
    */
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: String): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typings.semver.semverMod.^, range: String): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typings.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typings.semver.semverMod.^, range: typings.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  
  /**
    * Return a "simplified" range that matches the same items in `versions` list as the range specified.
    * Note that it does *not* guarantee that it would match the same versions in all cases,
    * only for the set of versions provided.
    * This is useful when generating ranges by joining together multiple versions with `||` programmatically,
    * to provide the user with something a bit more ergonomic.
    * If the provided range is shorter in string-length than the generated range, then that is returned.
    */
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: String): String | typings.semver.rangeMod.^ = js.native
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: String, options: Options): String | typings.semver.rangeMod.^ = js.native
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: typings.semver.rangeMod.^): String | typings.semver.rangeMod.^ = js.native
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: typings.semver.rangeMod.^, options: Options): String | typings.semver.rangeMod.^ = js.native
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  @JSImport("semver", "sort")
  @js.native
  def sort[T /* <: String | typings.semver.semverMod.^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver", "sort")
  @js.native
  def sort[T /* <: String | typings.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver", "sort")
  @js.native
  def sort[T /* <: String | typings.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: String): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: String, options: Options): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: typings.semver.rangeMod.^, options: Options): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: String): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: String, options: Options): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: typings.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typings.semver.rangeMod.^, dom: typings.semver.rangeMod.^, options: Options): Boolean = js.native
  
  /**
    * Mostly just for testing and legacy API reasons
    */
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: String): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: String, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: String, optionsOrLoose: Options): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: typings.semver.rangeMod.^): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: typings.semver.rangeMod.^, optionsOrLoose: Options): String = js.native
  
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  @JSImport("semver", "valid")
  @js.native
  def valid(): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: String): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: String, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: Null, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: Null, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: typings.semver.semverMod.^): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: typings.semver.semverMod.^, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: typings.semver.semverMod.^, optionsOrLoose: Options): String | Null = js.native
  
  /**
    * Return the valid range or null if it's not valid
    */
  @JSImport("semver", "validRange")
  @js.native
  def validRange(): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: String): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: String, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: String, optionsOrLoose: Options): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: Null, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: Null, optionsOrLoose: Options): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: typings.semver.rangeMod.^): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: typings.semver.rangeMod.^, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: typings.semver.rangeMod.^, optionsOrLoose: Options): String = js.native
  
  @js.native
  trait CoerceOptions extends Options {
    
    /**
      * Used by `coerce()` to coerce from right to left.
      *
      * @default false
      *
      * @example
      * coerce('1.2.3.4', { rtl: true });
      * // => SemVer { version: '2.3.4', ... }
      *
      * @since 6.2.0
      */
    var rtl: js.UndefOr[Boolean] = js.native
  }
  object CoerceOptions {
    
    @scala.inline
    def apply(): CoerceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoerceOptions]
    }
    
    @scala.inline
    implicit class CoerceOptionsMutableBuilder[Self <: CoerceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semver.semverStrings.EqualssignEqualssignEqualssign
    - typings.semver.semverStrings.ExclamationmarkEqualssignEqualssign
    - typings.semver.semverStrings._empty
    - typings.semver.semverStrings.Equalssign
    - typings.semver.semverStrings.EqualssignEqualssign
    - typings.semver.semverStrings.ExclamationmarkEqualssign
    - typings.semver.semverStrings.Greaterthansign
    - typings.semver.semverStrings.GreaterthansignEqualssign
    - typings.semver.semverStrings.Lessthansign
    - typings.semver.semverStrings.LessthansignEqualssign
  */
  trait Operator extends StObject
  object Operator {
    
    @scala.inline
    def Equalssign: typings.semver.semverStrings.Equalssign = "=".asInstanceOf[typings.semver.semverStrings.Equalssign]
    
    @scala.inline
    def EqualssignEqualssign: typings.semver.semverStrings.EqualssignEqualssign = "==".asInstanceOf[typings.semver.semverStrings.EqualssignEqualssign]
    
    @scala.inline
    def EqualssignEqualssignEqualssign: typings.semver.semverStrings.EqualssignEqualssignEqualssign = "===".asInstanceOf[typings.semver.semverStrings.EqualssignEqualssignEqualssign]
    
    @scala.inline
    def ExclamationmarkEqualssign: typings.semver.semverStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typings.semver.semverStrings.ExclamationmarkEqualssign]
    
    @scala.inline
    def ExclamationmarkEqualssignEqualssign: typings.semver.semverStrings.ExclamationmarkEqualssignEqualssign = "!==".asInstanceOf[typings.semver.semverStrings.ExclamationmarkEqualssignEqualssign]
    
    @scala.inline
    def Greaterthansign: typings.semver.semverStrings.Greaterthansign = ">".asInstanceOf[typings.semver.semverStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typings.semver.semverStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.semver.semverStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typings.semver.semverStrings.Lessthansign = "<".asInstanceOf[typings.semver.semverStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typings.semver.semverStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.semver.semverStrings.LessthansignEqualssign]
    
    @scala.inline
    def _empty: typings.semver.semverStrings._empty = "".asInstanceOf[typings.semver.semverStrings._empty]
  }
  
  @js.native
  trait Options extends StObject {
    
    var includePrerelease: js.UndefOr[Boolean] = js.native
    
    var loose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludePrerelease(value: Boolean): Self = StObject.set(x, "includePrerelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePrereleaseUndefined: Self = StObject.set(x, "includePrerelease", js.undefined)
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semver.semverStrings.major
    - typings.semver.semverStrings.premajor
    - typings.semver.semverStrings.minor
    - typings.semver.semverStrings.preminor
    - typings.semver.semverStrings.patch
    - typings.semver.semverStrings.prepatch
    - typings.semver.semverStrings.prerelease
  */
  trait ReleaseType extends StObject
  object ReleaseType {
    
    @scala.inline
    def major: typings.semver.semverStrings.major = "major".asInstanceOf[typings.semver.semverStrings.major]
    
    @scala.inline
    def minor: typings.semver.semverStrings.minor = "minor".asInstanceOf[typings.semver.semverStrings.minor]
    
    @scala.inline
    def patch: typings.semver.semverStrings.patch = "patch".asInstanceOf[typings.semver.semverStrings.patch]
    
    @scala.inline
    def premajor: typings.semver.semverStrings.premajor = "premajor".asInstanceOf[typings.semver.semverStrings.premajor]
    
    @scala.inline
    def preminor: typings.semver.semverStrings.preminor = "preminor".asInstanceOf[typings.semver.semverStrings.preminor]
    
    @scala.inline
    def prepatch: typings.semver.semverStrings.prepatch = "prepatch".asInstanceOf[typings.semver.semverStrings.prepatch]
    
    @scala.inline
    def prerelease: typings.semver.semverStrings.prerelease = "prerelease".asInstanceOf[typings.semver.semverStrings.prerelease]
  }
}
