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
import scala.scalajs.js.`|`
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
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
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
    
    /**
      * Get an existing Classifier resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/glue/classifier", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID]): Classifier = js.native
    @JSImport("@pulumi/aws/glue/classifier", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Classifier = js.native
    @JSImport("@pulumi/aws/glue/classifier", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClassifierState): Classifier = js.native
    @JSImport("@pulumi/aws/glue/classifier", "Classifier.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClassifierState, opts: CustomResourceOptions): Classifier = js.native
    
    /**
      * Returns true if the given object is an instance of Classifier.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/glue/classifier", "Classifier.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/classifier.Classifier */ Boolean = js.native
  }
  
  @js.native
  trait ClassifierArgs extends StObject {
    
    /**
      * A classifier for Csv content. Defined below.
      */
    val csvClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]] = js.native
    
    /**
      * A classifier that uses grok patterns. Defined below.
      */
    val grokClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]] = js.native
    
    /**
      * A classifier for JSON content. Defined below.
      */
    val jsonClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]] = js.native
    
    /**
      * The name of the classifier.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A classifier for XML content. Defined below.
      */
    val xmlClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]] = js.native
  }
  object ClassifierArgs {
    
    @scala.inline
    def apply(): ClassifierArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassifierArgs]
    }
    
    @scala.inline
    implicit class ClassifierArgsMutableBuilder[Self <: ClassifierArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsvClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]): Self = StObject.set(x, "csvClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvClassifierUndefined: Self = StObject.set(x, "csvClassifier", js.undefined)
      
      @scala.inline
      def setGrokClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]): Self = StObject.set(x, "grokClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrokClassifierUndefined: Self = StObject.set(x, "grokClassifier", js.undefined)
      
      @scala.inline
      def setJsonClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]): Self = StObject.set(x, "jsonClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonClassifierUndefined: Self = StObject.set(x, "jsonClassifier", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setXmlClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]): Self = StObject.set(x, "xmlClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlClassifierUndefined: Self = StObject.set(x, "xmlClassifier", js.undefined)
    }
  }
  
  @js.native
  trait ClassifierState extends StObject {
    
    /**
      * A classifier for Csv content. Defined below.
      */
    val csvClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]] = js.native
    
    /**
      * A classifier that uses grok patterns. Defined below.
      */
    val grokClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]] = js.native
    
    /**
      * A classifier for JSON content. Defined below.
      */
    val jsonClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]] = js.native
    
    /**
      * The name of the classifier.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A classifier for XML content. Defined below.
      */
    val xmlClassifier: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]] = js.native
  }
  object ClassifierState {
    
    @scala.inline
    def apply(): ClassifierState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassifierState]
    }
    
    @scala.inline
    implicit class ClassifierStateMutableBuilder[Self <: ClassifierState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCsvClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierCsvClassifier]): Self = StObject.set(x, "csvClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvClassifierUndefined: Self = StObject.set(x, "csvClassifier", js.undefined)
      
      @scala.inline
      def setGrokClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierGrokClassifier]): Self = StObject.set(x, "grokClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrokClassifierUndefined: Self = StObject.set(x, "grokClassifier", js.undefined)
      
      @scala.inline
      def setJsonClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierJsonClassifier]): Self = StObject.set(x, "jsonClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonClassifierUndefined: Self = StObject.set(x, "jsonClassifier", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setXmlClassifier(value: Input[typings.pulumiAws.inputMod.glue.ClassifierXmlClassifier]): Self = StObject.set(x, "xmlClassifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmlClassifierUndefined: Self = StObject.set(x, "xmlClassifier", js.undefined)
    }
  }
}
