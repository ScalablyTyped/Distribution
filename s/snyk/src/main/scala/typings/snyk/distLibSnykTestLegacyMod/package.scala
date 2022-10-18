package typings.snyk.distLibSnykTestLegacyMod

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.anon.Issues
import typings.snyk.anon.Patched
import typings.snyk.anon.Paths
import typings.snyk.distLibSnykTestLegacyMod.^
import typings.snyk.distLibTypesMod.Options
import typings.snyk.distLibTypesMod.SupportedProjectTypes
import typings.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertTestDepGraphResultToLegacy(
  res: TestDepGraphResponse,
  depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any,
  packageManager: Unit,
  options: Options & TestOptions
): LegacyVulnApiResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTestDepGraphResultToLegacy")(res.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LegacyVulnApiResult]
inline def convertTestDepGraphResultToLegacy(
  res: TestDepGraphResponse,
  depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify depGraphLib.DepGraph */ Any,
  packageManager: SupportedProjectTypes,
  options: Options & TestOptions
): LegacyVulnApiResult = (^.asInstanceOf[js.Dynamic].applyDynamic("convertTestDepGraphResultToLegacy")(res.asInstanceOf[js.Any], depGraph.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[LegacyVulnApiResult]

type AffectedPackages = StringDictionary[Issues]

type CallPath = js.Array[String]

type DependencyPins = StringDictionary[PinRemediation]

type DependencyUpdates = StringDictionary[UpgradeRemediation]

type Ignores = StringDictionary[Paths]

type PatchObject = StringDictionary[Patched]
