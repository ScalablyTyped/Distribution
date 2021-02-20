package typings.semverUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-utils", "parse")
  @js.native
  def parse(version: String): SemVer = js.native
  
  @JSImport("semver-utils", "parseRange")
  @js.native
  def parseRange(range: String): js.Array[SemVer] = js.native
  
  @JSImport("semver-utils", "stringify")
  @js.native
  def stringify(version: SemVer): String = js.native
  
  @JSImport("semver-utils", "stringifyRange")
  @js.native
  def stringifyRange(version: js.Array[SemVer]): String = js.native
  
  @js.native
  trait SemVer extends StObject {
    
    var build: js.UndefOr[String] = js.native
    
    var major: js.UndefOr[String] = js.native
    
    var minor: js.UndefOr[String] = js.native
    
    var operator: js.UndefOr[String] = js.native
    
    var patch: js.UndefOr[String] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var semver: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object SemVer {
    
    @scala.inline
    def apply(): SemVer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemVer]
    }
    
    @scala.inline
    implicit class SemVerMutableBuilder[Self <: SemVer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      @scala.inline
      def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setSemver(value: String): Self = StObject.set(x, "semver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSemverUndefined: Self = StObject.set(x, "semver", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
