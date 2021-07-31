package typings.pulumiKubernetes

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiKubernetes.yamlMod.CollectionComponentResource
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Inputs
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v3HelmMod {
  
  @JSImport("@pulumi/kubernetes/helm/v3/helm", "Chart")
  @js.native
  class Chart protected () extends CollectionComponentResource {
    /**
      * Create an instance of the specified Helm chart.
      * @param releaseName Name of the Chart (e.g., nginx-ingress).
      * @param config Configuration options for the Chart.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(releaseName: String, config: ChartOpts) = this()
    def this(releaseName: String, config: LocalChartOpts) = this()
    def this(releaseName: String, config: ChartOpts, opts: ComponentResourceOptions) = this()
    def this(releaseName: String, config: LocalChartOpts, opts: ComponentResourceOptions) = this()
    
    def parseChart(config: ChartOpts, releaseName: String): Output_[StringDictionary[CustomResource]] = js.native
    def parseChart(config: ChartOpts, releaseName: String, opts: ComponentResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
    def parseChart(config: LocalChartOpts, releaseName: String): Output_[StringDictionary[CustomResource]] = js.native
    def parseChart(config: LocalChartOpts, releaseName: String, opts: ComponentResourceOptions): Output_[StringDictionary[CustomResource]] = js.native
  }
  
  trait BaseChartOpts extends StObject {
    
    /**
      * The optional kubernetes api versions used for Capabilities.APIVersions.
      */
    var apiVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The optional namespace to install chart resources into.
      */
    var namespace: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * An optional prefix for the auto-generated resource names.
      * Example: A resource created with resourcePrefix="foo" would produce a resource named "foo-resourceName".
      */
    var resourcePrefix: js.UndefOr[String] = js.undefined
    
    /**
      * A set of transformations to apply to Kubernetes resource definitions before registering
      * with engine.
      */
    var transformations: js.UndefOr[js.Array[js.Function2[/* o */ js.Any, /* opts */ CustomResourceOptions, Unit]]] = js.undefined
    
    /**
      * Overrides for chart values.
      */
    var values: js.UndefOr[Inputs] = js.undefined
  }
  object BaseChartOpts {
    
    @scala.inline
    def apply(): BaseChartOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseChartOpts]
    }
    
    @scala.inline
    implicit class BaseChartOptsMutableBuilder[Self <: BaseChartOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionsUndefined: Self = StObject.set(x, "apiVersions", js.undefined)
      
      @scala.inline
      def setApiVersionsVarargs(value: Input[String]*): Self = StObject.set(x, "apiVersions", js.Array(value :_*))
      
      @scala.inline
      def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setResourcePrefix(value: String): Self = StObject.set(x, "resourcePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcePrefixUndefined: Self = StObject.set(x, "resourcePrefix", js.undefined)
      
      @scala.inline
      def setTransformations(value: js.Array[js.Function2[/* o */ js.Any, /* opts */ CustomResourceOptions, Unit]]): Self = StObject.set(x, "transformations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformationsUndefined: Self = StObject.set(x, "transformations", js.undefined)
      
      @scala.inline
      def setTransformationsVarargs(value: (js.Function2[/* o */ js.Any, /* opts */ CustomResourceOptions, Unit])*): Self = StObject.set(x, "transformations", js.Array(value :_*))
      
      @scala.inline
      def setValues(value: Inputs): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait ChartOpts
    extends StObject
       with BaseChartOpts {
    
    /**
      * The name of the chart to deploy.  If [repo] is provided, this chart name will be prefixed by the repo name.
      * Example: repo: "stable", chart: "nginx-ingress" -> "stable/nginx-ingress"
      * Example: chart: "stable/nginx-ingress" -> "stable/nginx-ingress"
      */
    var chart: Input[String]
    
    /**
      * Additional options to customize the fetching of the Helm chart.
      */
    var fetchOpts: js.UndefOr[Input[FetchOpts]] = js.undefined
    
    /**
      * The repository name of the chart to deploy.
      * Example: "stable"
      */
    var repo: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The version of the chart to deploy. If not provided, the latest version will be deployed.
      */
    var version: js.UndefOr[Input[String]] = js.undefined
  }
  object ChartOpts {
    
    @scala.inline
    def apply(chart: Input[String]): ChartOpts = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartOpts]
    }
    
    @scala.inline
    implicit class ChartOptsMutableBuilder[Self <: ChartOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: Input[String]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOpts(value: Input[FetchOpts]): Self = StObject.set(x, "fetchOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchOptsUndefined: Self = StObject.set(x, "fetchOpts", js.undefined)
      
      @scala.inline
      def setRepo(value: Input[String]): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait FetchOpts extends StObject {
    
    /** Verify certificates of HTTPS-enabled servers using this CA bundle. */
    var caFile: js.UndefOr[Input[String]] = js.undefined
    
    /** Identify HTTPS client using this SSL certificate file. */
    var certFile: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Location to write the chart. If this and tardir are specified, tardir is appended to this
      * (default ".").
      */
    var destination: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Use development versions, too. Equivalent to version '>0.0.0-0'. If --version is set, this is
      * ignored.
      */
    var devel: js.UndefOr[Input[Boolean]] = js.undefined
    
    /** Location of your Helm config. Overrides $HELM_HOME (default "/Users/alex/.helm"). */
    var home: js.UndefOr[Input[String]] = js.undefined
    
    /** Identify HTTPS client using this SSL key file. */
    var keyFile: js.UndefOr[Input[String]] = js.undefined
    
    /** Keyring containing public keys (default "/Users/alex/.gnupg/pubring.gpg"). */
    var keyring: js.UndefOr[Input[String]] = js.undefined
    
    /** Chart repository password. */
    var password: js.UndefOr[Input[String]] = js.undefined
    
    /** Fetch the provenance file, but don't perform verification. */
    var prov: js.UndefOr[Input[Boolean]] = js.undefined
    
    /** Chart repository url where to locate the requested chart. */
    var repo: js.UndefOr[Input[String]] = js.undefined
    
    /** If set to false, will leave the chart as a tarball after downloading. */
    var untar: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * If untar is specified, this flag specifies the name of the directory into which the chart is
      * expanded (default ".").
      */
    var untardir: js.UndefOr[Input[String]] = js.undefined
    
    /** Chart repository username. */
    var username: js.UndefOr[Input[String]] = js.undefined
    
    /** Verify the package against its signature. */
    var verify: js.UndefOr[Input[Boolean]] = js.undefined
    
    /** Specific version of a chart. Without this, the latest version is fetched. */
    var version: js.UndefOr[Input[String]] = js.undefined
  }
  object FetchOpts {
    
    @scala.inline
    def apply(): FetchOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOpts]
    }
    
    @scala.inline
    implicit class FetchOptsMutableBuilder[Self <: FetchOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaFile(value: Input[String]): Self = StObject.set(x, "caFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaFileUndefined: Self = StObject.set(x, "caFile", js.undefined)
      
      @scala.inline
      def setCertFile(value: Input[String]): Self = StObject.set(x, "certFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertFileUndefined: Self = StObject.set(x, "certFile", js.undefined)
      
      @scala.inline
      def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      @scala.inline
      def setDevel(value: Input[Boolean]): Self = StObject.set(x, "devel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevelUndefined: Self = StObject.set(x, "devel", js.undefined)
      
      @scala.inline
      def setHome(value: Input[String]): Self = StObject.set(x, "home", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomeUndefined: Self = StObject.set(x, "home", js.undefined)
      
      @scala.inline
      def setKeyFile(value: Input[String]): Self = StObject.set(x, "keyFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFileUndefined: Self = StObject.set(x, "keyFile", js.undefined)
      
      @scala.inline
      def setKeyring(value: Input[String]): Self = StObject.set(x, "keyring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyringUndefined: Self = StObject.set(x, "keyring", js.undefined)
      
      @scala.inline
      def setPassword(value: Input[String]): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setProv(value: Input[Boolean]): Self = StObject.set(x, "prov", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvUndefined: Self = StObject.set(x, "prov", js.undefined)
      
      @scala.inline
      def setRepo(value: Input[String]): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepoUndefined: Self = StObject.set(x, "repo", js.undefined)
      
      @scala.inline
      def setUntar(value: Input[Boolean]): Self = StObject.set(x, "untar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntarUndefined: Self = StObject.set(x, "untar", js.undefined)
      
      @scala.inline
      def setUntardir(value: Input[String]): Self = StObject.set(x, "untardir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntardirUndefined: Self = StObject.set(x, "untardir", js.undefined)
      
      @scala.inline
      def setUsername(value: Input[String]): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setVerify(value: Input[Boolean]): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait LocalChartOpts
    extends StObject
       with BaseChartOpts {
    
    /**
      * The path to the chart directory which contains the `Chart.yaml` file.
      */
    var path: String
  }
  object LocalChartOpts {
    
    @scala.inline
    def apply(path: String): LocalChartOpts = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalChartOpts]
    }
    
    @scala.inline
    implicit class LocalChartOptsMutableBuilder[Self <: LocalChartOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
