package typings.semverDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply(versionA: String, versionB: String): js.UndefOr[Result] = (^.asInstanceOf[js.Dynamic].apply(versionA.asInstanceOf[js.Any], versionB.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Result]]
  
  @JSImport("semver-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.semverDiff.semverDiffStrings.major
    - typings.semverDiff.semverDiffStrings.premajor
    - typings.semverDiff.semverDiffStrings.minor
    - typings.semverDiff.semverDiffStrings.preminor
    - typings.semverDiff.semverDiffStrings.patch
    - typings.semverDiff.semverDiffStrings.prepatch
    - typings.semverDiff.semverDiffStrings.prerelease
    - typings.semverDiff.semverDiffStrings.build
  */
  trait Result extends StObject
  object Result {
    
    @scala.inline
    def build: typings.semverDiff.semverDiffStrings.build = "build".asInstanceOf[typings.semverDiff.semverDiffStrings.build]
    
    @scala.inline
    def major: typings.semverDiff.semverDiffStrings.major = "major".asInstanceOf[typings.semverDiff.semverDiffStrings.major]
    
    @scala.inline
    def minor: typings.semverDiff.semverDiffStrings.minor = "minor".asInstanceOf[typings.semverDiff.semverDiffStrings.minor]
    
    @scala.inline
    def patch: typings.semverDiff.semverDiffStrings.patch = "patch".asInstanceOf[typings.semverDiff.semverDiffStrings.patch]
    
    @scala.inline
    def premajor: typings.semverDiff.semverDiffStrings.premajor = "premajor".asInstanceOf[typings.semverDiff.semverDiffStrings.premajor]
    
    @scala.inline
    def preminor: typings.semverDiff.semverDiffStrings.preminor = "preminor".asInstanceOf[typings.semverDiff.semverDiffStrings.preminor]
    
    @scala.inline
    def prepatch: typings.semverDiff.semverDiffStrings.prepatch = "prepatch".asInstanceOf[typings.semverDiff.semverDiffStrings.prepatch]
    
    @scala.inline
    def prerelease: typings.semverDiff.semverDiffStrings.prerelease = "prerelease".asInstanceOf[typings.semverDiff.semverDiffStrings.prerelease]
  }
}
