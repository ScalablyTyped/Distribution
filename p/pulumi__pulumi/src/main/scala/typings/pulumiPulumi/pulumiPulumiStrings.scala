package typings.pulumiPulumi

import typings.pulumiPulumi.automationStackMod.OpType
import typings.pulumiPulumi.automationStackMod.UpdateKind
import typings.pulumiPulumi.automationStackMod.UpdateResult
import typings.pulumiPulumi.projectSettingsMod.ProjectRuntime
import typings.pulumiPulumi.workspaceMod.PluginKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulumiPulumiStrings {
  
  @js.native
  sealed trait LiftedObject extends StObject
  @scala.inline
  def LiftedObject: LiftedObject = "LiftedObject".asInstanceOf[LiftedObject]
  
  @js.native
  sealed trait ResolvedObject extends StObject
  @scala.inline
  def ResolvedObject: ResolvedObject = "ResolvedObject".asInstanceOf[ResolvedObject]
  
  @js.native
  sealed trait UnwrappedObject extends StObject
  @scala.inline
  def UnwrappedObject: UnwrappedObject = "UnwrappedObject".asInstanceOf[UnwrappedObject]
  
  @js.native
  sealed trait analyzer
    extends StObject
       with PluginKind
  @scala.inline
  def analyzer: analyzer = "analyzer".asInstanceOf[analyzer]
  
  @js.native
  sealed trait create
    extends StObject
       with OpType
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait `create-replacement`
    extends StObject
       with OpType
  @scala.inline
  def `create-replacement`: `create-replacement` = "create-replacement".asInstanceOf[`create-replacement`]
  
  @js.native
  sealed trait delete
    extends StObject
       with OpType
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait `delete-replaced`
    extends StObject
       with OpType
  @scala.inline
  def `delete-replaced`: `delete-replaced` = "delete-replaced".asInstanceOf[`delete-replaced`]
  
  @js.native
  sealed trait destroy
    extends StObject
       with UpdateKind
  @scala.inline
  def destroy: destroy = "destroy".asInstanceOf[destroy]
  
  @js.native
  sealed trait dotnet
    extends StObject
       with ProjectRuntime
  @scala.inline
  def dotnet: dotnet = "dotnet".asInstanceOf[dotnet]
  
  @js.native
  sealed trait failed
    extends StObject
       with UpdateResult
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait getProvider extends StObject
  @scala.inline
  def getProvider: getProvider = "getProvider".asInstanceOf[getProvider]
  
  @js.native
  sealed trait go
    extends StObject
       with ProjectRuntime
  @scala.inline
  def go: go = "go".asInstanceOf[go]
  
  @js.native
  sealed trait `import`
    extends StObject
       with UpdateKind
  @scala.inline
  def `import`: `import` = "import".asInstanceOf[`import`]
  
  @js.native
  sealed trait `in-progress`
    extends StObject
       with UpdateResult
  @scala.inline
  def `in-progress`: `in-progress` = "in-progress".asInstanceOf[`in-progress`]
  
  @js.native
  sealed trait language
    extends StObject
       with PluginKind
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  
  @js.native
  sealed trait nodejs
    extends StObject
       with ProjectRuntime
  @scala.inline
  def nodejs: nodejs = "nodejs".asInstanceOf[nodejs]
  
  @js.native
  sealed trait `not-started`
    extends StObject
       with UpdateResult
  @scala.inline
  def `not-started`: `not-started` = "not-started".asInstanceOf[`not-started`]
  
  @js.native
  sealed trait preview
    extends StObject
       with UpdateKind
  @scala.inline
  def preview: preview = "preview".asInstanceOf[preview]
  
  @js.native
  sealed trait python
    extends StObject
       with ProjectRuntime
  @scala.inline
  def python: python = "python".asInstanceOf[python]
  
  @js.native
  sealed trait refresh
    extends StObject
       with UpdateKind
  @scala.inline
  def refresh: refresh = "refresh".asInstanceOf[refresh]
  
  @js.native
  sealed trait rename
    extends StObject
       with UpdateKind
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  
  @js.native
  sealed trait replace
    extends StObject
       with OpType
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait resource
    extends StObject
       with PluginKind
  @scala.inline
  def resource: resource = "resource".asInstanceOf[resource]
  
  @js.native
  sealed trait same
    extends StObject
       with OpType
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  
  @js.native
  sealed trait succeeded
    extends StObject
       with UpdateResult
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait update
    extends StObject
       with OpType
       with UpdateKind
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @js.native
  sealed trait urn extends StObject
  @scala.inline
  def urn: urn = "urn".asInstanceOf[urn]
}
