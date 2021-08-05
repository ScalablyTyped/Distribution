package typings.pulumiAws

import typings.pulumiAws.outputMod.glue.ClassifierCsvClassifier
import typings.pulumiAws.outputMod.glue.ClassifierGrokClassifier
import typings.pulumiAws.outputMod.glue.ClassifierJsonClassifier
import typings.pulumiAws.outputMod.glue.ClassifierXmlClassifier
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classifierMod {
  
  @JSImport("@pulumi/aws/glue/classifier", "Classifier")
  @js.native
  class Classifier protected () extends CustomResource {
    /**
      * Create a Classifier resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClassifierArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClassifierArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A classifier for Csv content. Defined below.
      */
    val csvClassifier: Output_[js.UndefOr[ClassifierCsvClassifier]] = js.native
    
    /**
      * A classifier that uses grok patterns. Defined below.
      */
    val grokClassifier: Output_[js.UndefOr[ClassifierGrokClassifier]] = js.native
    
    /**
      * A classifier for JSON content. Defined below.
      */
    val jsonClassifier: Output_[js.UndefOr[ClassifierJsonClassifier]] = js.native
    
    /**
      * The name of the classifier.
      */
    val name: Output_[String] = js.native
    
    /**
      * A classifier for XML content. Defined below.
      */
    val xmlClassifier: Output_[js.UndefOr[ClassifierXmlClassifier]] = js.native
  }
  /* static members */
  object Classifier {
    
    @JSImport("@pulumi/aws/glue/classifier", "Classifier")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Classifier]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Classifier]
    inline def get(name: String, id: Input[ID], state: ClassifierState): Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Classifier]
    inline def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): Classifier = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Classifier]
    
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean]
  }
  
  trait ClassifierArgs extends StObject {
    
    /**
      * A classifier for Csv content. Defined below.
      */
    val csvClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]] = js.undefined
    
    /**
      * A classifier that uses grok patterns. Defined below.
      */
    val grokClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]] = js.undefined
    
    /**
      * A classifier for JSON content. Defined below.
      */
    val jsonClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]] = js.undefined
    
    /**
      * The name of the classifier.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A classifier for XML content. Defined below.
      */
    val xmlClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]] = js.undefined
  }
  object ClassifierArgs {
    
    inline def apply(): ClassifierArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassifierArgs]
    }
    
    extension [Self <: ClassifierArgs](x: Self) {
      
      inline def setCsvClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]): Self = StObject.set(x, "csvClassifier", value.asInstanceOf[js.Any])
      
      inline def setCsvClassifierUndefined: Self = StObject.set(x, "csvClassifier", js.undefined)
      
      inline def setGrokClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]): Self = StObject.set(x, "grokClassifier", value.asInstanceOf[js.Any])
      
      inline def setGrokClassifierUndefined: Self = StObject.set(x, "grokClassifier", js.undefined)
      
      inline def setJsonClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]): Self = StObject.set(x, "jsonClassifier", value.asInstanceOf[js.Any])
      
      inline def setJsonClassifierUndefined: Self = StObject.set(x, "jsonClassifier", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setXmlClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]): Self = StObject.set(x, "xmlClassifier", value.asInstanceOf[js.Any])
      
      inline def setXmlClassifierUndefined: Self = StObject.set(x, "xmlClassifier", js.undefined)
    }
  }
  
  trait ClassifierState extends StObject {
    
    /**
      * A classifier for Csv content. Defined below.
      */
    val csvClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]] = js.undefined
    
    /**
      * A classifier that uses grok patterns. Defined below.
      */
    val grokClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]] = js.undefined
    
    /**
      * A classifier for JSON content. Defined below.
      */
    val jsonClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]] = js.undefined
    
    /**
      * The name of the classifier.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A classifier for XML content. Defined below.
      */
    val xmlClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]] = js.undefined
  }
  object ClassifierState {
    
    inline def apply(): ClassifierState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassifierState]
    }
    
    extension [Self <: ClassifierState](x: Self) {
      
      inline def setCsvClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]): Self = StObject.set(x, "csvClassifier", value.asInstanceOf[js.Any])
      
      inline def setCsvClassifierUndefined: Self = StObject.set(x, "csvClassifier", js.undefined)
      
      inline def setGrokClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]): Self = StObject.set(x, "grokClassifier", value.asInstanceOf[js.Any])
      
      inline def setGrokClassifierUndefined: Self = StObject.set(x, "grokClassifier", js.undefined)
      
      inline def setJsonClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]): Self = StObject.set(x, "jsonClassifier", value.asInstanceOf[js.Any])
      
      inline def setJsonClassifierUndefined: Self = StObject.set(x, "jsonClassifier", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setXmlClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]): Self = StObject.set(x, "xmlClassifier", value.asInstanceOf[js.Any])
      
      inline def setXmlClassifierUndefined: Self = StObject.set(x, "xmlClassifier", js.undefined)
    }
  }
}
