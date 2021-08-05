package typings.pulumiPulumi

import typings.pulumiPulumi.localWorkspaceMod.InlineProgramArgs
import typings.pulumiPulumi.localWorkspaceMod.LocalProgramArgs
import typings.pulumiPulumi.localWorkspaceMod.LocalWorkspaceOptions
import typings.pulumiPulumi.workspaceMod.Workspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object automationMod {
  
  @JSImport("@pulumi/pulumi/x/automation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/x/automation", "CommandError")
  @js.native
  class CommandError ()
    extends typings.pulumiPulumi.automationErrorsMod.CommandError
  
  @JSImport("@pulumi/pulumi/x/automation", "ConcurrentUpdateError")
  @js.native
  class ConcurrentUpdateError ()
    extends typings.pulumiPulumi.automationErrorsMod.ConcurrentUpdateError
  
  @JSImport("@pulumi/pulumi/x/automation", "LocalWorkspace")
  @js.native
  /* private */ class LocalWorkspace ()
    extends typings.pulumiPulumi.localWorkspaceMod.LocalWorkspace
  /* static members */
  object LocalWorkspace {
    
    @JSImport("@pulumi/pulumi/x/automation", "LocalWorkspace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a workspace using the specified options. Used for maximal control and customization
      * of the underlying environment before any stacks are created or selected.
      *
      * @param opts Options used to configure the Workspace
      */
    inline def create(opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.localWorkspaceMod.LocalWorkspace] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.localWorkspaceMod.LocalWorkspace]]
    
    /**
      * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline Pulumi CLI program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings will be created
      * on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory will default
      * to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createOrSelectStack(args: InlineProgramArgs): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    inline def createOrSelectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    /**
      * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi CLI program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createOrSelectStack(args: LocalProgramArgs): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    inline def createOrSelectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    
    /**
      * Creates a Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createStack(args: InlineProgramArgs): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    inline def createStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    /**
      * Creates a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
      * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
      * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
      *
      * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def createStack(args: LocalProgramArgs): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    inline def createStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    
    @JSImport("@pulumi/pulumi/x/automation", "LocalWorkspace.inlineSourceStackHelper")
    @js.native
    def inlineSourceStackHelper: js.Any = js.native
    inline def inlineSourceStackHelper_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineSourceStackHelper")(x.asInstanceOf[js.Any])
    
    @JSImport("@pulumi/pulumi/x/automation", "LocalWorkspace.localSourceStackHelper")
    @js.native
    def localSourceStackHelper: js.Any = js.native
    inline def localSourceStackHelper_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localSourceStackHelper")(x.asInstanceOf[js.Any])
    
    /**
      * Selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def selectStack(args: InlineProgramArgs): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    inline def selectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    /**
      * Selects a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
      * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
      * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
      *
      * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    inline def selectStack(args: LocalProgramArgs): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    inline def selectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectStack")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
  }
  
  @JSImport("@pulumi/pulumi/x/automation", "Stack")
  @js.native
  /* private */ class Stack ()
    extends typings.pulumiPulumi.automationStackMod.Stack
  /* static members */
  object Stack {
    
    @JSImport("@pulumi/pulumi/x/automation", "Stack")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new stack using the given workspace, and stack name.
      * It fails if a stack with that name already exists
      *
      * @param name The name identifying the Stack.
      * @param workspace The Workspace the Stack was created from.
      */
    inline def create(name: String, workspace: Workspace): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    
    /**
      * Tries to create a new stack using the given workspace and
      * stack name if the stack does not already exist,
      * or falls back to selecting the existing stack. If the stack does not exist,
      * it will be created and selected.
      *
      * @param name The name identifying the Stack.
      * @param workspace The Workspace the Stack was created from.
      */
    inline def createOrSelect(name: String, workspace: Workspace): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrSelect")(name.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
    
    /**
      * Selects stack using the given workspace, and stack name.
      * It returns an error if the given Stack does not exist. All LocalWorkspace operations will call `select`
      * before running.
      *
      * @param name The name identifying the Stack.
      * @param workspace The Workspace the Stack was created from.
      */
    inline def select(name: String, workspace: Workspace): js.Promise[typings.pulumiPulumi.automationStackMod.Stack] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(name.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiPulumi.automationStackMod.Stack]]
  }
  
  @JSImport("@pulumi/pulumi/x/automation", "StackAlreadyExistsError")
  @js.native
  class StackAlreadyExistsError ()
    extends typings.pulumiPulumi.automationErrorsMod.StackAlreadyExistsError
  
  @JSImport("@pulumi/pulumi/x/automation", "StackNotFoundError")
  @js.native
  class StackNotFoundError ()
    extends typings.pulumiPulumi.automationErrorsMod.StackNotFoundError
  
  inline def fullyQualifiedStackName(org_ : String, project: String, stack: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fullyQualifiedStackName")(org_.asInstanceOf[js.Any], project.asInstanceOf[js.Any], stack.asInstanceOf[js.Any])).asInstanceOf[String]
}
