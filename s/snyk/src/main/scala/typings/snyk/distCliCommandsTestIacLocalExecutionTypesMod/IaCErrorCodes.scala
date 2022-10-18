package typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IaCErrorCodes extends StObject
@JSImport("snyk/dist/cli/commands/test/iac/local-execution/types", "IaCErrorCodes")
@js.native
object IaCErrorCodes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IaCErrorCodes & Double] = js.native
  
  @js.native
  sealed trait CurrentWorkingDirectoryTraversalError
    extends StObject
       with IaCErrorCodes
  /* 1012 */ val CurrentWorkingDirectoryTraversalError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.CurrentWorkingDirectoryTraversalError & Double = js.native
  
  @js.native
  sealed trait CwdTraversal
    extends StObject
       with IaCErrorCodes
  /* 2003 */ val CwdTraversal: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.CwdTraversal & Double = js.native
  
  @js.native
  sealed trait FailedToBuildOCIArtifactError
    extends StObject
       with IaCErrorCodes
  /* 1102 */ val FailedToBuildOCIArtifactError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToBuildOCIArtifactError & Double = js.native
  
  @js.native
  sealed trait FailedToBuildPolicyEngine
    extends StObject
       with IaCErrorCodes
  /* 1060 */ val FailedToBuildPolicyEngine: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToBuildPolicyEngine & Double = js.native
  
  @js.native
  sealed trait FailedToCachePolicyEngineError
    extends StObject
       with IaCErrorCodes
  /* 1142 */ val FailedToCachePolicyEngineError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToCachePolicyEngineError & Double = js.native
  
  @js.native
  sealed trait FailedToCacheRulesBundleError
    extends StObject
       with IaCErrorCodes
  /* 1132 */ val FailedToCacheRulesBundleError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToCacheRulesBundleError & Double = js.native
  
  @js.native
  sealed trait FailedToCleanLocalCacheError
    extends StObject
       with IaCErrorCodes
  /* 1001 */ val FailedToCleanLocalCacheError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToCleanLocalCacheError & Double = js.native
  
  @js.native
  sealed trait FailedToCompile
    extends StObject
       with IaCErrorCodes
  /* 2112 */ val FailedToCompile: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToCompile & Double = js.native
  
  @js.native
  sealed trait FailedToDetectJsonConfigError
    extends StObject
       with IaCErrorCodes
  /* 1023 */ val FailedToDetectJsonConfigError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToDetectJsonConfigError & Double = js.native
  
  @js.native
  sealed trait FailedToDetectYamlConfigError
    extends StObject
       with IaCErrorCodes
  /* 1024 */ val FailedToDetectYamlConfigError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToDetectYamlConfigError & Double = js.native
  
  @js.native
  sealed trait FailedToDownloadPolicyEngineError
    extends StObject
       with IaCErrorCodes
  /* 1141 */ val FailedToDownloadPolicyEngineError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToDownloadPolicyEngineError & Double = js.native
  
  @js.native
  sealed trait FailedToDownloadRulesBundleError
    extends StObject
       with IaCErrorCodes
  /* 1131 */ val FailedToDownloadRulesBundleError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToDownloadRulesBundleError & Double = js.native
  
  @js.native
  sealed trait FailedToDownloadRulesError
    extends StObject
       with IaCErrorCodes
  /* 1002 */ val FailedToDownloadRulesError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToDownloadRulesError & Double = js.native
  
  @js.native
  sealed trait FailedToExecuteCustomRulesError
    extends StObject
       with IaCErrorCodes
  /* 1100 */ val FailedToExecuteCustomRulesError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToExecuteCustomRulesError & Double = js.native
  
  @js.native
  sealed trait FailedToExecutePolicyEngine
    extends StObject
       with IaCErrorCodes
  /* 1061 */ val FailedToExecutePolicyEngine: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToExecutePolicyEngine & Double = js.native
  
  @js.native
  sealed trait FailedToExtractCustomRulesError
    extends StObject
       with IaCErrorCodes
  /* 1003 */ val FailedToExtractCustomRulesError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToExtractCustomRulesError & Double = js.native
  
  @js.native
  sealed trait FailedToExtractLineNumberError
    extends StObject
       with IaCErrorCodes
  /* 1071 */ val FailedToExtractLineNumberError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToExtractLineNumberError & Double = js.native
  
  @js.native
  sealed trait FailedToExtractResourcesInTerraformPlanError
    extends StObject
       with IaCErrorCodes
  /* 1052 */ val FailedToExtractResourcesInTerraformPlanError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToExtractResourcesInTerraformPlanError & Double = js.native
  
  @js.native
  sealed trait FailedToFormatResults
    extends StObject
       with IaCErrorCodes
  /* 1070 */ val FailedToFormatResults: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToFormatResults & Double = js.native
  
  @js.native
  sealed trait FailedToGetIacOrgSettingsError
    extends StObject
       with IaCErrorCodes
  /* 1080 */ val FailedToGetIacOrgSettingsError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToGetIacOrgSettingsError & Double = js.native
  
  @js.native
  sealed trait FailedToInitLocalCacheError
    extends StObject
       with IaCErrorCodes
  /* 1000 */ val FailedToInitLocalCacheError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToInitLocalCacheError & Double = js.native
  
  @js.native
  sealed trait FailedToLoadFileError
    extends StObject
       with IaCErrorCodes
  /* 1011 */ val FailedToLoadFileError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToLoadFileError & Double = js.native
  
  @js.native
  sealed trait FailedToLoadRegoAPI
    extends StObject
       with IaCErrorCodes
  /* 2110 */ val FailedToLoadRegoAPI: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToLoadRegoAPI & Double = js.native
  
  @js.native
  sealed trait FailedToLoadRules
    extends StObject
       with IaCErrorCodes
  /* 2111 */ val FailedToLoadRules: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToLoadRules & Double = js.native
  
  @js.native
  sealed trait FailedToMakeResourcesResolvers
    extends StObject
       with IaCErrorCodes
  /* 2115 */ val FailedToMakeResourcesResolvers: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToMakeResourcesResolvers & Double = js.native
  
  @js.native
  sealed trait FailedToParseHelmError
    extends StObject
       with IaCErrorCodes
  /* 1032 */ val FailedToParseHelmError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToParseHelmError & Double = js.native
  
  @js.native
  sealed trait FailedToParseInput
    extends StObject
       with IaCErrorCodes
  /* 2105 */ val FailedToParseInput: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToParseInput & Double = js.native
  
  @js.native
  sealed trait FailedToParseTerraformFileError
    extends StObject
       with IaCErrorCodes
  /* 1040 */ val FailedToParseTerraformFileError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToParseTerraformFileError & Double = js.native
  
  @js.native
  sealed trait FailedToProcessResults
    extends StObject
       with IaCErrorCodes
  /* 2200 */ val FailedToProcessResults: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToProcessResults & Double = js.native
  
  @js.native
  sealed trait FailedToPullCustomBundleError
    extends StObject
       with IaCErrorCodes
  /* 1101 */ val FailedToPullCustomBundleError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FailedToPullCustomBundleError & Double = js.native
  
  @js.native
  sealed trait FeatureFlagError
    extends StObject
       with IaCErrorCodes
  /* 1093 */ val FeatureFlagError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FeatureFlagError & Double = js.native
  
  @js.native
  sealed trait FlagError
    extends StObject
       with IaCErrorCodes
  /* 1090 */ val FlagError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FlagError & Double = js.native
  
  @js.native
  sealed trait FlagValueError
    extends StObject
       with IaCErrorCodes
  /* 1091 */ val FlagValueError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.FlagValueError & Double = js.native
  
  @js.native
  sealed trait InvalidArgumentError
    extends StObject
       with IaCErrorCodes
  /* 1094 */ val InvalidArgumentError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidArgumentError & Double = js.native
  
  @js.native
  sealed trait InvalidCustomRules
    extends StObject
       with IaCErrorCodes
  /* 1004 */ val InvalidCustomRules: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidCustomRules & Double = js.native
  
  @js.native
  sealed trait InvalidCustomRulesPath
    extends StObject
       with IaCErrorCodes
  /* 1005 */ val InvalidCustomRulesPath: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidCustomRulesPath & Double = js.native
  
  @js.native
  sealed trait InvalidInput
    extends StObject
       with IaCErrorCodes
  /* 2106 */ val InvalidInput: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidInput & Double = js.native
  
  @js.native
  sealed trait InvalidJsonFileError
    extends StObject
       with IaCErrorCodes
  /* 1021 */ val InvalidJsonFileError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidJsonFileError & Double = js.native
  
  @js.native
  sealed trait InvalidManifestSchemaVersionError
    extends StObject
       with IaCErrorCodes
  /* 1104 */ val InvalidManifestSchemaVersionError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidManifestSchemaVersionError & Double = js.native
  
  @js.native
  sealed trait InvalidRemoteRegistryURLError
    extends StObject
       with IaCErrorCodes
  /* 1103 */ val InvalidRemoteRegistryURLError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidRemoteRegistryURLError & Double = js.native
  
  @js.native
  sealed trait InvalidServiceError
    extends StObject
       with IaCErrorCodes
  /* 1110 */ val InvalidServiceError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidServiceError & Double = js.native
  
  @js.native
  sealed trait InvalidSeverityThreshold
    extends StObject
       with IaCErrorCodes
  /* 2006 */ val InvalidSeverityThreshold: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidSeverityThreshold & Double = js.native
  
  @js.native
  sealed trait InvalidUserPolicyEnginePathError
    extends StObject
       with IaCErrorCodes
  /* 1140 */ val InvalidUserPolicyEnginePathError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidUserPolicyEnginePathError & Double = js.native
  
  @js.native
  sealed trait InvalidUserRulesBundlePathError
    extends StObject
       with IaCErrorCodes
  /* 1130 */ val InvalidUserRulesBundlePathError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidUserRulesBundlePathError & Double = js.native
  
  @js.native
  sealed trait InvalidVarFilePath
    extends StObject
       with IaCErrorCodes
  /* 1006 */ val InvalidVarFilePath: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidVarFilePath & Double = js.native
  
  @js.native
  sealed trait InvalidYamlFileError
    extends StObject
       with IaCErrorCodes
  /* 1022 */ val InvalidYamlFileError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.InvalidYamlFileError & Double = js.native
  
  @js.native
  sealed trait MissingRequiredFieldsInKubernetesYamlError
    extends StObject
       with IaCErrorCodes
  /* 1031 */ val MissingRequiredFieldsInKubernetesYamlError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.MissingRequiredFieldsInKubernetesYamlError & Double = js.native
  
  @js.native
  sealed trait NoBundle
    extends StObject
       with IaCErrorCodes
  /* 2004 */ val NoBundle: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.NoBundle & Double = js.native
  
  @js.native
  sealed trait NoFilesToScanError
    extends StObject
       with IaCErrorCodes
  /* 1010 */ val NoFilesToScanError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.NoFilesToScanError & Double = js.native
  
  @js.native
  sealed trait NoLoadableInput
    extends StObject
       with IaCErrorCodes
  /* 2114 */ val NoLoadableInput: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.NoLoadableInput & Double = js.native
  
  @js.native
  sealed trait NoPaths
    extends StObject
       with IaCErrorCodes
  /* 2000 */ val NoPaths: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.NoPaths & Double = js.native
  
  @js.native
  sealed trait OpenBundle
    extends StObject
       with IaCErrorCodes
  /* 2005 */ val OpenBundle: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.OpenBundle & Double = js.native
  
  @js.native
  sealed trait PolicyEngineScanError
    extends StObject
       with IaCErrorCodes
  /* 1150 */ val PolicyEngineScanError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.PolicyEngineScanError & Double = js.native
  
  @js.native
  sealed trait ResourcesResolverError
    extends StObject
       with IaCErrorCodes
  /* 2116 */ val ResourcesResolverError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.ResourcesResolverError & Double = js.native
  
  @js.native
  sealed trait Scan
    extends StObject
       with IaCErrorCodes
  /* 2100 */ val Scan: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.Scan & Double = js.native
  
  @js.native
  sealed trait UnableToReadDir
    extends StObject
       with IaCErrorCodes
  /* 2108 */ val UnableToReadDir: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnableToReadDir & Double = js.native
  
  @js.native
  sealed trait UnableToReadFile
    extends StObject
       with IaCErrorCodes
  /* 2107 */ val UnableToReadFile: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnableToReadFile & Double = js.native
  
  @js.native
  sealed trait UnableToReadPath
    extends StObject
       with IaCErrorCodes
  /* 2113 */ val UnableToReadPath: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnableToReadPath & Double = js.native
  
  @js.native
  sealed trait UnableToReadStdin
    extends StObject
       with IaCErrorCodes
  /* 2109 */ val UnableToReadStdin: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnableToReadStdin & Double = js.native
  
  @js.native
  sealed trait UnableToRecognizeInputType
    extends StObject
       with IaCErrorCodes
  /* 2101 */ val UnableToRecognizeInputType: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnableToRecognizeInputType & Double = js.native
  
  @js.native
  sealed trait UnableToResolveLocation
    extends StObject
       with IaCErrorCodes
  /* 2103 */ val UnableToResolveLocation: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnableToResolveLocation & Double = js.native
  
  @js.native
  sealed trait UnrecognizedFileExtension
    extends StObject
       with IaCErrorCodes
  /* 2104 */ val UnrecognizedFileExtension: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnrecognizedFileExtension & Double = js.native
  
  @js.native
  sealed trait UnsupportedEntitlementFlagError
    extends StObject
       with IaCErrorCodes
  /* 1092 */ val UnsupportedEntitlementFlagError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnsupportedEntitlementFlagError & Double = js.native
  
  @js.native
  sealed trait UnsupportedEntitlementPullError
    extends StObject
       with IaCErrorCodes
  /* 1106 */ val UnsupportedEntitlementPullError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnsupportedEntitlementPullError & Double = js.native
  
  @js.native
  sealed trait UnsupportedFeatureFlagPullError
    extends StObject
       with IaCErrorCodes
  /* 1105 */ val UnsupportedFeatureFlagPullError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnsupportedFeatureFlagPullError & Double = js.native
  
  @js.native
  sealed trait UnsupportedFileTypeError
    extends StObject
       with IaCErrorCodes
  /* 1020 */ val UnsupportedFileTypeError: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnsupportedFileTypeError & Double = js.native
  
  @js.native
  sealed trait UnsupportedInputType
    extends StObject
       with IaCErrorCodes
  /* 2102 */ val UnsupportedInputType: typings.snyk.distCliCommandsTestIacLocalExecutionTypesMod.IaCErrorCodes.UnsupportedInputType & Double = js.native
}
