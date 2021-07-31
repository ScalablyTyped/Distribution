package typings.pulumiAws

import typings.pulumiAws.outputMod.cloudwatch.LogMetricFilterMetricTransformation
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMetricFilterMod {
  
  @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
  @js.native
  class LogMetricFilter protected () extends CustomResource {
    /**
      * Create a LogMetricFilter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogMetricFilterArgs) = this()
    def this(name: String, args: LogMetricFilterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The name of the log group to associate the metric filter with.
      */
    val logGroupName: Output_[String] = js.native
    
    /**
      * A block defining collection of information needed to define how metric data gets emitted. See below.
      */
    val metricTransformation: Output_[LogMetricFilterMetricTransformation] = js.native
    
    /**
      * A name for the metric filter.
      */
    val name: Output_[String] = js.native
    
    /**
      * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
      * for extracting metric data out of ingested log events.
      */
    val pattern: Output_[String] = js.native
  }
  /* static members */
  object LogMetricFilter {
    
    @JSImport("@pulumi/aws/cloudwatch/logMetricFilter", "LogMetricFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LogMetricFilter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): LogMetricFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LogMetricFilter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LogMetricFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogMetricFilter]
    @scala.inline
    def get(name: String, id: Input[ID], state: LogMetricFilterState): LogMetricFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LogMetricFilter]
    @scala.inline
    def get(name: String, id: Input[ID], state: LogMetricFilterState, opts: CustomResourceOptions): LogMetricFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LogMetricFilter]
    
    /**
      * Returns true if the given object is an instance of LogMetricFilter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cloudwatch/logMetricFilter.LogMetricFilter */ Boolean]
  }
  
  trait LogMetricFilterArgs extends StObject {
    
    /**
      * The name of the log group to associate the metric filter with.
      */
    val logGroupName: Input[String]
    
    /**
      * A block defining collection of information needed to define how metric data gets emitted. See below.
      */
    val metricTransformation: Input[typings.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]
    
    /**
      * A name for the metric filter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
      * for extracting metric data out of ingested log events.
      */
    val pattern: Input[String]
  }
  object LogMetricFilterArgs {
    
    @scala.inline
    def apply(
      logGroupName: Input[String],
      metricTransformation: Input[typings.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation],
      pattern: Input[String]
    ): LogMetricFilterArgs = {
      val __obj = js.Dynamic.literal(logGroupName = logGroupName.asInstanceOf[js.Any], metricTransformation = metricTransformation.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMetricFilterArgs]
    }
    
    @scala.inline
    implicit class LogMetricFilterArgsMutableBuilder[Self <: LogMetricFilterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricTransformation(value: Input[typings.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]): Self = StObject.set(x, "metricTransformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPattern(value: Input[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogMetricFilterState extends StObject {
    
    /**
      * The name of the log group to associate the metric filter with.
      */
    val logGroupName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A block defining collection of information needed to define how metric data gets emitted. See below.
      */
    val metricTransformation: js.UndefOr[Input[typings.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]] = js.undefined
    
    /**
      * A name for the metric filter.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
      * for extracting metric data out of ingested log events.
      */
    val pattern: js.UndefOr[Input[String]] = js.undefined
  }
  object LogMetricFilterState {
    
    @scala.inline
    def apply(): LogMetricFilterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogMetricFilterState]
    }
    
    @scala.inline
    implicit class LogMetricFilterStateMutableBuilder[Self <: LogMetricFilterState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogGroupName(value: Input[String]): Self = StObject.set(x, "logGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogGroupNameUndefined: Self = StObject.set(x, "logGroupName", js.undefined)
      
      @scala.inline
      def setMetricTransformation(value: Input[typings.pulumiAws.inputMod.cloudwatch.LogMetricFilterMetricTransformation]): Self = StObject.set(x, "metricTransformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetricTransformationUndefined: Self = StObject.set(x, "metricTransformation", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPattern(value: Input[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
