package typings.pulumiPulumi.localWorkspaceMod

import typings.pulumiPulumi.automationStackMod.Stack
import typings.pulumiPulumi.workspaceMod.Workspace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace")
@js.native
class LocalWorkspace protected () extends Workspace {
  
  var ready: js.Any = js.native
  
  var runPulumiCmd: js.Any = js.native
}
/* static members */
@JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace")
@js.native
object LocalWorkspace extends js.Object {
  
  /**
    * Creates a workspace using the specified options. Used for maximal control and customization
    * of the underlying environment before any stacks are created or selected.
    *
    * @param opts Options used to configure the Workspace
    */
  def create(opts: LocalWorkspaceOptions): js.Promise[LocalWorkspace] = js.native
  
  /**
    * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline Pulumi CLI program.
    * This program is fully debuggable and runs in process. If no Project option is specified, default project settings will be created
    * on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory will default
    * to a new temporary directory provided by the OS.
    *
    * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
    * @param opts Additional customizations to be applied to the Workspace.
    */
  def createOrSelectStack(args: InlineProgramArgs): js.Promise[Stack] = js.native
  def createOrSelectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
  /**
    * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi CLI program.
    * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
    * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
    * will default to a new temporary directory provided by the OS.
    *
    * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
    * @param opts Additional customizations to be applied to the Workspace.
    */
  def createOrSelectStack(args: LocalProgramArgs): js.Promise[Stack] = js.native
  def createOrSelectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
  
  /**
    * Creates a Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
    * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
    * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
    * will default to a new temporary directory provided by the OS.
    *
    * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
    * @param opts Additional customizations to be applied to the Workspace.
    */
  def createStack(args: InlineProgramArgs): js.Promise[Stack] = js.native
  def createStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
  /**
    * Creates a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
    * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
    * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
    *
    * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
    * @param opts Additional customizations to be applied to the Workspace.
    */
  def createStack(args: LocalProgramArgs): js.Promise[Stack] = js.native
  def createStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
  
  var inlineSourceStackHelper: js.Any = js.native
  
  var localSourceStackHelper: js.Any = js.native
  
  /**
    * Selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
    * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
    * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
    * will default to a new temporary directory provided by the OS.
    *
    * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
    * @param opts Additional customizations to be applied to the Workspace.
    */
  def selectStack(args: InlineProgramArgs): js.Promise[Stack] = js.native
  def selectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
  /**
    * Selects a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
    * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
    * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
    *
    * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
    * @param opts Additional customizations to be applied to the Workspace.
    */
  def selectStack(args: LocalProgramArgs): js.Promise[Stack] = js.native
  def selectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
}
