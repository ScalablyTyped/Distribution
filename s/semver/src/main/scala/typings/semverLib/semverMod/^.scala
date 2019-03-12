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
  def cmp(v1: java.lang.String, operator: Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: SemVer): scala.Boolean = js.native
  def cmp(v1: java.lang.String, operator: Operator, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: java.lang.String): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer): scala.Boolean = js.native
  def cmp(v1: SemVer, operator: Operator, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def coerce(version: java.lang.String): SemVer | scala.Null = js.native
  def coerce(version: SemVer): SemVer | scala.Null = js.native
  def compare(v1: java.lang.String, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compare(v1: SemVer, v2: SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: java.lang.String, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def compareIdentifiers(a: scala.Null, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def diff(v1: java.lang.String, v2: java.lang.String): ReleaseType | scala.Null = js.native
  def diff(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): ReleaseType | scala.Null = js.native
  def eq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def eq(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def eq(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def eq(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def eq(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def gt(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gt(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def gt(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def gte(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def gte(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def gte(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range): scala.Boolean = js.native
  def gtr(version: java.lang.String, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def gtr(version: SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range): scala.Boolean = js.native
  def gtr(version: SemVer, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def inc(v: java.lang.String, release: ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: ReleaseType, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(v: java.lang.String, release: ReleaseType, loose: scala.Boolean, identifier: java.lang.String): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def inc(v: SemVer, release: ReleaseType, loose: scala.Boolean, identifier: java.lang.String): java.lang.String | scala.Null = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range): scala.Boolean = js.native
  def intersects(range1: java.lang.String, range2: Range, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String): scala.Boolean = js.native
  def intersects(range1: Range, range2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def intersects(range1: Range, range2: Range): scala.Boolean = js.native
  def intersects(range1: Range, range2: Range, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def lt(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lt(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def lt(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def lte(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def lte(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def lte(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range): scala.Boolean = js.native
  def ltr(version: java.lang.String, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def ltr(version: SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range): scala.Boolean = js.native
  def ltr(version: SemVer, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def major(v: java.lang.String): scala.Double = js.native
  def major(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def major(v: SemVer): scala.Double = js.native
  def major(v: SemVer, loose: scala.Boolean): scala.Double = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String): java.lang.String = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: Range): java.lang.String = js.native
  def maxSatisfying(versions: js.Array[java.lang.String | SemVer], range: Range, loose: scala.Boolean): java.lang.String = js.native
  def minSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String): java.lang.String = js.native
  def minSatisfying(versions: js.Array[java.lang.String | SemVer], range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
  def minor(v: java.lang.String): scala.Double = js.native
  def minor(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def minor(v: SemVer): scala.Double = js.native
  def minor(v: SemVer, loose: scala.Boolean): scala.Double = js.native
  def neq(v1: java.lang.String, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer): scala.Boolean = js.native
  def neq(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String): scala.Boolean = js.native
  def neq(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def neq(v1: SemVer, v2: SemVer): scala.Boolean = js.native
  def neq(v1: SemVer, v2: SemVer, loose: scala.Boolean): scala.Boolean = js.native
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
  def `outside_<`(version: java.lang.String, range: Range, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: java.lang.String,
    range: Range,
    hilo: semverLib.semverLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: SemVer, range: java.lang.String, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(
    version: SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`<`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`<`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_<`(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`<`, loose: scala.Boolean): scala.Boolean = js.native
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
  def `outside_>`(version: java.lang.String, range: Range, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: java.lang.String,
    range: Range,
    hilo: semverLib.semverLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(version: SemVer, range: java.lang.String, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(
    version: SemVer,
    range: java.lang.String,
    hilo: semverLib.semverLibStrings.`>`,
    loose: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`>`): scala.Boolean = js.native
  @JSName("outside")
  def `outside_>`(version: SemVer, range: Range, hilo: semverLib.semverLibStrings.`>`, loose: scala.Boolean): scala.Boolean = js.native
  def parse(v: java.lang.String): SemVer | scala.Null = js.native
  def parse(v: java.lang.String, loose: scala.Boolean): SemVer | scala.Null = js.native
  def parse(v: SemVer): SemVer | scala.Null = js.native
  def parse(v: SemVer, loose: scala.Boolean): SemVer | scala.Null = js.native
  def patch(v: java.lang.String): scala.Double = js.native
  def patch(v: java.lang.String, loose: scala.Boolean): scala.Double = js.native
  def patch(v: SemVer): scala.Double = js.native
  def patch(v: SemVer, loose: scala.Boolean): scala.Double = js.native
  def prerelease(v: java.lang.String): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: java.lang.String, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: SemVer): js.Array[java.lang.String] | scala.Null = js.native
  def prerelease(v: SemVer, loose: scala.Boolean): js.Array[java.lang.String] | scala.Null = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: java.lang.String, v2: SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: java.lang.String, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompare(v1: SemVer, v2: SemVer, loose: scala.Boolean): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: java.lang.String, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rcompareIdentifiers(a: scala.Null, b: java.lang.String): semverLib.semverLibNumbers.`1` | semverLib.semverLibNumbers.`0` | semverLib.semverLibNumbers.`-1` = js.native
  def rsort(list: js.Array[java.lang.String | SemVer]): js.Array[java.lang.String | SemVer] = js.native
  def rsort(list: js.Array[java.lang.String | SemVer], loose: scala.Boolean): js.Array[java.lang.String | SemVer] = js.native
  def satisfies(version: java.lang.String, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range): scala.Boolean = js.native
  def satisfies(version: java.lang.String, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String): scala.Boolean = js.native
  def satisfies(version: SemVer, range: java.lang.String, loose: scala.Boolean): scala.Boolean = js.native
  def satisfies(version: SemVer, range: Range): scala.Boolean = js.native
  def satisfies(version: SemVer, range: Range, loose: scala.Boolean): scala.Boolean = js.native
  def sort(list: js.Array[java.lang.String | SemVer]): js.Array[java.lang.String | SemVer] = js.native
  def sort(list: js.Array[java.lang.String | SemVer], loose: scala.Boolean): js.Array[java.lang.String | SemVer] = js.native
  def valid(v: java.lang.String): java.lang.String | scala.Null = js.native
  def valid(v: java.lang.String, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def valid(v: SemVer): java.lang.String | scala.Null = js.native
  def valid(v: SemVer, loose: scala.Boolean): java.lang.String | scala.Null = js.native
  def validRange(range: java.lang.String): java.lang.String = js.native
  def validRange(range: java.lang.String, loose: scala.Boolean): java.lang.String = js.native
  def validRange(range: Range): java.lang.String = js.native
  def validRange(range: Range, loose: scala.Boolean): java.lang.String = js.native
}

