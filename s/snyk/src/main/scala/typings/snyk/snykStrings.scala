package typings.snyk

import typings.snyk.distLibAlertsMod.AlertType
import typings.snyk.distLibEcosystemsTypesMod.Ecosystem
import typings.snyk.distLibIacConstantsMod.IacProjectTypes
import typings.snyk.distLibIacConstantsMod._IacFileTypes
import typings.snyk.distLibMetricsMod.MetricType
import typings.snyk.distLibPackageManagersMod._SupportedPackageManagers
import typings.snyk.distLibPollingTypesMod.ResolveFactsStatus
import typings.snyk.distLibSnykTestCommonMod.FailOn
import typings.snyk.distLibSnykTestIacTestResultMod.FILTERED_OUT_FIELDS
import typings.snyk.distLibTypesMod.ShowVulnPaths
import typings.snyk.distLibTypesMod.SupportedUserReachableFacingCliArgs
import typings.snyk.distLibTypesMod._SupportedProjectTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snykStrings {
  
  @js.native
  sealed trait CANCELLED
    extends StObject
       with ResolveFactsStatus
  inline def CANCELLED: CANCELLED = "CANCELLED".asInstanceOf[CANCELLED]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with ResolveFactsStatus
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait OK
    extends StObject
       with ResolveFactsStatus
  inline def OK: OK = "OK".asInstanceOf[OK]
  
  @js.native
  sealed trait PENDING
    extends StObject
       with ResolveFactsStatus
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait RUNNING
    extends StObject
       with ResolveFactsStatus
  inline def RUNNING: RUNNING = "RUNNING".asInstanceOf[RUNNING]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait all
    extends StObject
       with FailOn
       with ShowVulnPaths
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait `all-projects`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `all-projects`: `all-projects` = "all-projects".asInstanceOf[`all-projects`]
  
  @js.native
  sealed trait `all-sub-projects`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `all-sub-projects`: `all-sub-projects` = "all-sub-projects".asInstanceOf[`all-sub-projects`]
  
  @js.native
  sealed trait armconfig
    extends StObject
       with IacProjectTypes
       with _SupportedProjectTypes
  inline def armconfig: armconfig = "armconfig".asInstanceOf[armconfig]
  
  @js.native
  sealed trait clear extends StObject
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait cli extends StObject
  inline def cli: cli = "cli".asInstanceOf[cli]
  
  @js.native
  sealed trait cloudConfigPath
    extends StObject
       with FILTERED_OUT_FIELDS
  inline def cloudConfigPath: cloudConfigPath = "cloudConfigPath".asInstanceOf[cloudConfigPath]
  
  @js.native
  sealed trait cloudformationconfig
    extends StObject
       with IacProjectTypes
       with _SupportedProjectTypes
  inline def cloudformationconfig: cloudformationconfig = "cloudformationconfig".asInstanceOf[cloudformationconfig]
  
  @js.native
  sealed trait cocoapods
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def cocoapods: cocoapods = "cocoapods".asInstanceOf[cocoapods]
  
  @js.native
  sealed trait code
    extends StObject
       with Ecosystem
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait composer
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def composer: composer = "composer".asInstanceOf[composer]
  
  @js.native
  sealed trait cpp
    extends StObject
       with Ecosystem
  inline def cpp: cpp = "cpp".asInstanceOf[cpp]
  
  @js.native
  sealed trait create extends StObject
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait customconfig
    extends StObject
       with IacProjectTypes
       with _SupportedProjectTypes
  inline def customconfig: customconfig = "customconfig".asInstanceOf[customconfig]
  
  @js.native
  sealed trait delete extends StObject
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `detection-depth`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `detection-depth`: `detection-depth` = "detection-depth".asInstanceOf[`detection-depth`]
  
  @js.native
  sealed trait docker
    extends StObject
       with Ecosystem
       with SupportedUserReachableFacingCliArgs
  inline def docker: docker = "docker".asInstanceOf[docker]
  
  @js.native
  sealed trait `dry-run`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `dry-run`: `dry-run` = "dry-run".asInstanceOf[`dry-run`]
  
  @js.native
  sealed trait engineType extends StObject
  inline def engineType: engineType = "engineType".asInstanceOf[engineType]
  
  @js.native
  sealed trait error_
    extends StObject
       with AlertType
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait `fail-on`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `fail-on`: `fail-on` = "fail-on".asInstanceOf[`fail-on`]
  
  @js.native
  sealed trait file
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fileContent extends StObject
  inline def fileContent: fileContent = "fileContent".asInstanceOf[fileContent]
  
  @js.native
  sealed trait from
    extends StObject
       with FILTERED_OUT_FIELDS
  inline def from: from = "from".asInstanceOf[from]
  
  @js.native
  sealed trait get extends StObject
  inline def get: get = "get".asInstanceOf[get]
  
  @js.native
  sealed trait golangdep
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def golangdep: golangdep = "golangdep".asInstanceOf[golangdep]
  
  @js.native
  sealed trait gomodules
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def gomodules: gomodules = "gomodules".asInstanceOf[gomodules]
  
  @js.native
  sealed trait govendor
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def govendor: govendor = "govendor".asInstanceOf[govendor]
  
  @js.native
  sealed trait gradle
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def gradle: gradle = "gradle".asInstanceOf[gradle]
  
  @js.native
  sealed trait `gradle-sub-project`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `gradle-sub-project`: `gradle-sub-project` = "gradle-sub-project".asInstanceOf[`gradle-sub-project`]
  
  @js.native
  sealed trait help extends StObject
  inline def help: help = "help".asInstanceOf[help]
  
  @js.native
  sealed trait hex
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait iac extends StObject
  inline def iac: iac = "iac".asInstanceOf[iac]
  
  @js.native
  sealed trait iacIssue extends StObject
  inline def iacIssue: iacIssue = "iacIssue".asInstanceOf[iacIssue]
  
  @js.native
  sealed trait ignore extends StObject
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait `ignore-policy`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `ignore-policy`: `ignore-policy` = "ignore-policy".asInstanceOf[`ignore-policy`]
  
  @js.native
  sealed trait info
    extends StObject
       with AlertType
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait inherit extends StObject
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait `init-script`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `init-script`: `init-script` = "init-script".asInstanceOf[`init-script`]
  
  @js.native
  sealed trait `integration-name`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `integration-name`: `integration-name` = "integration-name".asInstanceOf[`integration-name`]
  
  @js.native
  sealed trait `integration-version`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `integration-version`: `integration-version` = "integration-version".asInstanceOf[`integration-version`]
  
  @js.native
  sealed trait ipc extends StObject
  inline def ipc: ipc = "ipc".asInstanceOf[ipc]
  
  @js.native
  sealed trait json
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait jsonContent extends StObject
  inline def jsonContent: jsonContent = "jsonContent".asInstanceOf[jsonContent]
  
  @js.native
  sealed trait k8sconfig
    extends StObject
       with IacProjectTypes
       with _SupportedProjectTypes
  inline def k8sconfig: k8sconfig = "k8sconfig".asInstanceOf[k8sconfig]
  
  @js.native
  sealed trait license extends StObject
  inline def license: license = "license".asInstanceOf[license]
  
  @js.native
  sealed trait maven
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def maven: maven = "maven".asInstanceOf[maven]
  
  @js.native
  sealed trait `maven-aggregate-project`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `maven-aggregate-project`: `maven-aggregate-project` = "maven-aggregate-project".asInstanceOf[`maven-aggregate-project`]
  
  @js.native
  sealed trait multiiacconfig
    extends StObject
       with IacProjectTypes
       with _SupportedProjectTypes
  inline def multiiacconfig: multiiacconfig = "multiiacconfig".asInstanceOf[multiiacconfig]
  
  @js.native
  sealed trait name
    extends StObject
       with FILTERED_OUT_FIELDS
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait `no-op` extends StObject
  inline def `no-op`: `no-op` = "no-op".asInstanceOf[`no-op`]
  
  @js.native
  sealed trait none
    extends StObject
       with ShowVulnPaths
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait note extends StObject
  inline def note: note = "note".asInstanceOf[note]
  
  @js.native
  sealed trait npm
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def npm: npm = "npm".asInstanceOf[npm]
  
  @js.native
  sealed trait nuget
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def nuget: nuget = "nuget".asInstanceOf[nuget]
  
  @js.native
  sealed trait `package-manager`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `package-manager`: `package-manager` = "package-manager".asInstanceOf[`package-manager`]
  
  @js.native
  sealed trait `packages-folder`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `packages-folder`: `packages-folder` = "packages-folder".asInstanceOf[`packages-folder`]
  
  @js.native
  sealed trait paket
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def paket: paket = "paket".asInstanceOf[paket]
  
  @js.native
  sealed trait patchable
    extends StObject
       with FailOn
  inline def patchable: patchable = "patchable".asInstanceOf[patchable]
  
  @js.native
  sealed trait pip
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def pip: pip = "pip".asInstanceOf[pip]
  
  @js.native
  sealed trait pipe extends StObject
  inline def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @js.native
  sealed trait poetry
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def poetry: poetry = "poetry".asInstanceOf[poetry]
  
  @js.native
  sealed trait policy
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def policy: policy = "policy".asInstanceOf[policy]
  
  @js.native
  sealed trait `project-name`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `project-name`: `project-name` = "project-name".asInstanceOf[`project-name`]
  
  @js.native
  sealed trait `prune-repeated-subdependencies`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `prune-repeated-subdependencies`: `prune-repeated-subdependencies` = "prune-repeated-subdependencies".asInstanceOf[`prune-repeated-subdependencies`]
  
  @js.native
  sealed trait read extends StObject
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait rubygems
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def rubygems: rubygems = "rubygems".asInstanceOf[rubygems]
  
  @js.native
  sealed trait rules
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def rules: rules = "rules".asInstanceOf[rules]
  
  @js.native
  sealed trait sbt
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def sbt: sbt = "sbt".asInstanceOf[sbt]
  
  @js.native
  sealed trait `scan-all-unmanaged`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `scan-all-unmanaged`: `scan-all-unmanaged` = "scan-all-unmanaged".asInstanceOf[`scan-all-unmanaged`]
  
  @js.native
  sealed trait sequential
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def sequential: sequential = "sequential".asInstanceOf[sequential]
  
  @js.native
  sealed trait set extends StObject
  inline def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait `severity-threshold`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `severity-threshold`: `severity-threshold` = "severity-threshold".asInstanceOf[`severity-threshold`]
  
  @js.native
  sealed trait `show-vulnerable-paths`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `show-vulnerable-paths`: `show-vulnerable-paths` = "show-vulnerable-paths".asInstanceOf[`show-vulnerable-paths`]
  
  @js.native
  sealed trait `skip-unresolved`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `skip-unresolved`: `skip-unresolved` = "skip-unresolved".asInstanceOf[`skip-unresolved`]
  
  @js.native
  sealed trait some
    extends StObject
       with ShowVulnPaths
  inline def some: some = "some".asInstanceOf[some]
  
  @js.native
  sealed trait `strict-out-of-sync`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `strict-out-of-sync`: `strict-out-of-sync` = "strict-out-of-sync".asInstanceOf[`strict-out-of-sync`]
  
  @js.native
  sealed trait `sub-project`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `sub-project`: `sub-project` = "sub-project".asInstanceOf[`sub-project`]
  
  @js.native
  sealed trait synthetic
    extends StObject
       with MetricType
  inline def synthetic: synthetic = "synthetic".asInstanceOf[synthetic]
  
  @js.native
  sealed trait terraformconfig
    extends StObject
       with IacProjectTypes
       with _SupportedProjectTypes
  inline def terraformconfig: terraformconfig = "terraformconfig".asInstanceOf[terraformconfig]
  
  @js.native
  sealed trait tf
    extends StObject
       with _IacFileTypes
  inline def tf: tf = "tf".asInstanceOf[tf]
  
  @js.native
  sealed trait tfvars
    extends StObject
       with _IacFileTypes
  inline def tfvars: tfvars = "tfvars".asInstanceOf[tfvars]
  
  @js.native
  sealed trait timer
    extends StObject
       with MetricType
  inline def timer: timer = "timer".asInstanceOf[timer]
  
  @js.native
  sealed trait `trust-policies`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `trust-policies`: `trust-policies` = "trust-policies".asInstanceOf[`trust-policies`]
  
  @js.native
  sealed trait unset extends StObject
  inline def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait update extends StObject
  inline def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait upgradable
    extends StObject
       with FailOn
  inline def upgradable: upgradable = "upgradable".asInstanceOf[upgradable]
  
  @js.native
  sealed trait upstream extends StObject
  inline def upstream: upstream = "upstream".asInstanceOf[upstream]
  
  @js.native
  sealed trait vuln extends StObject
  inline def vuln: vuln = "vuln".asInstanceOf[vuln]
  
  @js.native
  sealed trait warning
    extends StObject
       with AlertType
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait yarn
    extends StObject
       with _SupportedPackageManagers
       with _SupportedProjectTypes
  inline def yarn: yarn = "yarn".asInstanceOf[yarn]
  
  @js.native
  sealed trait `yarn-workspaces`
    extends StObject
       with SupportedUserReachableFacingCliArgs
  inline def `yarn-workspaces`: `yarn-workspaces` = "yarn-workspaces".asInstanceOf[`yarn-workspaces`]
}
