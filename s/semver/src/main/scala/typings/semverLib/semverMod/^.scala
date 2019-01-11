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
  def clean(version: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def cmp(v1: java.lang.String, operator: semverLib.semverMod.Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(
    v1: java.lang.String,
    operator: semverLib.semverMod.Operator,
    v2: java.lang.String,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: semverLib.semverMod.Operator, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def cmp(
    v1: java.lang.String,
    operator: semverLib.semverMod.Operator,
    v2: semverLib.semverMod.SemVer,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def cmp(v1: semverLib.semverMod.SemVer, operator: semverLib.semverMod.Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(
    v1: semverLib.semverMod.SemVer,
    operator: semverLib.semverMod.Operator,
    v2: java.lang.String,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def cmp(
    v1: semverLib.semverMod.SemVer,
    operator: semverLib.semverMod.Operator,
    v2: semverLib.semverMod.SemVer
  ): scala.Boolean = js.native
  def cmp(
    v1: semverLib.semverMod.SemVer,
    operator: semverLib.semverMod.Operator,
    v2: semverLib.semverMod.SemVer,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def coerce(version: java.lang.String): semverLib.semverMod.SemVer | scala.Null = js.native
  def coerce(version: semverLib.semverMod.SemVer): semverLib.semverMod.SemVer | scala.Null = js.native
  def compare(v1: java.lang.String, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: semverLib.semverMod.SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: semverLib.semverMod.SemVer, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: scala.Null, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def diff(v1: java.lang.String, v2: java.lang.String): semverLib.semverMod.ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): semverLib.semverMod.ReleaseType | scala.Null = js.native
  def eq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: semverLib.semverMod.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def eq(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: semverLib.semverMod.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def gt(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: semverLib.semverMod.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def gte(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: semverLib.semverMod.Range): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: semverLib.semverMod.SemVer, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: semverLib.semverMod.SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: semverLib.semverMod.SemVer, range: semverLib.semverMod.Range): scala.Boolean = js.native
  def gtr(version: semverLib.semverMod.SemVer, range: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def inc(v: java.lang.String, release: semverLib.semverMod.ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: semverLib.semverMod.ReleaseType, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(
    v: java.lang.String,
    release: semverLib.semverMod.ReleaseType,
    loose: scala.Boolean,
    identifier: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def inc(v: semverLib.semverMod.SemVer, release: semverLib.semverMod.ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: semverLib.semverMod.SemVer, release: semverLib.semverMod.ReleaseType, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(
    v: semverLib.semverMod.SemVer,
    release: semverLib.semverMod.ReleaseType,
    loose: scala.Boolean,
    identifier: java.lang.String
  ): java.lang.String | scala.Null = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: semverLib.semverMod.Range): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: semverLib.semverMod.Range, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: semverLib.semverMod.Range, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: semverLib.semverMod.Range, range2: semverLib.semverMod.Range): scala.Boolean = js.native
  def intersects(range1: semverLib.semverMod.Range, range2: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: semverLib.semverMod.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def lt(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: semverLib.semverMod.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def lte(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: semverLib.semverMod.Range): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: semverLib.semverMod.SemVer, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: semverLib.semverMod.SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: semverLib.semverMod.SemVer, range: semverLib.semverMod.Range): scala.Boolean = js.native
  def ltr(version: semverLib.semverMod.SemVer, range: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def major(v: java.lang.String): scala.Double = js.native
  def major(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def major(v: semverLib.semverMod.SemVer): scala.Double = js.native
  def major(v: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Double = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | semverLib.semverMod.SemVer], range: java.lang.String): java.lang.String = js.native
  def maxSatisfying(
    versions: js.Array[java.lang.String | semverLib.semverMod.SemVer],
    range: java.lang.String,
    loose: scala.Boolean
  ): java.lang.String = js.native
  def maxSatisfying(
    versions: js.Array[java.lang.String | semverLib.semverMod.SemVer],
    range: semverLib.semverMod.Range
  ): java.lang.String = js.native
  def maxSatisfying(
    versions: js.Array[java.lang.String | semverLib.semverMod.SemVer],
    range: semverLib.semverMod.Range,
    loose: scala.Boolean
  ): java.lang.String = js.native
  def minSatisfying(versions: js.Array[java.lang.String | semverLib.semverMod.SemVer], range: java.lang.String): java.lang.String = js.native
  def minSatisfying(
    versions: js.Array[java.lang.String | semverLib.semverMod.SemVer],
    range: java.lang.String,
    loose: scala.Boolean
  ): java.lang.String = js.native
  def minor(v: java.lang.String): scala.Double = js.native
  def minor(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def minor(v: semverLib.semverMod.SemVer): scala.Double = js.native
  def minor(v: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Double = js.native
  def neq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: semverLib.semverMod.SemVer, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): scala.Boolean = js.native
  def neq(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: java.lang.String, range: java.lang.String, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: java.lang.String,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: java.lang.String, range: semverLib.semverMod.Range, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: java.lang.String,
    range: semverLib.semverMod.Range,
    hilo: semverLib.semverLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: semverLib.semverMod.SemVer, range: java.lang.String, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: semverLib.semverMod.SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: semverLib.semverMod.SemVer,
    range: semverLib.semverMod.Range,
    hilo: semverLib.semverLibStrings.`<`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: semverLib.semverMod.SemVer,
    range: semverLib.semverMod.Range,
    hilo: semverLib.semverLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(version: java.lang.String, range: java.lang.String, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: java.lang.String,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(version: java.lang.String, range: semverLib.semverMod.Range, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: java.lang.String,
    range: semverLib.semverMod.Range,
    hilo: semverLib.semverLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(version: semverLib.semverMod.SemVer, range: java.lang.String, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: semverLib.semverMod.SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: semverLib.semverMod.SemVer,
    range: semverLib.semverMod.Range,
    hilo: semverLib.semverLibStrings.`>`
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: semverLib.semverMod.SemVer,
    range: semverLib.semverMod.Range,
    hilo: semverLib.semverLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  def parse(v: java.lang.String): semverLib.semverMod.SemVer | scala.Null = js.native
  def parse(v: java.lang.String, loose: scala.Boolean): semverLib.semverMod.SemVer | scala.Null = js.native
  def parse(v: semverLib.semverMod.SemVer): semverLib.semverMod.SemVer | scala.Null = js.native
  def parse(v: semverLib.semverMod.SemVer, loose: scala.Boolean): semverLib.semverMod.SemVer | scala.Null = js.native
  def patch(v: java.lang.String): scala.Double = js.native
  def patch(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def patch(v: semverLib.semverMod.SemVer): scala.Double = js.native
  def patch(v: semverLib.semverMod.SemVer, loose: scala.Boolean): scala.Double = js.native
  def prerelease(v: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: java.lang.String, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: semverLib.semverMod.SemVer): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: semverLib.semverMod.SemVer, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: semverLib.semverMod.SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: semverLib.semverMod.SemVer, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: semverLib.semverMod.SemVer, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: semverLib.semverMod.SemVer, v2: semverLib.semverMod.SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: scala.Null, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rsort(list: js.Array[java.lang.String | semverLib.semverMod.SemVer]): js.Array[java.lang.String | semverLib.semverMod.SemVer] = js.native
  def rsort(list: js.Array[java.lang.String | semverLib.semverMod.SemVer], loose: scala.Boolean): js.Array[java.lang.String | semverLib.semverMod.SemVer] = js.native
  def satisfies(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: semverLib.semverMod.Range): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: semverLib.semverMod.SemVer, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: semverLib.semverMod.SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: semverLib.semverMod.SemVer, range: semverLib.semverMod.Range): scala.Boolean = js.native
  def satisfies(version: semverLib.semverMod.SemVer, range: semverLib.semverMod.Range, loose: scala.Boolean): scala.Boolean = js.native
  def sort(list: js.Array[java.lang.String | semverLib.semverMod.SemVer]): js.Array[java.lang.String | semverLib.semverMod.SemVer] = js.native
  def sort(list: js.Array[java.lang.String | semverLib.semverMod.SemVer], loose: scala.Boolean): js.Array[java.lang.String | semverLib.semverMod.SemVer] = js.native
  def valid(v: java.lang.String): java.lang.String | scala.Null = js.native
  def valid(v: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def valid(v: semverLib.semverMod.SemVer): java.lang.String | scala.Null = js.native
  def valid(v: semverLib.semverMod.SemVer, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def validRange(range: java.lang.String): java.lang.String = js.native
  def validRange(range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
  def validRange(range: semverLib.semverMod.Range): java.lang.String = js.native
  def validRange(range: semverLib.semverMod.Range, loose: scala.Boolean): java.lang.String = js.native
}

