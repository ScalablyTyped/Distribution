package typings.snykGradlePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DepTree = typings.snykCliInterface.commonMod.DepTree
  type Options = typings.snykCliInterface.pluginMod.InspectOptions with typings.snykGradlePlugin.mod.GradleInspectOptions
  type ProjectsDict = org.scalablytyped.runtime.StringDictionary[typings.snykGradlePlugin.mod.GradleProjectInfo]
  type VersionBuildInfo = typings.snykCliInterface.pluginMod.VersionBuildInfo
}
