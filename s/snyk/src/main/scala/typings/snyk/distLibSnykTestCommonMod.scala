package typings.snyk

import typings.snyk.anon.IgnorePolicy
import typings.snyk.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSnykTestCommonMod {
  
  @JSImport("snyk/dist/lib/snyk-test/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FAIL_ON extends StObject
  @JSImport("snyk/dist/lib/snyk-test/common", "FAIL_ON")
  @js.native
  object FAIL_ON extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FAIL_ON & String] = js.native
    
    @js.native
    sealed trait all
      extends StObject
         with FAIL_ON
    /* "all" */ val all: typings.snyk.distLibSnykTestCommonMod.FAIL_ON.all & String = js.native
    
    @js.native
    sealed trait patchable
      extends StObject
         with FAIL_ON
    /* "patchable" */ val patchable: typings.snyk.distLibSnykTestCommonMod.FAIL_ON.patchable & String = js.native
    
    @js.native
    sealed trait upgradable
      extends StObject
         with FAIL_ON
    /* "upgradable" */ val upgradable: typings.snyk.distLibSnykTestCommonMod.FAIL_ON.upgradable & String = js.native
  }
  
  @JSImport("snyk/dist/lib/snyk-test/common", "SEVERITIES")
  @js.native
  val SEVERITIES: js.Array[Value] = js.native
  
  @js.native
  sealed trait SEVERITY extends StObject
  @JSImport("snyk/dist/lib/snyk-test/common", "SEVERITY")
  @js.native
  object SEVERITY extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SEVERITY & String] = js.native
    
    @js.native
    sealed trait CRITICAL
      extends StObject
         with SEVERITY
    /* "critical" */ val CRITICAL: typings.snyk.distLibSnykTestCommonMod.SEVERITY.CRITICAL & String = js.native
    
    @js.native
    sealed trait HIGH
      extends StObject
         with SEVERITY
    /* "high" */ val HIGH: typings.snyk.distLibSnykTestCommonMod.SEVERITY.HIGH & String = js.native
    
    @js.native
    sealed trait LOW
      extends StObject
         with SEVERITY
    /* "low" */ val LOW: typings.snyk.distLibSnykTestCommonMod.SEVERITY.LOW & String = js.native
    
    @js.native
    sealed trait MEDIUM
      extends StObject
         with SEVERITY
    /* "medium" */ val MEDIUM: typings.snyk.distLibSnykTestCommonMod.SEVERITY.MEDIUM & String = js.native
  }
  
  inline def assembleQueryString(options: Any): IgnorePolicy | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleQueryString")(options.asInstanceOf[js.Any]).asInstanceOf[IgnorePolicy | Null]
  
  inline def colorTextBySeverity(severity: String, textToColor: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("colorTextBySeverity")(severity.asInstanceOf[js.Any], textToColor.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.snyk.snykStrings.all
    - typings.snyk.snykStrings.upgradable
    - typings.snyk.snykStrings.patchable
  */
  trait FailOn extends StObject
  object FailOn {
    
    inline def all: typings.snyk.snykStrings.all = "all".asInstanceOf[typings.snyk.snykStrings.all]
    
    inline def patchable: typings.snyk.snykStrings.patchable = "patchable".asInstanceOf[typings.snyk.snykStrings.patchable]
    
    inline def upgradable: typings.snyk.snykStrings.upgradable = "upgradable".asInstanceOf[typings.snyk.snykStrings.upgradable]
  }
}
