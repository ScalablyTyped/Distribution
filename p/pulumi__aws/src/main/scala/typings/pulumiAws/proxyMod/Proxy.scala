package typings.pulumiAws.proxyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.ProxyAuth
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds/proxy", "Proxy")
@js.native
class Proxy protected () extends CustomResource {
  /**
    * Create a Proxy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProxyArgs) = this()
  def this(name: String, args: ProxyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The Amazon Resource Name (ARN) for the proxy.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
    */
  val auths: Output_[js.Array[ProxyAuth]] = js.native
  
  /**
    * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
    */
  val debugLogging: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora. Valid values are `MYSQL` and `POSTGRESQL`.
    */
  val engineFamily: Output_[String] = js.native
  
  /**
    * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
    */
  val idleClientTimeout: Output_[Double] = js.native
  
  /**
    * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  val name: Output_[String] = js.native
  
  /**
    * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
    */
  val requireTls: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
    */
  val roleArn: Output_[String] = js.native
  
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * One or more VPC security group IDs to associate with the new proxy.
    */
  val vpcSecurityGroupIds: Output_[js.Array[String]] = js.native
  
  /**
    * One or more VPC subnet IDs to associate with the new proxy.
    */
  val vpcSubnetIds: Output_[js.Array[String]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/rds/proxy", "Proxy")
@js.native
object Proxy extends js.Object {
  
  /**
    * Get an existing Proxy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Proxy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Proxy = js.native
  def get(name: String, id: Input[ID], state: ProxyState): Proxy = js.native
  def get(name: String, id: Input[ID], state: ProxyState, opts: CustomResourceOptions): Proxy = js.native
  
  /**
    * Returns true if the given object is an instance of Proxy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxy.Proxy */ Boolean = js.native
}
