package typings.semverUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(version: String): SemVer = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(version.asInstanceOf[js.Any]).asInstanceOf[SemVer]
  
  inline def parseRange(range: String): js.Array[SemVer] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRange")(range.asInstanceOf[js.Any]).asInstanceOf[js.Array[SemVer]]
  
  inline def stringify(version: SemVer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringifyRange(version: js.Array[SemVer]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyRange")(version.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
    
    inline def apply(): SemVer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemVer]
    }
    
    extension [Self <: SemVer](x: Self) {
      
      inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setSemver(value: String): Self = StObject.set(x, "semver", value.asInstanceOf[js.Any])
      
      inline def setSemverUndefined: Self = StObject.set(x, "semver", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
