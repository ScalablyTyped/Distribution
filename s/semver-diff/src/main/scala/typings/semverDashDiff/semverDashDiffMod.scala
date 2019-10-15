package typings.semverDashDiff

import typings.semverDashDiff.semverDashDiffMod.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver-diff", JSImport.Namespace)
@js.native
object semverDashDiffMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.semverDashDiff.semverDashDiffStrings.major
    - typings.semverDashDiff.semverDashDiffStrings.premajor
    - typings.semverDashDiff.semverDashDiffStrings.minor
    - typings.semverDashDiff.semverDashDiffStrings.preminor
    - typings.semverDashDiff.semverDashDiffStrings.patch
    - typings.semverDashDiff.semverDashDiffStrings.prepatch
    - typings.semverDashDiff.semverDashDiffStrings.prerelease
    - typings.semverDashDiff.semverDashDiffStrings.build
  */
  trait Result extends js.Object
  
  /**
  Get the diff type of two [semver](https://github.com/npm/node-semver) versions: `0.0.1 0.0.2` → `patch`.
  @returns The difference type between two semver versions, or `undefined` if they're identical or the second one is lower than the first.
  @example
  ```
  import semverDiff = require('semver-diff');
  semverDiff('1.1.1', '1.1.2');
  //=> 'patch'
  semverDiff('1.1.1-foo', '1.1.2');
  //=> 'prepatch'
  semverDiff('0.0.1', '1.0.0');
  //=> 'major'
  semverDiff('0.0.1-foo', '1.0.0');
  //=> 'premajor'
  semverDiff('0.0.1', '0.1.0');
  //=> 'minor'
  semverDiff('0.0.1-foo', '0.1.0');
  //=> 'preminor'
  semverDiff('0.0.1-foo', '0.0.1-foo.bar');
  //=> 'prerelease'
  semverDiff('0.1.0', '0.1.0+foo');
  //=> 'build'
  semverDiff('0.0.1', '0.0.1');
  //=> undefined
  semverDiff('0.0.2', '0.0.1');
  //=> undefined
  ```
  */
  def apply(versionA: String, versionB: String): js.UndefOr[Result] = js.native
}

