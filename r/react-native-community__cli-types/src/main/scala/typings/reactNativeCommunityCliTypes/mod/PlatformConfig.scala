package typings.reactNativeCommunityCliTypes.mod

import typings.reactNativeCommunityCliTypes.anon.CopyAssets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformConfig[ProjectConfig, ProjectParams, DependencyConfig, DependencyParams] extends js.Object {
  
  def dependencyConfig(dependency: String, params: DependencyParams): DependencyConfig | Unit = js.native
  
  def linkConfig(): CopyAssets[ProjectConfig, DependencyConfig] = js.native
  
  var npmPackageName: js.UndefOr[String] = js.native
  
  def projectConfig(projectRoot: String, projectParams: ProjectParams): ProjectConfig | Unit = js.native
  def projectConfig(projectRoot: String, projectParams: Unit): ProjectConfig | Unit = js.native
}
