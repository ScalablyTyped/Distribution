package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.kustomizeKustomizeMod.DirectoryOpts
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kustomize {
  
  @JSImport("@pulumi/kubernetes", "kustomize.Directory")
  @js.native
  class Directory protected ()
    extends typings.pulumiKubernetes.kustomizeMod.Directory {
    /**
      * Create an instance of the specified kustomize directory.
      *
      * @param name Name of the kustomization (e.g., nginx-ingress).
      * @param config Configuration options for the kustomization.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, config: DirectoryOpts) = this()
    def this(name: String, config: DirectoryOpts, opts: ComponentResourceOptions) = this()
  }
}
