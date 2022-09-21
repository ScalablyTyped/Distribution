package typings.semverDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(versionA: String, versionB: String): js.UndefOr[Difference] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(versionA.asInstanceOf[js.Any], versionB.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Difference]]
  
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
  trait Difference extends StObject
  object Difference {
    
    inline def build: typings.semverDiff.semverDiffStrings.build = "build".asInstanceOf[typings.semverDiff.semverDiffStrings.build]
    
    inline def major: typings.semverDiff.semverDiffStrings.major = "major".asInstanceOf[typings.semverDiff.semverDiffStrings.major]
    
    inline def minor: typings.semverDiff.semverDiffStrings.minor = "minor".asInstanceOf[typings.semverDiff.semverDiffStrings.minor]
    
    inline def patch: typings.semverDiff.semverDiffStrings.patch = "patch".asInstanceOf[typings.semverDiff.semverDiffStrings.patch]
    
    inline def premajor: typings.semverDiff.semverDiffStrings.premajor = "premajor".asInstanceOf[typings.semverDiff.semverDiffStrings.premajor]
    
    inline def preminor: typings.semverDiff.semverDiffStrings.preminor = "preminor".asInstanceOf[typings.semverDiff.semverDiffStrings.preminor]
    
    inline def prepatch: typings.semverDiff.semverDiffStrings.prepatch = "prepatch".asInstanceOf[typings.semverDiff.semverDiffStrings.prepatch]
    
    inline def prerelease: typings.semverDiff.semverDiffStrings.prerelease = "prerelease".asInstanceOf[typings.semverDiff.semverDiffStrings.prerelease]
  }
}
