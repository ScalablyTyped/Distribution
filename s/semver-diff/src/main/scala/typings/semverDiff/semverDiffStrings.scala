package typings.semverDiff

import typings.semverDiff.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semverDiffStrings {
  
  @js.native
  sealed trait build
    extends StObject
       with Result
  inline def build: build = "build".asInstanceOf[build]
  
  @js.native
  sealed trait major
    extends StObject
       with Result
  inline def major: major = "major".asInstanceOf[major]
  
  @js.native
  sealed trait minor
    extends StObject
       with Result
  inline def minor: minor = "minor".asInstanceOf[minor]
  
  @js.native
  sealed trait patch
    extends StObject
       with Result
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait premajor
    extends StObject
       with Result
  inline def premajor: premajor = "premajor".asInstanceOf[premajor]
  
  @js.native
  sealed trait preminor
    extends StObject
       with Result
  inline def preminor: preminor = "preminor".asInstanceOf[preminor]
  
  @js.native
  sealed trait prepatch
    extends StObject
       with Result
  inline def prepatch: prepatch = "prepatch".asInstanceOf[prepatch]
  
  @js.native
  sealed trait prerelease
    extends StObject
       with Result
  inline def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}
