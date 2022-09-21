package typings.semanticRelease

import typings.semanticRelease.mod.ReleaseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semanticReleaseStrings {
  
  @js.native
  sealed trait major
    extends StObject
       with ReleaseType
  inline def major: major = "major".asInstanceOf[major]
  
  @js.native
  sealed trait minor
    extends StObject
       with ReleaseType
  inline def minor: minor = "minor".asInstanceOf[minor]
  
  @js.native
  sealed trait patch
    extends StObject
       with ReleaseType
  inline def patch: patch = "patch".asInstanceOf[patch]
  
  @js.native
  sealed trait premajor
    extends StObject
       with ReleaseType
  inline def premajor: premajor = "premajor".asInstanceOf[premajor]
  
  @js.native
  sealed trait preminor
    extends StObject
       with ReleaseType
  inline def preminor: preminor = "preminor".asInstanceOf[preminor]
  
  @js.native
  sealed trait prepatch
    extends StObject
       with ReleaseType
  inline def prepatch: prepatch = "prepatch".asInstanceOf[prepatch]
  
  @js.native
  sealed trait prerelease
    extends StObject
       with ReleaseType
  inline def prerelease: prerelease = "prerelease".asInstanceOf[prerelease]
}
