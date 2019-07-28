package typings.atPulumiPulumi.runtimeClosureCodePathsMod

import typings.atPulumiPulumi.assetMod.Archive
import typings.atPulumiPulumi.assetMod.Asset
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/codePaths", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeCodePaths(): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  def computeCodePaths(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = js.native
}

