package typings.pulumiKubernetes.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.yamlYamlMod.ConfigFileOpts
import typings.pulumiKubernetes.yamlYamlMod.ConfigGroupOpts
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yaml {
  
  @JSImport("@pulumi/kubernetes", "yaml")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/kubernetes", "yaml.CollectionComponentResource")
  @js.native
  abstract class CollectionComponentResource protected ()
    extends typings.pulumiKubernetes.yamlMod.CollectionComponentResource {
    protected def this(resourceType: String, name: String, config: js.Any) = this()
    protected def this(resourceType: String, name: String, config: js.Any, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes", "yaml.ConfigFile")
  @js.native
  class ConfigFile protected ()
    extends typings.pulumiKubernetes.yamlMod.ConfigFile {
    /**
      * Create a ConfigFile resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, config: ConfigFileOpts) = this()
    def this(name: String, config: Unit, opts: ComponentResourceOptions) = this()
    def this(name: String, config: ConfigFileOpts, opts: ComponentResourceOptions) = this()
  }
  
  @JSImport("@pulumi/kubernetes", "yaml.ConfigGroup")
  @js.native
  class ConfigGroup protected ()
    extends typings.pulumiKubernetes.yamlMod.ConfigGroup {
    /**
      * Create a ConfigGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param config The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, config: ConfigGroupOpts) = this()
    def this(name: String, config: ConfigGroupOpts, opts: ComponentResourceOptions) = this()
  }
  
  @scala.inline
  def parse(config: ConfigGroupOpts): Output_[StringDictionary[CustomResource]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(config.asInstanceOf[js.Any]).asInstanceOf[Output_[StringDictionary[CustomResource]]]
  @scala.inline
  def parse(config: ConfigGroupOpts, opts: CustomResourceOptions): Output_[StringDictionary[CustomResource]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(config.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Output_[StringDictionary[CustomResource]]]
}
