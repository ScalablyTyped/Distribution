package typings.pulumiPulumi

import typings.pulumiPulumi.automationStackMod.OpType
import typings.pulumiPulumi.automationStackMod.UpdateKind
import typings.pulumiPulumi.automationStackMod.UpdateResult
import typings.pulumiPulumi.projectSettingsMod.ProjectRuntime
import typings.pulumiPulumi.workspaceMod.PluginKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulumiPulumiStrings {
  
  @scala.inline
  def LiftedObject: LiftedObject = "LiftedObject".asInstanceOf[LiftedObject]
  
  @scala.inline
  def ResolvedObject: ResolvedObject = "ResolvedObject".asInstanceOf[ResolvedObject]
  
  @scala.inline
  def UnwrappedObject: UnwrappedObject = "UnwrappedObject".asInstanceOf[UnwrappedObject]
  
  @scala.inline
  def analyzer: analyzer = "analyzer".asInstanceOf[analyzer]
  
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @scala.inline
  def `create-replacement`: `create-replacement` = "create-replacement".asInstanceOf[`create-replacement`]
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def `delete-replaced`: `delete-replaced` = "delete-replaced".asInstanceOf[`delete-replaced`]
  
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @scala.inline
  def dotnet: dotnet = "dotnet".asInstanceOf[dotnet]
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def getProvider: getProvider = "getProvider".asInstanceOf[getProvider]
  
  @scala.inline
  def go: go = "go".asInstanceOf[go]
  
  @scala.inline
  def `import`: `import` = "import".asInstanceOf[`import`]
  
  @scala.inline
  def `in-progress`: `in-progress` = "in-progress".asInstanceOf[`in-progress`]
  
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  
  @scala.inline
  def nodejs: nodejs = "nodejs".asInstanceOf[nodejs]
  
  @scala.inline
  def `not-started`: `not-started` = "not-started".asInstanceOf[`not-started`]
  
  @scala.inline
  def preview: preview = "preview".asInstanceOf[preview]
  
  @scala.inline
  def python: python = "python".asInstanceOf[python]
  
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def resource: resource = "resource".asInstanceOf[resource]
  
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @scala.inline
  def urn: urn = "urn".asInstanceOf[urn]
  
  @js.native
  sealed trait LiftedObject extends js.Object
  
  @js.native
  sealed trait ResolvedObject extends js.Object
  
  @js.native
  sealed trait UnwrappedObject extends js.Object
  
  @js.native
  sealed trait analyzer extends PluginKind
  
  @js.native
  sealed trait create extends OpType
  
  @js.native
  sealed trait `create-replacement` extends OpType
  
  @js.native
  sealed trait delete extends OpType
  
  @js.native
  sealed trait `delete-replaced` extends OpType
  
  @js.native
  sealed trait destroy extends UpdateKind
  
  @js.native
  sealed trait dotnet extends ProjectRuntime
  
  @js.native
  sealed trait failed extends UpdateResult
  
  @js.native
  sealed trait getProvider extends js.Object
  
  @js.native
  sealed trait go extends ProjectRuntime
  
  @js.native
  sealed trait `import` extends UpdateKind
  
  @js.native
  sealed trait `in-progress` extends UpdateResult
  
  @js.native
  sealed trait language extends PluginKind
  
  @js.native
  sealed trait nodejs extends ProjectRuntime
  
  @js.native
  sealed trait `not-started` extends UpdateResult
  
  @js.native
  sealed trait preview extends UpdateKind
  
  @js.native
  sealed trait python extends ProjectRuntime
  
  @js.native
  sealed trait refresh extends UpdateKind
  
  @js.native
  sealed trait rename extends UpdateKind
  
  @js.native
  sealed trait replace extends OpType
  
  @js.native
  sealed trait resource extends PluginKind
  
  @js.native
  sealed trait same extends OpType
  
  @js.native
  sealed trait succeeded extends UpdateResult
  
  @js.native
  sealed trait update
    extends OpType
       with UpdateKind
  
  @js.native
  sealed trait urn extends js.Object
}
