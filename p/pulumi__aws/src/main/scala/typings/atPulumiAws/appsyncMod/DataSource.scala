package typings.atPulumiAws.appsyncMod

import typings.atPulumiAws.appsyncDataSourceMod.DataSourceArgs
import typings.atPulumiAws.appsyncDataSourceMod.DataSourceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync", "DataSource")
@js.native
class DataSource protected ()
  extends typings.atPulumiAws.appsyncDataSourceMod.DataSource {
  /**
    * Create a DataSource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DataSourceArgs) = this()
  def this(name: String, args: DataSourceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appsync", "DataSource")
@js.native
object DataSource extends js.Object {
  /**
    * Get an existing DataSource resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
  def get(name: String, id: Input[ID], state: DataSourceState): typings.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
  def get(name: String, id: Input[ID], state: DataSourceState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncDataSourceMod.DataSource = js.native
  /**
    * Returns true if the given object is an instance of DataSource.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/dataSource.DataSource */ Boolean = js.native
}

