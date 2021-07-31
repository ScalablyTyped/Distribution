package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.rds.ProxyAuth
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyMod {
  
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
  object Proxy {
    
    @JSImport("@pulumi/aws/rds/proxy", "Proxy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Proxy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Proxy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Proxy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyState): Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Proxy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyState, opts: CustomResourceOptions): Proxy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Proxy]
    
    /**
      * Returns true if the given object is an instance of Proxy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/proxy.Proxy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/rds/proxy.Proxy */ Boolean]
  }
  
  trait ProxyArgs extends StObject {
    
    /**
      * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
      */
    val auths: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ProxyAuth]]]
    
    /**
      * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
      */
    val debugLogging: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora. Valid values are `MYSQL` and `POSTGRESQL`.
      */
    val engineFamily: Input[String]
    
    /**
      * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
      */
    val idleClientTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
      */
    val requireTls: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
      */
    val roleArn: Input[String]
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * One or more VPC security group IDs to associate with the new proxy.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * One or more VPC subnet IDs to associate with the new proxy.
      */
    val vpcSubnetIds: Input[js.Array[Input[String]]]
  }
  object ProxyArgs {
    
    @scala.inline
    def apply(
      auths: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ProxyAuth]]],
      engineFamily: Input[String],
      roleArn: Input[String],
      vpcSubnetIds: Input[js.Array[Input[String]]]
    ): ProxyArgs = {
      val __obj = js.Dynamic.literal(auths = auths.asInstanceOf[js.Any], engineFamily = engineFamily.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], vpcSubnetIds = vpcSubnetIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyArgs]
    }
    
    @scala.inline
    implicit class ProxyArgsMutableBuilder[Self <: ProxyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuths(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ProxyAuth]]]): Self = StObject.set(x, "auths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthsVarargs(value: Input[typings.pulumiAws.inputMod.rds.ProxyAuth]*): Self = StObject.set(x, "auths", js.Array(value :_*))
      
      @scala.inline
      def setDebugLogging(value: Input[Boolean]): Self = StObject.set(x, "debugLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugLoggingUndefined: Self = StObject.set(x, "debugLogging", js.undefined)
      
      @scala.inline
      def setEngineFamily(value: Input[String]): Self = StObject.set(x, "engineFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleClientTimeout(value: Input[Double]): Self = StObject.set(x, "idleClientTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleClientTimeoutUndefined: Self = StObject.set(x, "idleClientTimeout", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequireTls(value: Input[Boolean]): Self = StObject.set(x, "requireTls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireTlsUndefined: Self = StObject.set(x, "requireTls", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSubnetIds", js.Array(value :_*))
    }
  }
  
  trait ProxyState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) for the proxy.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
      */
    val auths: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ProxyAuth]]]] = js.undefined
    
    /**
      * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
      */
    val debugLogging: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora. Valid values are `MYSQL` and `POSTGRESQL`.
      */
    val engineFamily: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
      */
    val idleClientTimeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
      */
    val requireTls: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A mapping of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * One or more VPC security group IDs to associate with the new proxy.
      */
    val vpcSecurityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * One or more VPC subnet IDs to associate with the new proxy.
      */
    val vpcSubnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ProxyState {
    
    @scala.inline
    def apply(): ProxyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyState]
    }
    
    @scala.inline
    implicit class ProxyStateMutableBuilder[Self <: ProxyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAuths(value: Input[js.Array[Input[typings.pulumiAws.inputMod.rds.ProxyAuth]]]): Self = StObject.set(x, "auths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthsUndefined: Self = StObject.set(x, "auths", js.undefined)
      
      @scala.inline
      def setAuthsVarargs(value: Input[typings.pulumiAws.inputMod.rds.ProxyAuth]*): Self = StObject.set(x, "auths", js.Array(value :_*))
      
      @scala.inline
      def setDebugLogging(value: Input[Boolean]): Self = StObject.set(x, "debugLogging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugLoggingUndefined: Self = StObject.set(x, "debugLogging", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setEngineFamily(value: Input[String]): Self = StObject.set(x, "engineFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineFamilyUndefined: Self = StObject.set(x, "engineFamily", js.undefined)
      
      @scala.inline
      def setIdleClientTimeout(value: Input[Double]): Self = StObject.set(x, "idleClientTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleClientTimeoutUndefined: Self = StObject.set(x, "idleClientTimeout", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequireTls(value: Input[Boolean]): Self = StObject.set(x, "requireTls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireTlsUndefined: Self = StObject.set(x, "requireTls", js.undefined)
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsUndefined: Self = StObject.set(x, "vpcSecurityGroupIds", js.undefined)
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "vpcSubnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSubnetIdsUndefined: Self = StObject.set(x, "vpcSubnetIds", js.undefined)
      
      @scala.inline
      def setVpcSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "vpcSubnetIds", js.Array(value :_*))
    }
  }
}
