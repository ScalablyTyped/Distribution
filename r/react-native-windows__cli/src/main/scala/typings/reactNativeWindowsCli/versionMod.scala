package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Version {
    def this(major: Double) = this()
    def this(major: Double, minor: Double) = this()
    def this(major: Double, minor: Double, build: Double) = this()
    def this(major: Double, minor: Unit, build: Double) = this()
    def this(major: Double, minor: Double, build: Double, qfe: Double) = this()
    def this(major: Double, minor: Double, build: Unit, qfe: Double) = this()
    def this(major: Double, minor: Unit, build: Double, qfe: Double) = this()
    def this(major: Double, minor: Unit, build: Unit, qfe: Double) = this()
    
    /* private */ /* CompleteClass */
    var build: js.Any = js.native
    
    /* CompleteClass */
    override def eq(other: Version): Boolean = js.native
    
    /* CompleteClass */
    override def gt(other: Version): Boolean = js.native
    
    /* CompleteClass */
    override def gte(other: Version): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var major: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var minor: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var qfe: js.Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def compare(x: Version, y: Version): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def fromString(str: String): Version = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Version]
    
    inline def tryParse(str: String): Version | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("tryParse")(str.asInstanceOf[js.Any]).asInstanceOf[Version | Null]
  }
  
  trait Version extends StObject {
    
    /* private */ var build: js.Any
    
    def eq(other: Version): Boolean
    
    def gt(other: Version): Boolean
    
    def gte(other: Version): Boolean
    
    /* private */ var major: js.Any
    
    /* private */ var minor: js.Any
    
    /* private */ var qfe: js.Any
  }
  object Version {
    
    inline def apply(
      build: js.Any,
      eq_ : Version => Boolean,
      gt: Version => Boolean,
      gte: Version => Boolean,
      major: js.Any,
      minor: js.Any,
      qfe: js.Any
    ): Version = {
      val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], gt = js.Any.fromFunction1(gt), gte = js.Any.fromFunction1(gte), major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], qfe = qfe.asInstanceOf[js.Any])
      __obj.updateDynamic("eq")(js.Any.fromFunction1(eq_))
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setBuild(value: js.Any): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setEq_(value: Version => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
      
      inline def setGt(value: Version => Boolean): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
      
      inline def setGte(value: Version => Boolean): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
      
      inline def setMajor(value: js.Any): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMinor(value: js.Any): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setQfe(value: js.Any): Self = StObject.set(x, "qfe", value.asInstanceOf[js.Any])
    }
  }
}
