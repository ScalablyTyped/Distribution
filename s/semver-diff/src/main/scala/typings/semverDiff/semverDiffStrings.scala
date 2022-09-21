package typings.semverDiff

import typings.semverDiff.mod.Difference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semverDiffStrings {
  
  @js.native
  sealed trait build
    extends StObject
       with Difference
  inline def build: build = "build".asInstanceOf[build]
  
  @js.native
  sealed trait major
    extends StObject
       with Difference
  inline def major: major = "major".asInstanceOf[major]
  
  @js.native
  sealed trait minor
    extends StObject
       with Difference
  inline def minor: minor = "minor".asInstanceOf[minor]
  
  @js.native
  sealed trait patch
    extends StObject
       with Difference
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait premajor
    extends StObject
       with Difference
  inline def premajor: premajor = "premajor".asInstanceOf[premajor]
  
  @js.native
  sealed trait preminor
    extends StObject
       with Difference
  inline def preminor: preminor = "preminor".asInstanceOf[preminor]
  
  @js.native
  sealed trait prepatch
    extends StObject
       with Difference
  inline def prepatch: prepatch = "prepatch".asInstanceOf[prepatch]
  
  @js.native
  sealed trait prerelease
    extends StObject
       with Difference
  inline def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}
