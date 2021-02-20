package typings.reactNativeWindowsCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object versionMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", JSImport.Default)
  @js.native
  class default protected () extends Version {
    def this(major: Double) = this()
    def this(major: Double, minor: Double) = this()
    def this(major: Double, minor: js.UndefOr[scala.Nothing], build: Double) = this()
    def this(major: Double, minor: Double, build: Double) = this()
    def this(major: Double, minor: js.UndefOr[scala.Nothing], build: js.UndefOr[scala.Nothing], qfe: Double) = this()
    def this(major: Double, minor: js.UndefOr[scala.Nothing], build: Double, qfe: Double) = this()
    def this(major: Double, minor: Double, build: js.UndefOr[scala.Nothing], qfe: Double) = this()
    def this(major: Double, minor: Double, build: Double, qfe: Double) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", "default.compare")
    @js.native
    def compare(x: Version, y: Version): Double = js.native
    
    @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", "default.fromString")
    @js.native
    def fromString(str: String): Version = js.native
    
    @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/utils/version", "default.tryParse")
    @js.native
    def tryParse(str: String): Version | Null = js.native
  }
  
  @js.native
  trait Version extends StObject {
    
    var build: js.Any = js.native
    
    def eq(other: Version): Boolean = js.native
    
    def gt(other: Version): Boolean = js.native
    
    def gte(other: Version): Boolean = js.native
    
    var major: js.Any = js.native
    
    var minor: js.Any = js.native
    
    var qfe: js.Any = js.native
  }
  object Version {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuild(value: js.Any): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEq_(value: Version => Boolean): Self = StObject.set(x, "eq", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGt(value: Version => Boolean): Self = StObject.set(x, "gt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGte(value: Version => Boolean): Self = StObject.set(x, "gte", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMajor(value: js.Any): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinor(value: js.Any): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQfe(value: js.Any): Self = StObject.set(x, "qfe", value.asInstanceOf[js.Any])
    }
  }
}
