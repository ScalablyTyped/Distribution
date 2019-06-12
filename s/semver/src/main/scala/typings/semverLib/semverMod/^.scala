package typings
package semverLib.semverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val SEMVER_SPEC_VERSION: semverLib.semverLibStrings.`2DOT0DOT0` = js.native
  def clean(version: java.lang.String): java.lang.String | scala.Null = js.native
  def clean(version: java.lang.String, optionsOrLoose: scala.Boolean): java.lang.String | scala.Null = js.native
  def clean(version: java.lang.String, optionsOrLoose: Options): java.lang.String | scala.Null = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: SemVer): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def coerce(version: java.lang.String): SemVer | scala.Null = js.native
  def coerce(version: SemVer): SemVer | scala.Null = js.native
  def compare(v1: java.lang.String, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: SemVer, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: scala.Null, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def diff(v1: java.lang.String, v2: java.lang.String): ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: SemVer): ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): ReleaseType | scala.Null = js.native
  def diff(v1: SemVer, v2: java.lang.String): ReleaseType | scala.Null = js.native
  def diff(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): ReleaseType | scala.Null = js.native
  def diff(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): ReleaseType | scala.Null = js.native
  def diff(v1: SemVer, v2: SemVer): ReleaseType | scala.Null = js.native
  def diff(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): ReleaseType | scala.Null = js.native
  def diff(v1: SemVer, v2: SemVer, optionsOrLoose: Options): ReleaseType | scala.Null = js.native
  def eq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def eq(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def eq(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: SemVer, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def inc(v: java.lang.String, release: ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: ReleaseType, optionsOrLoose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(
    v: java.lang.String,
    release: ReleaseType,
    optionsOrLoose: scala.Boolean,
    identifier: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: ReleaseType, optionsOrLoose: Options): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: ReleaseType, optionsOrLoose: Options, identifier: java.lang.String): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType, optionsOrLoose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType, optionsOrLoose: scala.Boolean, identifier: java.lang.String): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType, optionsOrLoose: Options): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType, optionsOrLoose: Options, identifier: java.lang.String): java.lang.String | scala.Null = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def intersects(range1: Range, range2: Range): scala.Boolean = js.native
  def intersects(range1: Range, range2: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: Range, range2: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def major(v: java.lang.String): scala.Double = js.native
  def major(v: java.lang.String, optionsOrLoose: scala.Boolean): scala.Double = js.native
  def major(v: java.lang.String, optionsOrLoose: Options): scala.Double = js.native
  def major(v: SemVer): scala.Double = js.native
  def major(v: SemVer, optionsOrLoose: scala.Boolean): scala.Double = js.native
  def major(v: SemVer, optionsOrLoose: Options): scala.Double = js.native
  def maxSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: java.lang.String): T | scala.Null = js.native
  def maxSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: java.lang.String, optionsOrLoose: scala.Boolean): T | scala.Null = js.native
  def maxSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: java.lang.String, optionsOrLoose: Options): T | scala.Null = js.native
  def maxSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: Range): T | scala.Null = js.native
  def maxSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: Range, optionsOrLoose: scala.Boolean): T | scala.Null = js.native
  def maxSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: Range, optionsOrLoose: Options): T | scala.Null = js.native
  def minSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: java.lang.String): T | scala.Null = js.native
  def minSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: java.lang.String, optionsOrLoose: scala.Boolean): T | scala.Null = js.native
  def minSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: java.lang.String, optionsOrLoose: Options): T | scala.Null = js.native
  def minSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: Range): T | scala.Null = js.native
  def minSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: Range, optionsOrLoose: scala.Boolean): T | scala.Null = js.native
  def minSatisfying[T /* <: java.lang.String | SemVer */](versions: js.Array[T], range: Range, optionsOrLoose: Options): T | scala.Null = js.native
  def minVersion(range: java.lang.String): SemVer | scala.Null = js.native
  def minVersion(range: java.lang.String, optionsOrLoose: scala.Boolean): SemVer | scala.Null = js.native
  def minVersion(range: java.lang.String, optionsOrLoose: Options): SemVer | scala.Null = js.native
  def minVersion(range: Range): SemVer | scala.Null = js.native
  def minVersion(range: Range, optionsOrLoose: scala.Boolean): SemVer | scala.Null = js.native
  def minVersion(range: Range, optionsOrLoose: Options): SemVer | scala.Null = js.native
  def minor(v: java.lang.String): scala.Double = js.native
  def minor(v: java.lang.String, optionsOrLoose: scala.Boolean): scala.Double = js.native
  def minor(v: java.lang.String, optionsOrLoose: Options): scala.Double = js.native
  def minor(v: SemVer): scala.Double = js.native
  def minor(v: SemVer, optionsOrLoose: scala.Boolean): scala.Double = js.native
  def minor(v: SemVer, optionsOrLoose: Options): scala.Double = js.native
  def neq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def neq(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def neq(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: SemVer, v2: SemVer, optionsOrLoose: Options): scala.Boolean = js.native
  def outside(version: java.lang.String, range: java.lang.String, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    optionsOrLoose: scala.Boolean
  ): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    optionsOrLoose: Options
  ): scala.Boolean = js.native
  def outside(version: java.lang.String, range: java.lang.String, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    optionsOrLoose: scala.Boolean
  ): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    optionsOrLoose: Options
  ): scala.Boolean = js.native
  def outside(version: java.lang.String, range: Range, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: Range,
    hilo: semverLib.semverLibStrings.`<`,
    optionsOrLoose: scala.Boolean
  ): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: Range,
    hilo: semverLib.semverLibStrings.`<`,
    optionsOrLoose: Options
  ): scala.Boolean = js.native
  def outside(version: java.lang.String, range: Range, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: Range,
    hilo: semverLib.semverLibStrings.`>`,
    optionsOrLoose: scala.Boolean
  ): scala.Boolean = js.native
  def outside(
    version: java.lang.String,
    range: Range,
    hilo: semverLib.semverLibStrings.`>`,
    optionsOrLoose: Options
  ): scala.Boolean = js.native
  def outside(version: SemVer, range: java.lang.String, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  def outside(
    version: SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    optionsOrLoose: scala.Boolean
  ): scala.Boolean = js.native
  def outside(
    version: SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    optionsOrLoose: Options
  ): scala.Boolean = js.native
  def outside(version: SemVer, range: java.lang.String, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  def outside(
    version: SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    optionsOrLoose: scala.Boolean
  ): scala.Boolean = js.native
  def outside(
    version: SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    optionsOrLoose: Options
  ): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`<`, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`<`, optionsOrLoose: Options): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`>`, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def outside(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`>`, optionsOrLoose: Options): scala.Boolean = js.native
  def parse(v: java.lang.String): SemVer | scala.Null = js.native
  def parse(v: java.lang.String, optionsOrLoose: scala.Boolean): SemVer | scala.Null = js.native
  def parse(v: java.lang.String, optionsOrLoose: Options): SemVer | scala.Null = js.native
  def parse(v: SemVer): SemVer | scala.Null = js.native
  def parse(v: SemVer, optionsOrLoose: scala.Boolean): SemVer | scala.Null = js.native
  def parse(v: SemVer, optionsOrLoose: Options): SemVer | scala.Null = js.native
  def patch(v: java.lang.String): scala.Double = js.native
  def patch(v: java.lang.String, optionsOrLoose: scala.Boolean): scala.Double = js.native
  def patch(v: java.lang.String, optionsOrLoose: Options): scala.Double = js.native
  def patch(v: SemVer): scala.Double = js.native
  def patch(v: SemVer, optionsOrLoose: scala.Boolean): scala.Double = js.native
  def patch(v: SemVer, optionsOrLoose: Options): scala.Double = js.native
  def prerelease(v: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: java.lang.String, optionsOrLoose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: java.lang.String, optionsOrLoose: Options): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: SemVer): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: SemVer, optionsOrLoose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: SemVer, optionsOrLoose: Options): js.Array[java.lang.String] | scala.Null = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer, optionsOrLoose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer, optionsOrLoose: Options): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: scala.Null, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rsort[T /* <: java.lang.String | SemVer */](list: js.Array[T]): js.Array[T] = js.native
  def rsort[T /* <: java.lang.String | SemVer */](list: js.Array[T], optionsOrLoose: scala.Boolean): js.Array[T] = js.native
  def rsort[T /* <: java.lang.String | SemVer */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  def satisfies(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String, optionsOrLoose: Options): scala.Boolean = js.native
  def satisfies(version: SemVer, range: Range): scala.Boolean = js.native
  def satisfies(version: SemVer, range: Range, optionsOrLoose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: SemVer, range: Range, optionsOrLoose: Options): scala.Boolean = js.native
  def sort[T /* <: java.lang.String | SemVer */](list: js.Array[T]): js.Array[T] = js.native
  def sort[T /* <: java.lang.String | SemVer */](list: js.Array[T], optionsOrLoose: scala.Boolean): js.Array[T] = js.native
  def sort[T /* <: java.lang.String | SemVer */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  def valid(v: java.lang.String): java.lang.String | scala.Null = js.native
  def valid(v: java.lang.String, optionsOrLoose: scala.Boolean): java.lang.String | scala.Null = js.native
  def valid(v: java.lang.String, optionsOrLoose: Options): java.lang.String | scala.Null = js.native
  def valid(v: SemVer): java.lang.String | scala.Null = js.native
  def valid(v: SemVer, optionsOrLoose: scala.Boolean): java.lang.String | scala.Null = js.native
  def valid(v: SemVer, optionsOrLoose: Options): java.lang.String | scala.Null = js.native
  def validRange(range: java.lang.String): java.lang.String = js.native
  def validRange(range: java.lang.String, optionsOrLoose: scala.Boolean): java.lang.String = js.native
  def validRange(range: java.lang.String, optionsOrLoose: Options): java.lang.String = js.native
  def validRange(range: Range): java.lang.String = js.native
  def validRange(range: Range, optionsOrLoose: scala.Boolean): java.lang.String = js.native
  def validRange(range: Range, optionsOrLoose: Options): java.lang.String = js.native
}

