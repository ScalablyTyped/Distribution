package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPackageManagersMod {
  
  @JSImport("snyk/dist/lib/package-managers", "GRAPH_SUPPORTED_PACKAGE_MANAGERS")
  @js.native
  val GRAPH_SUPPORTED_PACKAGE_MANAGERS: js.Array[SupportedPackageManagers] = js.native
  
  @JSImport("snyk/dist/lib/package-managers", "PINNING_SUPPORTED_PACKAGE_MANAGERS")
  @js.native
  val PINNING_SUPPORTED_PACKAGE_MANAGERS: js.Array[SupportedPackageManagers] = js.native
  
  @js.native
  sealed trait SUPPORTED_MANIFEST_FILES extends StObject
  @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_MANIFEST_FILES")
  @js.native
  object SUPPORTED_MANIFEST_FILES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SUPPORTED_MANIFEST_FILES & String] = js.native
    
    @js.native
    sealed trait BUILD_GRADLE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "build.gradle" */ val BUILD_GRADLE: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.BUILD_GRADLE & String = js.native
    
    @js.native
    sealed trait BUILD_GRADLE_KTS
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "build.gradle.kts" */ val BUILD_GRADLE_KTS: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.BUILD_GRADLE_KTS & String = js.native
    
    @js.native
    sealed trait BUILD_SBT
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "build.sbt" */ val BUILD_SBT: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.BUILD_SBT & String = js.native
    
    @js.native
    sealed trait COCOAPODS_PODFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "CocoaPods.podfile" */ val COCOAPODS_PODFILE: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.COCOAPODS_PODFILE & String = js.native
    
    @js.native
    sealed trait COCOAPODS_PODFILE_YAML
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "CocoaPods.podfile.yaml" */ val COCOAPODS_PODFILE_YAML: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.COCOAPODS_PODFILE_YAML & String = js.native
    
    @js.native
    sealed trait COMPOSER_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "composer.lock" */ val COMPOSER_LOCK: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.COMPOSER_LOCK & String = js.native
    
    @js.native
    sealed trait GEMFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Gemfile" */ val GEMFILE: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GEMFILE & String = js.native
    
    @js.native
    sealed trait GEMFILE_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Gemfile.lock" */ val GEMFILE_LOCK: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GEMFILE_LOCK & String = js.native
    
    @js.native
    sealed trait GEMSPEC
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* ".gemspec" */ val GEMSPEC: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GEMSPEC & String = js.native
    
    @js.native
    sealed trait GOPKG_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Gopkg.lock" */ val GOPKG_LOCK: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GOPKG_LOCK & String = js.native
    
    @js.native
    sealed trait GO_MOD
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "go.mod" */ val GO_MOD: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.GO_MOD & String = js.native
    
    @js.native
    sealed trait JAR
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* ".jar" */ val JAR: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.JAR & String = js.native
    
    @js.native
    sealed trait MIX_EXS
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "mix.exs" */ val MIX_EXS: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.MIX_EXS & String = js.native
    
    @js.native
    sealed trait PACKAGES_CONFIG
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "packages.config" */ val PACKAGES_CONFIG: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PACKAGES_CONFIG & String = js.native
    
    @js.native
    sealed trait PACKAGE_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "package.json" */ val PACKAGE_JSON: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PACKAGE_JSON & String = js.native
    
    @js.native
    sealed trait PACKAGE_LOCK_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "package-lock.json" */ val PACKAGE_LOCK_JSON: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PACKAGE_LOCK_JSON & String = js.native
    
    @js.native
    sealed trait PAKET_DEPENDENCIES
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "paket.dependencies" */ val PAKET_DEPENDENCIES: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PAKET_DEPENDENCIES & String = js.native
    
    @js.native
    sealed trait PIPFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Pipfile" */ val PIPFILE: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PIPFILE & String = js.native
    
    @js.native
    sealed trait PODFILE
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Podfile" */ val PODFILE: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PODFILE & String = js.native
    
    @js.native
    sealed trait PODFILE_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "Podfile.lock" */ val PODFILE_LOCK: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PODFILE_LOCK & String = js.native
    
    @js.native
    sealed trait POETRY_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "poetry.lock" */ val POETRY_LOCK: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.POETRY_LOCK & String = js.native
    
    @js.native
    sealed trait POM_XML
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "pom.xml" */ val POM_XML: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.POM_XML & String = js.native
    
    @js.native
    sealed trait PROJECT_ASSETS_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "project.assets.json" */ val PROJECT_ASSETS_JSON: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PROJECT_ASSETS_JSON & String = js.native
    
    @js.native
    sealed trait PROJECT_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "project.json" */ val PROJECT_JSON: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.PROJECT_JSON & String = js.native
    
    @js.native
    sealed trait REQUIREMENTS_TXT
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "requirements.txt" */ val REQUIREMENTS_TXT: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.REQUIREMENTS_TXT & String = js.native
    
    @js.native
    sealed trait SETUP_PY
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "setup.py" */ val SETUP_PY: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.SETUP_PY & String = js.native
    
    @js.native
    sealed trait VENDOR_JSON
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "vendor.json" */ val VENDOR_JSON: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.VENDOR_JSON & String = js.native
    
    @js.native
    sealed trait WAR
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* ".war" */ val WAR: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.WAR & String = js.native
    
    @js.native
    sealed trait YARN_LOCK
      extends StObject
         with SUPPORTED_MANIFEST_FILES
    /* "yarn.lock" */ val YARN_LOCK: typings.snyk.distLibPackageManagersMod.SUPPORTED_MANIFEST_FILES.YARN_LOCK & String = js.native
  }
  
  /* Inlined {readonly [ packageManager in snyk.snyk/dist/lib/package-managers.SupportedPackageManagers ]: string} */
  object SUPPORTED_PACKAGE_MANAGER_NAME {
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.Unmanaged (C/C++)")
    @js.native
    val UnmanagedCC: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.cocoapods")
    @js.native
    val cocoapods: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.composer")
    @js.native
    val composer: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.golangdep")
    @js.native
    val golangdep: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.gomodules")
    @js.native
    val gomodules: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.govendor")
    @js.native
    val govendor: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.gradle")
    @js.native
    val gradle: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.hex")
    @js.native
    val hex: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.maven")
    @js.native
    val maven: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.npm")
    @js.native
    val npm: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.nuget")
    @js.native
    val nuget: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.paket")
    @js.native
    val paket: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.pip")
    @js.native
    val pip: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.poetry")
    @js.native
    val poetry: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.rubygems")
    @js.native
    val rubygems: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.sbt")
    @js.native
    val sbt: String = js.native
    
    @JSImport("snyk/dist/lib/package-managers", "SUPPORTED_PACKAGE_MANAGER_NAME.yarn")
    @js.native
    val yarn: String = js.native
  }
  
  object SupportedPackageManagers {
    
    inline def `Unmanaged LeftparenthesisCSlashCPlussignPlussignRightparenthesis`: /* Unmanaged (C/C++) */ String = ("Unmanaged (C/C++)").asInstanceOf[/* Unmanaged (C/C++) */ String]
    
    inline def cocoapods: typings.snyk.snykStrings.cocoapods = "cocoapods".asInstanceOf[typings.snyk.snykStrings.cocoapods]
    
    inline def composer: typings.snyk.snykStrings.composer = "composer".asInstanceOf[typings.snyk.snykStrings.composer]
    
    inline def golangdep: typings.snyk.snykStrings.golangdep = "golangdep".asInstanceOf[typings.snyk.snykStrings.golangdep]
    
    inline def gomodules: typings.snyk.snykStrings.gomodules = "gomodules".asInstanceOf[typings.snyk.snykStrings.gomodules]
    
    inline def govendor: typings.snyk.snykStrings.govendor = "govendor".asInstanceOf[typings.snyk.snykStrings.govendor]
    
    inline def gradle: typings.snyk.snykStrings.gradle = "gradle".asInstanceOf[typings.snyk.snykStrings.gradle]
    
    inline def hex: typings.snyk.snykStrings.hex = "hex".asInstanceOf[typings.snyk.snykStrings.hex]
    
    inline def maven: typings.snyk.snykStrings.maven = "maven".asInstanceOf[typings.snyk.snykStrings.maven]
    
    inline def npm: typings.snyk.snykStrings.npm = "npm".asInstanceOf[typings.snyk.snykStrings.npm]
    
    inline def nuget: typings.snyk.snykStrings.nuget = "nuget".asInstanceOf[typings.snyk.snykStrings.nuget]
    
    inline def paket: typings.snyk.snykStrings.paket = "paket".asInstanceOf[typings.snyk.snykStrings.paket]
    
    inline def pip: typings.snyk.snykStrings.pip = "pip".asInstanceOf[typings.snyk.snykStrings.pip]
    
    inline def poetry: typings.snyk.snykStrings.poetry = "poetry".asInstanceOf[typings.snyk.snykStrings.poetry]
    
    inline def rubygems: typings.snyk.snykStrings.rubygems = "rubygems".asInstanceOf[typings.snyk.snykStrings.rubygems]
    
    inline def sbt: typings.snyk.snykStrings.sbt = "sbt".asInstanceOf[typings.snyk.snykStrings.sbt]
    
    inline def yarn: typings.snyk.snykStrings.yarn = "yarn".asInstanceOf[typings.snyk.snykStrings.yarn]
  }
  /* Rewritten from type alias, can be one of: 
    - typings.snyk.snykStrings.rubygems
    - typings.snyk.snykStrings.npm
    - typings.snyk.snykStrings.yarn
    - typings.snyk.snykStrings.maven
    - typings.snyk.snykStrings.pip
    - typings.snyk.snykStrings.sbt
    - typings.snyk.snykStrings.gradle
    - typings.snyk.snykStrings.golangdep
    - typings.snyk.snykStrings.govendor
    - typings.snyk.snykStrings.gomodules
    - typings.snyk.snykStrings.nuget
    - typings.snyk.snykStrings.paket
    - typings.snyk.snykStrings.composer
    - typings.snyk.snykStrings.cocoapods
    - typings.snyk.snykStrings.poetry
    - typings.snyk.snykStrings.hex
    - / * Unmanaged (C/C++) * / java.lang.String
  */
  type SupportedPackageManagers = _SupportedPackageManagers | (/* Unmanaged (C/C++) */ String)
  
  trait _SupportedPackageManagers extends StObject
}
