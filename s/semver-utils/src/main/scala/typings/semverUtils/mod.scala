package typings.semverUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(version: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  @scala.inline
  def parseRange(range: String): js.Array[SemVer] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRange")(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[SemVer]]
  
  @scala.inline
  def stringify(version: SemVer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def stringifyRange(version: js.Array[SemVer]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRange")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait SemVer extends StObject {
    
    var build: js.UndefOr[String] = js.undefined
    
    var major: js.UndefOr[String] = js.undefined
    
    var minor: js.UndefOr[String] = js.undefined
    
    var operator: js.UndefOr[String] = js.undefined
    
    var patch: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[String] = js.undefined
    
    var semver: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
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
